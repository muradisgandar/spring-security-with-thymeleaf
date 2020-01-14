/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.main.service.impl;

import com.test.main.dao.UserDataInter;
import com.test.main.entity.User;
import com.test.main.service.inter.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author murad_isgandar
 */
@Service
public class UserServiceImpl implements UserServiceInter{
    
    @Autowired
    UserDataInter userDataInter;
    
    @Override
    public User findByEmail(String email) {
//        return userDataInter.findByUsername(username);
        return userDataInter.findByEmail(email);
        
    }
    
}
