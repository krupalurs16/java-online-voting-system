package elections.votes;

import elections.Contestant;

import java.util.HashMap;
import java.util.Map;

public class VoteLoggerImpl implements VoteLogger{

    Map<Contestant, Integer> voteCount = new HashMap();

    @Override
    public void setContestants(Contestant[] contestants){
        for(Contestant contestant : contestants){
            voteCount.put(contestant, 0);
        }
    }

    @Override
    public void logVote(Contestant contestant){
        voteCount.put(contestant, voteCount.getOrDefault(contestant, 0) + 1); // incrementing the vote count for a particular contestant
    }

    @Override
    public Map<Contestant, Integer> getResults(){
        return voteCount;
    }

}
