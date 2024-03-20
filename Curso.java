import java.time.LocalDate;

public class Curso {
	private int cod_curso;
	private String nome_curso;
	private LocalDate dt_incio_curso;
	
	public Curso(int cod_curso, String nome_curso, LocalDate dt_incio_curso) {
		this.cod_curso = cod_curso;
		this.nome_curso = nome_curso;
		this.dt_incio_curso = dt_incio_curso;
	}

	public int getCod_curso() {
		return cod_curso;
	}

	public void setCod_curso(int cod_curso) {
		this.cod_curso = cod_curso;
	}

	public String getNome_curso() {
		return nome_curso;
	}

	public void setNome_curso(String nome_curso) {
		this.nome_curso = nome_curso;
	}

	public LocalDate getDt_incio_curso() {
		return dt_incio_curso;
	}

	public void setDt_incio_curso(LocalDate dt_incio_curso) {
		this.dt_incio_curso = dt_incio_curso;
	}

	@Override
	public String toString() {
		return "Curso [cod_curso=" + cod_curso + ", nome_curso=" + nome_curso + ", dt_incio_curso=" + dt_incio_curso
				+ "]";
	}
	
	

}
