package Members;
import java.util.Scanner;
public class BeginnerMember extends Members {
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
		
		System.out.print("휘트니스 센터 회원의 담당 PT선생님 이름을 입력하세요: ");
	    String pt = input.next();			
		this.setPt(pt);
		
	    System.out.print("휘트니스 센터 회원의 등록 개월 수를 입력하세요: ");
		int registration = input.nextInt();			
		this.setRegistration(registration);
		
		char answer = 'x';
		while(answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.println("개인 락커를 등록했나요?(Y/N): ");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer =='Y') {
				System.out.println("락커 번호를 입력하세요: ");
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
}
