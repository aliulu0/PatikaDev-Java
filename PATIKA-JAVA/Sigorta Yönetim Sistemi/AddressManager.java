package com.insuranceManagement;

public class AddressManager {
    public boolean add(User user,IAddress address) {
        if(user.getAdresses().add(address)) {
            return true;
        }
        return false;
    }

    public boolean remove(User user,int id) {
        if(user.getAdresses().remove(id) != null) {
            return true;
        }
        return false;

    }
}
