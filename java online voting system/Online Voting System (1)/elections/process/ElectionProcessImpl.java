package elections.process;

import elections.Contestant;
import elections.Election;
import elections.Utils;
import elections.votes.VoteLoggerImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ElectionProcessImpl implements ElectionProcess {

    private Election election;
    private VoteLoggerImpl voteLogger;

    public ElectionProcessImpl(Election election){ // Constructors
        this.election = election;
        this.voteLogger = new VoteLoggerImpl(); // usage of this keyword
    }

    @Override
    public void startElection() { // Methods

        Utils.showWelcomeMessage();

        int selectedVote;
        Contestant[] contestants = election.getContestents(); // Scope and lifetime of variables - contestants and selectedVote are local variables to this method startElection
        voteLogger.setContestants(contestants); // Access control mechanism. voteLogger is global variable to the class

        do{
            System.out.println("Select your symbol");
            for(int i=0;i<contestants.length;i++){
                System.out.println((i+1) + ". " + contestants[i].getName() + " - " + contestants[i].getSymbol());
            }
            System.out.println("Please enter your choice (Enter 0 to end the voting and see the results): ");
            selectedVote = Utils.getSelection();
            if(selectedVote != 0){
                voteLogger.logVote(contestants[selectedVote - 1]);
            }
        }while(selectedVote != 0);

        System.out.println("End of voting");

    }

    @Override
    public Map<Contestant, Integer> getResults() {
        return voteLogger.getResults();
    }

    @Override
    public List<Contestant> getWinners() {
        Map<Contestant, Integer> results = voteLogger.getResults();
        int highestVoteCount = 0;
        for(Map.Entry<Contestant, Integer> result : results.entrySet()){
            highestVoteCount = Math.max(highestVoteCount, result.getValue());
        }
        List<Contestant> winners = new ArrayList<>();
        if(highestVoteCount > 0){
            for(Map.Entry<Contestant, Integer> result : results.entrySet()){
                if(result.getValue() == highestVoteCount){
                    winners.add(result.getKey());
                }
            }
        }
        return winners;
    }
}
