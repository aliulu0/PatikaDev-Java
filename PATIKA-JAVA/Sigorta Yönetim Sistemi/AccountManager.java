package com.insuranceManagement;

import java.util.ArrayList;
import java.util.TreeSet;

public class AccountManager {
    TreeSet<Account> dataList = new TreeSet<Account>();

    public void login(String mail,String password) {

        for(User user : list()) {
            try {
                Account.AuthenticationStatus(user.getEmail(),user.getPassword(),mail,password);
            } catch (InvalidAuthenticationException e) {
                e.printStackTrace();
            }
        }


    }

    public ArrayList<User> list() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "Ali", "Ulu", "ali.u@gmail.com", "123", "futbolcu", 24,null, null,null));
        return users;
    }
}
