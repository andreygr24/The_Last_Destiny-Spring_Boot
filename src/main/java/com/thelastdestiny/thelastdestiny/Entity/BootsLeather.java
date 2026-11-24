package com.thelastdestiny.thelastdestiny.Entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "boots_leather")
public class BootsLeather extends ItemWoW {

@ElementCollection
private List<String> attributes = new ArrayList<>();

    public BootsLeather() {}

    public BootsLeather(String name, String type, String spec, int price) {
        super(name, type, spec, price);
        this.attributes.add("Stamina +550");
        this.attributes.add("Armor +250");
        this.attributes.add("Agility +300");
    }

    public List<String> getAttributes() { return attributes; }
    public void setAttributes(List<String> attributes) { this.attributes = attributes; }
}
