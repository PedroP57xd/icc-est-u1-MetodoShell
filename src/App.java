public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = { 5, 0, 8, 4, 9, 6, 7, 2, 3 };

        SortShell sortShell = new SortShell();
        View view = new View();

        System.out.println("\n Arreglo Original");
        view.printArray(numeros);
        System.out.println("\n Adrreglo Ordenado");
        sortShell.sort(numeros, false);
        view.printArray(numeros);
        System.out.println("\n ");
    }
}
