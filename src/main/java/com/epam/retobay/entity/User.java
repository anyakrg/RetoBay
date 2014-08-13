package com.epam.retobay.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class User {
    private UUID uuid;
    private String login;
    //    private String nickname/real name?;
    private String password;
    private String email;
    private Role role;
    private Sex gender;

    public User(UUID uuid, String login, String password, String email, Role role, Sex gender) {
        this.uuid = uuid;
        this.login = login;
        this.password = password;
        this.email = email;
        this.role = role;
        this.gender = gender;
    }
    public User() {
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "uuid=" + uuid +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", myRole=" + role +
                ", gender=" + gender +

                '}';
    }

    public static class Builder {
        private final static Logger log = LoggerFactory.getLogger(Builder.class);
        private UUID uuid;
        private String login;
        private String password;
        private String email;
        private Role role;
        private Sex gender;

        public Builder() {
        }

        public Builder uuid(UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder login(String login) {
            this.login = login;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder role(String role) {
            this.role = Role.valueOf(role);
            return this;
        }

        public Builder gender(String gender) {
            this.gender = Sex.valueOf(gender);
            return this;
        }

        public User buildUser() {

            User returnedUser = new User(uuid,
                    login,
                    password,
                    email,
                    role,
                    gender);
            log.info("User Created. login={}", login);
            return returnedUser;
        }
    }

    public enum Role {
        ADMIN, CLIENT
    }

    public enum Sex {
        MALE, FEMALE
    }
}

