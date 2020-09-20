public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Animal("1", "Doggo", 4, "Shiba", "Dog food", "Woof Woof", "Bark");
        Animal cat = new Animal("2", "Miu", 3, "White cat", "Cat food", "Meow meow", "Sleep");
        Animal cow = new Animal("3", "jason", 5, "Male cow", "Grass", "Mooooo", "Eat grass");

        dog.info();
        cat.info();
        cow.info();
    }
}
