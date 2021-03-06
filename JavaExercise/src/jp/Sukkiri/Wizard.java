package jp.Sukkiri;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("この値は設定できません。");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("この名前は設定できません。");
        }
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("この値は設定できません。");
        }
        this.wand = wand;
    }

    void heal(Hero h) {
        int basePoint = 10;
        int recoverPoint = (int) (basePoint * this.wand.getPower());

        h.setHp(h.getHp() + recoverPoint);
        System.out.println(h.getName() + "を" + recoverPoint + "回復した。");
    }
}
