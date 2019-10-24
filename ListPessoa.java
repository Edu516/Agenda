import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListPessoa {
	
	List<Pessoa> lista = new ArrayList<Pessoa>();
	
	public boolean add(Pessoa pessoa) {
		lista.add(pessoa);
		return true;
	}
	
	public List<Pessoa> getList(){
		return lista;
	}
	
	public void setList(List<Pessoa> list){
		this.lista = list;
	}
	
	public boolean remover(String nome) {
		for (int k =0; k< lista.size();k++) {
			if(nome.equals(lista.get(k).getNome())) {
				lista.remove(k);
				return true;
			}
		}
		return false;
	}
	

	public List<Pessoa> buscar(String nome){
		List<Pessoa> consulta =  new ArrayList<Pessoa>();
		Pessoa p =  new Pessoa();
		for (int k =0; k< consulta.size();k++) {
			if(nome.contains(lista.get(k).getNome())) {
				consulta.add(lista.get(k));
			}
		}
		return consulta;
	}
	public List<Pessoa> buscar_dominio(String nome){
		List<Pessoa> consulta =  new ArrayList<Pessoa>();
		Pessoa p =  new Pessoa();
		for (int k =0; k< consulta.size();k++) {
			if(nome.equalsIgnoreCase(lista.get(k).getEmail())) {
				consulta.add(lista.get(k));
			}
		}
		return consulta;
	}
}
