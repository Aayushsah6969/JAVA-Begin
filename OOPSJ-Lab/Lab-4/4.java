import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

  //  @Override
    void input() {
        super.input(); // Call parent input() for acc_no and balance
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLine();
    }

    //@Override
    void disp() {
        super.disp(); // Call parent disp() for acc_no and balance
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        // Input details of 3 persons
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input();
        }

        // Display details of 3 persons
        System.out.println("\nDetails of Persons:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            persons[i].disp();
        }
    }
}
