package com.personal;

public class DineshProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstant.FIRST_NAME+"Dinesh");
		System.out.println(ProfileConstant.LAST_NAME+"Jayapal");
		System.out.println(ProfileConstant.AGE+"21");
	}

	@Override
	public void myHobbies() {
		System.out.println("Hobbies  :watching movies");
	}


}
