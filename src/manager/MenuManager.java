package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import event.EventLogger;
import gui.WindowFrame;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MembersManager memberManager = getObject("membermanager.ser"); 
		if(memberManager == null) {
			memberManager = new MembersManager(input);
		}	
		WindowFrame frame = new WindowFrame(memberManager);
		selectMenu(input, memberManager);
		putObject(memberManager, "membermanager.ser");
	}	
	
	public static void selectMenu(Scanner input, MembersManager memberManager) {
		int menunumber=-1;
		while(menunumber != 5) 
		{
			try {
				showMenu();
				menunumber = input.nextInt(); 
				switch(menunumber) {
				case 1:
					memberManager.AddMembers();
					logger.log("add a member");
					break;
				case 2:
					memberManager.DeleteMembers();
					logger.log("delete a member");
					break;
				case 3:
					memberManager.EditMembers();
					logger.log("edit a member");
					break;
				case 4:
					memberManager.ViewMembers();
					logger.log("view a member");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("1 ~ 5 사이의 정수를 입력하세요!");
				if(input.hasNext()) {
					input.next();
				}
				menunumber = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("-----Fiteness center members menu-----");
		System.out.println("1.Add fitness center member");
		System.out.println("2.Delete fitness center member");
		System.out.println("3.Edit fitness center member");
		System.out.println("4.View fitness center members");
		System.out.println("5.Exit");
		System.out.print("1 ~ 5의 메뉴번호 중 하나를 선택하세요: " ); 
	}
	
	public static MembersManager getObject(String filename) {
		MembersManager memberManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			memberManager = (MembersManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return memberManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return memberManager;
	}
	
	
	public static void putObject(MembersManager memberManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(memberManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}