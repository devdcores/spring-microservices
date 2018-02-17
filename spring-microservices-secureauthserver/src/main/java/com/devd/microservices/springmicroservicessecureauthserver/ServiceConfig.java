package com.devd.microservices.springmicroservicessecureauthserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

/**
 * Created by Devaraj Reddy on 2/17/2018.
 */
@Configuration
public class ServiceConfig extends GlobalAuthenticationConfigurerAdapter {

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("agoldberg").password("pass1").roles("USER").and()
                .withUser("bgoldberg").password("pass2").roles("USER", "OPERATOR");
    }

}