package exercicio03;

public class NotificacaoEmail extends Notificacao {
	
	@Override
	public void enviar(String mensagem) {
		
		if(mensagem == null || mensagem.isEmpty()) {
			throw new IllegalArgumentException("O campo e-mail não pode estar vazio!");
		}
		
		System.out.println("E-mail enviado com sucesso!" +  mensagem);
		
	}

}
