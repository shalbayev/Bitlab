package AbstractClass;

public class Main {
    public static void main(String[] args) {
////        Burger burger = new Burger();
////        burger.meatType = 1;
////        burger.meatAmount = 20;
////        burger.name = "Salam Bro Burger";
////        System.out.println(burger.meatAmount);
////        System.out.println(burger.meatType);
////        System.out.println(burger.name);
////        System.out.println(burger.getCalories());
//
//
////        GoldShape g = new GoldShape() {
////            @Override
////            double getVolume() {
////                return 45;
////            }
////        };
////        System.out.println(g.getPrice());
////        SphereGold sp = new SphereGold();
////        sp.setRadius(2);
////        System.out.println(sp.getVolume());
//        FerrariEngine fr = new FerrariEngine(5,88,17);
//        System.out.println("Enigine volume: " + fr.getEngineVolume());
//        System.out.println("Cylinder amount: " + fr.getCylinderAmount());
//        System.out.println("Engine weight: " + fr.getEngineWeight());
//        System.out.println("Max: " + fr.getMaxSpeed());
        ERPSystem erpSystem1 = new ERPSystem();
        erpSystem1.addUser(new Teacher(1,"bigteacher@mail.ru", "5874", "Big Teacher", "Professor"));
        ERPSystem erpSystem2 = new ERPSystem();
        erpSystem2.addUser(new Teacher(1,"math@mail.ru", "456", "Math Teacher", "Tutor"));
        ERPSystem erpSystem3 = new ERPSystem();
        erpSystem3.addUser(new Teacher(1,"english@mail.ru", "452", "English Teacher", "Assistant"));
        ERPSystem erpSystem4 = new ERPSystem();
        erpSystem4.addUser(new Teacher(1,"geography@mail.ru", "1234", "Geography Teacher", "Lecturer"));
        ERPSystem erpSystem5 = new ERPSystem();
        erpSystem5.addUser(new Teacher(1,"science@mail.ru", "952", "Science Teacher", "Lecturer"));

        System.out.println("Data about teachers - > - > - > - >");
        /*erpSystem1.printTeacher();
        erpSystem2.printTeacher();
        erpSystem3.printTeacher();
        erpSystem4.printTeacher();
        erpSystem5.printTeacher();*/
    }
}
