import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaMatricula {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		ArrayList <Aluno> alunos = new ArrayList<>();
		ArrayList <Curso> cursos = new ArrayList<>();
		ArrayList <Matricula> matriculas = new ArrayList<>();
		
		while (true) {
			try {
					
				
				System.out.println("Escolha uma opção:");
	            System.out.println("1. Cadastrar aluno");
	            System.out.println("2. Cadastrar curso");
	            System.out.println("3. Realizar matrícula");
	            System.out.println("4. Sair");
	
	            int opcao = scanner.nextInt();
	            
	            switch (opcao) {
	            
	            case 1:
	                System.out.println("Digite o número de matrícula:");
	                int matricula = scanner.nextInt();
	                scanner.nextLine(); // Limpar o buffer
	                System.out.println("Digite o nome do aluno:");
	                String nomeAluno = scanner.nextLine();
	                System.out.println("Digite a data de nascimento (no formato yyyy-MM-dd):");
	                String data_nascStr = scanner.nextLine();
	                LocalDate data_nasc = LocalDate.parse(data_nascStr);
	                Aluno aluno = new Aluno(matricula, nomeAluno, data_nasc);
	                alunos.add(aluno);
	                break;
	            case 2:
	                System.out.println("Digite o código do curso:");
	                int cod_curso = scanner.nextInt();
	                scanner.nextLine(); 
	                System.out.println("Digite o nome do curso:");
	                String nome_curso = scanner.nextLine();
	                System.out.println("Digite a data de início do curso (no formato yyyy-MM-dd):");
	                String dt_incio_cursoStr = scanner.nextLine();
	                LocalDate dt_incio_curso = LocalDate.parse(dt_incio_cursoStr);
	                Curso curso = new Curso(cod_curso, nome_curso, dt_incio_curso);
	                cursos.add(curso);
	                break;
	            case 3:
	                System.out.println("Escolha o aluno (pelo número de matrícula):");
	                for (Aluno a : alunos) {
	                    System.out.println(a.getMatricula() + ". " + a.getNome());
	                }
	                int matriculaEscolhida = scanner.nextInt();
	                Aluno alunoEscolhido = null;
	                for (Aluno a : alunos) {
	                    if (a.getMatricula() == matriculaEscolhida) {
	                        alunoEscolhido = a;
	                        break;
	                    }
	                }
	                if (alunoEscolhido == null) {
	                    System.out.println("Aluno não encontrado.");
	                    break;
	                }
	
	                System.out.println("Escolha o curso (pelo código):");
	                for (Curso c : cursos) {
	                    System.out.println(c.getCod_curso() + ". " + c.getNome_curso());
	                }
	                int codigoCursoEscolhido = scanner.nextInt();
	                Curso cursoEscolhido = null;
	                for (Curso c : cursos) {
	                    if (c.getCod_curso() == codigoCursoEscolhido) {
	                        cursoEscolhido = c;
	                        break;
	                    }
	                }
	                if (cursoEscolhido == null) {
	                    System.out.println("Curso não encontrado.");
	                    break;
	                }
	
	                int idadeNaMatricula = new Matricula(alunoEscolhido, cursoEscolhido, LocalDate.now()).calculaIdadeNaMatricula();
	                if (idadeNaMatricula < 18) {
	                    System.out.println("O aluno não tem idade suficiente para se matricular.");
	                    break;
	                }
	
	                Matricula matriculaRealizada = new Matricula(alunoEscolhido, cursoEscolhido, LocalDate.now());
	                matriculas.add(matriculaRealizada);
	                System.out.println("Matrícula realizada com sucesso.");
	                break;
	            case 4:
	                System.out.println("Saindo do sistema...");
	                System.exit(0);
	            default:
	                System.out.println("Opção inválida.");
	            }
			}catch (InputMismatchException e) {
            	System.out.println("Entrada inválida, insira um número. ");
            	scanner.nextLine();
           }catch (Exception e) {
        	   System.out.println("Ocorreu um erro: " + e.getMessage());
           }
    }
}
}       	


