package ServletTest;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

import com.fdmgroup.CRUD.Create;
import com.fdmgroup.CRUD.IdGenerator;
import com.fdmgroup.groceryitems.Item;
import com.fdmgroup.servlets.AddItemServlet;


public class AddItemServletTest {
	
	
	private final AddItemServlet servlet = new AddItemServlet();
	private final HttpServletRequest req = mock(HttpServletRequest.class);
	private final HttpServletResponse res = mock(HttpServletResponse.class);
	private final RequestDispatcher dispatcher = mock(RequestDispatcher.class);
	private final ServletContext servletContext = mock(ServletContext.class);
	
	Create createItem = new Create(); 
	IdGenerator generateId = new IdGenerator(); 

	
	
	@Test
	public void sends_add_jsp_as_response_when_requesting_add_item() throws ServletException, IOException {
		
		when(req.getParameter("itemname")).thenReturn("potato");
		when(req.getParameter("itemcat")).thenReturn("veg");
		
		when(servlet.getServletContext()).thenReturn(servletContext);
		servlet.doGet(req, res);
		verify(dispatcher).forward(req, res);
			

	}



	

}
