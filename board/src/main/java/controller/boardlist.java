package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.mysql.cj.xdevapi.JsonArray;
import com.mysql.cj.xdevapi.JsonValue;

import model.dao.BoardDao;
import model.dto.BoardDto;

/**
 * Servlet implementation class boardlist
 */
@WebServlet("/boardlist")
public class boardlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public boardlist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<BoardDto> list = BoardDao.getInstance().getboardlist();
		JSONArray array = new JSONArray();		
		for(BoardDto boardDto : list) {
			JSONObject object = new JSONObject();
			object.put("bno", boardDto.getBno());
			object.put("title", boardDto.getTitle());
			object.put("content", boardDto.getContent());
			object.put("writer", boardDto.getWriter());
			object.put("view", boardDto.getView());
			object.put("bdate", boardDto.getBdate());
			array.add(object);
		}
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
