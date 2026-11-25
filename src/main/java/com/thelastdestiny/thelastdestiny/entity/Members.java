package com.thelastdestiny.thelastdestiny.entity;


import jakarta.persistence.*;

@Entity
@Table (name = "members")

public class Members {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String wowClass;
    private boolean active;
    @Column(name = "member_rank")
    private String rank;

    public Members() {}

    public Members(String name, String wowClass, boolean active, String rank) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid Name.");
        }
        if (wowClass == null || wowClass.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid Class.");
        }
        if (rank == null || rank.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid Rank.");
        }
        this.name = name;
        this.active = active;
        this.wowClass = wowClass;
        this.rank = rank;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public boolean isActive() { return active; }
    public String getRank() { return rank; }
    public String getWowClass() { return wowClass; }

    public void setName(String name) { this.name = name; }
    public void setWowClass(String wowClass) { this.wowClass = wowClass; }
    public void setActive(boolean active) { this.active = active; }
    public void setRank(String rank) { this.rank = rank; }

}
