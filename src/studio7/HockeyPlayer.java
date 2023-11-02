package studio7;

public class HockeyPlayer {
	private int number;
	private String name;
	private String handed;
	private double goals;
	private double assists;
	private double points;
	private double games;
	private double ppg;
	
	public HockeyPlayer(String name, int number, String handed, double goals, double assists, double games) {
	this.number = number;
	this.name = name;
	this.handed = handed;
	this.games = games;
	this.assists = assists;
	this.goals = goals;
	this.points = (this.goals + this.assists);
	this.ppg = (this.points / this.games);
	}
	
	public double Points() {
		return this.points;
	}
	
	public double PPG() {
		return this.ppg;
	}
	
	public void print() {
		System.out.println(this.name + ", " + this.number + ", " + this.handed + ", Points: " + this.points + ", PPG: " + this.ppg);
	}
	
	
	
	   public static void main(String[] args)
	   {
	      HockeyPlayer Player1 = new HockeyPlayer("Devin", 2, "Right", 100, 33, 20);
	      Player1.print();
	   }
}
