package com.thelastdestiny.thelastdestiny.Service;

import com.thelastdestiny.thelastdestiny.Entity.Apply;
import org.springframework.stereotype.Service;

@Service
public class ServiceForm {

    public Apply createForm(String name, String email, String country, int age, String mainCharacter, String role, String spec,
                            String tellMeAboutYourSelf) {
        try {
            return new Apply(name, email, country, age, mainCharacter, role, spec, tellMeAboutYourSelf);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
