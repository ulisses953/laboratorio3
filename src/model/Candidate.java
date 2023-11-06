package model;

public class Candidate extends Person {
    private String politicalParty;
    private int numberVotes;

    // #region get e set

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        this.politicalParty = politicalParty;
    }

    public int getNumberVotes() {
        return numberVotes;
    }

    public void setNumberVotes(int numberVotes) {
        this.numberVotes = numberVotes;
    }

    // #endregion

    // #region constructor

    public Candidate() {
    }

    public Candidate(String name, int age, String politicalParty, int numberVotes) {
        super(name, age);
        this.politicalParty = politicalParty;
        this.numberVotes = numberVotes;
    }

    //#endregion
}
