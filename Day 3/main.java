class Car {
    String brand;
    String color;
    int year;
    Car() {
        this("BMW", "RED",2202);
    }

    Car(String brand) {
        this(brand, "Black", 2022);
    }

    Car(String brand, String color, int year) {
        this.brand=brand;
        this.color=color;
        this.year=year;
    }
    void display() {
        System.out.println(brand+" | "+ color+" | "+year);
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Honda");
        Car c3 = new Car("FORD", "Pink", 2028);
        c1.display();
        c2.display();
        c3.display();
    }
}
