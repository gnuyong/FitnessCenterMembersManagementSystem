package Members;
import java.util.Scanner;
public class ProMember extends Members {
	public void getUserInput(Scanner input) {
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���̵� �Է��ϼ���: ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� �̸��� �Է��ϼ���: ");
		String name = input.next();
		this.setName(name);
			
		char answer = 'x';
		while(answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.println("��ȭ��ȣ�� ����߳���?(Y/N): ");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer =='Y') {
				System.out.println("��ȭ ��ȣ�� �Է��ϼ���: ");
				int phone = input.nextInt();
				this.setPhone(phone);
				break;
			}
			else if(answer == 'n' || answer =='N') {
				this.setPhone(0);
				break;
			}
			else {				
			}	
		}
			
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��� PT������ �̸��� �Է��ϼ���: ");
	    String pt = input.next();			
		this.setPt(pt);
		
	    System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��� ���� ���� �Է��ϼ���: ");
		int registration = input.nextInt();			
		this.setRegistration(registration);
		
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���� �繰�� ��ȣ�� �Է��ϼ���: ");
		int locker = input.nextInt();
		this.setLocker(locker);
	}
}
