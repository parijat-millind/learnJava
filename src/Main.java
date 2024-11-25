class Animal{
    String name;
    int legs;

    Animal(String name,int legs){
        this.name=name;
        this.legs=legs;
    }

    Animal(Animal a){
        this.name=a.name;
        this.legs=a.legs;
    }


}

public class Main {


    public static void main(String[] args) {

        Animal ob1=new Animal("elephant",4);
        Animal ob2=new Animal(ob1);

    }


}