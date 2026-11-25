package com.thelastdestiny.thelastdestiny.entity;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pants_plate")
public class PantsPlate extends ItemWoW {

@ElementCollection
private List<String> attributes = new ArrayList<>();

    public PantsPlate() {}

    public PantsPlate(String name, String type, String spec, int price) {
        super(name, type, spec, price);
        this.attributes.add("Armor +220");
        this.attributes.add("Stamina +480");
        this.attributes.add("Strength +550");
    }

    public List<String> getAttributes() { return attributes; }
    public void setAttributes(List<String> attributes) { this.attributes = attributes; }
}
