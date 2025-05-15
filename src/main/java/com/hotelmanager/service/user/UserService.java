package com.hotelmanager.service.user;

import com.hotelmanager.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.hotelmanager.repository.UserRepository;

import java.util.List;

public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
