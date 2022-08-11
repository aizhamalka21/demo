package com.example.Money.confing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/user/**").permitAll()
                .antMatchers(HttpMethod.GET,"/user/userCreate/**").fullyAuthenticated()
                .antMatchers(HttpMethod.GET, "/user/**").hasRole("ADMIN")

                .antMatchers(HttpMethod.GET,"/user/get-current/**").fullyAuthenticated()
                .antMatchers(HttpMethod.GET,"/user/getAll/**").fullyAuthenticated()
                .antMatchers(HttpMethod.GET,"/user/getByUserId/{id}/**").fullyAuthenticated()
                .antMatchers(HttpMethod.GET,"/user/sing-in/**").fullyAuthenticated()

                .antMatchers(HttpMethod.DELETE,"/user/deleteUser/**").fullyAuthenticated()
                .antMatchers(HttpMethod.DELETE,"/user/updateUser/**").fullyAuthenticated()
                .anyRequest().permitAll()
                .and()
                .httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select username, password, active from users where username=?")
                .authoritiesByUsernameQuery
                        ("select u.username, ur.role_name as role from user_role ur inner join users u on ur.user_id = " +
                                "u.id where u.username=? and u.active=1");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
