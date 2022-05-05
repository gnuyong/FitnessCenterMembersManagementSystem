package Members;
import java.util.Scanner;
public class AdvancedMember extends Members implements MemberInput {
	protected int ptPhone;
	
	public AdvancedMember(MembersKind kind) {
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
			
		char answer = 'x';
		while(answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.println("PT�������� �ֳ���?(Y/N): ");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer =='Y') {
				System.out.println("PT�������� �̸��� �Է��ϼ���: ");
				String pt = input.next();
				this.setPt(pt);
				System.out.println("PT�������� ��ȭ��ȣ�� �Է��ϼ���: ");
				ptPhone = input.nextInt();
				break;
			}
			else if(answer == 'n' || answer =='N') {
				this.setPt(" ");
				break;
			}
			else {			
			}	
		}		
		
	    System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��� ���� ���� �Է��ϼ���: ");
		int registration = input.nextInt();			
		this.setRegistration(registration);
		
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���� �繰�� ��ȣ�� �Է��ϼ���: ");
		int locker = input.nextInt();
		this.setLocker(locker);
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
		System.out.println("ȸ�� PT������ �̸�: " + this.pt + " ȸ���� PT�������� ��ȭ��ȣ: "+this.ptPhone + " ȸ�� ��� ���� ��: " + this.registration + " ȸ�� �繰�� ��ȣ: " + this.locker);
	}
}
