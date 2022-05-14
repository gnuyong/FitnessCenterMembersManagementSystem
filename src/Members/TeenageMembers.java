package Members;

import java.util.Scanner;

public abstract class TeenageMembers extends Members {
	
	public TeenageMembers(MembersKind kind) {
		super(kind);
	}
	
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String sKind = getKindString();
		System.out.println("ȸ�����: "+this.kind+"ȸ�� ID: "+ this.id + " ȸ�� �̸�: " + this.name + " ȸ���� ��ȭ��ȣ:  " + this.phone );
		System.out.println("ȸ�� PT������ �̸�: " + this.pt + " ȸ�� ��� ���� ��: " + this.registration + " ȸ�� �繰�� ��ȣ: " + this.locker);
	}

	public static void main(String[] args) {
	}

	public void setMemberPhonewithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.println("��ȭ��ȣ�� ����߳���?(Y/N): ");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer =='Y') {
				setMemberPhone(input);
				break;
			}
			else if(answer == 'n' || answer =='N') {
				this.setPhone(0);
				break;
			}
			else {				
			}	
		}
	}
}
