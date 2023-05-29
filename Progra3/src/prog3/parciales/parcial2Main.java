package prog3.parciales;

import prog3.arbolgeneral.ArbolGeneral;
import prog3.listagenerica.*;

public class parcial2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArbolGeneral<Integer> arbol3=new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> arbol2=new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> arbol1=new ArbolGeneral<Integer>(1);
		arbol3.agregarHijo(new ArbolGeneral<Integer>(9));
		arbol3.agregarHijo(new ArbolGeneral<Integer>(10));
		arbol3.agregarHijo(new ArbolGeneral<Integer>(5));
		arbol1.agregarHijo(arbol2);
		arbol1.agregarHijo(arbol2);
		ArbolGeneral<Integer> arbol=new ArbolGeneral<Integer>(2);
		arbol.agregarHijo(arbol1);
		ArbolGeneral<Integer> arbol4=new ArbolGeneral<Integer>(12);
		ArbolGeneral<Integer> arbol5=new ArbolGeneral<Integer>(8);
		arbol5.agregarHijo(new ArbolGeneral<Integer>(3));
		ArbolGeneral<Integer> arbol6=new ArbolGeneral<Integer>(7);
		arbol6.agregarHijo(new ArbolGeneral<Integer>(13));
		arbol4.agregarHijo(arbol5);
		arbol4.agregarHijo(new ArbolGeneral<Integer>(4));
		arbol4.agregarHijo(arbol6);
		arbol.agregarHijo(arbol4);
		arbol.agregarHijo(new ArbolGeneral<Integer>(14));
		
		
		ListaGenerica<Integer> lista= arbol.preOrden();
		System.out.println(lista.toString());
		
	}
	

}
