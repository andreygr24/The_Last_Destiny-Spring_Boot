package com.thelastdestiny.thelastdestiny.Service;


public class Login {

    private String user;
    private String passWord;
    private int maxAttempts;
    private int attempts;

    public Login(String user, String passWord) {
        if (user == null || user.trim().isEmpty()) {
            throw new IllegalArgumentException("Write correctly the User");
        }
        if (passWord == null || passWord.trim().isEmpty()) {
            throw new IllegalArgumentException("Write correctly the Pass Word");
        }
        this.user = user;
        this.passWord = passWord;
        this.maxAttempts = 3;
        this.attempts = 0;
    }

    public boolean authenticator(String enterUser, String enterPassWord) {
        if (enterUser == null || enterUser.trim().isEmpty()) {
            throw new IllegalArgumentException("Write correctly the User");
        }
        if (enterPassWord == null || enterPassWord.trim().isEmpty()) {
            throw new IllegalArgumentException("Write correctly the Pass Word");
        }
        if (attempts >= maxAttempts) {
            throw new IllegalStateException("You don't have tries");
        }

        boolean access = user.equalsIgnoreCase(enterUser) && enterPassWord.equals(passWord);
        if (access) {
            attempts = 0;
            return true;
        } else {
            attempts++;
            return false;
        }
    }

    public int getRemainingAttempts() {
        return maxAttempts - attempts;
    }
}
