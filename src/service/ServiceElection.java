package service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import model.Candidate;
import model.Elections;

public class ServiceElection {
    private Elections elections;

    public boolean addCandidate(UUID id,String name,int age,String politicalParty,int numberVotes){
       return elections.getCandidates().add(new Candidate(id,name,age,politicalParty,numberVotes));
    }

    public boolean addCandidate(Candidate candidate){
       return elections.getCandidates().add(candidate);
    } 

    public boolean removeCandidate(UUID id){
        return elections.getCandidates().removeIf(ca -> ca.getId()==id);
    }
    public Optional<Candidate> getCandidate(UUID id){
        for (Candidate ca : elections.getCandidates()) {
            if (ca.getId() == id) {
                return Optional.of(ca);
            }
        }
        return Optional.empty();
    }
    public List<Candidate> getCandidates(){
        return elections.getCandidates();
    }


    public Candidate getCandidateYounges(){
        Candidate candidateYounges = elections.getCandidates().get(0);

        for (Candidate candidate : elections.getCandidates()) {
            if (candidate.getAge() < candidateYounges.getAge()) {
                candidateYounges = candidate;
            }
        }

        return candidateYounges;
    }

    public Candidate getCandidatOld(){
    Candidate CandidatOld = elections.getCandidates().get(0);

        for (Candidate candidate : elections.getCandidates()) {
            if (candidate.getAge() > CandidatOld.getAge()) {
                CandidatOld = candidate;
            }
        }

        return CandidatOld;
    }

    public Candidate getMostVotedCandidate(){
    Candidate MostVotedCandidate = elections.getCandidates().get(0);

        for (Candidate candidate : elections.getCandidates()) {
            if (candidate.getNumberVotes() > MostVotedCandidate.getNumberVotes()) {
                MostVotedCandidate = candidate;
            }
        }

        return MostVotedCandidate;
    }

    public Candidate getLeastvotedCandidate(){
    Candidate LeastvotedCandidate = elections.getCandidates().get(0);

        for (Candidate candidate : elections.getCandidates()) {
            if (candidate.getNumberVotes()< LeastvotedCandidate.getNumberVotes()) {
                LeastvotedCandidate = candidate;
            }
        }

        return LeastvotedCandidate;
    }

    public Integer getTotalVotes(){
        Integer totalVotes = 0;

        for (Candidate candidate : elections.getCandidates()) {
            totalVotes += candidate.getNumberVotes();
        }

        return totalVotes;
    }

    public Double getAverageVotes(){
        return (double) (getTotalVotes() / elections.getCandidates().size());
    }

    public Elections getElections() {
        return elections;
    }

    public void setElections(Elections elections) {
        this.elections = elections;
    }

    public ServiceElection(Elections elections) {
        this.elections = elections;
    }
    public ServiceElection(List<Candidate> candidates) {
        this.elections = new Elections(candidates);
    }
    

}

