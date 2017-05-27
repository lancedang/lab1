package com.ppdai.tutorial;

/**
 * Planning is a class including class info
 * @author qiankai02
 * @version 2017.5.20
 */
public class Planning {
	private String[] info = new String[4];

	/**
	 * Constructor
	 * @param str
	 */
	public Planning(String str) {
		String[] resultStrings = str.split(",");
		info[0] = resultStrings[0];
		info[1] = resultStrings[1];
		info[2] = resultStrings[2];
		info[3] = ""
				+ (Integer.parseInt(resultStrings[1])
						+ Integer.parseInt(resultStrings[2]) - 1)
				/ Integer.parseInt(resultStrings[2]);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CLASS: "+info[0] + ", Enrolled: "+info[1] + ", Max class size: " + info[2] + ", Sections: " +info[3];
	}
}
