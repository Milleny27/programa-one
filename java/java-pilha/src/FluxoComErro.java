
public class FluxoComErro {

	public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch (ArithmeticException | NullPointerException ex) {
        	String msg = ex.getMessage();
        	System.out.println("Exception " + msg);
        	ex.printStackTrace();
        } 
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
//    	loop - vai at? o limite da pilha - StackOverflowError
    	System.out.println("Ini do m?todo2");
        metodo2();
        System.out.println("Fim do m?todo2");
    }

}
