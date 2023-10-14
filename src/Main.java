public class Main {

    public static void main(String[] args) {
        Boss boss=new Boss();
        boss.setDamage(75);
        boss.setHealth(550);
        boss.setTypeOfProtection("physicalDefence");
        System.out.println(boss.getDamage()+" "+boss.getHealth()+" "+boss.getTypeOfProtection());



    }
}