import java.util.Scanner;
import java.util.ArrayList;

public class GestioMagatzem {

	static ArrayList<Article> Item = new ArrayList<>();
	static int contador = 1;
	

	static Scanner s1 = new Scanner(System.in);
	static Scanner s2 = new Scanner(System.in);
	static Scanner s3 = new Scanner(System.in);
	static Scanner s4 = new Scanner(System.in);
	static Scanner s5 = new Scanner(System.in);
	
	static Scanner remov = new Scanner(System.in);
	
	static Scanner mod = new Scanner(System.in);
	
	static Scanner suma = new Scanner(System.in);
	
	static Scanner resta = new Scanner(System.in);
	
	
	//METODE MENU
	public static int showMenu() {
		System.out.println("Eliga una opción: ");
		System.out.println("1-Llistat");
		System.out.println("2-Alta");
		System.out.println("3-Baixa");
		System.out.println("4-Modificació");
		System.out.println("5-Entrada de mercaderia");
		System.out.println("6-Sortida de mercaderia");
		System.out.println("7-Sortir");
		
		Scanner scanMenu = new Scanner(System.in);
		int opcion = scanMenu.nextInt();
		return opcion;
		
	}
	
	//METODE LLISTA
	public static void llistat() {
		System.out.println("List: ");
		System.out.println(Item.toString() + "\n");
	}
	 
	 //METODE 2-ALTA
	public static void altaArticle() {
		
	 	Article newItem = new Article();
	 	System.out.println("Introdueix el codi de l'article: ");
	 	String codiItem = s1.next();
	 	newItem.setCodi(codiItem);
	 	
	 	System.out.println("Introdueix la descripcio de l'article: ");
	 	String descripcio = s2.next();
	 	newItem.setDescripcio(descripcio);
	 	
	 	System.out.println("Introdueix preu de compra de l'article: ");
	 	double preuCompra = s3.nextDouble();
	 	newItem.setPreuDeCompra(preuCompra);
	 	
	 	System.out.println("Introdueix preu de venta de l'article: ");
	 	double preuVenta = s4.nextDouble();
	 	newItem.setPreuDeVenda(preuVenta);
	 	
	 	System.out.println("Introdueix l'stock de l'article: ");
	 	int stock = s5.nextInt();
	 	newItem.setStock(stock);
	 	
	 	Item.add(newItem);
	
		 
	 }
	 
	 //METODE 3-BAIXA
	 public static void baixaArticle() {
	
	 	for (int i = 0; i < Item.size(); i++) {
		      System.out.println(i + " - " + Item.get(i));
		    }
		    
		System.out.println("Introdueix el codi de l'article a donar de baixa: ");
		
		int choice = remov.nextInt();
		Item.remove(choice);
		
		 
	 }
	 
	 //METOE 4-MODIFICACIO
	 public static void modArticle() {
		 
		 for (int i = 0; i < Item.size(); i++) {
				System.out.println(i + " - " + Item.get(i));
				}
    
		 System.out.println("Introdueix el numero de l'article a modificar:  ");
		 System.out.println("1- Codi");
		 System.out.println("2- Descripció");
		 System.out.println("3- Preu de compra");
		 System.out.println("4- Preu de venta");
		 System.out.println("5- Stock");
		 System.out.println("6- Enrera");
		 
		 int numMod = mod.nextInt();
		 
		 Article modArt = Item.get(numMod);
		 
		 int modificarItem = mod.nextInt();

		 boolean out = false;
		 switch(modificarItem) {
		 	case 1:
		 		System.out.println("Modifiqui el codi de l'article");
		 		String modCode = mod.next();
		 		modArt.setCodi(modCode);
		 		break;
		
			case 2:
				System.out.println("Modifiqui la descripció de l'article");
		 		String modDef = mod.next();
		 		modArt.setDescripcio(modDef);
				break;
			
			case 3:
				System.out.println("Modifiqui el preu de compra de l'article");
		 		double modComp = mod.nextDouble();
		 		modArt.setPreuDeCompra(modComp);
		 		break;
			
			case 4:
				System.out.println("Modifiqui el preu de venda de l'article");
		 		double modVend = mod.nextDouble();
		 		modArt.setPreuDeVenda(modVend);
			
			case 5:
				System.out.println("Modifiqui l'stock de l'article");
		 		int modStock = mod.nextInt();
		 		modArt.setStock(modStock);
			
			case 6:
				out = true;
				break;
			
			default:
				System.out.println("Opcions disponibles 1, 2, 3, 4, 5 o 6.");
	 
	}
	       

	 	}
	 
	 
	 //METODE 5-ENTRADA MERCADERIA
	 public static void entradaMercaderia() {
		 System.out.println("Introdueixi el numero de l'article a augmentar stock:  ");
		 for (int i = 0; i < Item.size(); i++) {
				System.out.println(i + " - " + Item.get(i));
				}
		 
		 
		 
		 int numStock = suma.nextInt();
		 Article sum = Item.get(numStock);
		
		 
		 System.out.println("Numero a augmentar stock?  ");
		 int sumStock = suma.nextInt();
		 
		 
		 int stock = Item.get(numStock).getStock();
		 
		 stock = stock + sumStock;

		 Item.get(numStock).setStock(stock);
	 
	 	
		 
	 }
	 
	 //METODE 6-SORTIDA MERCADERIA
	 public static void sortidaMercaderia() {
		 System.out.println("Introdueixi el numero de l'article a augmentar stock:  ");
		 for (int i = 0; i < Item.size(); i++) {
				System.out.println(i + " - " + Item.get(i));
				}
		 int num2Stock = resta.nextInt();
		 Article rest = Item.get(num2Stock);
		
		 
		 System.out.println("Numero a augmentar stock?  ");
		 int restStock = suma.nextInt();
		 
		 
		 int stock = Item.get(num2Stock).getStock();
		 
		 stock = stock - restStock;
		 if (stock < 0) {
			 System.out.println("Stock no pot ser menor a 0, introdueixi un numero vàlid");
		 } else {
			 Item.get(num2Stock).setStock(stock);
			 }
		 
		 
	 }
	
	
	public static void main(String[] args) {
		
		
		
		Item.add(new Article("Patata", "Verdura primera necessitat", 1.00, 1.50, 200));
		Item.add(new Article("Pilotes", "Bolla de carn, son molt bones", 2.00, 3.00, 100));
		Item.add(new Article("Sobrasada", "Carn dins visceres", 3.00, 5.00, 75));
		Item.add(new Article("Voll-Damn", "cervessa 7'4%", 0.77, 1.00, 666));
		
		
		
	
		boolean Salir = false;
		
		while (Salir == false) {
			int opcion = showMenu();
			
			switch(opcion) {
			case 1:
				llistat();
				break;
				
			case 2:
				altaArticle();
				contador++;
				break;
				
			case 3:
				baixaArticle();
				break;
				
			case 4:
				modArticle();
				
			case 5:
				entradaMercaderia();
				break;
				
			case 6:
				sortidaMercaderia();
				break;
				
			case 7:
				Salir = true;
				System.out.println("Gracies, vagi bé.");
				break;
				
			default:
				System.out.println("Opcions disponibles 1, 2, 3, 4, 5, 6, O 7.");
				
			}

		}
	}
}
