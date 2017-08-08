package com.curso;


/**
 * 
 * @author 4c0de
 * 
 *Configuraciones de WebSecurity
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	   @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	                .authorizeRequests().anyRequest().authenticated();
	        http
	                .formLogin().failureUrl("/login?error")
	                .defaultSuccessUrl("/admin")
	                .loginPage("/index")
	                .permitAll()
	                .and()
	                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login")
	                .permitAll();
	    }
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("admin").password("12345").roles("USER");
    }
}