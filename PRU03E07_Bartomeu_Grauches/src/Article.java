public class Article {
	
	private String codi = "LLIURE";
	private String descripcio;
	private double preuDeCompra;
	private double preuDeVenda;
	private int stock;
	

	
	public Article(String codi2, String descripcio2, double preuDeCompra2, double preuDeVenda2, int stock2) {
		this.codi = codi2;
		this.descripcio = descripcio2;
		this.preuDeCompra  = preuDeCompra2;
		this.preuDeVenda = preuDeVenda2;
		this.stock = stock2;
		// TODO Auto-generated constructor stub
	}

	public Article() {
		// TODO Auto-generated constructor stub
	}

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
		String cadena = "\n----------------------------------------------";
		cadena += "\nCodi: "+ this.codi;
		cadena += "\nDescripcio: "+ this.descripcio;
		cadena += "\nPreu de compra: "+ this.preuDeCompra;
		cadena += "\nPreu de venda: "+ this.preuDeVenda;
		cadena += "\nStock: "+ this.stock+ " unitats";
		cadena += "\n--------------------------------------------------";
		return cadena;
	}

}
