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
		System.out.println("회원등급: "+this.kind+"회원 ID: "+ this.id + " 회원 이름: " + this.name + " 회원의 전화번호:  " + this.phone );
		System.out.println("회원 PT선생님 이름: " + this.pt + " 회원 등록 개월 수: " + this.registration + " 회원 사물함 번호: " + this.locker);
	}

	public static void main(String[] args) {
	}

	public void setMemberPhonewithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.println("전화번호를 등록했나요?(Y/N): ");
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
