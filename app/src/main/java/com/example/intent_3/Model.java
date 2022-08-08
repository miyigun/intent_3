package com.example.intent_3;

public class Model {
    String name;
    String surname;
    String tel;

    public Model(String name, String surname, String tel) {
        this.name = name;
        this.surname = surname;
        this.tel = tel;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
