import java.util.Scanner;

public class Main {
    String name;
    int Id;
    int voters;

    Main (String n, int i) {
        this.Id = i;
        this.name = n;
    }
     Main ( int v) {
        this.voters= v;
    }
    public void display1 () {
        System.out.println("Id: " + this.Id);
        System.out.println("Name: " + this.name);
    }
    public void display2 () {
        System.out.println("votes: " + this.voters);
    }
    public static void main (String[] args) {
        int votes = 0, totalVotes = 0;
        Scanner scan = new Scanner(System.in);

        Main cand1 = new Main("Juan Luna", 101 );
        Main cand2 = new Main("Maria Clara", 102 );
        Main cand3 = new Main("Jose Rizal", 103 );
        Main cand4 = new Main("Andrei Boni", 104 );

        cand1.display1();
        System.out.println("Votes: "  );
        while (votes != -999){
            votes = scan.nextInt();
            if (votes == -999) {votes =0; break;}
            totalVotes += votes;
        }
        Main cand1Votes = new Main(totalVotes);
        totalVotes = 0;

        cand2.display1();
        System.out.println("Votes: "  );
        while (votes != -999){
            votes = scan.nextInt();
            if (votes == -999) {votes = 0; break;};
            totalVotes += votes;
        }
        Main cand2Votes = new Main(totalVotes);
        totalVotes = 0;

        cand3.display1();
        System.out.println("Votes: "  );
        while (votes != -999){
            votes = scan.nextInt();
            if (votes == -999) {votes = 0; break;}
            totalVotes += votes;
        }
        Main cand3Votes = new Main(totalVotes);
        totalVotes = 0;

        cand4.display1();
        System.out.println("Votes: "  );
        while (votes != -999){
            votes = scan.nextInt();
            if (votes == -999) { votes = 0; break;}
            totalVotes += votes;
        }
        Main cand4Votes = new Main(totalVotes);
        totalVotes = 0;

        System.out.println("\n------TOTAL VOTES OF EACH CANDIDATE------");
        cand1.display1();
        cand1Votes.display2();
        System.out.println("\n");
        cand2.display1();
        cand2Votes.display2();
        System.out.println("\n");
        cand3.display1();
        cand3Votes.display2();
        System.out.println("\n");
        cand4.display1();
        cand4Votes.display2();
    }
}
