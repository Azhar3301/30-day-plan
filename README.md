# 30-day-plan
Day 1:
video link:https://www.youtube.com/watch?v=s2hoJkIz3RQ&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=2&t=167s
Ex 1:
public class Car {
    String color;
    String  model;
    int year;
    void displayInfo(){
        System.out.println("Car's Color: "+color);
        System.out.println("Car's Color: "+model);
        System.out.println("Car's Color: "+year);
    }
}

public class Cmain {
     public static void main(String[] args){
  Car myCar=new Car();
  myCar.color="red";
  myCar.model="BMW";
  myCar.year=2026;
  myCar.displayInfo();
    }
}


Ex 2:
public class Student {
    String name;
    String Roll;
    int Number;
    void Show() {
        System.out.println("Student's name: "+name);
        System.out.println("Student's roll: "+Roll);
        System.out.println("Student's number: "+Number);
    }
}


public class Stmain{
    static void main(String[] args){
        Student s=new Student();
        s.name="Azhar";
        s.Roll= "IT-24031";
        s.Number=78;
        s.Show();
       
    }
}

