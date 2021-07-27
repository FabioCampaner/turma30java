programa
{
	
	funcao inicio() {

/* 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, 
 *  e se é positivo ou negativo.

*/
		inteiro numeroInteiro

	
		escreva("Digite um número inteiro: ")
		leia(numeroInteiro)


		se (numeroInteiro == 0) {
			escreva("O número é neutro")
		}
		senao {
			se (numeroInteiro > 0) {
				escreva("O número é positivo")
				se (numeroInteiro % 2 == 0) {
					escreva(" e  par.")
				}
				senao {
					escreva(" e  ímpar.")
				}
			}
			senao {
				escreva("O número é negativo")
				se (numeroInteiro % 2 == 0) {
					escreva(" e  par.")
				}
				senao {
					escreva(" e  ímpar.")
				}
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 209; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */