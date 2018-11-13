package pkgEnum;

import java.util.HashMap;

public enum eGameDifficulty {
	
	EASY(100), MEDIUM(500), HARD(1000);
	
	private final int iDifficulty;
	
	private static final HashMap<Integer, eGameDifficulty> lookup = new HashMap<Integer, eGameDifficulty>();;
	
	static {
		for (eGameDifficulty eGD : eGameDifficulty.values()) {
			lookup.put(eGD.getDifficulty(), eGD);
		}
	}
	
	private eGameDifficulty(int iDifficulty) {
		this.iDifficulty = iDifficulty;
	}
	
	public int getDifficulty() {
		return iDifficulty;
	}
	
	public static eGameDifficulty get(int i) {
		eGameDifficulty eGD = null;
		for (eGameDifficulty e : eGameDifficulty.values())
			if (e.getDifficulty() >= i)
				eGD = e;
		return eGD;
	}
}