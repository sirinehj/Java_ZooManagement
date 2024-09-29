import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {

       Animal lion = new Animal("Félins", "Lion", 6, true);
       Zoo myZoo = new Zoo("MyZoo", "Tunis", 20);

        if (myZoo.addAnimal(lion)) {
            System.out.println("L'animal a été ajouté au zoo avec succès.");
        } else {
            System.out.println("Le zoo est plein, impossible d'ajouter l'animal.");
        }
    }
}
