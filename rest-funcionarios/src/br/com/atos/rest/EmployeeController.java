package br.com.atos.rest;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.com.atos.dao.EmployeeDAO;
import br.com.atos.entidade.Employee;

@Path("/employees")
public class EmployeeController {
	
	private EmployeeDAO employeeDAO;
	
	@PostConstruct
	private void init() {
		employeeDAO = new EmployeeDAO();
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> listEmployee(@QueryParam("list") final List<String> list){
		List<Employee> listEmployee = null;
		
		try {
			listEmployee = employeeDAO.listEmployee(list);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return listEmployee;
	}

}
