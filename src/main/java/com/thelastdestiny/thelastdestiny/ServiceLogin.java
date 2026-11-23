package com.thelastdestiny.thelastdestiny;


import org.springframework.stereotype.Service;

@Service
public class ServiceLogin {


    private Login login;

    public ServiceLogin() {
        try {
            this.login = new Login("Andrey", "240490");
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong data!" + e.getMessage());
        }
    }

    public boolean loginUser(String userInput, String passInput) {
        try {
            return login.authenticator(userInput, passInput);
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println("Wrong data!" + e.getMessage());
            return false;
        }
    }

    public int getMaxAttempts() {
        return login.getRemainingAttempts();
    }

}
