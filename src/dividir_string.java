public class dividir_string {
    public static void main(String[] args) {
    String texto = "este e um exemplo de um texto";
    String texto2 = "isto nao e um exemplo de um texto";

    String[] pal1 = texto.split(" ");
    String[] pal2 = texto2.split(" ");

    for (int i = 0; i < pal1.length; i++) {
        System.out.print(pal1[i] + " ");
    }

    for (int i = 0; i < pal2.length; i++) {
        System.out.print(pal2[i] + " ");
    }
}
}
