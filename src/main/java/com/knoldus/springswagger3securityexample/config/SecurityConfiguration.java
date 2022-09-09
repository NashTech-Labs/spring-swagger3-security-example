package com.knoldus.springswagger3securityexample.config;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/***
 * configured a public class SecurityConfiguration
 * for Authorization in spring security.
 *
 * @author shashikant
 * @version OepnJdk 1.8
 */
    @EnableWebSecurity
    public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/swagger-ui/**", "/shashijava-openapi/**").permitAll()
                    .anyRequest().authenticated()
                    .and()
                    .httpBasic();
        }

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication()
                    .withUser("shashijava")
                    .password(passwordEncoder().encode("shashijava123"))
                    .authorities("ADMIN");
        }

        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }
    }

