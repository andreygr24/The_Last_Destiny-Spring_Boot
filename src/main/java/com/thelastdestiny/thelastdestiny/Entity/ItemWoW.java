package com.thelastdestiny.thelastdestiny.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ItemWoW implements Sellable {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;


    protected String name;
    protected String type;
    protected String spec;
    protected int price;

    public ItemWoW() {}

    public ItemWoW(String name, String type, String spec, int price) {
        this.name = name;
        this.type = type;
        this.spec = spec;
        this.price = price;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }
    public String getSpec() { return spec; }
    public int getPrice() { return price; }

    @Override
    public int getSell() { return price; }

    public void setName(String name) { this.name = name; }
    public void setType(String type) { this.type = type; }
    public void setSpec(String spec) { this.spec = spec; }
    public void setPrice(int price) { this.price = price; }


}
