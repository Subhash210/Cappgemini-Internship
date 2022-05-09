package com.hms.owner.security;

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
	private OwnerSecurityRepository ownerRepo;

	PasswordEncoder encoder = new BCryptPasswordEncoder();

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		OwnerSecurityModel secModel = ownerRepo.findById(username).get();
		return new User(secModel.getUserId(), secModel.getPassword(), new ArrayList<>());
	}

	// add owner details
	public void addownerDetails(OwnerSecurityModel ownersecurityModel) {
		ownerRepo.insert(ownersecurityModel);
	}

	// update owner details
	public void updateOwnerDetails(OwnerSecurityModel securityModel, String newPassword) throws Exception {
		if (ownerRepo.existsById(securityModel.getUserId())) {
			if (encoder.matches(securityModel.getPassword(),
					ownerRepo.findById(securityModel.getUserId()).get().getPassword())) {
				securityModel.setPassword(newPassword);
				ownerRepo.save(securityModel);
			} else {
				throw new Exception("Incorrect old password, please check it and try again");
			}
		} else {
			throw new Exception("User name not found");
		}
	}

}