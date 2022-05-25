package com.LoginRegistroUsuario.App.SecurityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userService;
	
	@Autowired
	private BCryptPasswordEncoder bcry;
	@Bean
	public BCryptPasswordEncoder passwordEncoder(){
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		 auth.userDetailsService(userService).passwordEncoder(bcry);
	}
	
	 String[] resources = new String[]{
	            "/include/**","/css/**","/icons/**","/img/**","/js/**","/layer/**"
	    };
	 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
        .authorizeRequests()
        .antMatchers(resources).permitAll()  
        .antMatchers("/","/index").permitAll()
            .anyRequest().authenticated()
            .and()
        .formLogin()
            .loginPage("/login2")
            .permitAll()
            .defaultSuccessUrl("/listarUsuario")//dashboard
            .failureUrl("/login2?error=true")
            .usernameParameter("username")
            .passwordParameter("password")
            .and()
        .logout()
            .permitAll()
            .logoutSuccessUrl("/login2?logout");
	}	
}
