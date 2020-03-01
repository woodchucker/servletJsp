package com.mvcdemo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvcdemo.model.Todo;
import com.mvcdemo.model.TodoService;

/**
 * Servlet implementation class TodoList
 */
@WebServlet("/TodoList")
public class TodoList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TodoService todoService = new TodoService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
//    public TodoList() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
	/**
	 * protected void processRequest(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { List<Todo> todoList =
	 * todoService.getAll(); // Passiamo l'oggetto alla jsp che l'ha richiesta //
	 * Alla richiesta aggiungiamo una variabile "todoList" contenente le info prese
	 * dal modello todoList request.setAttribute("todoList", todoList); //
	 * Richiamiamo la jsp non ancora creata creiamola adesso
	 * request.getRequestDispatcher("todos.jsp").forward(request, response); }
	 **/
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		{
			List<Todo> todoList = todoService.getAll();
			// Passiamo l'oggetto alla jsp che l'ha richiesta
			// Alla richiesta aggiungiamo una variabile "todoList" contenente le info prese
			// dal modello todoList
			request.setAttribute("todoList", todoList);
			// Richiamiamo la jsp non ancora creata creiamola adesso
			request.getRequestDispatcher("todos.jsp").forward(request, response);
//			for (Todo todo : todoList) {
//				System.out.println(todo.getTitle());
//			}
			// response.getWriter().append("Served at: ").append(request.getContextPath());
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

	}
}
