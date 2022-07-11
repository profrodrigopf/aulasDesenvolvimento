package aulasDesenvolvimento;

public class TestandoEnum {

	public static void main(String[] args) {

		Enum enumn = new Enum(TesteEnum.FINALIZADO);
		
		System.out.println("Status: " + enumn.getStatus());
		
	}

}
