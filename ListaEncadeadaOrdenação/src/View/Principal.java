package View;
import Controller.Ordenacoes;
import controller.Ordem;

public class Principal {
	public static void main(String[] args) {

		try {
			Ordem O = new Ordem();
			O.ordenação();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
