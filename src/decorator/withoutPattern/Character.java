package decorator.withoutPattern;

public abstract class Character {

    private boolean hasFireWeapon;
    private boolean hasPoisonTip;
    private boolean hasLightningStrike;
    private boolean hasSharpBlade;
    private boolean hasCriticalHit;
    private boolean hasBerserkMode;
    private boolean hasDoubleStrike;

    private boolean hasShield;
    private boolean hasArmorPlating;
    private boolean hasElixir;

    public abstract String getBaseDescription();
    public abstract int getBaseHp();
    public abstract int getBaseDamage();

    public void setHasFireWeapon(boolean hasFireWeapon) { 
        this.hasFireWeapon = hasFireWeapon; 
    }

    public void setHasPoisonTip(boolean hasPoisonTip) { 
        this.hasPoisonTip = hasPoisonTip; 
    }

    public void setHasLightningStrike(boolean hasLightningStrike) { 
        this.hasLightningStrike = hasLightningStrike; 
    }

    public void setHasSharpBlade(boolean hasSharpBlade) { 
        this.hasSharpBlade = hasSharpBlade; 
    }

    public void setHasCriticalHit(boolean hasCriticalHit) { 
        this.hasCriticalHit = hasCriticalHit; 
    }

    public void setHasBerserkMode(boolean hasBerserkMode) { 
        this.hasBerserkMode = hasBerserkMode; 
    }

    public void setHasDoubleStrike(boolean hasDoubleStrike) { 
        this.hasDoubleStrike = hasDoubleStrike; 
    }

    public void setHasShield(boolean hasShield) { 
        this.hasShield = hasShield; 
    }

    public void setHasArmorPlating(boolean hasArmorPlating) { 
        this.hasArmorPlating = hasArmorPlating; }
    public void setHasElixir(boolean hasElixir) { this.hasElixir = hasElixir; }

    public int getDamage() {
        int damage = getBaseDamage();

        if (hasFireWeapon) damage += 30;
        if (hasPoisonTip) damage += 20;
        if (hasLightningStrike) damage += 40;
        if (hasSharpBlade) damage += 15;
        if (hasCriticalHit) damage += 35;
        if (hasBerserkMode) damage += 50;
        if (hasDoubleStrike) damage *= 2;

        return damage;
    }

    public int getHp() {
        int hp = getBaseHp();

        if (hasShield) hp += 40;
        if (hasArmorPlating) hp += 70;
        if (hasElixir) hp += 50;

        return hp;
    }

    public String getDescription() {
        StringBuilder description = new StringBuilder(getBaseDescription());

        if (hasFireWeapon) description.append(" + Fire Weapon");
        if (hasPoisonTip) description.append(" + Poison Tip");
        if (hasLightningStrike) description.append(" + Lightning Strike");
        if (hasSharpBlade) description.append(" + Sharp Blade");
        if (hasCriticalHit) description.append(" + Critical Hit");
        if (hasBerserkMode) description.append(" + Berserk Mode");
        if (hasDoubleStrike) description.append(" + Double Strike");
        if (hasShield) description.append(" + Shield");
        if (hasArmorPlating) description.append(" + Armor Plating");
        if (hasElixir) description.append(" + Elixir");

        return description.toString();
    }

    public void display() {
        System.out.println("Character : " + getDescription());
        System.out.println("HP        : " + getHp());
        System.out.println("Damage    : " + getDamage());
        System.out.println();
    }

    public static void fight(Character c1, Character c2) {
        int hitsForC1ToWin = (int) Math.ceil((double) c2.getHp() / c1.getDamage());
        int hitsForC2ToWin = (int) Math.ceil((double) c1.getHp() / c2.getDamage());

        System.out.println(c1.getDescription() + "  vs  " + c2.getDescription());
        System.out.println(c1.getBaseDescription() + " needs " + hitsForC1ToWin + " hit(s) to win");
        System.out.println(c2.getBaseDescription() + " needs " + hitsForC2ToWin + " hit(s) to win");

        if (hitsForC1ToWin < hitsForC2ToWin) {
            System.out.println("Winner: " + c1.getBaseDescription());
        } else if (hitsForC2ToWin < hitsForC1ToWin) {
            System.out.println("Winner: " + c2.getBaseDescription());
        } else {
            System.out.println("Both " + c1.getBaseDescription() + " and " + c2.getBaseDescription() + " died");
        }

        System.out.println();
    }
}
