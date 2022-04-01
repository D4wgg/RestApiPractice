package ru.dawgg.bookmarket.security.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@ComponentScan(basePackages = "ru.dawgg")
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/").authenticated()
                    .antMatchers("/login").permitAll()
                    .antMatchers("/signUp").permitAll()
                    .anyRequest().authenticated()
                .and()
                .formLogin()
                    .loginPage("/login")
                    .usernameParameter("login")
                    .defaultSuccessUrl("/")
                    .permitAll()
                .and()
                    .csrf().disable();

    }
}
