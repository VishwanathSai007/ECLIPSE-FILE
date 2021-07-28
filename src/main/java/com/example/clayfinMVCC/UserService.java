package com.example.clayfinMVCC;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private ArrayList<User> al;
	
	public boolean loginvalid(String name,String pass) {
		if(name.equals("admin")&&pass.equals("pass")){
			return true;
		}
		return false;
		
	}
	
	public void UserRegister(User user) {
		al=new ArrayList<User>();
		al.add(user);
		System.out.print(al);
		
		
	}

}
