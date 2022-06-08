package OO;

public class ClienteTeste {
	
	public static void main(String[] args) {
	
		Compra compra1 = new Compra();
		compra1.adiciconarItem("caneta", 9.67, 5);
		compra1.adiciconarItem("teclado", 20.00,1);
		
		Compra compra2 = new Compra();
		compra2.adiciconarItem("computador", 3000.00, 1);
		compra2.adiciconarItem("monitor", 1000.00,1);
		

		Cliente cliente1 = new Cliente("Jhonathan");
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		
		System.out.println(cliente1.ValorTotal());
		
	}
}
