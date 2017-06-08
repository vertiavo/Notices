package com.project.ejb;

import com.project.model.UserCredentials;

import javax.ejb.Stateless;

/**
 * Created by vertiavo on 07.06.17.
 */

@Stateless
public class UserCredentialsDao extends AbstractDao<UserCredentials, Long> {

    public UserCredentialsDao() {
        super(UserCredentials.class);
    }

}
