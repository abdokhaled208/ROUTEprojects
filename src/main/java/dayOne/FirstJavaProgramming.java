package dayOne;

public class FirstJavaProgramming {
    public static void main(String[] args)
    {
       // Variable Declaration & Initialization
                // DataType variableName = value;
                String firstName = "Yara"; // Store text into variable
                String lastName = "Mostafa";
                String X="10";
                String Y="20";
                System.out.println(X+Y);



        //        // concatenation -> combining two strings together
                String fullName = firstName + " " + lastName;

              int age = 19;
               String dateOfBirth = "20/05/2002";
                String job = "Testing Engineer";
                double income = 10.5;
        //
        //        // Calculations
                double tax = income * 0.15; // 15% tax
               double netSalary = income - tax;
        //
        //        // Print using concatenation
                System.out.println("Hello my name is: " + fullName +
                       "\nmy age is: " + age +
                       "\nmy job is: " + job +
                       "\nmy income is: " + netSalary);
        //
               System.out.println("---------------------------------");
        //
        //        // Print using Format Specifiers (printf style inside println)
                System.out.printf("Hello my full name is: %s\n" +
                        "my age is: %d\n" +
                        "my job is: %s\n" +
                        "my income is: %f\n",
                        fullName, age, job, netSalary);
        //
        //        // Example of numeric variables from Screenshot (211)
                double d = 55; // 55.0
                double l = 55.33;
                System.out.println(d);
               System.out.println(l); System.out.println("HELLO BIG BOY");


    }
}