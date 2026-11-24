package com.thelastdestiny.thelastdestiny.Entity;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "wrist_cloth")
public class WristCloth extends ItemWoW {

@ElementCollection
private List<String> attributes = new ArrayList<>();

    public WristCloth() {}

    public WristCloth(String name, String type, String spec, int price) {
        super(name, type, spec, price);
        this.attributes.add("Power Spell +330");
        this.attributes.add("Intellect +100");
        this.attributes.add("Stamina +450");
    }

    public List<String> getAttributes() { return attributes; }
    public void setAttributes(List<String> attributes) { this.attributes = attributes; }
}
