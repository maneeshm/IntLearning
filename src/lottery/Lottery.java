package lottery;

public class Lottery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String rules[] = {"INDIGO: 93 8 T F",
				"ORANGE: 29 8 F T"};
		
		String result[] = new Lottery().sortByOdds(rules);

	}

	public String[] sortByOdds(String[] rules) {

		for(String string: rules){
			String[] stringSplit = string.split(" ");
			
			String name = stringSplit[0].split(":")[0];
			int choices = Integer.parseInt(stringSplit[1]);
			int blanks = Integer.parseInt(stringSplit[2]);
			boolean sorted = Boolean.parseBoolean(stringSplit[3]);
			boolean unique = Boolean.parseBoolean(stringSplit[4]);
			int sortedAndUnique=0;
			
			if (sorted && unique){
				sortedAndUnique = sortedAndUnique(choices, blanks);
			}
			
		}
		
		return null;
	}

	private int sortedAndUnique(int choices, int blanks) {

		for ()
		
		return 0;
	}

}
