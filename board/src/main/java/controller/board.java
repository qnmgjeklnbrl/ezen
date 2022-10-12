package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.mysql.cj.xdevapi.JsonArray;

import model.dao.BoardDao;
import model.dto.BoardDto;


@WebServlet("/board")
public class board extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public board() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String password = request.getParameter("password");
		String content = request.getParameter("content");
		
		BoardDto dto = new BoardDto(title, writer, password, content);
		
		boolean result = BoardDao.getInstance().board(dto);
		if(result) {System.out.println("글등록 성공");}
		else {System.out.println("글등록 실패");}
		
		
		
			
			
			
			
		

		response.sendRedirect("/board/view.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
