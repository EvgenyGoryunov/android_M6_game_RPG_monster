public class Monster {

    String name; // имя монстра
    int health;  // здоровье
    int damage;  // сила разрушения


    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.println("Monster " + name + " was created");
    }

    public void growl() { //вызов рева монстра
        System.out.println(" " + name + " growled");
//
    }




    public void attack(){ //вывод инфу о силе разрушения монстра
        System.out.println("Monster " + name + " was created");
        System.out.println("Monster " + name + " attacked with damage " + damage);
        System.out.print(name + " growled");
    }

}
