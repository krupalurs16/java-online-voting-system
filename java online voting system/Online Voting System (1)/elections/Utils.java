package elections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {

    public static void showWelcomeMessage(){
        System.out.println("Welcome to the election process. Select the following");
    }

    public static void showElectionOptions(){
        System.out.println("1. Cast your vote");
        System.out.println("2. View Results");
        System.out.println("3. Exit");
    }

    public static int getSelection(){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int selection = Integer.parseInt(br.readLine());
            return selection;
        } catch (IOException e) { // Exception handling. catching only IOException
            e.printStackTrace();
        }

        return -1;
    }

}
