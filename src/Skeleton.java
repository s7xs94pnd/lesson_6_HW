public class Skeleton extends Boss{
    private int countOfStrely;
    public Skeleton(String Name, int Damage, int Health, Weapon bossWeapon, int countOfStrely) {
        super(Name, Damage, Health, bossWeapon);
        this.countOfStrely=countOfStrely;
    }

    @Override
    public String print_info_boss(){
        return super.print_info_boss()+"\nCount of strel :" +this.countOfStrely;
    }

}

