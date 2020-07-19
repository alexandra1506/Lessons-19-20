package model;

import java.util.Date;

public class FamilyMember extends Man {

    private String kinship; // родственная связь

    public FamilyMember(String name, Date birth, char sex) {
        super(name, birth, sex);
    }

    public String getKinship() {
        return kinship;
    }

    public void setKinship(String kinship) {
        this.kinship = kinship;
    }
}
