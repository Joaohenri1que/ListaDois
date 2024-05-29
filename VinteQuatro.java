public class Main {

	public static void Main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int a = ref.nextInt();
		
		
		for (int i = 1; i <11; i++) {
			System.out.println(a + "X" + i + "=" + (a*i));
				
			}
		
	}
}
