//package com.sachin.demo.movieapi.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authorizeRequests ->
//                        authorizeRequests
//                                .requestMatchers("/", "/public/**").permitAll()  // Allow access to root and public endpoints
//                                .anyRequest().authenticated()  // All other requests require authentication
//                )
//                .oauth2Login(oauth2Login ->
//                        oauth2Login
//                                .loginPage("/oauth2/authorization/github")  // GitHub login endpoint
//                )
//                .csrf(AbstractHttpConfigurer::disable);  // Disable CSRF for simplicity
//
//        return http.build();
//    }
//}