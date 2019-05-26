package game.show;

public class GameTwo {

	public static void main(String[] args) {
		for(int i = 1; i <101 ;i ++){
			if(i %3 == 0 || i % 5 == 0 || String.valueOf(i).contains("3") || String.valueOf(i).contains("5")){
				System.out.println("FizzBuzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
