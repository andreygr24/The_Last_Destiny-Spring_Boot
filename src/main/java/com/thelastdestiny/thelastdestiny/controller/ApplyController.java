package com.thelastdestiny.thelastdestiny.controller;


import com.thelastdestiny.thelastdestiny.entity.Apply;
import com.thelastdestiny.thelastdestiny.service.ServiceForm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApplyController {

    private final List<Apply> applies = new ArrayList<>();
    private final ServiceForm serviceForm;

    public ApplyController(ServiceForm serviceForm) {
        this.serviceForm = serviceForm;

        Apply demo = serviceForm.createForm("Demo", "demo@test.com", "CR", 20, "DemoChar", "RDPS", "Affliction",
                "I want to join");
        if (demo != null) {
            applies.add(demo);
        }
    }

    @GetMapping("/apply")
    public List<Apply> getApplies() {
        return applies;
    }

    @PostMapping("/apply")
    public Apply createApply(@RequestBody Apply apply) {
        Apply created = serviceForm.createForm(
                apply.getName(), apply.getEmail(), apply.getCountry(),
                apply.getAge(), apply.getMainCharacter(),
                apply.getRole(), apply.getSpec(), apply.getTellMeAboutYourSelf()
        );
        if (created != null) {
            applies.add(created);
        }
        return created;
    }
}
