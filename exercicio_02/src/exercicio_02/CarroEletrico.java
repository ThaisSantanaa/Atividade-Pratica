package exercicio_02;


public class CarroEletrico extends Veiculo {
	
private int nivelBateria = 100;

	public CarroEletrico(String modelo, int nivelBateria) {
		super(modelo);
		
		this.nivelBateria =  nivelBateria;
			
	}
	
	@Override
	public void acelerar(int valor) {
		int consumo = valor / 3;
		if(nivelBateria < consumo) {
			throw new RuntimeException("Bateria Insuficiente" + valor + "km/h" );
	
		}
		
		super.acelerar(valor);
		this.nivelBateria -= consumo;
	}	
	public void status() {
		System.out.println("Modelo: " + modelo + "Velocidade: " + velocidade + "Km/h | Bateria Restante: " + nivelBateria + "%");
	}
	

}
