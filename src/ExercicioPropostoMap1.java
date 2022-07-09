import java.util.*;

public class ExercicioPropostoMap1 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário e relacione os estados com suas populações: ");
        Map<String, Integer> estadosPopulacao = new HashMap<>(){{
           put("PE", 9616621);
           put("AL", 3351543);
           put("CE", 9187103);
           put("RN", 3534265);
        }};
        System.out.println(estadosPopulacao);

        System.out.println("\nsubstituir a população do estamo do RN por 3534165: ");
        estadosPopulacao.put("RN", 3534165);
        System.out.println(estadosPopulacao);

        System.out.println("\nConferir se o estado PB está no dicionário: " + estadosPopulacao.containsKey("PB"));
        System.out.println("Adicionar o estado PB: ");
        estadosPopulacao.put("PB", 4039277);
        System.out.println(estadosPopulacao);

        System.out.println("Exibir a população de PE: " + estadosPopulacao.get("PE"));

        System.out.println("\nExibir os estados e as populações na ordem que foi informado: ");
        Map<String, Integer> estadosPopulacao2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(estadosPopulacao2);

        System.out.println("\nExibir em ordem alfabética: ");
        Map<String,Integer> estadosPopulacao3 = new TreeMap<>(estadosPopulacao2);
        System.out.println(estadosPopulacao3);

        System.out.println("\nExibir o estado com menor população: ");
        Integer menorPopulacao = Collections.min(estadosPopulacao2.values());
        String estadoMenorPopulacao = "";
        for (Map.Entry<String,Integer> entry : estadosPopulacao2.entrySet()) {
            if (entry.getValue().equals(menorPopulacao)) {
                estadoMenorPopulacao = entry.getKey();
                System.out.println("Estado com menor população é: " + estadoMenorPopulacao + " com " + menorPopulacao + " habitantes");
            }
        }

        System.out.println("Exibir o estado com maior população: ");
        Integer maiorPopulacao = Collections.max(estadosPopulacao2.values());
        String estadoMaiorPopulacao = "";
        for (Map.Entry<String,Integer> entry2 : estadosPopulacao2.entrySet()){
            if (entry2.getValue().equals(maiorPopulacao)){
                estadoMaiorPopulacao = entry2.getKey();
                System.out.println("Estado com maior população é: " + estadoMaiorPopulacao + " com " + maiorPopulacao + " habitantes");
            }
        }

        System.out.println("soma das populações: ");
        Iterator<Integer> iterator = estadosPopulacao2.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("\nA média de população: " + (soma/estadosPopulacao2.size()));

        System.out.println("\nRemover estados com a população menor que 400000: ");
        Iterator<Integer> iterator1 = estadosPopulacao2.values().iterator();
        while (iterator1.hasNext()){
           if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(estadosPopulacao2);

        System.out.println("\nApagar o dicionário de estados");
        estadosPopulacao2.clear();
        System.out.println(estadosPopulacao2);

        System.out.println("conferir se o dicionário está vazio: " + estadosPopulacao2.isEmpty());



    }
}

