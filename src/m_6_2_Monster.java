public class m_6_2_Monster {

    String name; // имя монстра
    int health;  // здоровье
    int damage;  // сила разрушения


    public m_6_2_Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void growl() { //вызов рева монстра
//
    }

    public void attack(){ //вывод инфу о силе разрушения монстра
        System.out.println("Monster " + name + " was created");
        System.out.println("Monster " + name + " attacked with damage " + damage);
        System.out.print(name + " growled");
    }

}
