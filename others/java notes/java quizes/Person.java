public class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getGreeting(){
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }

    Person john = new Person("John", 30);
    String greeting = john.getGreeting();
    System.out.println(greeting);
}
//using constructor for inheritance
public class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

public class Dog extends Animal {
    private String breed;
    
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
    }
}
In this example, the Animal class has a constructor that takes a name parameter and initializes the name field with its value. The Dog class extends Animal and has an additional field called breed.

The Dog class has a constructor that takes both name and breed parameters. This constructor calls the super() method to invoke the constructor of the parent class Animal, passing in the name parameter. This initializes the name field of the Animal object.

After that, the Dog constructor initializes its own breed field with the value of the breed parameter. This way, the Dog object is constructed with both a name and a breed.

Using this setup, when you create a Dog object using the new keyword, you can pass in both a name and a breed parameter. The Dog constructor will call the constructor of the parent Animal class to initialize the name field, and then initialize the breed field itself. This way, the Dog object is constructed with both a name and a breed, and has inherited the constructor from its parent class.

public class BankAccount {
    private String accountNumber; //use of encapsulation
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

/*example of abstarction using interface, which is implemented and later outputs the make sound.
 This is an example of abstraction because we are hiding the implementation details of the Dog and Cat classes 
 behind the Animal interface, and exposing only their essential feature (i.e., the ability to make a sound).*/

public interface Animal {
    public void makeSound();
}

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // Outputs "Woof!"
        cat.makeSound(); // Outputs "Meow!"
    }
}



