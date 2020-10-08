package classes;
import java.util.Scanner;
public class Exercicio_4_Empresa {
	public static void main(String[] args)
	{
		/*
		 * idade, sexo (1-feminino / 2-masculino / 3-Outros)
		 * as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3,
		 *  se a pessoa era agressiva)
		 *  limite - 150 pessoas
		 *  vou calcular
		 *  o n�mero de pessoas calmas;
			o n�mero de mulheres nervosas;
			o n�mero de homens agressivos;
			o n�mero de outros calmos;
			o n�mero de pessoas nervosas com mais de 40 anos;
			o n�mero de pessoas calmas com menos de 18 anos.
		 */
		//instanciando o objeto teclado chamado leia pela classe scanner
		Scanner leia = new Scanner(System.in);
		
		//declarar as variaveis
		int idade;
		final int LIMITE = 3; // O LIMITE DE PESSOAS � 150
		byte sexo; // (1-feminino / 2-masculino / 3-Outros)
		byte tipoHumor; //(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva)
		int totalF, totalM, totalO, pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, nervosas40=0, calmasMenor18=0;
		
		int contador = 1;
		System.out.println("------- SISTEMA DE PESQUISA DA CIDADE DE EMBU -----------------");
		while (contador <=LIMITE) {
			System.out.print("Digite a sua idade:");
			idade = leia.nextInt();
			System.out.print("Digite 1-feminino / 2-masculino / 3-Outros :");
			sexo = leia.nextByte();
			System.out.print("Digite para cada tipo de pessoa: 1 - Calma / 2 - Nervosa / 3 - Agressiva :");
			tipoHumor = leia.nextByte();
			leia.nextLine(); //limpeza de buffer teclado
			
			if (tipoHumor == 1) {
				pessoasCalmas = pessoasCalmas + 1;
			}
			if ((tipoHumor ==2) && (sexo == 1)) {
				mulheresNervosas = mulheresNervosas +1;
			}
			// fuga do loop / la�o
			contador++;
			
		}
		System.out.printf("\nTOTAL DE PESSOAS CALMAS : %d", pessoasCalmas);
		System.out.printf("\nTOTAL DE MULHERES NERVOSAS : %d, :", mulheresNervosas);
		leia.close();
		
	}
}