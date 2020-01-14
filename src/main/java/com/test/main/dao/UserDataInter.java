/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.main.dao;

import com.test.main.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author murad_isgandar
 */
@Repository
public interface UserDataInter extends JpaRepository<User, Integer> {

//    User findByUsername(String username);
    
     User findByEmail(String email);

}
