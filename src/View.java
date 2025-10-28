public class View {
    public void printArray(int[] numeros){
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length-1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
    
}
