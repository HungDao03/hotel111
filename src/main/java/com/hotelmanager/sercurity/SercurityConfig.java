//package com.hotelmanager.sercurity;
//
//import com.hotelmanager.repository.UserRepository;
//import com.hotelmanager.service.CustomUserDetailsService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.ProviderManager;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
//import org.springframework.security.web.SecurityFilterChain;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableWebSecurity
//public class SercurityConfig {
//
//    // Dùng JDBC để load user từ database
////    @Bean
////    public UserDetailsService userDetailsService(DataSource dataSource) {
////        return new JdbcUserDetailsManager(dataSource);
////    }
//
//    // Password encoder để kiểm tra password (bcrypt)
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder(10);
//    }
//    @Bean
//    public UserDetailsService userDetailsService(UserRepository userRepository) {
//        return new CustomUserDetailsService(userRepository);
//    }
//
//
//    // AuthenticationManager với DaoAuthenticationProvider
//    @Bean
//    public AuthenticationManager authenticationManager(UserDetailsService userDetailsService,
//                                                       PasswordEncoder passwordEncoder) {
//        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//        provider.setUserDetailsService(userDetailsService);
//        provider.setPasswordEncoder(passwordEncoder);
//        return new ProviderManager(provider);
//    }
//
//    // Cấu hình bảo mật
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(AbstractHttpConfigurer::disable)
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/admin/**").hasRole("ADMIN")
//                        .requestMatchers("/user/**").hasRole("USER")
//                        .anyRequest().permitAll()
//                )
//                .formLogin(form -> form
////                        .loginPage("/login")
//                        .successHandler(customSuccessHandler())
//                        .permitAll()
//                )
//                .logout(logout -> logout
//                        .logoutSuccessUrl("/login?logout")
//                        .permitAll()
//                );
//
//        return http.build();
//    }
//
//    // Bean cho success handler
//    @Bean
//    public CustomerSuccessHandle customSuccessHandler() {
//        return new CustomerSuccessHandle();
//    }
//}
