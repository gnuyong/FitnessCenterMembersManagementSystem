package Members;

import java.util.Scanner;

import exception.PTFormatException;

public interface MemberInput {
	public int getId(); 
	public void setId(int id);
	public String getName();
	public void setName(String name);
	public int getPhone();
	public void setPhone(int phone);
	public String getPt();
	public void setPt(String pt) throws PTFormatException;
	public int getRegistration();
	public void setRegistration(int registration);
	public int getLocker();
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
