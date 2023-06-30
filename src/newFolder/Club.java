package newFolder;

public class Club {
    String name;
    String country;
    int ratingPoints;
    Player[] players;

    public Club() {
    }
    /*Например, если name = "Real Madrid", country= "Portugal", ratingPoints= 55, players[] (В нашем случае у нас есть пять объект класса Player в массиве)
    то тогда текст возвращаемый текст будет:

    Name: Real Madrid Country: Portugal RatingPoints: 55 Players:
    Player{number=12, name='Thomas', surname='Oliver', position='defender'}
    Player{number=10, name='Tommy', surname='George', position='attack'}
    Player{number=14, name='Harry', surname='Charley', position='defender'}
    Player{number=07, name='Smith', surname='Jack', position='attack'}
    Player{number=09, name='Jon', surname='Smith', position='defender'}*/
    public Club(String name, String country, int ratingPoints, Player[] players) {
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }
    void printClubData(){
        System.out.println("Name: " + name + " Coutry: " + country + " " + "RatingPoints: " + ratingPoints + " Players:");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
    }
}
