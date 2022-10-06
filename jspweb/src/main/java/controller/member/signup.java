package controller.member;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;
import model.dto.MemberDto;


@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public signup() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Scanner scanner = new Scanner(System.in);
		
		//System.out.println("아이디: ");	String id = scanner.next();
		//System.out.println("비밀번호: "); String pw = scanner.next();
		//System.out.println("이름: ");    String name = scanner.next();
		//System.out.println("연락처 : "); String phone = scanner.next();  
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		
		
		MemberDto dto = new MemberDto(id, pw, name, phone);
		//3.Dao
		boolean result = MemberDao.getInstance().signup( dto );
		if(result) {System.out.println("회원가입 성공");}
		else {System.out.println("회원가입 실패");}
		
		System.out.println(dto.toString());
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
