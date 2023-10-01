package com.algaworks.example.algaeshop.discovery;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

//@Configuration
//@EnableWebSecurity
class WebSecurityConfig  {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(c-> c.disable())
            .authorizeHttpRequests(c-> c.requestMatchers("/**").authenticated())
            .httpBasic(withDefaults());
        return http.build();
    }

    @Bean
    public UserDetailsService users() {
        var users = User.withDefaultPasswordEncoder();
        UserDetails user = users
                .username("eureka-client")
                .password("password123")
                .build();
        return new InMemoryUserDetailsManager(user);
    }

}


