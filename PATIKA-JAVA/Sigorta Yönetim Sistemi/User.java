package com.insuranceManagement;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String job;
    private int age;
    private ArrayList<IAddress> adresses;
    private Date lastLogin;
    private ArrayList<Insurance> insurances;

    public User(int id, String name, String surname, String email, String password, String job, int age, ArrayList<IAddress> adresses, Date lastLogin, ArrayList<Insurance> insurances) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.adresses = adresses;
        this.lastLogin = lastLogin;
        this.insurances = insurances;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<IAddress> getAdresses() {
        return adresses;
    }

    public void setAdresses(ArrayList<IAddress> adresses) {
        this.adresses = adresses;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }
}
