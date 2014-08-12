package com.epam.catharina.entity;

import java.util.Date;
import java.util.UUID;

public class User {
    private UUID uuid;
    private String nickname;
    private String email;
    private MyRole myRole;
    private Sex gender;
    private Date birthday;

    public User(UUID uuid, String nickname, String email, MyRole myRole, Sex gender, Date birthday) {
        this.uuid = uuid;
        this.nickname = nickname;
        this.email = email;
        this.myRole = myRole;
        this.gender = gender;
        this.birthday = birthday;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MyRole getMyRole() {
        return myRole;
    }

    public void setMyRole(MyRole myRole) {
        this.myRole = myRole;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "uuid=" + uuid +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", myRole=" + myRole +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }
}
