package vetores;

public class Arrays {

	public static void main(String[] args) {
		// Armazenar a temperatura média diária por 1 ano.
		
		//double temperatura1 = 30.5;
		//double temperatura2 = 25.6;
		//double temperatura3 = 20.9;
		
		double[] temperaturas = new double [365];
		
		temperaturas[0] = 30.5;
		temperaturas[1] = 27.5;
		temperaturas[2] = 20.5;
		temperaturas[3] = 37.5;
		temperaturas[4] = 35.5;
		
		System.out.println("O valor da temperatura é: " + temperaturas[1]);
		
		System.out.println("Tamanho do Arrays: " + temperaturas.length);
		
		for(int i=0; i<temperaturas.length; i++){
			System.out.println("A temperatura do dia " + (i+1) +  " é: " + temperaturas[i]);
		}
		
	}

}
