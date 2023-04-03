package com.spring.oauth2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration

public class AutoConfig {

    public SecurityFilterChain getSecurityFilterChain(HttpSecurity httpSecurity) throws Exception{
        return httpSecurity.
                csrf().disable()
                .authorizeHttpRequests().requestMatchers("/login").permitAll().and()
                .authorizeHttpRequests().anyRequest().authenticated().
                and().oauth2Client().and().build();}
}
