import java.io.*;

public class SaveFile {
	public static void SavePlayer(Player player) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(player.getUsername() + ".txt"));

			bw.write("[username] : " + player.getUsername());
			bw.newLine();
			bw.write("[hp] : " + player.getHp());
			bw.newLine();
			bw.write("[mana] : " + player.getMana());
			bw.newLine();
			bw.write("[defense] : " + player.getDefense());
			bw.newLine();
			bw.write("[power] : " + player.getPower());
			bw.newLine();

			System.out.println("저장 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("저장 실패" + e.getMessage());
		}

	}
}
