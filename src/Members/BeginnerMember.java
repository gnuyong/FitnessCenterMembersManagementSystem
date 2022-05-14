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
			System.out.println("개인 락커를 등록했나요?(Y/N): ");
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
		System.out.println("회원등급: "+this.kind+"회원 ID: "+ this.id + " 회원 이름: " + this.name + " 회원의 전화번호:  " + this.phone );
		System.out.println("회원 PT선생님 이름: " + this.pt+ " 회원 등록 개월 수: " + this.registration + " 회원 사물함 번호: " + this.locker);
	}
}
