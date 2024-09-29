public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }

    public boolean addAnimal(Animal animal) {
            for (int i = 0; i < nbrCages; i++) {
                if (animals[i] == null) {
                    animals[i] = animal;
                    return true;
                }
            }
            return false;
    }

    public void animalDisplay() {
        System.out.println("Animaux présents dans le zoo " + name + " :");
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null) {
                System.out.println("Cage " + (i + 1) + ": " + animals[i].name);
            } else {
                System.out.println("Cage " + (i + 1) + ": vide");
            }
        }
    }

    int searchAnimal(Animal animal){
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

}
