public class Main {

	public static void Main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int a = ref.nextInt();
		
		System.out.println("Digite um numero: ");
		int b = ref.nextInt();
		int c = ref.nextInt();	
		
		c = b;
		b = a;
		a = c;
		
		System.out.println("o valor do primeiro número é: " +a+ "e o valor do segundo é: " +b);
				
			}
		
	}
