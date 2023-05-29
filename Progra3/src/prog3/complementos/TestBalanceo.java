package prog3.complementos;

public class TestBalanceo {
    public static boolean estaBalanceado(String s) {
        Pila<Character> pila = new Pila<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                pila.apilar(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.estaVacia()) {
                    return false;
                }
                char ultimo = pila.desapilar();
                if (c == ')' && ultimo != '(' || c == ']' && ultimo != '[' || c == '}' && ultimo != '{') {
                    return false;
                }
            }
        }

        return pila.estaVacia();
    }

    public static void main(String[] args) {
        String prueba1 = "{()[(())]}";
        String prueba2 = "([)]";
        String prueba3 = "{[()]}";

        System.out.println("Prueba 1 balanceado? " + estaBalanceado(prueba1));
        System.out.println("Prueba 2 balanceado? " + estaBalanceado(prueba2));
        System.out.println("Prueba 3 balanceado? " + estaBalanceado(prueba3));
    }
}

