package elections.types.panchayat;

import elections.Contestant;
import elections.Election;

public class PanchayatElection extends Election { // Inheritance

    @Override
    public Contestant[] getContestents() { // Overriding
        return PanchayatElectionData.getContestantsData();
    }
}
