package classAndObjects;

import java.util.Arrays;

public class Club {
    String name;
    String country;
    int ratingPoints;
    Player []players;


    public Club(){

    }
    public Club(String name, String country, int ratingPoints, Player []players){
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    @Override
    public String toString() {
        return "Club{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", ratingPoints=" + ratingPoints +
                ", players=" + Arrays.toString(players) +
                '}';
    }

    public void printClubData(){
        System.out.println("Name:" + name + " Country: " + country + " RatingPoints: " + ratingPoints + " Players:");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }

    }
}
