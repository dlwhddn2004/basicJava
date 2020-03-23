package game;

public class GameMain {

	public static void main(String[] args) throws Exception {
		System.out.print("Loading");
		  for (int i = 0; i < 30; i++) {
		   System.out.print("▶");
		   Thread.sleep(50);
		  }
		GameStart ga = new GameStart();
		
		ga.gamestrat();
		
	}

}
