import java.time.LocalDate;

public class Aluno {
	private int matricula;
	private String nome;
	private LocalDate dt_nasc;
	
	public Aluno(int matricula, String nome, LocalDate dt_nasc) {
		this.matricula = matricula;
		this.nome = nome;
		this.dt_nasc = dt_nasc;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDt_nasc() {
		return dt_nasc;
	}

	public void setDt_nasc(LocalDate dt_nasc) {
		this.dt_nasc = dt_nasc;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", dt_nasc=" + dt_nasc + "]";
	}
	
	
	
	
	}

