/*WAP in java to demonstrate a model of animal kingdom
 * Animals are two kinds - mammals and birds
 * Create bird object and mammal object, display the characteristics.
 * List of characteristics:-
 *         1. No. Of wings
 *         2. No. of limbs
 *         3. No. of eyes
 -------------------------------------------------------------------------------------------------------------------------------------
 Demonstrate inheritance OOPS concepts by
       1. Identifying classes
       2. Identifying which Characteristics belong to which class.
---------------------------------------------------------------------------------------------------------------------------------------
Output-
Mammals: 
No. of Limbs : 4
No. of Eyes : 2
Birds: 
No. of wings : 2
No. of eyes : 2
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
12/09/2023
*/


// Parent class Animal
class Animal {
    int numOfEyes;

    // Constructor for Animal class
    public Animal(int eyes) {
        numOfEyes = eyes;
    }
}

// Subclass Mammal
class Mammal extends Animal {
    int numOfLimbs;

    // Constructor for Mammal class
    public Mammal(int limbs, int eyes) {
        super(eyes); // Using 'super' to call the constructor of the superclass (Animal)
        numOfLimbs = limbs;
    }

    public void display() {
        System.out.println("Mammals:");
        System.out.println("No. of Limbs : " + numOfLimbs);
        System.out.println("No. of Eyes : " + numOfEyes);
    }
}

// Subclass Bird
class Bird extends Animal {
    int numOfWings;

    // Constructor for Bird class
    public Bird(int wings, int eyes) {
        super(eyes); // Using 'super' to call the constructor of the superclass (Animal)
        numOfWings = wings;
    }

    public void display() {
        System.out.println("Birds:");
        System.out.println("No. of Wings : " + numOfWings);
        System.out.println("No. of Eyes : " + numOfEyes);
    }
}

public class AnimalKingdom {
    public static void main(String[] args) {
        Mammal dog = new Mammal(4, 2);  // New Mammal object
        Bird sparrow = new Bird(2, 2);  // New Bird object

        dog.display();    // Display characteristics of the mammal
        sparrow.display(); // Display characteristics of the bird
    }
}
