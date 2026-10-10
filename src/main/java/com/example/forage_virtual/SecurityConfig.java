package com.example.forage_virtual;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.ignoringRequestMatchers("/employees/**"))
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/employees/**").permitAll()
                        .anyRequest().authenticated()
                );
        return http.build();
    }
}
