
public class MainMenu {
	
	
	public MainMenu(MainChoice choice) {
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
		new SoloGame().start();
	}
	
	private void online() {
		System.out.println("아직 미구현");
	}
	
	private void save(Player player) {
		SaveFile.SavePlayer(player);
	}
	
	private void load() {
		
	}
	
	private void exit() {
		
	}
}
