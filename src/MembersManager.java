import java.util.ArrayList;
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
		while(kind != 1 && kind != 2 && kind !=3) {
			System.out.println("1.Beginner ");
			System.out.println("2.Advanced ");
			System.out.println("3.Pr0 ");
			System.out.print(" ����� ��޿� �´� 1~3 ������ ���ڸ� ������: ");
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
			MemberInput memberInput = members.get(i);
			if(memberInput.getId()==memberId) {
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
					    memberInput.setId(id);
					    }
				    else if(num == 2) {
					    System.out.print("��Ʈ�Ͻ� ���� ȸ���� �̸��� �Է��ϼ���: ");
					    String name = input.next();
					    memberInput.setName(name);
				        }
				    else if(num==3) {
					    System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��ȭ��ȣ�� �Է��ϼ���: ");
					    int phone = input.nextInt();
					    memberInput.setPhone(phone);
				        }
				    else if(num==4) {
					    System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��� PT������ �̸��� �Է��ϼ���: ");
					    String pt = input.next();
					    memberInput.setPt(pt);
				        }
				    else if(num==5) {
					    System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��� ���� ���� �Է��ϼ���: ");
					    int registration = input.nextInt();
					    memberInput.setRegistration(registration);
				        }
				    else if(num==6) {
					    System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���� �繰�� ��ȣ�� �Է��ϼ���: ");
				  	    int locker = input.nextInt();
				  	    memberInput.setLocker(locker);
				        }
				    else {
					    continue;
					    }
				    }
				break;
				}
		}
		
		
	}
	public void ViewMembers() {
		System.out.println("��ϵ� ȸ���� ��: "+members.size());
		for(int i=0;i<members.size();i++) {
			members.get(i).printInfo();
		}
	}
}
