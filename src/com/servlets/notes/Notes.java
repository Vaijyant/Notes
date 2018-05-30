package com.servlets.notes;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.databasemanage.notes.DBManager;

/**
 * Servlet implementation class Notes
 */
@WebServlet("/Notes")
public class Notes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Notes() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		ArrayList<com.model.notes.Subjects> subList = DBManager.getSubjects();
		
		ArrayList<com.model.notes.Notes> allNotesList = null;
		ArrayList<com.model.notes.Notes> subNotesList = null;

		if (subList != null) {
			allNotesList = new ArrayList<com.model.notes.Notes>();

			for (int i = 0; i < subList.size(); i++) {

				subNotesList = DBManager.getNotes(subList.get(i)
						.getSubjectAbb());
				if (subNotesList != null)
					allNotesList.addAll(subNotesList);
			}
		}
		request.setAttribute("subList", subList);
		request.setAttribute("allNotesList", allNotesList);
		RequestDispatcher view = request.getRequestDispatcher("notes.jsp");
		view.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
