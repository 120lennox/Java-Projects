public class Gambler{
	public static void main(String args[]){
		int stake = Integer.parseInt(args[0]);
		int goal = Integer.parseInt(args[1]);
		int trials = Integer.parseInt(args[2]);

		int t;
		int wins = 0;
		for (t = 0; t <= trials; t++){
			int cash = stake;
			while (cash > 0 && cash < goal){
				if (Math.random() < 0.5)
					cash += 1000;
				else
					cash -= 1000;
			}
			if (cash == goal) wins++;
		}
		
		System.out.println(wins + " wins of " + trials);
	}
}