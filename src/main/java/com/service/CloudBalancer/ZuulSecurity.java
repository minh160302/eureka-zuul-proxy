package com.service.CloudBalancer;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsUtils;

@Configuration
@EnableAutoConfiguration
public class ZuulSecurity extends WebSecurityConfigurerAdapter {

  @Override
  public void configure(HttpSecurity http) throws Exception {
    http.csrf().disable().antMatcher("/**")
            .authorizeRequests()
            .requestMatchers(CorsUtils::isPreFlightRequest).permitAll()
            .anyRequest().permitAll();
  }
}
