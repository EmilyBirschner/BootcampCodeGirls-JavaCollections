import java.util.*;

public class ExemploSet {

    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,0d,3.6));
        System.out.println(notas.toString());

       //não tem como exibir na a posição da nota e nem adicionar uma nota numa posição x,
        // pois o set não permite

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.printf("Exiba a soma dos valores: %.2f", soma);

        System.out.printf("\nExiba a média das notas: %.2f", (soma/ notas.size()));

        System.out.println("\nRemova a nota 0 ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\n Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet <>(Arrays.asList(7d,8.5,9.3,5d,0d,3.6));
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(Arrays.asList(7d,8.5,9.3,5d,0d,3.6));
        //Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo conjunto: ");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());

    }
}
