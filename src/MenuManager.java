import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		MembersManager memberManager = new MembersManager(input);
		
		int menunumber=-1;
		
		while(menunumber != 5) 
		{
			System.out.println("-----Fiteness center members menu-----");
			System.out.println("1.Add fitness center member");
			System.out.println("2.Delete fitness center member");
			System.out.println("3.Edit fitness center member");
			System.out.println("4.View fitness center members");
			System.out.println("5.Exit");
			System.out.print("1 ~ 5의 메뉴번호 중 하나를 선택하세요: " );
			
			menunumber = input.nextInt();
			
			if (menunumber==1) {
				memberManager.AddMembers();
			}
			else if (menunumber==2) {
				memberManager.DeleteMembers();
			}
			else if (menunumber==3) {
				memberManager.EditMembers();
			}
			else if (menunumber==4) {
				memberManager.ViewMembers();
			}
			else {
				continue;
			}
		}
	}	
}