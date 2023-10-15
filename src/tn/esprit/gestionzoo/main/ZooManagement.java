package tn.esprit.gestionzoo.main;
import java.util.Scanner;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
public class ZooManagement {
    //int nbrCages = 20;
    String ZooName = "my Zoo";
    public static void main(String[] args) {
      /*ZooManagement ZM = new ZooManagement() ;
        System.out.println(ZM.ZooName+" comporte "+ZM.nbrCages+" cages");
        Scanner scanner = new Scanner(System.in);
        System.out.println("donner le nom du Zoo : ");
        ZM.ZooName = scanner.nextLine();
        System.out.println("le nom du zoo est " +ZM.ZooName);
        System.out.println("donner le nombre de cage : ");
        ZM.nbrCages = scanner.nextInt();
        System.out.println("le nombre des cages est :  " +ZM.nbrCages);
*/

        Animal a1 = new Animal();
        a1.setFamily("cats");
        a1.setFamily("lion");
        a1.setAge(5);
        a1.setMammal(true);

        Zoo z1=new Zoo();
        z1.setName("zoo ");
        z1.setCity("Tunis");
       // z1.nbrCages=3;
        z1.setAnimals (new Animal[z1.nbrCages]);
        Animal a2 = new Animal("cats","tigre",-6,true);
        Animal a3 = new Animal("birds","aigle",4,true);
        Animal a4= new Animal("birds","bird",4,true);

        Animal[] animals ={a1,a2,a3};

        //Zoo z1= new Zoo(animals,"zoo 1","Tunis");
        Zoo z2= new Zoo(animals,"","Tunis");

        /* Les nouveaux constructeurs paramétrés permettent
    d'initialiser les objets "Animal" et "Zoo" directement
    lors de leur création en fournissant les valeurs des attributs e
    n un seul appel au constructeur, ce qui simplifie le code et le rend plus lisible.*/
        System.out.println("**********liste des zoo*********");
        z2.displayZoo();
        z1.displayZoo();

        System.out.println("************liste des zoo**************");
        System.out.println(z1);  // affichera l'adresse mémoire de l'objet,
        System.out.println(z2.toString()); /* Cela appelle la méthode
        toString() sur l'objet "z1". Si vous n'avez pas redéfini la méthode
        toString() dans la classe "Zoo, cela affichera l'adresse mémoire de l'objet.*/

        System.out.println("***********Ajout animals zoo1***********");
        //System.out.println(z1.addAnimal(a1));
        //System.out.println(z1.addAnimal(a2));
        System.out.println("***********Ajout animals zoo2***********");

        System.out.println(z2.addAnimal(a3));

        System.out.println("***********zoo1*************");
        z1.displayAnimals();
        System.out.println("***********zoo2*************");
        z2.displayAnimals();

        System.out.println("********search dans zoo1*********");
        System.out.println(z1.searchAnimal("tigre"));

        System.out.println("********search dans zoo2*********");
        System.out.println(z2.searchAnimal("tigre"));


        System.out.println("**************************");
        System.out.println(z1.addAnimal(a1));

       // System.out.println("***********zoo1***************");
        //System.out.println(z1.isZooFull());
      //System.out.println("*************zoo2*************");
      //  System.out.println(z2.isZooFull());

        System.out.println("*********le zoo avec le plus d'animaux *****************");
        System.out.println(Zoo.comparerZoo(z1,z2));

        System.out.println("***********Ajout animals zoo1 avce isZooFull***********");
        System.out.println(z1.addAnimal(a4));






    }

}