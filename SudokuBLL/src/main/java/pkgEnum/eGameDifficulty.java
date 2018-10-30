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
	
	public eGameDifficulty get(int i) {
		 if (i < 100)
			 return null;
		 else if (i >= 100 && i < 500)
			 return EASY;
		 else if (i >= 500 && i < 1000)
			 return MEDIUM;
		 else
			 return HARD;
	}
}