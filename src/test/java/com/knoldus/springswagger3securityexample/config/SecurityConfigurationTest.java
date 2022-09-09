package com.knoldus.springswagger3securityexample.config;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

class SecurityConfigurationTest {

    /**
     * Method under test: {@link SecurityConfiguration#passwordEncoder()}
     */
    @Test
    void testPasswordEncoder() {
        // TODO: Complete this test.

        (new SecurityConfiguration()).passwordEncoder();
    }
}

