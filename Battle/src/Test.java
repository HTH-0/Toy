import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==== 메인 메뉴 ====");
		System.out.print("1.Solo  2.Online  3.Exit >> ");
		int Mchoice = sc.nextInt();

		MainChoice mainchoice = switch (Mchoice) {
			case 1 -> MainChoice.SOLO;
			case 2 -> MainChoice.ONLINE;
			case 3 -> MainChoice.SAVE;
			case 4 -> MainChoice.LOAD;
			case 5 -> MainChoice.EXIT;
			default -> MainChoice.SOLO;
		};

		new MainMenu(mainchoice);
	}
}
