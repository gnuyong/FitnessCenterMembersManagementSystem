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
			System.out.print(" ����� ��޿� �´� 1~3 ������ ���ڸ� ������: ");
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
				System.out.print("����� ��޿� �´� 1~3 ������ ���ڸ� ������: ");
			}
		}

	}
	public void DeleteMembers() {
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���̵� �Է��ϼ���: ");
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
			System.out.println(memberId+"ȸ�� ������ �Ϸ�Ǿ����ϴ�.");
		}
		else {
			System.out.println("��ϵ��� ���� ȸ���Դϴ�.");
			return;
		}
		
	}
	public void EditMembers() {
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���̵� �Է��ϼ���: ");
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
				    System.out.print("1 ~ 5�� �޴���ȣ �� �ϳ��� �����ϼ���: " );
				    num = input.nextInt();
				    if(num == 1) {
				    	System.out.println("��Ʈ�Ͻ� ���� ȸ���� ���̵� �Է��ϼ���: ");
					    int id = input.nextInt();
					    member.setId(id);
					    }
				    else if(num == 2) {
					    System.out.print("��Ʈ�Ͻ� ���� ȸ���� �̸��� �Է��ϼ���: ");
					    String name = input.next();
					    member.setName(name);
				        }
				    else if(num==3) {
					    System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��ȭ��ȣ�� �Է��ϼ���: ");
					    int phone = input.nextInt();
					    member.setPhone(phone);
				        }
				    else if(num==4) {
					    System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��� PT������ �̸��� �Է��ϼ���: ");
					    String pt = input.next();
					    member.setPt(pt);
				        }
				    else if(num==5) {
					    System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��� ���� ���� �Է��ϼ���: ");
					    int registration = input.nextInt();
					    member.setRegistration(registration);
				        }
				    else if(num==6) {
					    System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���� �繰�� ��ȣ�� �Է��ϼ���: ");
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
//		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���̵� �Է��ϼ���: ");
//		int memberId = input.nextInt();
		System.out.println("��ϵ� ȸ���� ��: "+members.size());
		for(int i=0;i<members.size();i++) {
			members.get(i).printInfo();
		}
	}

}
