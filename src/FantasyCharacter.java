public abstract class FantasyCharacter  implements Fighter {

    private String name;
    private int hp;
    private int dexterity;
    private int exp;
    private int strength;
    private int gold;

    public FantasyCharacter(String name, int hp, int dexterity, int exp, int strength, int gold) {
        this.name = name;
        this.hp = hp;
        this.dexterity = dexterity;
        this.exp = exp;
        this.strength = strength;
        this.gold = gold;
    }
    @Override
    public int attack() {
        if (dexterity * 3 > getRandomValue()) return strength;
        else return 0;
    }
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getExp() {
        return exp;
    }

    public int getStrength() {
        return strength;
    }

    public int getGold() {
        return gold;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
    public int getRandomValue() {
        return (int) (Math.random()*100);
    }
    @Override
    public String toString () {
        return String.format("%s здоровье: %d", name , hp);
    }
}
