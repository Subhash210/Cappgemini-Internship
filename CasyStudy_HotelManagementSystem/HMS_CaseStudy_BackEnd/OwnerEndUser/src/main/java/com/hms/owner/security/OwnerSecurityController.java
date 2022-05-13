package com.hms.owner.security;

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
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/owner")
@CrossOrigin("*")
public class OwnerSecurityController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtil jwtTokenUtil;

	@Autowired
	private MyUserDetailsService userDetailsService;

	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;

	// Authenticates the owner using user name and password and returns JWT token
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

	// Add new username and password for the owner
	@PostMapping("/addowner")
	public void addOwner(@RequestBody OwnerSecurityModel mod) {
		String encodedPassword = bCryptPasswordEncoder.encode(mod.getPassword());
		OwnerSecurityModel user = new OwnerSecurityModel(mod.getUserId(), encodedPassword);
		userDetailsService.addownerDetails(user);
	}

	// Add new username and password for the receptionist
	@PostMapping("/addreceptionist")
	public void addReceeptionist(@RequestBody ReceptionistSecurityModel recepmodel) {
		restTemplate.postForObject("http://ReceptionistEndUser/receptionist/addreceptionist", recepmodel,
				ReceptionistSecurityModel.class);
	}

	// Add username and password for the manager
	@PostMapping("/addmanager")
	public void addReceptionist(@RequestBody ManagerSecurityModel managerModel) {
		restTemplate.postForObject("http://ManagerEndUser/manager/addmanager", managerModel,
				ManagerSecurityModel.class);
	}

	// updates the owner username password
	@PutMapping("/updateowner")
	public void updateOwnerDetails(@RequestBody OwnerSecurityModel ownerSecurityModel, @RequestParam String newpassword)
			throws Exception {
		String newPasswordEncoded = bCryptPasswordEncoder.encode(newpassword);
		userDetailsService.updateOwnerDetails(ownerSecurityModel, newPasswordEncoded);
	}

}