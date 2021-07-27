programa
{
	
	funcao inicio(){

/* 7) Receber valores de base e altura de um triângulo e verificar se são valores válidos 
 *  (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
*/

		real base, altura

		escreva("Vamos calcular a área de um triângulo!")
		
		escreva("\nDigite o valor da base: ")
		leia(base)
		
		escreva("Digite o valor da altura: ")
		leia(altura)
		
		se (base > 0 e altura > 0) {
			escreva("A área do triângulo é ", (base * altura) / 2)
		}
		senao {
			se (base > 0) {
				escreva("Insira um valor válido para a altura! (números positivos maiores que zero)")
			}
			senao se (altura > 0) {
				escreva("Insira um valor válido para a base! (números positivos maiores que zero)")
			}
			senao {
				escreva("Insira valores válidos! (números positivos maiores que zero)")	
			}
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 430; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */