class Student {
    String name;
    int age;

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Umair";
        s1.age = 20;

        s1.display();
    }
}