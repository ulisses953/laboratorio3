package test.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

import model.Candidate;
import service.ServiceElection;

public class TestServiceElection {
    @Test
    public void addCandidate(){
        ServiceElection serviceElection = new ServiceElection(new LinkedList<Candidate>());
        Candidate ca1 = new Candidate(UUID.randomUUID(),"Ulisses",19,"Mundo Novo",20);
        assertEquals(true, serviceElection.addCandidate(ca1));
    }

    @Test
    public void removeCandidate(){
        List<Candidate> list= new LinkedList<Candidate>();
        Candidate ca1 = new Candidate(UUID.randomUUID(),"Ulisses",19,"Mundo Novo",20);
        list.add(ca1);
        ServiceElection serviceElection = new ServiceElection(list);
        
        assertEquals(true, serviceElection.removeCandidate(ca1.getId()));
    }
    @Test
    public void getCandidates(){
        List<Candidate> list= new LinkedList<Candidate>();
        Candidate ca1 = new Candidate(UUID.randomUUID(),"Ulisses",19,"Mundo Novo",20);
        list.add(ca1);

        ServiceElection serviceElection = new ServiceElection(list);
        
        assertEquals(ca1, serviceElection.getCandidate(ca1.getId()).get());
    }

    @Test
    public void getCandidateYounges(){
        List<Candidate> list= new LinkedList<Candidate>();
        Candidate ca1 = new Candidate(UUID.randomUUID(),"Ulisses",19,"Mundo Novo",20);
        Candidate ca2 = new Candidate(UUID.randomUUID(),"Ulisses",30,"Mundo Novo",20);

        list.add(ca1);
        list.add(ca2);


        ServiceElection serviceElection = new ServiceElection(list);
        
        assertEquals(ca1.getAge(), serviceElection.getCandidateYounges().getAge());
    }

    @Test
    public void getCandidatOld(){
        List<Candidate> list= new LinkedList<Candidate>();
        Candidate ca1 = new Candidate(UUID.randomUUID(),"Ulisses",19,"Mundo Novo",20);
        Candidate ca2 = new Candidate(UUID.randomUUID(),"Ulisses2",30,"Mundo Novo",20);

        list.add(ca1);
        list.add(ca2);


        ServiceElection serviceElection = new ServiceElection(list);
        
        assertEquals(ca2.getAge(), serviceElection.getCandidatOld().getAge());
    }

    @Test
    public void getMostVotedCandidate(){
        List<Candidate> list= new LinkedList<Candidate>();
        Candidate ca1 = new Candidate(UUID.randomUUID(),"Ulisses",19,"Mundo Novo",20);
        Candidate ca2 = new Candidate(UUID.randomUUID(),"Ulisses2",30,"Mundo Novo",30);

        list.add(ca1);
        list.add(ca2);


        ServiceElection serviceElection = new ServiceElection(list);
        
        assertEquals(ca2.getNumberVotes(), serviceElection.getMostVotedCandidate().getNumberVotes());
    }

    @Test
    public void getLeastvotedCandidate(){
        List<Candidate> list= new LinkedList<Candidate>();
        Candidate ca1 = new Candidate(UUID.randomUUID(),"Ulisses",19,"Mundo Novo",20);
        Candidate ca2 = new Candidate(UUID.randomUUID(),"Ulisses2",30,"Mundo Novo",30);

        list.add(ca1);
        list.add(ca2);


        ServiceElection serviceElection = new ServiceElection(list);
        
        assertEquals(ca1.getNumberVotes(), serviceElection.getLeastvotedCandidate().getNumberVotes());
    }

    @Test
    public void getTotalVotes(){
        List<Candidate> list= new LinkedList<Candidate>();
        Candidate ca1 = new Candidate(UUID.randomUUID(),"Ulisses",19,"Mundo Novo",20);
        Candidate ca2 = new Candidate(UUID.randomUUID(),"Ulisses2",30,"Mundo Novo",30);

        list.add(ca1);
        list.add(ca2);


        ServiceElection serviceElection = new ServiceElection(list);

        assertTrue(50 == serviceElection.getTotalVotes());
        
    }

    @Test
    public void getAverageVotes(){
        List<Candidate> list= new LinkedList<Candidate>();
        Candidate ca1 = new Candidate(UUID.randomUUID(),"Ulisses",19,"Mundo Novo",20);
        Candidate ca2 = new Candidate(UUID.randomUUID(),"Ulisses2",30,"Mundo Novo",30);

        list.add(ca1);
        list.add(ca2);


        ServiceElection serviceElection = new ServiceElection(list);

        assertTrue(25 == serviceElection.getAverageVotes());
    }


    
}
