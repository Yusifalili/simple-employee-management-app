package model;

public class Person {
    private int id;
    private String name;
    private String surname;
    private String dateOfBrith;
    private String position;
    private double salary;

    public Person(int id, String name, String surname, String dateOfBrith, String position, double salary){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBrith = dateOfBrith;
        this.position = position;
        this.salary = salary;
    }



    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSurname (){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getDateOfBrith(){
        return dateOfBrith;
    }

    public void setDateOfBrith(String dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }
    public String getPosition(){
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(Double salary){
        this.salary = salary;
    }

    public String toString(){
        return "ID: " + id + "\n" +
                name+ " " + surname + "|" + dateOfBrith +  "\n" +
                "Position:" + position + "\n" +
                "Salary:" + salary;
    }



}
