package com.thelastdestiny.thelastdestiny.Service;

import com.thelastdestiny.thelastdestiny.Entity.Members;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceMembers {
    private final List<Members> members = new ArrayList<>();

    public void addMember(Members m) {
        members.add(m);
    }

    public void loadMembers() {
        members.add(new Members("Lucky mage", "Mage", true, "Raider"));
        members.add(new Members("Marcux", "Warrior", true, "Core raider"));
        members.add(new Members("Arcinesa", "Priest", true, "Officer"));
        members.add(new Members("Tony Hunter", "Hunter", true, "Sub GM"));
        members.add(new Members("Weskerxd", "Paladin", true, "Sub GM"));
        members.add(new Members("Mix", "Priest", true, "GM"));
        members.add(new Members("Wonderland", "Paladin", true, "GM"));
        members.add(new Members("Long Cat", "Priest", true, "Core Raider"));
        members.add(new Members("Apahea", "Hunter", true, "Raider"));
        members.add(new Members("Dark Soul", "Warlock", true, "Core Raider"));
        members.add(new Members("OMG Banana", "Druid", true, "Trial"));
        members.add(new Members("Nightmare", "Warrior", true, "Trial"));
        members.add(new Members("Love My Rogue", "Rogue", true, "Raider"));
        members.add(new Members("Mi masme", "Mage", true, "Core Raider"));
        members.add(new Members("Azir", "Druid", true, "Core Raider"));
    }

    public List<Members> getMembers() { return members; }
}
