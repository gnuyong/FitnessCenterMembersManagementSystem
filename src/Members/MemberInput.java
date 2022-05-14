package Members;

import java.util.Scanner;

import exception.PTFormatException;

public interface MemberInput {
	public int getId(); 
	public void setId(int id);
	public void setName(String name);
	public void setPhone(int phone);
	public void setPt(String pt) throws PTFormatException;
	public void setRegistration(int registration);
	public void setLocker(int locker);
	public void printInfo();
	public void getUserInput(Scanner input);
	public void setMemberID(Scanner input);
	public void setMemberName(Scanner input);
	public void setMemberPhone(Scanner input);
	public void setMemberPT(Scanner input);
	public void setMemberRegistration(Scanner input);
	public void setMemberLocker(Scanner input);
}
