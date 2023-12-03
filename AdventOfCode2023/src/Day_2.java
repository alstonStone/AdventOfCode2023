import java.util.*;

public class Day_2 {

	public static int redMax = 12;
	public static int greenMax = 13;
	public static int blueMax = 14;
	/**
	 * @param args
	 *
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String lines[] = input.split("\\r?\\n");

		for(String s: lines){
			String current = s;
			String currentLines[] = current.split(":");
			String game = currentLines[0];
			int gameNumber = ExtractGameNumber(game);

			String rounds[] = currentLines[1].split(";");
			for(String r: rounds){
				String colors[] = r.split(",");
				string Colorvalue = "";
				for(String c :color){
					if(c.contains("blue")){

					}else if(c.contains("red")){

					}else if(c.contains("green")){

					}
				}
			}

			System.out.println(Arrays.toString(rounds));

			System.out.println(rounds.length);

			System.out.println(ExtractGameNumber(lines[60]));
		}

	}

  public static int ExtractGameNumber(String s){
    String value ="";
    for( Character c: s.toCharArray()){
      if(c ==':'){
        break;
      }else if(Character.isDigit(c)){
        value += c;
      }
    }
    return Integer.parseInt(value);
  }





  public static String input = "Game 1: 1 blue, 2 green, 3 red; 7 red, 8 green; 1 green, 2 red, 1 blue; 2 green, 3 red, 1 blue; 8 green, 1 blue\r\n"
    + "Game 2: 12 blue, 3 green, 5 red; 1 green, 1 blue, 8 red; 2 green, 12 blue, 5 red; 7 red, 2 green, 13 blue\r\n"
    + "Game 3: 7 red, 4 blue, 13 green; 14 green, 1 blue, 1 red; 1 red, 11 green, 5 blue; 10 green, 3 blue, 3 red; 5 red, 5 blue, 3 green\r\n"
    + "Game 4: 3 red, 1 green, 17 blue; 11 red, 6 green, 18 blue; 4 red, 9 blue, 5 green; 2 blue, 2 green, 1 red; 1 red, 2 green; 7 green, 9 red, 2 blue\r\n"
    + "Game 5: 1 blue, 9 green, 5 red; 12 green, 1 blue, 15 red; 17 green, 8 red, 4 blue; 7 green, 12 red\r\n"
    + "Game 6: 4 blue, 9 green, 7 red; 1 red, 7 green, 4 blue; 4 blue, 8 green, 3 red; 2 green, 1 red, 2 blue\r\n"
    + "Game 7: 3 green, 1 blue; 11 red, 2 blue; 2 red, 3 blue, 6 green\r\n"
    + "Game 8: 8 blue, 1 red, 11 green; 11 blue, 10 red, 7 green; 4 blue, 6 green, 4 red; 3 blue, 2 green, 6 red; 4 green, 4 red, 1 blue; 5 blue, 12 red, 9 green\r\n"
    + "Game 9: 2 green, 20 blue, 4 red; 3 green, 7 red, 2 blue; 3 green, 17 blue; 20 blue, 7 red, 2 green; 4 green, 6 red, 1 blue; 7 red, 5 green, 19 blue\r\n"
    + "Game 10: 2 red, 9 green, 8 blue; 16 green, 1 red, 7 blue; 3 blue, 5 red, 9 green; 5 blue, 2 red, 11 green\r\n"
    + "Game 11: 6 blue, 3 green, 8 red; 6 blue, 4 green; 1 red, 3 green, 4 blue\r\n"
    + "Game 12: 18 red, 16 blue, 9 green; 10 green, 6 blue; 12 blue, 5 green, 15 red; 16 blue, 4 red, 8 green\r\n"
    + "Game 13: 2 green; 1 blue, 4 green; 1 green, 3 blue, 6 red; 2 red, 2 blue; 3 red, 2 green; 8 red, 2 blue, 5 green\r\n"
    + "Game 14: 8 red, 3 blue, 3 green; 3 green; 4 red, 7 blue, 5 green; 10 blue, 15 red, 1 green; 4 green, 14 red, 7 blue\r\n"
    + "Game 15: 8 red, 9 blue; 1 green, 4 red, 3 blue; 15 red, 3 blue, 1 green; 17 red, 6 blue\r\n"
    + "Game 16: 1 green, 10 blue, 13 red; 16 red, 1 green; 7 red; 9 blue, 12 red, 1 green; 6 red, 13 blue, 1 green\r\n"
    + "Game 17: 6 green, 1 blue, 1 red; 2 blue, 9 green, 1 red; 6 green, 1 blue, 2 red\r\n"
    + "Game 18: 5 red, 4 green, 1 blue; 5 blue, 6 red, 6 green; 12 red, 16 blue, 11 green\r\n"
    + "Game 19: 6 red, 9 green; 1 blue, 4 red; 12 green; 5 green, 2 blue, 9 red\r\n"
    + "Game 20: 15 blue, 15 red, 1 green; 2 green, 5 red, 13 blue; 15 red, 2 green, 15 blue; 3 green, 3 red, 13 blue; 6 blue, 1 green, 8 red\r\n"
    + "Game 21: 3 red, 3 blue; 4 blue, 3 red; 4 red, 8 blue, 1 green; 1 blue, 2 red, 7 green; 3 green, 3 blue; 3 blue\r\n"
    + "Game 22: 5 green, 3 blue, 7 red; 7 green, 1 blue, 5 red; 5 red, 3 blue, 3 green; 12 green, 7 red, 1 blue; 2 red, 3 blue; 7 green, 11 red, 1 blue\r\n"
    + "Game 23: 9 blue, 8 red; 9 blue, 9 green, 8 red; 3 red, 6 blue, 14 green; 3 blue, 4 red; 5 red, 14 green, 9 blue; 12 blue, 8 red, 8 green\r\n"
    + "Game 24: 15 green, 1 red, 1 blue; 6 red, 2 green, 7 blue; 7 blue, 2 green, 4 red; 8 blue, 5 red, 8 green; 5 blue, 3 red, 7 green; 6 blue, 12 green\r\n"
    + "Game 25: 7 blue, 16 green, 1 red; 13 green; 4 red, 9 green, 2 blue; 11 green, 1 red, 1 blue; 3 blue, 5 green, 5 red\r\n"
    + "Game 26: 2 blue, 11 red, 10 green; 5 green, 1 blue, 2 red; 7 green, 5 red, 14 blue; 11 green, 1 blue, 10 red\r\n"
    + "Game 27: 2 green, 8 blue, 2 red; 1 blue, 1 red, 5 green; 3 green, 7 blue\r\n"
    + "Game 28: 9 green, 15 red, 1 blue; 3 blue, 3 green; 18 green, 15 red, 7 blue; 3 red, 10 blue, 7 green; 6 red, 5 green, 8 blue; 2 blue, 7 red, 3 green\r\n"
    + "Game 29: 5 blue, 3 red, 7 green; 17 blue, 8 red, 11 green; 6 red, 5 blue, 12 green; 3 red, 10 blue, 10 green; 4 blue, 10 green; 6 red, 2 blue, 9 green\r\n"
    + "Game 30: 4 green, 5 blue, 1 red; 19 red, 18 blue, 3 green; 18 red, 18 blue, 1 green; 5 green, 14 blue, 4 red; 4 red, 3 green, 18 blue; 6 blue, 3 green, 17 red\r\n"
    + "Game 31: 2 red, 2 green; 13 red, 9 blue; 4 blue, 3 green, 1 red; 12 blue, 12 red, 4 green; 9 red, 6 blue; 12 red, 1 green, 2 blue\r\n"
    + "Game 32: 11 red, 5 blue, 9 green; 3 blue, 8 red, 15 green; 3 green, 7 blue, 17 red; 2 green, 9 red, 1 blue; 2 blue, 6 green, 2 red\r\n"
    + "Game 33: 13 blue, 2 green; 1 green, 1 red, 14 blue; 3 green, 6 blue, 1 red; 12 blue, 1 green; 9 blue, 2 green; 4 blue, 1 red\r\n"
    + "Game 34: 15 green, 2 red, 13 blue; 1 green, 6 blue; 2 red, 1 green, 7 blue\r\n"
    + "Game 35: 1 green, 12 red, 2 blue; 3 red, 5 blue; 6 red; 3 red, 3 blue; 4 red\r\n"
    + "Game 36: 6 blue, 8 red, 1 green; 7 green, 6 blue, 10 red; 7 blue, 9 green, 5 red; 7 green, 1 red, 1 blue\r\n"
    + "Game 37: 6 blue, 2 green, 4 red; 2 green, 3 blue, 6 red; 1 green, 17 red, 14 blue; 10 red, 2 blue; 19 red, 1 green, 8 blue; 2 red, 2 green\r\n"
    + "Game 38: 6 red, 1 green, 5 blue; 2 blue, 15 green, 6 red; 10 green, 3 blue, 6 red; 5 blue, 8 green, 2 red\r\n"
    + "Game 39: 8 blue, 5 green, 5 red; 4 green, 5 blue; 2 red, 7 blue; 3 green, 15 blue, 4 red\r\n"
    + "Game 40: 8 green, 12 red, 10 blue; 8 blue, 8 red, 9 green; 1 green, 10 blue, 9 red; 17 red, 7 green, 2 blue; 6 green, 11 red; 2 green, 2 blue, 8 red\r\n"
    + "Game 41: 11 red, 5 green, 1 blue; 5 green; 3 green; 2 red\r\n"
    + "Game 42: 8 blue, 11 red, 1 green; 12 red, 10 green, 6 blue; 2 red, 6 blue, 16 green; 18 blue, 2 red, 4 green; 10 blue, 10 green, 3 red\r\n"
    + "Game 43: 4 red, 3 blue; 2 blue, 10 red, 4 green; 3 blue, 7 red, 5 green; 2 green, 8 red; 1 green, 3 blue; 10 red, 1 green\r\n"
    + "Game 44: 1 red, 9 blue; 2 red, 19 blue; 2 green, 6 red, 15 blue; 11 blue, 8 red, 4 green\r\n"
    + "Game 45: 7 green, 4 blue, 1 red; 5 blue, 8 green; 5 blue, 8 green; 5 blue, 6 green; 6 green, 3 blue\r\n"
    + "Game 46: 2 red, 2 green; 6 red, 5 blue, 2 green; 13 green, 8 blue, 2 red\r\n"
    + "Game 47: 1 red, 5 green; 1 blue, 15 red, 5 green; 6 red, 6 green, 3 blue; 5 blue, 4 red; 4 blue, 7 red\r\n"
    + "Game 48: 16 blue, 16 red; 11 blue, 16 red; 15 red, 1 green; 6 blue, 1 green, 2 red\r\n"
    + "Game 49: 9 green, 20 blue, 7 red; 16 blue, 6 red; 9 green, 1 blue, 1 red; 8 red, 12 green, 15 blue; 3 blue, 2 green, 8 red\r\n"
    + "Game 50: 9 red, 6 green, 9 blue; 6 blue, 2 red, 6 green; 7 green, 4 red, 6 blue; 2 red, 7 blue, 9 green; 4 red, 8 green, 9 blue\r\n"
    + "Game 51: 1 blue, 2 red, 6 green; 1 blue, 4 red; 6 red, 2 green; 6 red, 8 green, 2 blue; 2 blue, 8 green, 4 red\r\n"
    + "Game 52: 10 green, 1 blue; 5 blue, 5 green; 5 blue, 2 red, 4 green; 2 blue, 12 green\r\n"
    + "Game 53: 3 blue, 8 red, 7 green; 7 blue, 7 red, 12 green; 8 blue, 9 green, 7 red; 7 red, 10 blue, 1 green\r\n"
    + "Game 54: 3 green, 4 blue; 1 blue, 5 red, 4 green; 7 red, 4 blue; 2 green, 4 blue; 1 red, 4 blue; 1 blue, 6 red, 5 green\r\n"
    + "Game 55: 7 red, 13 blue; 7 blue, 1 red, 1 green; 3 red, 5 blue\r\n"
    + "Game 56: 6 red, 3 green, 1 blue; 7 blue, 2 green, 5 red; 4 green, 4 red; 8 blue, 1 green; 6 green, 6 blue, 4 red\r\n"
    + "Game 57: 14 blue, 12 green, 8 red; 1 red, 20 blue, 10 green; 4 red, 16 green, 15 blue\r\n"
    + "Game 58: 3 blue, 12 red; 9 red, 3 blue, 2 green; 2 blue, 2 red; 7 red, 4 green, 5 blue; 10 red, 1 blue\r\n"
    + "Game 59: 7 red, 11 blue, 17 green; 5 red, 4 green, 7 blue; 8 red, 6 blue, 17 green; 16 green, 7 red, 6 blue; 5 blue, 12 green, 9 red; 7 blue, 3 red, 9 green\r\n"
    + "Game 60: 4 red, 5 green, 4 blue; 15 green, 4 red, 18 blue; 6 blue, 1 red, 1 green; 14 blue, 12 green, 1 red; 2 green, 5 red, 4 blue; 2 green, 1 blue, 5 red\r\n"
    + "Game 61: 3 green, 2 blue; 4 green, 6 blue; 2 red, 12 green, 11 blue; 1 red, 9 green, 7 blue; 2 red, 11 green, 19 blue; 9 blue, 1 red, 2 green\r\n"
    + "Game 62: 17 green; 3 blue, 14 red, 14 green; 17 red, 16 green, 5 blue; 17 green, 5 blue, 1 red; 4 blue, 17 red, 13 green\r\n"
    + "Game 63: 4 green, 2 red, 2 blue; 10 green, 15 blue, 3 red; 5 green, 5 blue, 5 red\r\n"
    + "Game 64: 9 red, 10 blue, 2 green; 1 green, 4 red, 1 blue; 5 green, 2 blue, 11 red\r\n"
    + "Game 65: 1 blue, 10 red, 5 green; 1 blue, 4 green, 2 red; 3 blue, 1 green; 11 red, 2 blue, 5 green; 9 green, 11 red, 3 blue\r\n"
    + "Game 66: 6 blue, 13 green, 2 red; 5 green, 1 red, 7 blue; 11 green, 3 red; 5 blue, 1 red, 2 green\r\n"
    + "Game 67: 1 red, 10 green, 4 blue; 5 blue, 3 red, 9 green; 4 blue, 3 red, 1 green; 14 red, 4 blue, 10 green\r\n"
    + "Game 68: 12 green, 3 red, 3 blue; 2 green, 1 red, 2 blue; 1 blue, 3 green, 3 red; 1 green, 1 red, 6 blue\r\n"
    + "Game 69: 3 blue, 10 red, 4 green; 4 green, 1 blue, 6 red; 1 blue, 1 red, 6 green; 4 red, 3 blue, 5 green\r\n"
    + "Game 70: 9 blue, 3 green; 1 red, 2 green, 6 blue; 9 blue, 2 green; 6 blue, 1 red; 6 green, 1 red, 6 blue; 3 blue, 1 red, 2 green\r\n"
    + "Game 71: 2 blue; 2 red, 3 blue; 12 blue, 3 red, 1 green; 1 green; 1 red, 7 blue; 1 red, 9 blue\r\n"
    + "Game 72: 1 red, 1 green, 5 blue; 19 blue, 1 red, 3 green; 3 green, 1 red; 1 red, 13 blue, 1 green; 1 red, 1 green, 19 blue; 6 blue\r\n"
    + "Game 73: 12 blue, 5 red, 5 green; 12 blue, 1 red, 4 green; 7 green, 4 red, 6 blue; 1 green, 4 blue, 10 red; 9 blue, 14 green\r\n"
    + "Game 74: 9 blue, 1 green, 2 red; 7 blue, 15 red; 5 red, 2 green, 17 blue\r\n"
    + "Game 75: 8 red; 1 green, 14 red; 2 blue, 3 green, 10 red; 2 blue, 4 green\r\n"
    + "Game 76: 2 red, 3 blue; 6 blue, 8 red; 6 blue, 9 red; 7 blue; 7 red, 1 green, 5 blue\r\n"
    + "Game 77: 6 green, 5 red, 12 blue; 16 blue, 5 red, 11 green; 4 blue, 5 green; 10 blue, 4 red, 9 green\r\n"
    + "Game 78: 7 blue, 2 red; 1 green, 5 red; 4 blue\r\n"
    + "Game 79: 3 green, 4 blue; 4 blue, 1 green, 2 red; 8 blue, 3 green\r\n"
    + "Game 80: 10 red, 8 green; 4 red, 1 blue; 7 red, 4 green, 4 blue; 6 green, 1 red, 3 blue; 9 red, 3 blue; 4 green, 8 blue, 13 red\r\n"
    + "Game 81: 3 red, 6 green, 9 blue; 9 red, 1 blue, 3 green; 5 red, 11 green, 1 blue\r\n"
    + "Game 82: 6 green, 11 blue, 8 red; 16 green, 9 red, 7 blue; 6 blue, 17 green, 4 red\r\n"
    + "Game 83: 6 blue, 1 green, 8 red; 3 green, 5 blue; 4 red, 2 green, 8 blue\r\n"
    + "Game 84: 2 green, 1 red, 5 blue; 1 red, 2 green, 5 blue; 2 blue; 9 blue\r\n"
    + "Game 85: 9 blue, 2 red; 7 green, 13 blue, 3 red; 11 green, 17 blue\r\n"
    + "Game 86: 2 green, 15 red; 12 red, 1 blue, 3 green; 2 blue, 4 red, 3 green; 5 red; 6 green, 2 blue\r\n"
    + "Game 87: 17 blue, 3 red; 3 red, 4 green, 10 blue; 3 red, 14 blue, 4 green\r\n"
    + "Game 88: 13 green, 10 blue, 10 red; 14 green, 3 red, 4 blue; 13 blue, 7 red, 16 green; 10 blue, 6 green, 1 red; 9 red, 4 green, 14 blue\r\n"
    + "Game 89: 3 green, 16 blue, 14 red; 4 green, 13 red, 1 blue; 6 red, 17 blue, 1 green; 4 red, 7 blue\r\n"
    + "Game 90: 2 blue, 2 red; 5 blue, 10 red, 6 green; 10 red, 3 green, 1 blue; 10 blue, 6 green, 7 red\r\n"
    + "Game 91: 15 green, 5 blue, 12 red; 9 red, 1 green, 4 blue; 2 red, 15 green, 3 blue; 18 green, 5 blue, 2 red\r\n"
    + "Game 92: 7 green, 7 blue, 12 red; 7 blue, 9 red, 2 green; 11 blue, 10 red, 10 green; 2 green, 4 red, 11 blue; 12 red, 4 blue; 2 red, 6 green\r\n"
    + "Game 93: 2 green, 8 blue; 2 blue, 1 red, 3 green; 4 blue, 8 green, 1 red; 8 blue, 5 green; 3 green\r\n"
    + "Game 94: 16 red, 1 green, 5 blue; 11 red, 9 blue; 5 red, 2 green, 6 blue\r\n"
    + "Game 95: 4 blue, 7 red; 7 red, 10 green; 11 green; 2 red, 10 green; 6 blue, 8 red; 8 red, 2 green, 6 blue\r\n"
    + "Game 96: 9 blue, 12 green; 6 green, 9 blue, 11 red; 7 blue, 5 green, 10 red\r\n"
    + "Game 97: 1 green, 6 red, 1 blue; 6 red, 3 green, 6 blue; 9 green, 5 blue, 9 red; 13 red, 7 green\r\n"
    + "Game 98: 9 red, 12 green, 2 blue; 1 blue, 11 green, 10 red; 10 red, 2 green\r\n"
    + "Game 99: 4 red, 13 blue, 7 green; 7 green, 5 blue, 6 red; 7 green, 11 blue; 10 green, 2 red, 8 blue\r\n"
    + "Game 100: 2 green, 1 blue; 9 red, 8 green, 1 blue; 4 red, 10 green, 1 blue; 17 green, 8 red; 5 green, 1 blue, 7 red; 14 red, 12 green";
}
