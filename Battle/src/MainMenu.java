
public class MainMenu {
	
	private Player player;

	public MainMenu(MainChoice choice, Player player) {
		this.player = player;
		select(choice);
	}
	
	public void select(MainChoice choice) {
		switch(choice) {
		case SOLO -> solo();
		case ONLINE -> online();
		case SAVE -> save();
		case LOAD -> load();
		case EXIT -> exit();
		}
	}
	private void solo() {
		new SoloGame(player).start();
	}
	
	private void online() {
		System.out.println("아직 미구현");
	}
	
	private void save() {
		SaveFile.SavePlayer(player);
	}
	
	private void load() {
		
	}
	
	private void exit() {
		
	}
}
