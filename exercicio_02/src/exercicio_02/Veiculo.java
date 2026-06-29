package exercicio_02;

public class Veiculo {
	
	protected String modelo;
	protected int velocidade;
	
	public Veiculo (String modelo) { 
		
		this.modelo = modelo;
		this.velocidade = 0;
		
	}
	
	public void acelerar ( int valor) {
		if(valor <= 0) {
			throw new IllegalArgumentException("Acelerar o carro");
		}
		
		this.velocidade += valor;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
	
	

}
