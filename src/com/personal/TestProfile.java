package com.personal;

public class TestProfile {
public static void printProfile(IProfile profile){
	profile.myBasicInfo();
	//profile.myHobbies();
}	
	public static void main(String[] args) {
	IProfile myProfile1=new DineshProfile();
	//IProfile myProfile2=new FriendProfile();
	System.out.println("My Profile");
	printProfile(myProfile1);
	//System.out.println("Friend profile");
	//printProfile(myProfile2)
	}

}
