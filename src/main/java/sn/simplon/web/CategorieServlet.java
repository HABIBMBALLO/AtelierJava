package sn.simplon.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.simplon.dao.CategorieImpl;
import sn.simplon.dao.ICategorie;
import sn.simplon.entities.Categorie;



/**
 * Servlet implementation class CategorieServlet
 */
@WebServlet("/Categorie")
public class CategorieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ICategorie categoriedao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategorieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	categoriedao = new CategorieImpl();
    	
//    	
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
//		List<Categorie> ListCat = new categoriedao.add();
//		request.setAttribute("Liste_Categorie", ListCat);
		request.getRequestDispatcher("WEB-INF/views/categorie/formCategorie.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nomCateorie = request.getParameter("nomCategorie");
		Categorie categorie = new Categorie();
		categorie.setNomcategorie("nomCategorie");
		categoriedao.add(categorie);
		
	}

}
