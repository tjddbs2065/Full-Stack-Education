package com.oopsw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

// 적절한 action을 찾아 객체를 생성해서 반환한다.
public class ActionFactory {	
	private ActionFactory(){}
	
	public static Action getAction(String cmd){
		Action action = null;
		
		// 구현부
		switch (cmd) {
		case "addMemberUI":
			action = new AddMemberUIAction();
			break;
		case "addVisitorUI":
			action = new Action() {
				@Override
				public String execute(HttpServletRequest request) throws ServletException, IOException {
					return "addMember.html";
				}
			};
			break;

		case "mainUI":
		case "loginUI":
			action = new LoginUIAction();
			break;
		default:
			action = new Action() {
				@Override
				public String execute(HttpServletRequest request) throws ServletException, IOException {
					return "404page.html";
				}
			};
		}
		
		return action;
	}
}
