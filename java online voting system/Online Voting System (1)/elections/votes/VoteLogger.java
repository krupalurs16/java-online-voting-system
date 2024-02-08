package elections.votes;

import elections.Contestant;

import java.util.Map;

public interface VoteLogger {

    void setContestants(Contestant[] contestants);
    void logVote(Contestant contestant);
    Map<Contestant, Integer> getResults();

}
