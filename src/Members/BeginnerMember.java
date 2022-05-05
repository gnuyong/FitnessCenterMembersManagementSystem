package Members;
import java.util.Scanner;
public class BeginnerMember extends Members implements MemberInput  {
	public BeginnerMember(MembersKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���̵� �Է��ϼ���: ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� �̸��� �Է��ϼ���: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��ȭ��ȣ�� �Է��ϼ���: ");
		int phone = input.nextInt();
		this.setPhone(phone);
		
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��� PT������ �̸��� �Է��ϼ���: ");
	    String pt = input.next();			
		this.setPt(pt);
		
	    System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��� ���� ���� �Է��ϼ���: ");
		int registration = input.nextInt();			
		this.setRegistration(registration);
		
		char answer = 'x';
		while(answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.println("���� ��Ŀ�� ����߳���?(Y/N): ");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer =='Y') {
				System.out.println("��Ŀ ��ȣ�� �Է��ϼ���: ");
				int locker = input.nextInt();
				this.setLocker(locker);
				break;
			}
			else if(answer == 'n' || answer =='N') {
				this.setLocker(0);
				break;
			}
			else {				
			}	
		}
	}
	public void printInfo() {
		String sKind = "����";
		switch(this.kind) {
		case Beginner:
			sKind = "Beginner";
			break;
		case Advanced:
		    sKind = "Advanced";
		    break;
		case Pro:
			sKind ="Pro";
			break;
		default:
		}
		System.out.println("ȸ�����: "+this.kind+"ȸ�� ID: "+ this.id + " ȸ�� �̸�: " + this.name + " ȸ���� ��ȭ��ȣ:  " + this.phone );
		System.out.println("ȸ�� PT������ �̸�: " + this.pt+ " ȸ�� ��� ���� ��: " + this.registration + " ȸ�� �繰�� ��ȣ: " + this.locker);
	}
}
