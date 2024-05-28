class animal {
    public void speak(){
        System.out.println("The animal makes a sound");
    }
}

class dog extends animal {
    public void speak(){
        System.out.println("The dog made a sound : Woof!");
    }
}
class cat extends animal {
    public void speak(){
        System.out.println("the cat made a sound : meow meow!");
    }
}
class cow extends animal{
    public void speak(){
        System.out.println("The sapi made a sound : Moo!");
    }
}

public class forum7 {
    public static void main(String[] args) {
        System.out.println("==================");
        System.out.println("Andika Prasetyo");
        System.out.println("IF-D Siang");
        System.out.println("2303310917");
        System.out.println("==================");
        System.out.println("");
        animal myanimal = new animal();
        animal mydog = new cat();
        animal mycat = new dog();
        animal mycow = new cow();

        myanimal.speak();
        mydog.speak();
        mycat.speak();
        mycow.speak();
    }
}
