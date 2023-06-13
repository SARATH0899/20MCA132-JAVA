class Cricketer {
    String name, country;

    Cricketer(String n, String c) {
        name = n;
        country = c;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
    }
}

class Batsman extends Cricketer {
    int runs;

    Batsman(String n, String c, int r) {
        super(n, c);
        runs = r;
    }

    void display() {
        super.display();
        System.out.println("Runs: " + runs);
    }
}

class Bowler extends Cricketer {
    int wickets;

    Bowler(String n, String c, int w) {
        super(n, c);
        wickets = w;
    }

    void display() {
        super.display();
        System.out.println("Wickets: " + wickets);
    }
}

public class cricket {
    public static void main(String[] args) {
        Batsman b = new Batsman("Sachin Tendulkar", "India", 18426);
        Bowler bl = new Bowler("Muttiah Muralitharan", "Sri Lanka", 800);

        System.out.println("Batsman Details:");
        b.display();

        System.out.println("\nBowler Details:");
        bl.display();
    }
}