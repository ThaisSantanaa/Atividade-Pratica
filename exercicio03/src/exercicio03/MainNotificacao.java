package exercicio03;

public class MainNotificacao {

	public static void main(String[] args) {
		
		String mensagem = "\nBem vindo ao sistema de notificação";
		String tipo = "Email";
		String tipo1 = "SMS";
		
		Notificacao notificador;
		
		if(tipo.equalsIgnoreCase("Email")) {
			notificador = new NotificacaoEmail();
			
		}else if(tipo.equalsIgnoreCase("SMS")) {
			notificador = new NotificacaoSms();
				
		}else {
			throw new IllegalArgumentException("Erro de notificação");
			
		}
		
		notificador.enviar(mensagem);
		
		if(tipo1.equalsIgnoreCase("Email")) {
			notificador = new NotificacaoEmail();
			
		}else if(tipo1.equalsIgnoreCase("SMS")) {
			notificador = new NotificacaoSms();
				
		}else {
			throw new IllegalArgumentException("Erro de notificação");
			
		}
		
		notificador.enviar(mensagem);

	}

}
