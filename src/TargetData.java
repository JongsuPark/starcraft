import java.util.HashMap;
import java.util.Map;

import bwapi.Unit;

public class TargetData {

	private Map<Integer, Unit> attackerTarget = new HashMap<Integer, Unit>();
	
	public void addTarget(Unit attacker, Unit target) {
		this.addTarget(attacker.getID(), target);
	}
	
	public void addTarget(int attackerId, Unit target) {
		this.attackerTarget.put(attackerId, target);
	}
	
	public Unit getTarget(int attackerId) {
		return this.attackerTarget.get(attackerId);
	}
	
	public Unit getTarget(Unit attacker) {
		return this.attackerTarget.get(attacker.getID());
	}
	
	public void destroy(Unit attacker) {
		this.destroy(attacker.getID());
	}
	
	public void destroy(int attackerId) {
		this.attackerTarget.remove(attackerId);
	}
}
