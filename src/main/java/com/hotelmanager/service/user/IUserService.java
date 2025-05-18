package com.hotelmanager.service.user;

import com.hotelmanager.entity.User;
import com.hotelmanager.service.IGenericService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface IUserService extends IGenericService<User> {

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
