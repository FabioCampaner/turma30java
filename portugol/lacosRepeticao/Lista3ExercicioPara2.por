programa
{
	
	funcao inicio()
	{

/* 2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são 
 *  múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
*/
		inteiro soma = 0
		
		para (inteiro contador = 1; contador <= 500; contador++) {
			se (contador % 3 == 0 e contador % 2 == 1) {
				soma += contador
			}
		}
				
		escreva("A soma de todos os números ímpares, múltiplos de 3 e que se encontram entre 1 e 500 é: ", soma ,".")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 483; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */