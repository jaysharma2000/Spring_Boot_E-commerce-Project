package com.sheryians.major.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sheryians.major.modal.CustomUserDetail;
import com.sheryians.major.modal.User;
import com.sheryians.major.repository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService{
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        Optional <User> user = userRepository.findUserByEmail(email);
        user.orElseThrow(() -> new UsernameNotFoundException("user not found"));
        return user.map(CustomUserDetail::new).get();
    }

    
}
