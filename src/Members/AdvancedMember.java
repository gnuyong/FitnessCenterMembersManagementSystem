package Members;
import java.util.Scanner;

import exception.PTFormatException;
public class AdvancedMember extends Members {
	protected int ptPhone;
	
	public AdvancedMember(MembersKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setMemberID(input);
		setMemberName(input);
		setMemberPhone(input);
		setMemberPTwithYN(input);	
		setMemberRegistration(input);
		setMemberLocker(input);
	}
	
	public void setMemberPTwithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.println("PT�������� �ֳ���?(Y/N): ");
			answer = input.next().charAt(0);
			try {
				if(answer == 'y' || answer =='Y') {
					setMemberPT(input);
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
			catch(PTFormatException e) {
				System.out.println("���Ŀ� ���� �ʴ� PT������ �̸��Դϴ�. @�� ������ �������� �ٽ� �ۼ��ϼ���!");
			}
				
		}
	}
	public void printInfo() {
		String sKind = getKindString();
		System.out.println("ȸ�����: "+this.kind+"ȸ�� ID: "+ this.id + " ȸ�� �̸�: " + this.name + " ȸ���� ��ȭ��ȣ:  " + this.phone );
		System.out.println("ȸ�� PT������ �̸�: " + this.pt + " ȸ���� PT�������� ��ȭ��ȣ: "+this.ptPhone + " ȸ�� ��� ���� ��: " + this.registration + " ȸ�� �繰�� ��ȣ: " + this.locker);
	}
}
