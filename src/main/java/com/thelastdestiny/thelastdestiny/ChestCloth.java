package com.thelastdestiny.thelastdestiny;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "chest_cloth")
public class ChestCloth extends ItemWoW {

@ElementCollection
private List<String> attributes = new ArrayList<>();

    public ChestCloth() {}

    public ChestCloth(String name, String type, String spec, int price) {
        super(name, type, spec, price);
        this.attributes.add("Spirit +150");
        this.attributes.add("Stamina +250");
        this.attributes.add("Power Spell +550");
    }

    public List<String> getAttributes() { return attributes; }
    public void setAttributes(List<String> attributes) { this.attributes = attributes; }

}
