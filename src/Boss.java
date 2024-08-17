public class Boss extends GameEntity{
    private Weapon BossWeapon;

    public Boss(String Name,int Damage,int Health,Weapon bossWeapon){
       super(Name,Damage,Health);
       this.BossWeapon = bossWeapon;
    }
    public Weapon getBossWeapon() {
        return BossWeapon;
    }
    public String print_info_boss(){
        return "\nBoss name :"+ super.getName()+"\nDamage :" + super.getDamage()+"\nHealth :"+ super.getHealth()+"\nWeapon type:"+this.BossWeapon.getwType()+"\nWeapon name :" + this.BossWeapon.getWeaponName();
    }
    public void setBossWeapon(Weapon bossWeapon){
        this.BossWeapon = bossWeapon;
    }
}
