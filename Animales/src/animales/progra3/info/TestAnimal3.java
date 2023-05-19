package animales.progra3.info;

public class TestAnimal3 {
	   public static void main(String[] args) {
	      Gato gato1 = new Gato();
	      gato1.saludo();
	      Perro perro1 = new Perro();
	      perro1.saludo();
	      PerroGrande perroGrande1 = new PerroGrande();
	      perroGrande1.saludo();
	      Animal animal1 = new Gato();
	      animal1.saludo();
	      Animal animal2 = new Perro();
	      animal2.saludo();
	      Animal animal3 = new PerroGrande();
	      animal3.saludo();
	      Perro perro2 = new Perro();
	      PerroGrande perroGrande2 = new PerroGrande();
	      Perro perro3 = new Perro();
	      Gato gato2 = new Gato();
	      perro2.saludo(perro3);
	      perro3.saludo(perro2);
	      perro2.saludo(perroGrande2);
	      perroGrande2.saludo(perro2);
	      perroGrande2.saludo(perroGrande1);
	  } 
}
	      
