package day34_abstraction.animalTask;

    public abstract class Animal {
        private String name, breed;
        private char gender;
        private int age;
        private String size, color;

        // Constructor to initialize all attributes
        public Animal(String name, String breed, char gender, int age, String size, String color) {
            setName(name);
            setBreed(breed);
            setGender(gender);
            setAge(age);
            setSize(size);
            setColor(color);
        }

        // Getters and setters for all private attributes
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        // Animal behavior methods
        public void drink() {
            System.out.println(name + " is drinking");
        }

        public abstract void eat();

        public void sleep() {
            System.out.println(name + " is sleeping 8 hours");
        }

        // Overriding toString to return a string representation of the Animal object
        @Override
        public String toString() {
            return getClass().getSimpleName() + "{" +
                    "name='" + getName() + '\'' +
                    ", breed='" + getBreed() + '\'' +
                    ", gender=" + getGender() +
                    ", age=" + getAge() +
                    ", size='" + getSize() + '\'' +
                    ", color='" + getColor() + '\'' +
                    '}';
        }
    }

/*
Animal task:
	interface Swimmable
		swim()

	interface Flyable
			fly();

	interface Wild:
			hunt();

	interface Plyable
			play();


	abstractClass Animal:
		eat();
		drink();



	Dog extend Animal implements Plyable, Swimmable

	Cat extend Animal implements Plyable

	Cow extend Animal implements Plyable

	Horse extend Animal implements Plyable

	Parrot extend Animal implements Plyable, Flyable

	Eagle extend Animal implements Wild, Flyable

	Tiger extend Animal implements Wild

	Lion extend Animal implements Wild

	Falcon extend Animal implements Wild, Flyable

	Shark extend Animal implements Wild, Swimmable

	Dolphin extend Animal implements Plyable, Swimmable

	Duck extend Animal implements Plyable, Swimmable, Flyable

	Java extend Animal implements Plyable, Swimmable, Flyable, Wild


 */