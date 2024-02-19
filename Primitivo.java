package br.com.fiap;

public class Primitivo {
	
	public static void main(String[] args) {
        //declarar e atribuir
        //tipo nome = valor;
        char sexo = 'f';
        byte idade = 25;
        short codigo = 1502;
        //declarar e atribuir várias variáveis de mesmo tipo
        int alunos = 50, turma = 11;
        long brasileiros = 216708210;
        float media = 8.7f; //somente para o float, usar o f
        double cotacaoDolar = 4.94;
        boolean alternativa = false;

        System.out.println("Sexo: " + sexo  + " Idade: " + idade + " Código: " + codigo);
        System.out.println("Média: " + media + " Alunos: " + alunos + " Turma: " + turma);
        System.out.println("Habitantes: " + brasileiros + " Dólar: " + cotacaoDolar);
        System.out.println("Alternativa: " + alternativa);
    }
}
