/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.main.bean;

import com.test.main.entity.User;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author murad_isgandar
 */
public class CustomUserDetail extends org.springframework.security.core.userdetails.User {

    private User user;

    public CustomUserDetail(User user, String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }

}
