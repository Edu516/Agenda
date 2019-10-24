import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
	public static void main (String[] args) throws IOException {

		ListPessoa l = new ListPessoa();
		
		PersistenciaCSV csv = new PersistenciaCSV();
		Persistencia pers = new Persistencia(csv);
		
		l = new ListPessoa();
		l.setList(pers.ler());
		Scanner entrada = new Scanner(System.in);
		boolean menu =  true;
		boolean per= true;
		while(per) {
			System.out.println("1)CSV"
					+ "2)");
		}
		while(menu) {
			
			System.out.println("1)inserir Contato"
					+ "\n2)Alterar Contato"
					+ "\n3)Excluir Contato"
					+ "\n4)Consultar por Nome"
					+ "\n5)Aniversariante do Mês"
					+ "\n6)Consulta por Dominio"
					+ "\n7)Sair");
			int esc =  entrada.nextInt();
			switch(esc) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				menu =  false;
				break;
			}
		}
		for (Pessoa pessoa : l.getList()) {
			System.out.println(pessoa);
		}
	}
}