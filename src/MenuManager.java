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
			System.out.print("1 ~ 6�� �޴���ȣ �� �ϳ��� �����ϼ���: " );
			
			menunumber = input.nextInt();
			
			if (menunumber==1) {
				System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���̵� �Է��ϼ���: ");
				String memberId = input.next();				
				System.out.print("��Ʈ�Ͻ� ���� ȸ���� �̸��� �Է��ϼ���: ");
				String memberName = input.next();				
				System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��ȭ��ȣ�� �Է��ϼ���: ");
				String memberPhone = input.next();			
				System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��� PT������ �̸��� �Է��ϼ���: ");
				String memberPt = input.next();			
				System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��� ���� ���� �Է��ϼ���: ");
				int memberRegistration = input.nextInt();			
				System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���� �繰�� ��ȣ�� �Է��ϼ���: ");
				int memberLocker = input.nextInt();
			}
			else if (menunumber==2) {
				System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���̵� �Է��ϼ���: ");
				String memberId = input.next();
			}
			else if (menunumber==3) {
				System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���̵� �Է��ϼ���: ");
				String memberId = input.next();
			}
			else if (menunumber==4) {
				System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���̵� �Է��ϼ���: ");
				String memberId = input.next();
			}
			else {
				continue;
			}
		}

	}
	
}