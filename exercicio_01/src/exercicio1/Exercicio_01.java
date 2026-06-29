package exercicio1;

public class Exercicio_01  {
	
	public static void main(String[] args) throws Exception {
	
		try {
				Admin admin1 = new Admin("Jasmin", "Jasmin9@outlook.com", "2");
				System.out.println("Dados do Sistema: ");
				System.out.println(admin1.getDescricao());
	} catch (IllegalArgumentException e) {
		System.err.println("Erro ao iniciar" + e.getMessage());
	}

	
	}

}