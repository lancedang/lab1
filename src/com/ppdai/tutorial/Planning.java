package com.ppdai.tutorial;

/**
 * Planning is a class including class info
 * 
 * @author dangdang
 * @version 2017.5.20
 */
public class Planning {
	private String[] info = new String[4];

	/**
	 * Constructor
	 * 
	 * @param str
	 */
	public Planning(String str) {
		String[] resultStrings = str.split(",");

		info[0] = resultStrings[0].trim();
		info[1] = resultStrings[1].trim();
		info[2] = resultStrings[2].trim();
		info[3] = ""
				+ (Integer.parseInt(info[1]) + Integer.parseInt(info[2]) - 1)
				/ Integer.parseInt(info[2]);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CLASS: " + info[0] + ", Enrolled: " + info[1]
				+ ", Max class size: " + info[2] + ", Sections: " + info[3];
	}
}
