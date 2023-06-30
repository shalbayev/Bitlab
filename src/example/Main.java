package example;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human();
//        Human h2 = new Human("Tima",22, 190);
        Human[] h3 = new Human[5];
//        h3[0] = new Human("Tima",22,190);
        h3[1] = new Human();
        h3[2] = new Human();
        h3[3] = new Human();
        h3[4] = new Human();
        Human h4 = new Human("Tima", 22, 190, "oldR1ch"); //name2 - Armagedonkaz
        Human h5 = new Human("Arman", 22, 180, "Armagedonkaz"); // name2 - Armagedonkaz (name2) общий для двоих
        System.out.println(h4);
        System.out.println(h5);
        //static переменнам можно обращатьс не писав обьект, а просто класс. например human.pi;

//        h2.run();
//        h1.run();
//        for (int i = 0; i < h3.length; i++) {
//            System.out.println(h3[i]);
//        }


        FirstClass f = new FirstClass();
        FirstClass.secondRun();

    }
}
