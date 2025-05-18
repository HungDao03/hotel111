package com.hotelmanager.security;

import com.hotelmanager.entity.User;
import com.hotelmanager.entity.UserPrinciple;
import com.hotelmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);
        return UserPrinciple.build(user.orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username)));
    }
}