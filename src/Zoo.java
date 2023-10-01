public class Zoo {
    Animal [] animals ;
    String name;
    String city ;
    final int nbrCages=25 ;
     int animalCount = 0;

    Zoo(){

    }

    public Zoo(Animal[] animals, String name, String city)  {
        this.animals = animals;
        this.name = name;
        this.city = city;
       // this.nbrCages = nbrCages;
      //  this.animalCount = animalCount ;
    }

    public void displayZoo(){
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public boolean addAnimal (Animal animal){
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equalsIgnoreCase(animal.name)) {
                return false;
            }
        }
        if (animalCount < nbrCages) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            return false;
        }
    }

    void displayAnimals() {
        System.out.println("Liste des animaux :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println("Nom : " + animals[i].name);
            System.out.println("Famille : " + animals[i].family);
            System.out.println("Âge : " + animals[i].age + " ans");
            System.out.println("Mammifère : " + (animals[i].isMammal ? "Oui" : "Non"));

        }
    }

    public int searchAnimal(String name) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }
    public boolean isZooFull() {

        if (animalCount >= nbrCages) {
            System.out.println("Le zoo est plein !");
            return true ;
        }
        else {
            System.out.println("Il y a de la place au zoo.");
            return false ;
        }

    }
     static Zoo comparerZoo(Zoo z1, Zoo z2)
    {
        if (z1.animalCount>= z2.animalCount) {
            System.out.println("Le zoo1 avec le plus d'animaux!");
            return z1 ;
        }
        else {
            System.out.println("Le zoo2 avec le plus d'animaux!");

            return z2 ;
        }
    }
}

