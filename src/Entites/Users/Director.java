package Entites.Users;


public class Director extends Conductor{

    public Musician hireMusician(String name,String surname,int salary){
        Musician mc = new Musician(name,surname,salary);

        return mc;
    }

    public Conductor hireConductor(String name,String surname,int salary){
        Conductor cd = new Conductor(name,surname,salary);
        return cd;
    }

}
