
public class Article {
	private String codi = "Lliure";
	private String descripcio;
	private double preuDeCompra;
	private double preuDeVenda;
	private int stock;
	
	public String getCodi() {
		return codi;
	}
	public void setCodi(String codi) {
		this.codi = codi;
	}
	
	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}
	
	public double getPreuDeCompra() {
		return preuDeCompra;
	}
	public void setPreuDeCompra(double preuDeCompra) {
		this.preuDeCompra = preuDeCompra;
	}
	
	public double getPreuDeVenda() {
		return preuDeVenda;
	}
	public void setPreuDeVenda(double preuDeVenda) {
		this.preuDeVenda = preuDeVenda;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	public String toString() {
		String cadena = "----------------------------------------------";
		cadena += "\nCodi: "+ this.codi;
		cadena += "\nDescripcio: "+ this.descripcio;
		cadena += "\nPreu de compra: "+ this.preuDeCompra;
		cadena += "\nPreu de venda: "+ this.preuDeVenda;
		cadena += "\nStock: "+ this.stock+ " unitats";
		cadena += "\n--------------------------------------------------";
		return cadena;
	}
	//METODES PER LA ARRAY DE MAGATZEM
	public static void add(String string) {
		// TODO Auto-generated method stub
		
	}
	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static char[] get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}

