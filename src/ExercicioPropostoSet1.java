import java.util.*;

public class ExercicioPropostoSet1 {
    public static void main(String[] args) {
        System.out.println("Criar um conjunto contendo as cores do arco-íris");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("vermelho");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("anil");

        for (String cor : coresArcoIris){
            System.out.println(cor);
        }

        System.out.println("A quantidade de cores: " + coresArcoIris.size());

        System.out.println("Exibir em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("Exibir na ordem inversa que foi informada: ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "azul", "verde", "vermelho", "amarelo", "laranja", "anil"));
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Exibir todas as cores que começam com a letra 'v': ");
        for (String cor: coresArcoIris){
            if (cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remover as cores que não começam com 'v': ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()){
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();

        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());



    }
}

