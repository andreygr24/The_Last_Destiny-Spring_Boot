package com.thelastdestiny.thelastdestiny.entity;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "head_plate")
public class HeadPlate extends ItemWoW {

    @ElementCollection
    private List<String> attributes = new ArrayList<>();

    public HeadPlate() {}

    public HeadPlate(String name, String type, String spec, int price) {
        super(name, type, spec, price);
        this.attributes.add("Armor +100");
        this.attributes.add("Strength +150");
        this.attributes.add("Stamina +110");
    }

    public List<String> getAttributes() { return attributes; }
    public void setAttributes(List<String> attributes) { this.attributes = attributes; }


}
