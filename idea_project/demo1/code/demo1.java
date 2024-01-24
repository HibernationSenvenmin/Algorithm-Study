package code;

class dog {
    String name;
    public dog(String n){
        name = n;
    }
}

public class demo1 {
    public static void main(String[] args) {
        dog pet = new dog("samoye");
        System.out.println(pet.name);
    }
}
