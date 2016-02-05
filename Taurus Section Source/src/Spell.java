import java.util.ArrayList;

public class Spell{
	//0: damage/heal, 1: ADS, 2: paralyze, 3: speed, 4: poison, 5: disarm, 6: silence
	public int type;
	public int effect;
	public int manaCost;
	public String name;
	public Spell(int t, int e, int mC, String s) {
		type = t;
		effect = e;
		name = s;
		manaCost = mC;
	}
	public void invoke(ArrayList<Unit> uni) {
		if (type == 0) {
			for (int i = 0; i < uni.size(); i++) {
				uni.get(i).hpChange(effect);
			}
		}
	}
	
}