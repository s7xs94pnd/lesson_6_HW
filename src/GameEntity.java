public class GameEntity {
    private final String Name;
    private int Damage;
    private int Health;

    public GameEntity(String name, int damage, int health) {
        this.Name = name;
        this.Damage= damage;
        this.Health = health;
    }


    public void setDamage(int damage) {
        Damage = damage;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public String getName(){
        return Name;
    }
    public int getDamage(){
        return Damage;
    }
    public int getHealth(){
        return Health;
    }


}
