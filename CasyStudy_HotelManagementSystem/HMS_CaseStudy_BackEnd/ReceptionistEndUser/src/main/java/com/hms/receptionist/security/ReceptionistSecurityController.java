package com.hms.receptionist.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receptionist")
@CrossOrigin("*")
public class ReceptionistSecurityController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtil jwtTokenUtil;

	@Autowired
	private MyUserDetailsService userDetailsService;

	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;

	// Authenticates the receptionist using user name and password and returns JWT
	// token
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestParam String username, @RequestParam String password)
			throws Exception {

		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password", e);
		}

		final UserDetails userDetails = userDetailsService.loadUserByUsername(username);

		final String jwt = jwtTokenUtil.generateToken(userDetails);

		return ResponseEntity.ok(jwt);
	}

	// Add the username and password of the receptionist
	@PostMapping("/addreceptionist")
	public void addReceptionist(@RequestBody ReceptionistSecurityModel mod) {
		String encodedPassword = bCryptPasswordEncoder.encode(mod.getPassword());
		ReceptionistSecurityModel user = new ReceptionistSecurityModel(mod.getUserId(), encodedPassword);
		userDetailsService.addUserdetails(user);
	}

	// Updates the receptionist username and password
	@PutMapping("/updatereceptionist")
	public void updateReceptionst(@RequestBody ReceptionistSecurityModel receptionistSecurityModel,
			@RequestParam String password) throws Exception {
		String newPasswordEncoded = bCryptPasswordEncoder.encode(password);
		userDetailsService.updateReceptionistDetails(receptionistSecurityModel, newPasswordEncoded);
	}

}