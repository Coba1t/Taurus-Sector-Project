
public abstract class Equipment {
	//Rarity: 0 = common, 1 = rare, 2 = arcane, 3 = mythical, 4 = celestial
	public int rarity;
	public int type;
	public String name;
	public abstract int effect();
}
