import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class Matricula {
	private Aluno aluno;
	private Curso curso;
	private LocalDate data_matricula;
	
	public Matricula(Aluno aluno, Curso curso, LocalDate data_matricula) {
		this.aluno = aluno;
		this.curso = curso;
		this.data_matricula = data_matricula;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public LocalDate getData_matricula() {
		return data_matricula;
	}

	public void setData_matricula(LocalDate data_matricula) {
		this.data_matricula = data_matricula;
	}

	@Override
	public String toString() {
		return "Matricula [aluno=" + aluno + ", curso=" + curso + ", data_matricula=" + data_matricula + "]";
	}
	
	
	public int calculaIdadeNaMatricula() {
		Instant inst = Instant.now();
		LocalDate data_nasc = aluno.getDt_nasc();
		LocalDate data_mat = LocalDate.ofInstant(inst, ZoneId.of("America/Sao_Paulo"));
		Period idade = Period.between(data_nasc, data_mat);
		return idade.getYears();
		
	}
	
	
	
	

}
