programa
{
	
	funcao inicio()
	{
		real peso,altura,imc,total
		
		escreva("Digite seu peso: ")
		leia(peso)

		escreva("Digite sua altura: ")
		leia(altura)

		imc = peso/(altura*altura)
		se (imc < 18.5) {
			escreva("Abaixo do peso")
		}
		
		senao se(imc >=18.5 e imc <25) {
			escreva("Peso normal")
		}
		senao se(imc >=25 e imc< 30) {
			escreva("Acima do peso")
		}
		senao {
			escreva("Acima do peso (obeso)")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 300; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */