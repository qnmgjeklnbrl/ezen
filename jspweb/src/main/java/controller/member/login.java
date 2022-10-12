package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.MemberDao;

/**
 * Servlet implementation class login
 */
@WebServlet("/member/login") // URL 정의 : 해당 클래스로 들어올수 있는 경로 선언 [ 매핑 ]
public class login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// -------------- form -------------------// 
		
		// 1. form내 input 태그로 부터 변수 요청 
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		// 2. 변수2개 --> dto x 
		// 3. dao 메소드 호출 [싱글톤 ]
//		boolean result 
//			=  MemberDao.getInstance().login(mid, mpassword);
//		// 4. 결과 제어 [ true이면 index.jsp  false 이면 login.jsp ]
//		if( result ) { response.sendRedirect("/jspweb/index.jsp"); }
//		else{ response.sendRedirect("/jspweb/member/login.jsp"); }
	}
	
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*-------------- ajax --------------------*/
		
		// 1. js ajax 에게 변수 요청
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		// 2. DAO DB메소드 호출 
		int result =  MemberDao.getInstance().login(mid, mpassword);
		// **** 만약에 로그인 성공하면 세션 할당 
		if( result == 1 ) {
			HttpSession 세션 = request.getSession(); // 1. 세션 객체 선언 
			세션.setAttribute( "mid", mid );			// 2. 세션 생성[ 세션 메모리 할당 ]
				// setAttribute( "식별자" , 데이터 );
		}
		// 3. db메소드 반환 결과를 js ajax에게 응답
		response.getWriter().print( result );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}








