package br.com.atos.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import br.com.atos.entidade.Employee;

public class EmployeeDAO {
	
	public List<Employee> listEmployee(List<String> skills) throws FileNotFoundException, IOException, URISyntaxException{
		
		//simula como se fosse a tabela de banco de dados
		Reader reader = new FileReader(new File(getClass().getResource("/file/employees.txt").toURI()));
		Gson gson = new Gson();
		
		Employee[] colecao = gson.fromJson(reader, Employee[].class);
		List<Employee> colecaoSelecionados = new ArrayList<Employee>();
		
		//aqui vai procurar os funcionarios de acordo com o filtro é claro que se fosse usado banco seria diferente
		em:for(Employee item: colecao) {
			for(String skill: item.getSkills()) {
				for(String skillFiltro : skills) {
					if(skill.equalsIgnoreCase(skillFiltro)) {
						colecaoSelecionados.add(item);
						continue em;
					}
				}
			}
		}
		
        return colecaoSelecionados;
	}
}
