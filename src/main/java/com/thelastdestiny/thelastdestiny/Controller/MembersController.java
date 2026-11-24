package com.thelastdestiny.thelastdestiny.Controller;


import com.thelastdestiny.thelastdestiny.Entity.Members;
import com.thelastdestiny.thelastdestiny.Service.ServiceMembers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MembersController {

    private final ServiceMembers serviceMembers;

    public MembersController(ServiceMembers serviceMembers) {
        this.serviceMembers = serviceMembers;
        this.serviceMembers.loadMembers();
    }

    @GetMapping("/members")
    public List<Members> getMembers() {
        return serviceMembers.getMembers();
    }
}
