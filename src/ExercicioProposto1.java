import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        System.out.println("Faça um programa que receba a temperatura média dos 6 primeiros meses \n " +
                "Calcular média, mostrar as temperaturas acima da média e em que mês ocorreram");

        List<Double> temperaturas = new ArrayList<Double>();
        temperaturas.add(37.5);
        temperaturas.add(15.6);
        temperaturas.add(25.4);
        temperaturas.add(20.0);
        temperaturas.add(17.0);
        temperaturas.add(30.8);
        System.out.println(temperaturas.toString());

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        Double mediaTemp = soma/ temperaturas.size();
        System.out.println("\n-----------------\n");
        System.out.printf("Média das temperaturas: %.2f",mediaTemp);
        System.out.println("\n-----------------\n");

        Iterator comp = temperaturas.iterator();

        while(comp.hasNext()) {
            Double temp = (Double)comp.next();
            if (temp > mediaTemp) {
                int index = temperaturas.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println(index + 1 + " - JANEIRO: " + temp + " oC");
                        break;
                    case 1:
                        System.out.println(index + 1 + " - FEVEREIRO: " + temp + " oC");
                        break;
                    case 2:
                        System.out.println(index + 1 + " - MARÇO: " + temp + " oC");
                        break;
                    case 3:
                        System.out.println(index + 1 + " - ABRIL: " + temp + " oC");
                        break;
                    case 4:
                        System.out.println(index + 1 + " - MAIO: " + temp + " oC");
                        break;
                    case 5:
                        System.out.println(index + 1 + " - JUNHO: " + temp + " oC");
                }
            }
        }
    }
}
