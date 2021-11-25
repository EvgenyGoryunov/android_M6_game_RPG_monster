public class m_6_2_Zombie extends m_6_2_Monster {


    public m_6_2_Zombie(String name) {            //конструктор класс, созданный на основе конструктора суперкласса
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
