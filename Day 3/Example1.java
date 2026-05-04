class Student {
    String name;
    int age;
    Student() {
        name = "Unknown";
        age = 0;
    }
    Student(String name, int age) {
        this.name=name;
        this.age=age;
    }
    void display() {
        System.out.println("Name: "+ name + ",Age: "+age);
    }
    public static void Example1(String[] args) {
        Student s1=new Student();
        Student s2=new Student("rumi",18);
        s1.display();
        s2.display();
    }
}
