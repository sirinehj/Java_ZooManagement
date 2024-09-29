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
}
