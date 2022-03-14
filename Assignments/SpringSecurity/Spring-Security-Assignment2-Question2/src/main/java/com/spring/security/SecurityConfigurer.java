package com.spring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// userPassword = user12
		// adminPassword = admin12

		auth.inMemoryAuthentication().withUser("user")
				.password("$2a$10$Wr1mD6.StrRjv7vP6ndZneJGMeee9Xu6PntRZz0krIz4ZGaRK0CB2").roles("USER").and()
				.withUser("admin").password("$2a$10$zCmNwIDCdno0wqSoarqb/u4TRmWlcIbb647HyiwwX.r.pWjuf3aTq")
				.roles("ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/admin").hasRole("ADMIN").antMatchers("/user").hasAnyRole("USER", "ADMIN")
				.antMatchers("/").permitAll().and().formLogin().loginPage("/login").permitAll().and().logout()
				.logoutUrl("/logout").permitAll();
	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {

		return new BCryptPasswordEncoder();
	}

}
