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
		// userPassword = user
		// adminPassword = admin
		auth.inMemoryAuthentication().withUser("user")
				.password("$2a$09$E.fT2/vceQYX2Xq2vIvy9O6hX5Cs8gXT43Y.d8q8vwh0nC/QJfFj2").roles("USER").and()
				.withUser("admin").password("$2a$09$9lq11vs9kR8HRp7cdRjCQuVNatbxcKCDd5bgS.HIh/jgh/7o5QM/q")
				.roles("ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/admin").hasRole("ADMIN").antMatchers("/user").hasAnyRole("USER", "ADMIN")
				.antMatchers("/").permitAll().and().formLogin().permitAll().and().logout().permitAll().and()
				.rememberMe().key("JSESSIONID").tokenValiditySeconds(60);

	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {

		return new BCryptPasswordEncoder();
	}
}
