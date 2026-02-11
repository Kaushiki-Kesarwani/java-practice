class Pen{
    String color;//properties
    String type;

    public void write(){//methods
        System.out.println("Write something!\n");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int roll_num;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.roll_num);
    }

    // Student(){
    //     System.out.println("i am constructor"); // non parameterized constructor
    // }

   /*  Student(String name, int roll_num){ // parameterized constructor
        this.name = name;
        this.roll_num = roll_num; // this.name => object name  name = parameter
    }*/

        Student(){

        }

        Student(Student s2){ //copy constructor
            this.name = s2.name;
            this.roll_num = s2.roll_num;
        }
}

public class oops1 {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "red";
        // pen1.type = "gel";

        // Pen pen2 = new Pen();
        // pen2.color = "blue";
        // pen2.type = "ballpoint";

        // pen1.write();
        // pen1.printColor();

        // pen2.write();
        // pen2.printColor();

        Student stu1 = new Student(); // Student() ==>> constructors
        stu1.name = "palak";
        stu1.roll_num = 18;

        Student s2 = new Student(stu1);
        stu1.printInfo();



    }
}