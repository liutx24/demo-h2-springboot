package com.exampleh2data.demoh2springboot.entity;

import javax.persistence.*;

@Entity
@Table(name = "dockompatibility")
public class DockCompatibilityEntity {

    public DockCompatibilityEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String DockPn;
    @Column
    private String DockDescription;
    @Column
    private String CompatibilityPn;
    @Column
    private String CompDescription;
    @Column
    private String FootNoteId;
    @Column
    private String FootNoteText;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDockPn() {
        return DockPn;
    }

    public String getFootNoteId() {
        return FootNoteId;
    }

    public String getFootNoteText() {
        return FootNoteText;
    }

    public void setFootNoteText(String footNoteText) {
        FootNoteText = footNoteText;
    }

    public void setFootNoteId(String footNoteId) {
        FootNoteId = footNoteId;
    }

    public String getCompDescription() {
        return CompDescription;
    }

    public void setCompDescription(String compDescription) {
        CompDescription = compDescription;
    }

    public void setDockPn(String dockPn) {
        DockPn = dockPn;
    }

    public String getDockDescription() {
        return DockDescription;
    }

    public String getCompatibilityPn() {
        return CompatibilityPn;
    }

    public void setCompatibilityPn(String compatibilityPn) {
        CompatibilityPn = compatibilityPn;
    }

    public void setDockDescription(String dockDescription) {
        DockDescription = dockDescription;
    }
}

