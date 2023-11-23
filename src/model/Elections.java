package model;

import java.util.List;

public class Elections {
    private List<Candidate> candidates;

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    public Elections() {
    }

    public Elections(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    
    



}
