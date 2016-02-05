
public class Weapon extends Equipment{
	public int damage;
	public Weapon(int d, int r, String s) {
		type = 0;
		damage = d;
		rarity = r;
		name = s;
	}
	public int effect() {
		return damage;
	}
	public String checkRarity() {
		if (rarity == 0){
			return("The item " + name + " is of common quality. Hey, at least it works, right?");
		}
		else if (rarity == 1) {
			return("The item " + name + "is of rare quality. Not a bad item at all.");
		}
		else if (rarity == 2) {
			return("The item " + name + "is of mythical quality. It must've been extremely hard to farm.");
		}
		else {
			return("The item " + name + "is of CELESTIAL quality. This item was forged by immortal blacksmiths and thus has a special effect.");
		}
	}
}