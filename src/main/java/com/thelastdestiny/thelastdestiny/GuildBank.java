package com.thelastdestiny.thelastdestiny;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuildBank {


    private final List<Sellable> bank = new ArrayList<>();

    public void addItem(Sellable item) {
        bank.add(item);
    }

    public List<Sellable> getBank() {
        return bank;
    }

    public Sellable getItem(int index) {
        if (index < 0 || index >= bank.size()) {
            return null;
        }
        return bank.get(index);
    }

    public int sellItem(int index, int quantity) {
        Sellable item = getItem(index);
        if (item == null) {
            return 0;
        }
        return item.getSell() * quantity;
    }
}
