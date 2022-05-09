package com.hms.receptionist.security;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private ReceptionistSecurityRepository repo;

	PasswordEncoder encoder = new BCryptPasswordEncoder();

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		ReceptionistSecurityModel secModel = repo.findById(username).get();
		return new User(secModel.getUserId(), secModel.getPassword(), new ArrayList<>());
	}

	public void addUserdetails(ReceptionistSecurityModel mod) {
		repo.insert(mod);
	}

	// update receptionist details
	public void updateReceptionistDetails(ReceptionistSecurityModel securityModel, String newPassword)
			throws Exception {
		if (repo.existsById(securityModel.getUserId())) {
			if (encoder.matches(securityModel.getPassword(),
					repo.findById(securityModel.getUserId()).get().getPassword())) {
				securityModel.setPassword(newPassword);
				repo.save(securityModel);
			} else {
				throw new Exception("Incorrect old password, please check it and try again");
			}
		} else {
			throw new Exception("User name not found");
		}

	}

}