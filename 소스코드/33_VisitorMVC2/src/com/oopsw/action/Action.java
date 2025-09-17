package com.oopsw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

// request를 전달받아 내부 로직을 수행하고 이동할 페이지를 문자열로 반환한다.
public interface Action {
	/** 사용자가 입력한 모든 정보를 전달, 실행 결과 이동할 페이지 리턴 */
	String execute(HttpServletRequest request) throws ServletException, IOException;
	
	
}
