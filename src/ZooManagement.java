import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {

        Animal lion = new Animal("Félins", "Lion", 5, true);
        Animal tiger = new Animal("Félins", "Tigre", 4, true);
        Animal elephant = new Animal("Éléphantidés", "Éléphant", 10, true);
        Animal pinguin = new Animal("Pinguin", "Pinguin", 10, true);

        Zoo myZoo = new Zoo("MyZoo", "Tunis", 10);

        if (myZoo.addAnimal(lion)) {
            System.out.println("L'animal a été ajouté au zoo avec succès.");
        } else {
            System.out.println("Le zoo est plein, impossible d'ajouter l'animal.");
        }

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(pinguin);

        int cageNumber = myZoo.searchAnimal(pinguin);

        if (cageNumber != -1) {
            System.out.println("pinguin trouvé à l'indice " + cageNumber);
        } else {
            System.out.println("pinguin non trouvé dans le zoo.");
        }


        myZoo.animalDisplay();




    }
}
