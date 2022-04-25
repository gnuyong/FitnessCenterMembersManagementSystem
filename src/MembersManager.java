import java.util.ArrayList;
import java.util.Scanner;

import Members.AdvancedMember;
import Members.BeginnerMember;
import Members.Members;
import Members.ProMember;

public class MembersManager {
	ArrayList<Members> members = new ArrayList<Members>();
	Scanner input;
	
	MembersManager(Scanner input){
		this.input = input;
	}
	
	public void AddMembers(){
		int kind =0;
		Members member;
		while(kind != 1 && kind != 2 && kind !=3) {
			System.out.print("1.Beginner ");
			System.out.print("2.Advanced ");
			System.out.print("3.Pr0 ");
			System.out.print(" 멤버의 등급에 맞는 1~3 사이의 숫자를 고르세요: ");
			kind = input.nextInt();
			if(kind==1) {
				member = new BeginnerMember();
				member.getUserInput(input);
				members.add(member);
				break;
			}
			else if(kind==2) {
				member = new AdvancedMember();
				member.getUserInput(input);
				members.add(member);
				break;
			}
			else if(kind==3) {
				member = new ProMember();
				member.getUserInput(input);
				members.add(member);
				break;
			}
			else{
				System.out.print("멤버의 등급에 맞는 1~3 사이의 숫자를 고르세요: ");
			}
		}

	}
	public void DeleteMembers() {
		System.out.print("휘트니스 센터 회원의 아이디를 입력하세요: ");
		int memberId = input.nextInt();
		int index = -1;
		
		for(int i=0;i<members.size();i++) {
			if(members.get(i).getId()==memberId) {
				index = i;
			    break;
			}
		}
		
		if(index>=0) {
			members.remove(index);
			System.out.println(memberId+"회원 삭제가 완료되었습니다.");
		}
		else {
			System.out.println("등록되지 않은 회원입니다.");
			return;
		}
		
	}
	public void EditMembers() {
		System.out.print("휘트니스 센터 회원의 아이디를 입력하세요: ");
		int memberId = input.nextInt();
		for(int i=0;i<members.size();i++) {
			Members member = members.get(i);
			if(member.getId()==memberId) {
				int num = -1;
				while(num!=7) {
					System.out.println("-----Fiteness center members Info Edit Menu-----");
				    System.out.println("1.Edit Id");
				    System.out.println("2.Edit Name");
				    System.out.println("3.Edit Phone");
				    System.out.println("4.Edit Pt");
				    System.out.println("5.Edit registration");
				    System.out.println("6.Edit Locker");
				    System.out.println("7.Exit");
				    System.out.print("1 ~ 5의 메뉴번호 중 하나를 선택하세요: " );
				    num = input.nextInt();
				    if(num == 1) {
				    	System.out.println("휘트니스 센터 회원의 아이디를 입력하세요: ");
					    int id = input.nextInt();
					    member.setId(id);
					    }
				    else if(num == 2) {
					    System.out.print("휘트니스 센터 회원의 이름을 입력하세요: ");
					    String name = input.next();
					    member.setName(name);
				        }
				    else if(num==3) {
					    System.out.print("휘트니스 센터 회원의 전화번호를 입력하세요: ");
					    int phone = input.nextInt();
					    member.setPhone(phone);
				        }
				    else if(num==4) {
					    System.out.print("휘트니스 센터 회원의 담당 PT선생님 이름을 입력하세요: ");
					    String pt = input.next();
					    member.setPt(pt);
				        }
				    else if(num==5) {
					    System.out.print("휘트니스 센터 회원의 등록 개월 수를 입력하세요: ");
					    int registration = input.nextInt();
					    member.setRegistration(registration);
				        }
				    else if(num==6) {
					    System.out.print("휘트니스 센터 회원의 개인 사물함 번호를 입력하세요: ");
				  	    int locker = input.nextInt();
				  	    member.setLocker(locker);
				        }
				    else {
					    continue;
					    }//if
				    }//while
				break;
				}//if
		}//for
		
		
	}
	public void ViewMembers() {
//		System.out.print("휘트니스 센터 회원의 아이디를 입력하세요: ");
//		int memberId = input.nextInt();
		System.out.println("등록된 회원의 수: "+members.size());
		for(int i=0;i<members.size();i++) {
			members.get(i).printInfo();
		}
	}

}
