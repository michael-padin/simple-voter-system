import java.util.Scanner;

public class Main {
    String name;
    int Id;
    int votes;

    Main (String n, int i, int v) {
        this.Id = i;
        this.name = n;
        this.votes= v;
    }

    public void display () {
        System.out.println("Id: " + this.Id);
        System.out.println("Name: " + this.name);
        System.out.println("votes: " + this.votes);
    }

    public static void main (String[] args) {

        boolean sentinelVal = false;
        Main cand1 = new Main("Juan Luna", 101, 0);
    }
}
