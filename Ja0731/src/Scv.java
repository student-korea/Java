
public class Scv extends GroundUnit implements Repairable{
	Scv(){
		super(60);
	}
	
	void repair(Repairable r) {
		Unit u = (Unit)r;
		while(u.hitPoint != u.MAX_UP) {
			u.hitPoint++;
		}
	}
}
