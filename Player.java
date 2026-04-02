class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Team {
    private String name;
    private Player[] players;
    int count;

    Team(String name, int maxPlayers) {
        this.name = name;
        players = new Player[maxPlayers];
        this.count = 0;
    }

    void addPlayer(Player p) {
        if (count < players.length) {
            players[count] = p;
            count++;
        } else {
            System.out.println("No more player can be added");
        }
    }

    String getTeamName() {
        return name;
    }

    void displayPlayers() {
        for (int i = 0; i < count; i++) {
            System.out.println(players[i].getName());
        }
    }
}

class Main {
    public static void main(String[] args) {

        Player p1 = new Player("Ahmed");
        Player p2 = new Player("Nimra");
        Player p3 = new Player("Kashaf");
        Player p4 = new Player("Kashan");
        Player p5 = new Player("Kashif");
        Player p6 = new Player("Kamran");
        Player p7 = new Player("Katrina");
        Player p8 = new Player("Kareena");
        Player p9 = new Player("Kapal Shamra");
        Player p10 = new Player("Khan Sahib");

        Team team = new Team("Zafran", 10);
        team.addPlayer(p1);
        team.addPlayer(p2);
        team.addPlayer(p3);
        team.addPlayer(p4);
        team.addPlayer(p5);
        team.addPlayer(p6);
        team.addPlayer(p7);
        team.addPlayer(p8);
        team.addPlayer(p9);
        team.addPlayer(p10);

        team.displayPlayers();

        System.out.println(team.getTeamName());
    }
}