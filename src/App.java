import java.util.LinkedList;
import java.util.Scanner;
import java.util.UUID;

import model.Candidate;
import service.ServiceElection;

public class App {
    public static void main(String[] args) throws Exception {
        boolean sair = false;
        Scanner scanner = new Scanner(System.in);
        ServiceElection service = new ServiceElection(new LinkedList<Candidate>());
        do {
            System.out.println("1 - sair");
            System.out.println("2 - adicionar Candidato");
            System.out.println("3 - Remover candidato");
            System.out.println("4 - ver candidatos");
            System.out.println("5 - Ver informacoes");

            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    sair = true;
                    break;
                case 2:
                    Candidate c1 = new Candidate();
                    c1.setId(UUID.randomUUID());
                    System.out.println("Nome :");
                    c1.setName(scanner.next());
                    System.out.println("Idade :");
                    c1.setAge(scanner.nextInt());
                    System.out.println("numero de votos :");
                    c1.setNumberVotes(scanner.nextInt());
                    System.out.println("Partido politico :");
                    c1.setPoliticalParty(scanner.next());

                    service.addCandidate(c1);

                    break;
                case 3:
                    System.out.println("Digite o id :");
                    service.removeCandidate(UUID.fromString(scanner.next()));

                    break;

                case 4:
                    System.out.println(service.getCandidates().toString());

                    break;

                case 5:
                    System.out.println("Candidato mais Novo :" + service.getCandidateYounges().toString());
                    System.out.println("Candidato mais Velho :" + service.getCandidatOld().toString());
                    System.out.println("Candidato mais Votado :" + service.getMostVotedCandidate().toString());
                    System.out.println("Candidato menos Votado :" + service.getLeastvotedCandidate().toString());
                    System.out.println("Total de votos :" + service.getTotalVotes());
                    System.out.println("media de votos :" + service.getAverageVotes());

                    break;
                default:
                    break;
            }

        } while (sair == false);

    }
}
