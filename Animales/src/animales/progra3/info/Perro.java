package animales.progra3.info;

public class Perro extends Animal { 
	
	@Override
   public void saludo() {
      System.out.println("Guau!");
	}
   public void saludo(Perro otro) {
      System.out.println("Guau! Guau!");
} }