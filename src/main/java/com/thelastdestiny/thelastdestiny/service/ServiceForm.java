package com.thelastdestiny.thelastdestiny.service;

import com.thelastdestiny.thelastdestiny.entity.Apply;
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
