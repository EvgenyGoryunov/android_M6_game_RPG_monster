public class Zombie extends Monster {

    int damage = 5;

    public Zombie(String name) {
        super(name + "the Zombie", 5);
    }

    public void growl(){
        System.out.print("Raaaauuughhhh");
    }

    public void attack(){
        System.out.print("Monster " + name + " attaked with danage " + damage);
    }

}
