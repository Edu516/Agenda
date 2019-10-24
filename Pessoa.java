import java.util.Date;

public class Pessoa {
	private int codigo ;
	private String nome,email ;
	private long fone;
	private Date dataNascimento;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getFone() {
		return fone;
	}
	public void setFone(long fone) {
		this.fone = fone;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", fone=" + fone
				+ ", dataNascimento=" + dataNascimento + "]";
	}
	
	
	
}