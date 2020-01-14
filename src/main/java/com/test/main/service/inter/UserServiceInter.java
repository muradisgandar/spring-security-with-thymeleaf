/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.main.service.inter;

import com.test.main.entity.User;

/**
 *
 * @author murad_isgandar
 */
public interface UserServiceInter {
    
     User findByEmail(String email);
}
