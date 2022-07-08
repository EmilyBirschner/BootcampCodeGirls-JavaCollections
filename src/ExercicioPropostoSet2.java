import java.util.*;

public class ExercicioPropostoSet2 {
    public static void main(String[] args) {

        Set<LinguagemFavorita> minhasLinguagens = new HashSet<>() {{
            add(new LinguagemFavorita("Ling1", 1990,"Eclipse"));
            add(new LinguagemFavorita("Ling2", 2005,"VSC"));
            add(new LinguagemFavorita("Ling3", 1994,"Intelli"));
        }};
       for (LinguagemFavorita favorita: minhasLinguagens) System.out.println(favorita.getNome() + " - " +
               favorita.getAnoDeCriacao() + " - " + favorita.getIde());

       System.out.println("Ordem de inserção: ");

       Set<LinguagemFavorita> minhasLinguagens2 = new LinkedHashSet<>() {{
           add(new LinguagemFavorita("Ling1", 1990,"Eclipse"));
           add(new LinguagemFavorita("Ling2", 2005,"VSC"));
           add(new LinguagemFavorita("Ling3", 1994,"Intelli"));
       }};
        for (LinguagemFavorita favorita: minhasLinguagens) System.out.println(favorita.getNome() + " - " +
                favorita.getAnoDeCriacao() + " - " + favorita.getIde());

        System.out.println("Ordem natural (Nome)");
        Set<LinguagemFavorita> minhasLinguagens3 = new TreeSet<>(minhasLinguagens);
        for (LinguagemFavorita favorita: minhasLinguagens3) System.out.println(favorita.getNome() + " - " +
                favorita.getAnoDeCriacao() + " - " + favorita.getIde());

        System.out.println("Por IDE");
        Set<LinguagemFavorita> minhasLinguagens4 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        minhasLinguagens4.addAll(minhasLinguagens);
        for (LinguagemFavorita favorita: minhasLinguagens4) System.out.println(favorita.getNome() + " - " +
                favorita.getAnoDeCriacao() + " - " + favorita.getIde());

        System.out.println("Ano de Criação e Nome");
        Set<LinguagemFavorita> minhasLinguagens5 = new TreeSet<LinguagemFavorita>(new ComparatorAnoENome());
        minhasLinguagens5.addAll(minhasLinguagens);
        for (LinguagemFavorita favorita: minhasLinguagens5) System.out.println(favorita.getNome() + " - " +
                favorita.getAnoDeCriacao() + " - " + favorita.getIde());

        System.out.println("Por Nome, Ano de criação e IDE");
        Set<LinguagemFavorita> minhasLinguagens6 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoIde());
        minhasLinguagens6.addAll(minhasLinguagens);
        for (LinguagemFavorita favorita: minhasLinguagens6) System.out.println(favorita.getNome() + " - " +
                favorita.getAnoDeCriacao() + " - " + favorita.getIde());
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    public String nome;
    public Integer anoDeCriacao;
    public String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }
    @Override
    public int compareTo(LinguagemFavorita favorita){
        return this.nome.compareTo(favorita.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome) && anoDeCriacao.equals(that.anoDeCriacao) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}

class ComparatorAnoENome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        int anoCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (anoCriacao != 0) return anoCriacao;
        return lf1.nome.compareToIgnoreCase(lf1.nome);
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        int anoCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (nome != 0) return nome;
        if (anoCriacao != 0) return anoCriacao;
        return lf1.ide.compareToIgnoreCase(lf1.ide);
    }
}

