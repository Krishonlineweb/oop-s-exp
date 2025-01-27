// //

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




// public class exp2 {

//     public static void main(String[] args) {
//         // Check if exactly 3 arguments are passed (number1, operator, number2)
//         if (args.length != 3) {
//             System.out.println("Usage: java exp2 <number1> <operator> <number2>");
//             System.out.println("Example: java exp2 10 + 5");
//             return;
//         }

//         try {
//             // Parse the first and third arguments as integers
//             int num1 = Integer.parseInt(args[0]);
//             int num2 = Integer.parseInt(args[2]);

//             // Read the operator (second argument)
//             String operator = args[1];

//             // Perform the operation based on the operator
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

//             // Print the result
//             System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
//         } catch (NumberFormatException e) {
//             System.out.println("Error: Please provide valid integers for number1 and number2.");
//         }
//     }
// }
