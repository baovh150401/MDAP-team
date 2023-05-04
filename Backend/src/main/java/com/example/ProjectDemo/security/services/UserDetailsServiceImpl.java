package com.example.ProjectDemo.security.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.ProjectDemo.models.User;
import com.example.ProjectDemo.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    /**
     * Override phương thức trong class UserDetailsService
     *
     * @param username
     * @return UserDetailsImpl là implements của UserDetails (UserDetails là đối tượng Spring security sử dụng để authen và authorize)
     * @throws UsernameNotFoundException
     */
    @Override
    @Transactional
    public UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

        return UserDetailsImpl.build(user);
    }
}