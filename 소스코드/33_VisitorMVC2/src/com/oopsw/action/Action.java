package com.oopsw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

// request�� ���޹޾� ���� ������ �����ϰ� �̵��� �������� ���ڿ��� ��ȯ�Ѵ�.
public interface Action {
	/** ����ڰ� �Է��� ��� ������ ����, ���� ��� �̵��� ������ ���� */
	String execute(HttpServletRequest request) throws ServletException, IOException;
	
	
}
