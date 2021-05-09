//package com.codecool.springsecurityexample.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth, PasswordEncoder passwordEncoder) throws Exception {
//        auth.jdbcAuthentication()
//            .dataSource(dataSource);
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//
//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.authorizeRequests()
//            .antMatchers("/index.html")
//            .permitAll()
//            .anyRequest()
//            .authenticated()
//            .and()
//            .formLogin()
//            .and()
//            .logout(logout -> logout
//                .logoutUrl("/perform_logout")
//                .invalidateHttpSession(true)
//                .deleteCookies("JSESSIONID")
//            );
//
//        httpSecurity.csrf().ignoringAntMatchers("/perform_logout");
//
//        httpSecurity.headers()
//            .frameOptions()
//            .sameOrigin();
//    }
//}
