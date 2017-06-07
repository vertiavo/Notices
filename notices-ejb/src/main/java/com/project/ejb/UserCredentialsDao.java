package com.project.ejb;

import com.project.model.UserCredentials;

/**
 * Created by vertiavo on 07.06.17.
 */
public class UserCredentialsDao extends AbstractDao<UserCredentials, Long> {

    public UserCredentialsDao() {
        super(UserCredentials.class);
    }

}
