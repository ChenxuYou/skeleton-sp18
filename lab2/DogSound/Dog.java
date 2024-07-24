public class Dog {
    public int weightInPounds;
    public String dogName;

    public Dog(int w, String n) {
        weightInPounds = w;
        dogName = n;
    }

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yip.yip.yip.");
        } else if (weightInPounds < 30) {
            System.out.println("bark.bark.");
        } else {
            System.out.println("woof.");
        }
    }

    public void anotherMaxDog(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) {
            System.out.printf("anotherMaxDog: dog's name is %s and dog's weight is %d%n",
                    this.dogName, this.weightInPounds);
        } else {
            System.out.printf("anotherMaxDog: dog's name is %s and dog's weight is %d%n", d2.dogName,
                    d2.weightInPounds);
        }
    }

    public static void maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            System.out.printf("%s whose weight is %d is fatter.%n", d1.dogName, d1.weightInPounds);
        } else {
            System.out.printf("%s whose weight is %d is fatter.%n", d2.dogName, d2.weightInPounds);
        }
    }




    public static void main(String[] args) {
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(71,"kitty");
        dogs[1] = new Dog(25,"habby");
        dogs[0].makeNoise();
        dogs[1].makeNoise();
        Dog.maxDog(dogs[0], dogs[1]);
        dogs[0].anotherMaxDog(dogs[1]);
        dogs[1].anotherMaxDog(dogs[0]);
        System.out.println("------");
    }
}
