public class Main {
    public static void main(String[] args) {
    Boss boss1 = new Boss("Winx",100,500, new Weapon("ak74", WeaponType.GUN));
        System.out.println(boss1.print_info_boss());
    Skeleton skeleton1 = new Skeleton("Skeleton",70,505,new Weapon("LOK",WeaponType.BOW),50);
        System.out.println(skeleton1.print_info_boss());
    }

}


