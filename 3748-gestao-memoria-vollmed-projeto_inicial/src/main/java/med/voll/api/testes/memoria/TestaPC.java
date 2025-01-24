package med.voll.api.testes.memoria;

public class TestaPC {

    static {
        System.loadLibrary("somaLib"); // Carrega a biblioteca nativa
    }

    public static void main(String[] args) {
        System.out.println(soma(1, 2));
        System.out.println(soma(3, 4));
    }

    public native static int soma(int valor1, int valor2);
}
