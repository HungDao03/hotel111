//package com.hotelmanager.service;
//
//import com.hotelmanager.entity.User;
//import com.hotelmanager.repository.UserRepository;
//import com.hotelmanager.sercurity.CustomUserDetails;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.userdetails.*;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class CustomUserDetailsService implements UserDetailsService {
//
//    private final UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
//        return new CustomUserDetails(user);
//    }
//}
