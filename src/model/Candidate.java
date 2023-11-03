package model;

public class Candidate extends Person {
    private String politicalParty;
    private String NumberVotes;

    // #region get e set

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        this.politicalParty = politicalParty;
    }

    public String getNumberVotes() {
        return NumberVotes;
    }

    public void setNumberVotes(String numberVotes) {
        NumberVotes = numberVotes;
    }

    // #endregion

    // #region constructor

    public Candidate() {
    }

    public Candidate(String name, int age, String politicalParty, String numberVotes) {
        super(name, age);
        this.politicalParty = politicalParty;
        NumberVotes = numberVotes;
    }

    //#endregion
}
