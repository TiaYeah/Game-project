package ru.tiayeah.core;

public class UserInfoDTO {
    private int id;
    private String username;
    private String email;
    private boolean emailConfirm;
    private Role role;

    public UserInfoDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEmailConfirm() {
        return emailConfirm;
    }

    public void setEmailConfirm(boolean emailConfirm) {
        this.emailConfirm = emailConfirm;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserInfoDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", emailConfirm=" + emailConfirm +
                ", role=" + role +
                '}';
    }
}
