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
			System.out.println("PT선생님이 있나요?(Y/N): ");
			answer = input.next().charAt(0);
			try {
				if(answer == 'y' || answer =='Y') {
					setMemberPT(input);
					System.out.println("PT선생님의 전화번호를 입력하세요: ");
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
				System.out.println("형식에 맞지 않는 PT선생님 이름입니다. @를 포함한 형식으로 다시 작성하세요!");
			}
				
		}
	}
	public void printInfo() {
		String sKind = getKindString();
		System.out.println("회원등급: "+this.kind+"회원 ID: "+ this.id + " 회원 이름: " + this.name + " 회원의 전화번호:  " + this.phone );
		System.out.println("회원 PT선생님 이름: " + this.pt + " 회원의 PT선생님의 전화번호: "+this.ptPhone + " 회원 등록 개월 수: " + this.registration + " 회원 사물함 번호: " + this.locker);
	}
}
