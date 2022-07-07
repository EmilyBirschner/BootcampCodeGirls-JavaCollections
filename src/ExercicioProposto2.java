import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> todasRespostas = new ArrayList();
        System.out.println("Perguntas \n");
        System.out.println("Telefonou para a vítima? ");
        String respostaPergunta = scanner.next();
        todasRespostas.add(respostaPergunta);
        System.out.println("--------------\n");
        System.out.println("Esteve no local do crime? ");
        respostaPergunta = scanner.next();
        todasRespostas.add(respostaPergunta);
        System.out.println("--------------\n");
        System.out.println("Mora perto da vítima? ");
        respostaPergunta = scanner.next();
        todasRespostas.add(respostaPergunta);
        System.out.println("--------------\n");
        System.out.println("Devia para a vítima? ");
        respostaPergunta = scanner.next();
        todasRespostas.add(respostaPergunta);
        System.out.println("--------------\n");
        System.out.println("Já trabalhou com a vítima? ");
        respostaPergunta = scanner.next();
        todasRespostas.add(respostaPergunta);
        System.out.println("\n" + todasRespostas);
        System.out.println("--------------\n");

        int count = 0;
        Iterator<String> contador = todasRespostas.iterator();

        while(contador.hasNext()) {
            String resp = (String)contador.next();
            if (resp.contains("s")) {
                ++count;
            }
        }

        switch (count) {
            case 2:
                System.out.println(">> SUSPEITA <<");
                break;
            case 3:
                System.out.println(">> CÚMPLICE <<");
                break;
            case 4:
                System.out.println(">> CÚMPLICE <<");
                break;
            case 5:
                System.out.println(">> ASSASSINO <<");
                break;
            default:
                System.out.println(">> INOCENTE <<");
        }

    }
}
