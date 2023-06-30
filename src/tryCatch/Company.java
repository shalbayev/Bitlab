package tryCatch;

public class Company {
    String name;
    Worker director;


    public Company() {
    }

    public Company(String name, Worker director) {
        this.name = name;
        this.director = director;
    }

    String getData(){
        try{
            return "Company name: " + name + ". Information about director -> " + director.name + " " + director.surname + ".";

        }
        catch (NullPointerException e){
            return "Data not found";
        }
    }
}
