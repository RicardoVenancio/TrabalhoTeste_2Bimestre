package dao;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import entity.Sindico;

public class sindicoDaoTest {

	@Test
	public void testInserir() {
		boolean b;
		b = sindicoDao.inserir(null);
		Assert.assertFalse(b);
		
	}

//	@Test
//	public void testListAll() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testFindByID() {
//		int b;
//		b = sindicoDao.findByID()
//	}

	@Test
	public void testAlterar() {
		boolean b; 
		b = sindicoDao.alterar(null);
		Assert.assertFalse(b);
		
	}

	@Test
	public void testDeletar() {
	int b;  
	b = sindicoDao.deletar(0);
	Assert.assertTrue(true);
	}

}
