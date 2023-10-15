package tn.esprit.gestionzoo.entities;
public class Zoo {
    public Animal [] animals ;
    String name;
    String city ;
    public int nbrCages;
     public int animalCount;

    public Zoo(){

    }

    public Zoo(Animal[] animals, String name, String city)  {
        setAnimals(animals);
        setName(name);
      setCity(city);
      this.animals =animals;
        this.animalCount = 0;
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
        if (!isZooFull()) {
            for (int i = 0; i < animalCount; i++) {
                if (animals[i] != null && animals[i].name.equalsIgnoreCase(animal.name)) {
                    System.out.println("le nom de l'animal existe dans le zoo.");
                    return false;

                }

            }
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }
        else  return false;
    }


   public void displayAnimals() {
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
            return true;
        }
        else {
            System.out.println("Il y a de la place au zoo.");
            return false;
        }

    }
     public static Zoo comparerZoo(Zoo z1, Zoo z2)
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

    public void setName(String name) {
        if (name != null && !name.isEmpty() ) {
            this.name = name;
        }
        else {
            System.err.println("Le nom du zoo ne peut pas être vide.");

        }

    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }
}