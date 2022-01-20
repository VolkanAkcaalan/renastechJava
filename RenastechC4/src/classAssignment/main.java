package classAssignment;

public class main {
    public static void main(String[] args) {

        Animals b = new Animals(5,"Coco","White",animalTypes.Omnivores);

        System.out.println(b.toString());
        b.eatingVeggieAndMeat();
        System.out.println();

        Animals c = new Animals(3,"Blue Jays","Blue",animalTypes.Herbivores);

        System.out.println(c.toString());
        c.eatingVeggie();
        System.out.println();

        Animals d = new Animals(9,"King","Golden",animalTypes.Carnivores);
        System.out.println(d.toString());
        d.eatingMeat();


    }


}
