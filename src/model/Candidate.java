package model;

import java.util.UUID;

public class Candidate extends Person {
    
    private String politicalParty;
    private Integer numberVotes;

    // #region get e set

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        this.politicalParty = politicalParty;
    }

    public Integer getNumberVotes() {
        return numberVotes;
    }

    public void setNumberVotes(Integer numberVotes) {
        this.numberVotes = numberVotes;
    }

    // #endregion

    // #region constructor

    public Candidate() {
    }

    public Candidate(UUID id,String name, int age, String politicalParty, int numberVotes) {
        super(id,name, age);
        this.politicalParty = politicalParty;
        this.numberVotes = numberVotes;
    }

    @Override
    public String toString() {
        return "Candidate [id=" + super.getId() +  ", name="+ super.getName() + ", age=" + super.getAge()+", politicalParty=" + politicalParty + ", numberVotes=" + numberVotes + "] \n";
    }

    
    //#endregion

    
}
