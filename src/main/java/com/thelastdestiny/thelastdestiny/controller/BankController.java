package com.thelastdestiny.thelastdestiny.controller;

import com.thelastdestiny.thelastdestiny.entity.*;
import com.thelastdestiny.thelastdestiny.service.GuildBank;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankController {

    private final GuildBank guildBank;

    public BankController(GuildBank guildBank) {
        this.guildBank = guildBank;
        guildBank.addItem(new HeadPlate("Helm of Valor", "Plate", "Warrior", 500));
        guildBank.addItem(new ChestCloth("Robe of Power", "Cloth", "Mage", 450));
        guildBank.addItem(new BootsLeather("Boots of Speed", "Leather", "Rogue", 300));
        guildBank.addItem(new PantsPlate("Legs of Power", "Plate", "Warrior", 550));
        guildBank.addItem(new WristCloth("Wrist of Intellect", "Cloth", "Mage", 250));
    }

    @GetMapping("/bank")
    public List<Sellable> getBank() {
        return guildBank.getBank();
    }

}
