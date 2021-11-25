public class Zombie extends Monster {


    public Zombie(String name) {            //конструктор класс, созданный на основе конструктора суперкласса
        super(name + " the Zombie", 5);
    }


    public void growl(){
        System.out.print("Raaaauuughhhh");
        super.growl();
    }


    public void attack(){
        super.attack();
        growl();
    }

}
