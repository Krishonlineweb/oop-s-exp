// //Q1. finding area of triangle

// import java.util.Scanner;
// public class exp2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); // Create a Scanner object
//         // Prompt the user to enter the base of the triangle
//         System.out.print("Enter the base of the triangle: ");
//         double base = scanner.nextDouble();
//         // Prompt the user to enter the height of the triangle
//         System.out.print("Enter the height of the triangle: ");
//         double height = scanner.nextDouble();
//         // Calculate the area of the triangle
//         double area = 0.5 * base * height;
//         // Display the result
//         System.out.println("The area of the triangle is: " + area);
//         // Close the scanner
//         scanner.close();
//     }
// }


// Q2. find simple interest
// import java.util.Scanner;
// public class exp2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); // Create a Scanner object
//         // Input Principal Amount
//         System.out.print("Enter the Principal Amount (P): ");
//         double principal = scanner.nextDouble();
//         // Input Rate of Interest
//         System.out.print("Enter the Rate of Interest (R) in percentage: ");
//         double rate = scanner.nextDouble();
//         // Input Time
//         System.out.print("Enter the Time (T) in years: ");
//         double time = scanner.nextDouble();
//         // Calculate Simple Interest
//         double simpleInterest = (principal * rate * time) / 100;
//         // Display the Result
//         System.out.println("\nSimple Interest (SI) = " + simpleInterest);
//         scanner.close(); // Close the scanner
//     }
// }


//Q3. command line calculator
// public class exp2 {
//     public static void main(String[] args) {
//         if (args.length != 3) {
//             System.out.println("Usage: java exp2 <number1> <operator> <number2>");
//             System.out.println("Example: java exp2 10 + 5");
//             return;
//         }
//         try {
//             int num1 = Integer.parseInt(args[0]);
//             int num2 = Integer.parseInt(args[2]);
//             String operator = args[1];
//             int result = 0;
//             switch (operator) {
//                 case "+":
//                     result = num1 + num2;
//                     break;
//                 case "-":
//                     result = num1 - num2;
//                     break;
//                 case "*":
//                     result = num1 * num2;
//                     break;
//                 default:
//                     System.out.println("Invalid operator! Use +, -, or *.");
//                     return;
//             }
//             System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
//         } catch (NumberFormatException e) {
//             System.out.println("Error: Please provide valid integers for number1 and number2.");
//         }
//     }
// }


// Q4. using (if statement)
// public class exp2 {
//     public static void main(String[] args) {
//         int sum = 0; //try in order of 1
//         for (int i = 10; i <= 89; i++) {
//             if (i % 18 == 0) {
//                 sum += i;
//             }
//         }
//         System.out.println("The sum of all integers between 10 and 950 that are divisible by both 6 and 9 is: " + sum);
//     }
// }


//Q5. using nested if-else statements
// import java.util.Scanner;
// class NumberComparison {
//     public int findGreatest(int num1, int num2, int num3) {
//         if (num1 >= num2) {
//             if (num1 >= num3) {
//                 return num1;
//             } else {
//                 return num3;
//             }
//         } else {
//             if (num2 >= num3) {
//                 return num2;
//             } else {
//                 return num3;
//             }
//         }
//     }
// }
// public class exp2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int num1 = scanner.nextInt();
//         System.out.print("Enter the second number: ");
//         int num2 = scanner.nextInt();
//         System.out.print("Enter the third number: ");
//         int num3 = scanner.nextInt();
//         NumberComparison comparison = new NumberComparison();
//         int greatest = comparison.findGreatest(num1, num2, num3);
//         System.out.println("The greatest number is: " + greatest);
//         scanner.close();
//     }
// }


//Q6. using switch statement
// import java.util.Scanner;

// public class exp2 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number (1-7): ");
//         int dayNumber = scanner.nextInt();
//         switch (dayNumber) {
//             case 1 ->
//                 System.out.println("Monday");
//             case 2 ->
//                 System.out.println("Tuesday");
//             case 3 ->
//                 System.out.println("Wednesday");
//             case 4 ->
//                 System.out.println("Thursday");
//             case 5 ->
//                 System.out.println("Friday");
//             case 6 ->
//                 System.out.println("Saturday");
//             case 7 ->
//                 System.out.println("Sunday");
//             default ->
//                 System.out.println("Invalid! Enter a number between 1 and 7.");
//         }
//         scanner.close();
//     }
// }
