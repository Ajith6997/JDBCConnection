package com.jdbc.servlet.controller;

import java.io.IOException;

import com.jdbc.servlet.db.DataBaseUtil;
import com.jdbc.servlet.dto.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DbController
 */
@WebServlet("/DbController")
public class DbController extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DbController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserId=request.getParameter("userid");
		String UserName=request.getParameter("username");
		String PhoneNo=request.getParameter("phoneno");
		User user =new User();
		user.setUserId(UserId);
		user.setUserName(UserName);
		user.setPhoneNo(PhoneNo);
		DataBaseUtil db =new DataBaseUtil();
		String result = db.save(user);
		response.getWriter().print(result);
	}

}
