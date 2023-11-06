package model;

import java.util.Date;
import java.util.List;

public class CandidatesElections {
    private List<Candidate> candidates;
    private Date data;

    // #region get e set
    public List<Candidate> getCandidates() {
        return candidates;
    }
    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    // #endregion
    // #region constructor
    public CandidatesElections() {
    }
    public CandidatesElections(List<Candidate> candidates, Date data) {
        this.candidates = candidates;
        this.data = data;
    }
    // #endregion
}