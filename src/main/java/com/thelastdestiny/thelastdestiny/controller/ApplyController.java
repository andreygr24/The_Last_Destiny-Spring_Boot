package com.thelastdestiny.thelastdestiny.controller;


import com.thelastdestiny.thelastdestiny.entity.Apply;
import com.thelastdestiny.thelastdestiny.service.ServiceForm;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApplyController {

    private final ServiceForm serviceForm;


    public ApplyController(ServiceForm serviceForm) {

        this.serviceForm = serviceForm;
        serviceForm.createForm("Demo", "demo@test.com", "CR", 20, "DemoChar", "RDPS", "Affliction",
                "I want to join");
    }

    @GetMapping("/apply")
    public List<Apply> getApplies() { return serviceForm.getAll();}

    @PostMapping("/apply")
    public Apply createApply(@RequestBody Apply apply) {
        return serviceForm.createForm(
                apply.getName(), apply.getEmail(), apply.getCountry(),
                apply.getAge(), apply.getMainCharacter(),
                apply.getRole(), apply.getSpec(), apply.getTellMeAboutYourSelf()
        );
    }

    @PatchMapping ("/apply/{id}/approve")
    public Apply approve(@PathVariable Long id){
        return serviceForm.approve(id);
    }
    @PatchMapping ("/apply/{id}/reject")

    public Apply reject (@PathVariable Long id){
        return serviceForm.reject(id);
    }


}
