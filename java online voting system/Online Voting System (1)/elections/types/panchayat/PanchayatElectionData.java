package elections.types.panchayat;

import elections.Contestant;

public class PanchayatElectionData {

    public static Contestant[] getContestantsData(){
        Contestant[] contestants = new Contestant[5];
        contestants[0] = new Contestant("Basavaraj", "Fan");
        contestants[1] = new Contestant("Balaji", "Kamalam");
        contestants[2] = new Contestant("Geetha", "Kodavali");
        contestants[3] = new Contestant("Hanumantha Reddy", "Cycle");
        contestants[4] = new Contestant("Padmavathi", "Glass");
        return contestants;
    }

}
