import java.util.ArrayList;

public class Character extends Unit{
	public int exp;
	//Strength attribute: increases hp and raw attack damage
	public int strength;
	//Agility attribute: increases speed and evasion chance
	public int agility;
	//Intelligence attribute: increases mana pool and raw spell damage
	public int intelligence;
	//Array list of equipment, {weapon, offhand, armor, ornament}
	public ArrayList<Equipment> equipment;
	//Character constructor
	public Character(String charName, int levelInit, int expInit, int hpInit, int manaInit, int speedInit, int strengthInit, int agilityInit, 
int intelligenceInit, ArrayList<Equipment> e, ArrayList<Spell> s) {
		name = charName;
		level = levelInit;
		exp = expInit;
		hp = hpInit;
		hpMax = hpInit;
		mana = manaInit;
		manaMax = hpInit;
		speed = speedInit;
		speedMax = speedInit;
		strength = strengthInit;
		agility = agilityInit;
		intelligence = intelligenceInit;
		status = 1;
		equipment = e;
		spells = s;
	}
	//Levelup method
	public void levelUp(int d) {
		exp = 0;
		level += d;
		hpMaxChange(strength*5);
		manaMaxChange(intelligence*3);
		speedMaxChange(agility*4);
	}

	//Increase max hp method
	public void hpMaxChange(int d) {
		hpMax += d;
	}

	//Increase max mana method
	public void manaMaxChange(int d) {
		manaMax += d;
	}
	
	public void speedMaxChange(int d) {
		speedMax +=d;
	}
	//Gain experience method
	public void gainExp(int d) {
		exp += d;
	}
	public void speed() {
		
	}
	public void unequip(Equipment e) {
		if(equipment.contains(e)) {
			equipment.remove(e);
		}
	}
	public Equipment equip(Equipment e) {
		return equipment.set(e.type, e);
	}
	public void learn(Spell s) {
		spells.add(s);
	}

}