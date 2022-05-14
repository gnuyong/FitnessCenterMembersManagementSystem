import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Members.AdvancedMember;
import Members.BeginnerMember;
import Members.MemberInput;
import Members.Members;
import Members.MembersKind;
import Members.ProMember;

public class MembersManager {
	ArrayList<MemberInput> members = new ArrayList<MemberInput>();
	Scanner input;
	
	MembersManager(Scanner input){
		this.input = input;
	}
	
	public void AddMembers(){
		int kind =0;
		MemberInput memberinput;
		try {
			while(kind != 1 && kind != 2 && kind !=3) {
				System.out.println("1.Beginner ");
				System.out.println("2.Advanced ");
				System.out.println("3.Pr0 ");
				System.out.print(" 멤버의 등급에 맞는 1~3 사이의 숫자를 고르세요: ");
				kind = input.nextInt();
				if(kind==1) {
					memberinput = new BeginnerMember(MembersKind.Beginner);
					memberinput.getUserInput(input);
					members.add(memberinput);
					break;
				}
				else if(kind==2) {
					memberinput = new AdvancedMember(MembersKind.Advanced);
					memberinput.getUserInput(input);
					members.add(memberinput);
					break;
				}
				else if(kind==3) {
					memberinput = new ProMember(MembersKind.Pro);
					memberinput.getUserInput(input);
					members.add(memberinput);
					break;
				}
				else{
					System.out.print("멤버의 등급에 맞는 1~3 사이의 숫자를 고르세요: ");
				}
			}
		}
		catch(InputMismatchException e) {
			System.out.println("1 ~ 3 사이의 정수를 입력하세요!");
			if(input.hasNext()) {
				input.next();
			}
			kind = -1;
		}
	}
	
	public void DeleteMembers() {
		System.out.print("휘트니스 센터 회원의 아이디를 입력하세요: ");
		int memberId = input.nextInt();
		int index = findIndex(memberId);
		removefromMembers(index, memberId);
	}
	
	public int removefromMembers(int index,int memberId) {
		if(index>=0) {
			members.remove(index);
			System.out.println(memberId+"회원 삭제가 완료되었습니다.");
			return 1;
		}
		else {
			System.out.println("등록되지 않은 회원입니다.");
			return -1;
		}
	}
	
	public int findIndex(int memberId) {
		int index = -1;
		for(int i=0;i<members.size();i++) {
			if(members.get(i).getId()==memberId) {
				index = i;
			    break;
			}
		}
		return index;
	}
	
	public void EditMembers() {
		System.out.print("휘트니스 센터 회원의 아이디를 입력하세요: ");
		int memberId = input.nextInt();
		for(int i=0;i<members.size();i++) {
			MemberInput member = members.get(i);
			if(member.getId()==memberId) {
				int num = -1;
				while(num!=7) {
					showEditMenu();
				    num = input.nextInt();
				    switch(num) {
				    case 1:
				    	member.setMemberID(input);
				    	break;
				    case 2:
				    	member.setMemberName(input);
				    	break;
				    case 3:
				    	member.setMemberPhone(input);
				    	break;
				    case 4:
				    	member.setMemberPT(input);
				    	break;
				    case 5:
				    	member.setMemberRegistration(input);
				    	break;
				    case 6:
				    	member.setMemberLocker(input);
				    	break;
				    default:
				    	continue;
				    }
				}
				break;
		     }
		}
		
		
	}
	public void ViewMembers() {
		System.out.println("등록된 회원의 수: "+members.size());
		for(int i=0;i<members.size();i++) {
			members.get(i).printInfo();
		}
	}
	public void showEditMenu() {
		System.out.println("-----Fiteness center members Info Edit Menu-----");
	    System.out.println("1.Edit Id");
	    System.out.println("2.Edit Name");
	    System.out.println("3.Edit Phone");
	    System.out.println("4.Edit Pt");
	    System.out.println("5.Edit registration");
	    System.out.println("6.Edit Locker");
	    System.out.println("7.Exit");
	    System.out.print("1 ~ 5의 메뉴번호 중 하나를 선택하세요: " );
	}
}
