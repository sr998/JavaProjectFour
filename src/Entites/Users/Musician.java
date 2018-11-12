package Entites.Users;

import Entites.Concert.Part;

import java.util.Random;

public class Musician {

    private String name = "";
    private String surname = "";
    private String part = "";
    private int salary;

    public Musician() {
    }

    public Musician(String name, String surname,int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public boolean canParticipate(){
        Random rnd = new Random();
        int result = rnd.nextInt(2);
        if (result==1){return true;}
        return false;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Musician{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", part='" + part + '\'' +
                ", salary=" + salary +
                '}';
    }


}
