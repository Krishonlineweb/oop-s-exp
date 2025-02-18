//Q1. Create a Student class with attributes for name and age. Implement a default constructor to assign default values and a parameterized constructor to initialize the attributes with userdefined values. Create objects using both constructors and display their details. 
// public class student {

//     String name;
//     int age;
//     student() {
//         name = "varun";
//         age = 18;
//     }
//     student(String n, int a) {
//         name = n;
//         age = a;
//     }
//     void display() {
//         System.out.println(name + ", " + age);
//     }
//     public static void main(String[] args) {
//         student s1 = new student();
//         s1.display();
//         student s2 = new student("John", 20);
//         s2.display();
//     }
// }
//2. Bank acc.
class bank {

    private double balance;

    public bank() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        bank account = new bank();
        account.deposit(1000);
        account.checkBalance();
        account.withdraw(500);
        account.checkBalance();
    }
}
// //3.Calculator class 
// class Calculator {

//     int add(int a, int b) {
//         return a + b;
//     }
//     double add(double a, double b) {
//         return a + b;
//     }
//     int add(int a, int b, int c) {
//         return a + b + c;
//     }
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         System.out.println("Sum of two integers: " + calc.add(5, 10));
//         System.out.println("Sum of two doubles: " + calc.add(5.5, 2.5));
//         System.out.println("Sum of three integers: " + calc.add(1, 2, 3));
//     }
// }
