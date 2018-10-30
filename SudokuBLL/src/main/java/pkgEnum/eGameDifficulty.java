package pkgEnum;

import java.util.HashMap;

public enum eGameDifficulty {
	
	EASY(100), MEDIUM(250), HARD(500);
	
	private int iDifficulty;
	
	private HashMap<Integer, eGameDifficulty> lookup;
	
	private eGameDifficulty(int iDifficulty) {
		this.iDifficulty = iDifficulty;
	}
	//:)
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