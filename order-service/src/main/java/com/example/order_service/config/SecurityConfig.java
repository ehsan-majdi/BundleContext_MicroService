//package com.example.order_service.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/public/**").permitAll()  // دسترسی عمومی
//                .anyRequest().authenticated()          // نیاز به احراز هویت برای سایر درخواست‌ها
//                .and()
//                .formLogin()
//                .loginPage("/login")                    // صفحه لاگین سفارشی
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
//    }
//}