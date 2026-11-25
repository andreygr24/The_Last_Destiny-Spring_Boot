package com.thelastdestiny.thelastdestiny.service;

import com.thelastdestiny.thelastdestiny.entity.Apply;
import com.thelastdestiny.thelastdestiny.entity.Sellable;

import java.util.List;

public class Invoice {

    private final Apply buyer;
    private final List<Sellable> items;
    private final int total;

    public Invoice(Apply buyer, List<Sellable> items) {
        this.buyer = buyer;
        this.items = items;
        this.total = items.stream().mapToInt(Sellable::getSell).sum();
    }

    public int getTotalWithDiscount(String rank) {
        return switch (rank) {
            case "Core Raider" -> total * 80 / 100;
            case "Raider" -> total * 90 / 100;
            case "Member" -> total * 95 / 100;
            default -> total;
        };
    }

    public int getTotal() { return total; }
    public List<Sellable> getItems() { return items; }
    public Apply getBuyer() { return buyer; }
  }
