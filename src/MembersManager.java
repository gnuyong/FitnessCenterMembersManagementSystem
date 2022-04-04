import java.util.Scanner;

public class MembersManager {
	Members members;
	Scanner input;
	
	MembersManager(Scanner input){
		this.input = input;
	}
	
	public void AddMembers(){
		members = new Members();
		System.out.print("휘트니스 센터 회원의 아이디를 입력하세요: ");
		members.id = input.nextInt();
		System.out.print("휘트니스 센터 회원의 이름을 입력하세요: ");
		members.name = input.next();				
		System.out.print("휘트니스 센터 회원의 전화번호를 입력하세요: ");
		members.phone = input.nextInt();
		System.out.print("휘트니스 센터 회원의 담당 PT선생님 이름을 입력하세요: ");
		members.pt = input.next();			
		System.out.print("휘트니스 센터 회원의 등록 개월 수를 입력하세요: ");
		members.registration = input.nextInt();			
		System.out.print("휘트니스 센터 회원의 개인 사물함 번호를 입력하세요: ");
		members.locker = input.nextInt();
	}
	public void DeleteMembers() {
		System.out.print("휘트니스 센터 회원의 아이디를 입력하세요: ");
		int memberId = input.nextInt();
		if (members == null) {
			System.out.println("등록되지 않은 회원입니다.");
			return;
		}
		if (members.id == memberId) {
			members = null;
			System.out.println("회원 삭제가 완료되었습니다.");
		}
	}
	public void EditMembers() {
		System.out.print("휘트니스 센터 회원의 아이디를 입력하세요: ");
		int memberId = input.nextInt();
		if (members.id == memberId) {
			System.out.println(memberId+" 회원이 편집되었습니다.");
		}
	}
	public void ViewMembers() {
		System.out.print("휘트니스 센터 회원의 아이디를 입력하세요: ");
		int memberId = input.nextInt();
		if (members.id == memberId) {
			members.printInfo();
		}
	}

}
