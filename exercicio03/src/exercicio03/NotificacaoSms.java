package exercicio03;

public class NotificacaoSms extends Notificacao  {
	
	@Override
	public void enviar(String mensagem) {
		
		if(mensagem == null || mensagem.isEmpty()) {
			throw new IllegalArgumentException("O SMS não pode estar vazio!");
		}
		
		System.out.println("SMS enviado com sucesso!" + mensagem);
		
	}

}


