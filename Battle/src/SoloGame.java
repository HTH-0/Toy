import java.util.Scanner;

public class SoloGame {
	public void start() {
		Scanner sc = new Scanner(System.in);
		Player player = new Player(100, 30, 10, 20);
		StageInit stageInit = new StageInit();
		Battle battle = new Battle();

		System.out.println("싱글 모드 시작!");

		while (true) {
			Stage currentStage = stageInit.getCurrentStage();
			if (currentStage == null) {
				System.out.println("모든 스테이지를 클리어! 게임 종료");
				break;
			}

			System.out.println("\n▶ " + currentStage);
			for (Enemy enemy : currentStage.getEnemyList()) {
				System.out.println("전투 시작! 상대: " + enemy);

				while (enemy.getHp() > 0 && player.getHp() > 0) {
					System.out.print("행동을 선택하세요 (1.공격 2.방어 3.마법) >> ");
					int Bchoice = sc.nextInt();
					BattleChoice battleChoice = switch (Bchoice) {
						case 1 -> BattleChoice.ATTACK;
						case 2 -> BattleChoice.DEFEND;
						case 3 -> BattleChoice.MAGIC;
						default -> BattleChoice.ATTACK;
					};

					battle.battle(player, enemy, battleChoice);

					if (enemy.getHp() > 0) {
						battle.attacked(enemy, player);
						if (player.getHp() <= 0) {
							System.out.println("플레이어 사망! 게임 오버");
							return;
						}
					}
					System.out.println();
				}

				System.out.println("적을 처치했습니다!\n");
			}

			if (!stageInit.nextStage()) {
				System.out.println("마지막 스테이지까지 완료했습니다.");
				break;
			}
		}

		System.out.println("게임을 종료합니다.");
	}
}
