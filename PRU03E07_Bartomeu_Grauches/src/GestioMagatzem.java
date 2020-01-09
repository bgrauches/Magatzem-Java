import java.util.Scanner;
import java.util.ArrayList;

public class GestioMagatzem {
	
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
	
	//METODE 1-LLISTAT
	 public static void llista() {
		    ArrayList<String> Atricle = new ArrayList<String>();
		    Article.add("Patates");
		    Article.add("Pilotes");
		    Article.add("Sobrasada");
		    Article.add("Voll-Damn");
		    for (int i = 0; i < Article.size(); i++) {
		      System.out.println(Article.get(i));
		    }
		  }
	 
	 //METODE 2-ALTA
	 public static void altaArticle() {
		 Article object1 = new Article();
		 llista.add(object1);
		 
	 }
	 
	 //METODE 3-BAIXA
	 public static void baixaArticle() {
		 
	 }
	 
	 //METOE 4-MODIFICACIO
	 public static void modArticle() {
		 
	 }
	 
	 //METODE 5-ENTRADA MERCADERIA
	 public static void entradaMercaderia() {
		 
	 }
	 
	 //METODE 6-SORTIDA MERCADERIA
	 public static void sortidaMercaderia() {
		 
	 }
	
	
	
	
	
	public static void main(String[] args) {
		
		boolean Salir = false;
		
		while (Salir == false) {
			int opcion = showMenu();
			
			switch(opcion) {
			case 1:
				
			case 2:
				
			case 3:
			
			case 4:
				
			case 5:
				
			case 6:	
				
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
