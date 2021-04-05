package ExceptionsListsThreadsAndFiles;


import java.util.*; 

public class BowlingGameProject6{
     class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    public void getWinner() {
        String winner = "";
        int mrk = 0;
        for(String nm:players.keySet()) {
            if(players.get(nm)>mrk) {
                winner = nm;
                mrk = players.get(nm);
            }
        }
        System.out.println(winner);
    }
}

public class Program{
    public void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
       }
    }
}