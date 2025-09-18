package com.oopsw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

// ������ action�� ã�� ��ü�� �����ؼ� ��ȯ�Ѵ�.
public class ActionFactory {	
	private ActionFactory(){}
	
	public static Action getAction(String cmd){
		Action action = null;
		
		// ������
		switch (cmd) {
		case "logoutAction":
			action = new LogoutAction();
			break;
		case "loginAction":
			action = new LoginAction();
			break;
		case "addMemberAction":
			action = new AddMemberAction();
			break;
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
