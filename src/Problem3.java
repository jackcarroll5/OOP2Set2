/*This program driver will set up Animal classes to display them by showing the type,
* continent the animal is mainly in, the weight and age.*/

public class Problem3 {
    public static void main(String[] args) {

        String[] continents = new String[7];

        continents[0] = "Africa";
        continents[1] = "Asia";
        continents[2] = "Europe";
        continents[3] = "South America";
        continents[4] = "North America";


        Animal animal1 = new Animal();

        Animal animal2 = new Animal("Gorilla",continents,160.05f,35);

        System.out.println(animal1);
        System.out.println(animal2);

    }
}
