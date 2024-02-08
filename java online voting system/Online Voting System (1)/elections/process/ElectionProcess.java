package elections.process;

import elections.Contestant;

import java.util.List;
import java.util.Map;

public interface ElectionProcess {

    void startElection();
    Map<Contestant, Integer> getResults();
    List<Contestant> getWinners(); // returns more than 1 winner when the vote count is same

}
