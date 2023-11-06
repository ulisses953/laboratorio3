package service;

import java.util.ArrayList;
import java.util.List;

import model.Candidate;
import model.CandidatesElections;

public class ServiceCandidatesElections {
    /**
     * 
     * @param candidate candidate to be inserted
     * @param candidatesElections 
     * @return
     */
    public Candidate addCandidate(Candidate candidate,CandidatesElections candidatesElections){
        List candidatos = candidatesElections.getCandidates();

        candidatos.add(candidate);

        candidatesElections.setCandidates(candidatos);

        return candidate;
    }

    public Candidate findByCPF(String cpf, CandidatesElections candidatesElections){
        
    }

}
