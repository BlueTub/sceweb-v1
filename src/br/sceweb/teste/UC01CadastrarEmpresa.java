package br.sceweb.teste;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {
	static public EmpresaDAO empresaDAO;
	static public Empresa empresa;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
	}

	@Test
	public void CT01UC01FBCadastrarEmpresa_com_sucesso() {
		assertEquals("Empresa cadastrada com sucesso", empresaDAO.adiciona(empresa));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


}
