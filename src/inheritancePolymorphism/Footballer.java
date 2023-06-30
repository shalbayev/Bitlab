package inheritancePolymorphism;

    public class Footballer extends Sportsman {
        protected String position;
        protected String club;
        public Footballer(){

        }
        public Footballer(String fullName, int age, String country, String position, String club){
            super(fullName, age, country);
            this.position = position;
            this.club = club;
        }
        /*Например, если fullName = "Ilyas Zhuanyshev", age = 30, country = "Kazakhstan", position = "forward", club = "Kairat", то тогда текст вывода будет:

                "Footballer Ilyas Zhuanyshev from Kazakhstan, 30 years old forward is playing for Kairat"*/
        @Override
        String play() {
            return "Footballer " + fullName + " from " + country + " " + age + " years old, " + position + " is playing for " + club;

        }
    }
