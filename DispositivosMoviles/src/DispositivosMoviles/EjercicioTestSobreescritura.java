package DispositivosMoviles;

public class EjercicioTestSobreescritura {

	public static void main(String[] args) {
		SmartPhone s1 = new SmartPhone();
		SmartPhone s2 = new SmartPhone();
		s1.setNumero(1);
		s2.setNumero(1);
		System.out.println(s1.equals(s2));
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		

	}

}
