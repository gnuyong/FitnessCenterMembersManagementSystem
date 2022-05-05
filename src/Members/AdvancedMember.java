package Members;
import java.util.Scanner;
public class AdvancedMember extends Members implements MemberInput {
	protected int ptPhone;
	
	public AdvancedMember(MembersKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("휘트니스 센터 회원의 아이디를 입력하세요: ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("휘트니스 센터 회원의 이름을 입력하세요: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("휘트니스 센터 회원의 전화번호를 입력하세요: ");
		int phone = input.nextInt();
		this.setPhone(phone);
			
		char answer = 'x';
		while(answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.println("PT선생님이 있나요?(Y/N): ");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer =='Y') {
				System.out.println("PT선생님의 이름을 입력하세요: ");
				String pt = input.next();
				this.setPt(pt);
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
		
	    System.out.print("휘트니스 센터 회원의 등록 개월 수를 입력하세요: ");
		int registration = input.nextInt();			
		this.setRegistration(registration);
		
		System.out.print("휘트니스 센터 회원의 개인 사물함 번호를 입력하세요: ");
		int locker = input.nextInt();
		this.setLocker(locker);
	}
	public void printInfo() {
		String sKind = "없음";
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
		System.out.println("회원등급: "+this.kind+"회원 ID: "+ this.id + " 회원 이름: " + this.name + " 회원의 전화번호:  " + this.phone );
		System.out.println("회원 PT선생님 이름: " + this.pt + " 회원의 PT선생님의 전화번호: "+this.ptPhone + " 회원 등록 개월 수: " + this.registration + " 회원 사물함 번호: " + this.locker);
	}
}
