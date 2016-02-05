import java.util.ArrayList;

public class Unit {
	public String name;
	public int level;
	public int hp;
	public int hpMax;
	public int mana;
	public int manaMax;
	public int speed;
	public int speedMax;
	//Array list of spells the character can use
	public ArrayList<Spell> spells;
	//Status of character. 0 = fallen, 1 = normal, 2 = paralyzed, 3 = poisoned, 4 = disarmed, 5 = silenced
	public int status;
	
	//Change current hp method
	public void hpChange(int d) {
		if (hp+d<hpMax && hp+d>0) {
			hp+=d;
		}
		else if (hp+d>0) {
			hp = hpMax;
		}
		else {
			hp = 0;
			status = 0;
		}
	}
	
	//Change current mana method
	public void manaChange(int d) {
		if (mana+d<manaMax && mana+d>0) {
			hp+=d;
		}
		else if (mana+d>0) {
			mana = manaMax;
		}
		else {
			mana = 0;
		}
	}
	
	public void speedChange(int r) {
		speed = speed*r;
	}
	
	public void speedRestore() {
		speed = speedMax;
	}
	
	public void cast(String casted, ArrayList<Unit> targets) {
		for(Spell sp : spells) {
			if (sp.name.equals(casted)) {
				sp.invoke(targets);
			}
		}
	}
}
