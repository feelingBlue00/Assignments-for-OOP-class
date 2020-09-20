public class Animal {
    private String id;
    private String name;
    private int age;
    private String breed;
    private String food;
    private String sound;
    private String activity;

    public Animal(String id, String name, int age, String breed, String food, String sound, String activity) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.food = food;
        this.sound = sound;
        this.activity = activity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }

    public void makeNoise() {
        System.out.println(sound);
    }

    public void play() {
        System.out.println(activity);
    }

    public void info() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Food to feed: " + food);
        System.out.println("This pet sounds like this: " + sound);
        System.out.println("Things this pet can do include: " + activity);
    }
}
