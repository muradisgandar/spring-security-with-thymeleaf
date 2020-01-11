/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.main.service.impl;

import com.test.main.bean.CustomUserDetail;
import com.test.main.dao.UserDataInter;
import com.test.main.entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author murad_isgandar
 */
@Component
public class CustomUserDetailServiceImpl implements UserDetailsService{
    
    @Autowired
    private UserDataInter userDataInter;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userDataInter.findByUsername(username);
        List<GrantedAuthority> roles = new ArrayList<>();
        
        user.getRolesList().forEach(p ->{
            GrantedAuthority authority = new SimpleGrantedAuthority(p);
            roles.add(authority);
        
        });

        UserDetails userDetails = new CustomUserDetail(
                user,
                user.getUsername(),
                user.getPassword(),
                roles);

        return userDetails;
    }
}
    

