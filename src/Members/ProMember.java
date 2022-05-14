package Members;
import java.util.Scanner;
public class ProMember extends TeenageMembers{
	public ProMember(MembersKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) {
		setMemberID(input);
		setMemberName(input);
		setMemberPhonewithYN(input);	
		setMemberPT(input);
		setMemberRegistration(input);
		setMemberLocker(input);
	}
}
