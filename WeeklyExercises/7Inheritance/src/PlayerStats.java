public class PlayerStats {
    public static void main(String[] args) throws Exception {
        Player player = new Player();
        PlayerName playerName = new PlayerName();
        Sportstat sportstat = new Sportstat(player.playernum);

        System.out.print(playerName.PlayerName() + sportstat.Sportstat());
    }
}

class Player {
    private static int playercount = 0;
    int playernum;

    public Player() {
        playercount++;
        playernum = playercount;
    }
}

class PlayerName extends Player {
    public String PlayerName() {
        return "Player number #" + playernum + " is called Tiger Woods";
    }
}

class Sportstat {
    private int playernum;

    public Sportstat(int playernum) {
        this.playernum = playernum;
    }

    public String Sportstat() {
        return " and is a PGA golfer";
    }
}
