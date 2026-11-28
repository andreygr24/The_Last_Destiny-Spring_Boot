    package com.thelastdestiny.thelastdestiny.service;

    import com.thelastdestiny.thelastdestiny.entity.Apply;
    import com.thelastdestiny.thelastdestiny.entity.ApplyStatus;
    import org.springframework.stereotype.Service;

    import java.util.ArrayList;
    import java.util.List;

    @Service
    public class ServiceForm {

        private List<Apply> applies = new ArrayList<>();

        public List<Apply> getAll(){
            return applies;
        }

        public Apply createForm(String name, String email, String country, int age, String mainCharacter, String role, String spec,
                                String tellMeAboutYourSelf) {
            try {
                Apply a = new Apply (name, email, country, age, mainCharacter, role, spec, tellMeAboutYourSelf);
                applies.add(a);
                return  a;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return null;
            }
        }

        public Apply findById(Long id){
            for (Apply a : applies){
                if (a.getId() != null && a.getId().equals(id)){
        return a;
                }
            }
            return  null;
        }

        public Apply approve (Long id){
            Apply a = findById(id);
            if (a != null && a.getStatus() == ApplyStatus.PENDING){
                a.setStatus(ApplyStatus.APPROVED);
                return a;
            }
            return  null;
        }

        public Apply reject(Long id) {
            Apply a = findById (id);
            if (a != null && a.getStatus() == ApplyStatus.PENDING){
                a.setStatus(ApplyStatus.REJECTED);
                return a;
            }
            return null;
        }

    }
