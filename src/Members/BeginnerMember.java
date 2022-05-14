package Members;
import java.util.Scanner;
public class BeginnerMember extends Members{
	public BeginnerMember(MembersKind kind) {
		super(kind);
	}	
	public void getUserInput(Scanner input) {
		setMemberID(input);
		setMemberName(input);
		setMemberPhone(input);
		setMemberPT(input);
		setMemberRegistration(input);
		
		char answer = 'x';
		while(answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.println("���� ��Ŀ�� ����߳���?(Y/N): ");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer =='Y') {
				setMemberLocker(input);
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
		String sKind = getKindString();
		System.out.println("ȸ�����: "+this.kind+"ȸ�� ID: "+ this.id + " ȸ�� �̸�: " + this.name + " ȸ���� ��ȭ��ȣ:  " + this.phone );
		System.out.println("ȸ�� PT������ �̸�: " + this.pt+ " ȸ�� ��� ���� ��: " + this.registration + " ȸ�� �繰�� ��ȣ: " + this.locker);
	}
}
