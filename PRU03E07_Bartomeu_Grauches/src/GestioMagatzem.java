
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
	
	//Metode opcio 1
	public static void llista() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
