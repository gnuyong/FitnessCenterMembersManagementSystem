import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int menunumber = 5;
		
		while(menunumber != 6) 
		{
			System.out.println("-----Fiteness cneter members menu-----");
			System.out.println("1.Add fitness center members");
			System.out.println("2.Delete fitness center members");
			System.out.println("3.Edit fitness center members");
			System.out.println("4.View fitness center members");
			System.out.println("5.Show a menu");
			System.out.println("6.Exit");
			System.out.print("1 ~ 6의 메뉴번호 중 하나를 선택하세요: " );
			
			menunumber = input.nextInt();
			
			if (menunumber==1) {
				Add_fitness_center_members();
			}
			else if (menunumber==2) {
				Delete_fitness_center_members();
			}
			else if (menunumber==3) {
				Edit_fitness_center_members();
			}
			else if (menunumber==4) {
				View_fitness_center_members();
			}
			else {
				continue;
			}
		}

	}
	public static void Add_fitness_center_members() {
		Scanner input = new Scanner(System.in);
		System.out.print("휘트니스 센터 회원의 아이디를 입력하세요: ");
		String memberId = input.nextLine();
		System.out.print("휘트니스 센터 회원의 이름을 입력하세요: ");
		String memberName = input.nextLine();
		System.out.print("휘트니스 센터 회원의 전화번호를 입력하세요: ");
		String memberPhone = input.nextLine();
		System.out.print("휘트니스 센터 회원의 담당 PT선생님 이름을 입력하세요: ");
		String memberPt = input.nextLine();
		System.out.print("휘트니스 센터 회원의 등록 개월 수를 입력하세요: ");
		int memberRegistration = input.nextInt();
		System.out.print("휘트니스 센터 회원의 개인 사물함 번호를 입력하세요: ");
		int memberLocker = input.nextInt();
		
		
		
	}
	public static void Delete_fitness_center_members() {
		Scanner input = new Scanner(System.in);
		System.out.print("휘트니스 센터 회원의 아이디를 입력하세요: ");
		String memberId = input.nextLine();
	}
	public static void Edit_fitness_center_members() {
		Scanner input = new Scanner(System.in);
		System.out.print("휘트니스 센터 회원의 아이디를 입력하세요: ");
		String memberId = input.nextLine();
	}public static void View_fitness_center_members() {
		Scanner input = new Scanner(System.in);
		System.out.print("휘트니스 센터 회원의 아이디를 입력하세요: ");
		String memberId = input.nextLine();
	}
	

}
