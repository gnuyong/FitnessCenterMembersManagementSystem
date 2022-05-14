import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MembersManager memberManager = new MembersManager(input);
		selectMenu(input, memberManager);
	}	
	
	public static void selectMenu(Scanner input, MembersManager memberManager) {
		int menunumber=-1;
		while(menunumber != 5) 
		{
			try {
				showMenu();
				menunumber = input.nextInt(); 
				switch(menunumber) {
				case 1:
					memberManager.AddMembers();
					break;
				case 2:
					memberManager.DeleteMembers();
					break;
				case 3:
					memberManager.EditMembers();
					break;
				case 4:
					memberManager.ViewMembers();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("1 ~ 5 사이의 정수를 입력하세요!");
				if(input.hasNext()) {
					input.next();
				}
				menunumber = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("-----Fiteness center members menu-----");
		System.out.println("1.Add fitness center member");
		System.out.println("2.Delete fitness center member");
		System.out.println("3.Edit fitness center member");
		System.out.println("4.View fitness center members");
		System.out.println("5.Exit");
		System.out.print("1 ~ 5의 메뉴번호 중 하나를 선택하세요: " ); 
	}
}