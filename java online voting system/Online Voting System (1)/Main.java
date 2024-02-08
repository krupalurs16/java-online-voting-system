import elections.Contestant;
import elections.Election;
import elections.process.ElectionProcess;
import elections.process.ElectionProcessImpl;
import elections.types.panchayat.PanchayatElection;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Election election = new PanchayatElection(); // Declaring Objects
        ElectionProcess electionProcess = new ElectionProcessImpl(election); // Instant variables of different data types // Objects as parameters
        electionProcess.startElection();
        Map<Contestant, Integer> results = electionProcess.getResults();
        List<Contestant> winners = electionProcess.getWinners();

        System.out.println("---------------------------------------------------------------------------------");
        for(Map.Entry<Contestant, Integer> voteCountEntry : results.entrySet()){
            System.out.println(voteCountEntry.getKey().getName() + " with " + voteCountEntry.getValue() + " vote(s)");
        }
        System.out.println("---------------------------------------------------------------------------------");

        if(winners.isEmpty()){
            System.out.println("Election process interrupted. No votes logged");
        }else{
            System.out.println("Winner(s) : ");
            System.out.println("*********************************************************************************");
            for(Contestant contestant : winners){
                System.out.println(contestant.getName() + " with " + results.get(contestant) + " vote(s)");
            }
            System.out.println("*********************************************************************************");
        }

    }

}
