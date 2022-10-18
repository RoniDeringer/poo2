package tdd;

import junit.framework.TestCase;

public class testJUnit extends TestCase{
	
	Operacao op = new Operacao();
	
	public void testAdicao() {
		assertEquals(4.0, op.adicao(2.0,2.0));
	}
}
