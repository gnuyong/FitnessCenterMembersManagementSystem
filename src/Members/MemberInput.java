package Members;

import java.util.Scanner;

public interface MemberInput {
	public int getId(); 
	public void setId(int id);
	public void setName(String name);
	public void setPhone(int phone);
	public void setPt(String pt);
	public void setRegistration(int registration);
	public void setLocker(int locker);
	public void printInfo();
	public void getUserInput(Scanner input);
}
