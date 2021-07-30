programa
{
	
	funcao inicio()
	{

/* Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade 
 *  e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
*/	

		const inteiro TOTAL_VALORES = 5
		real pontuacao[TOTAL_VALORES], maiorPontuacao = 0.0
		

		para (inteiro indice = 0 ; indice < TOTAL_VALORES ; indice++) {
			escreva("Digite a ", indice + 1 ,"ª pontuação: ")
			leia(pontuacao[indice])
			
				se (pontuacao[indice] > maiorPontuacao) {
					maiorPontuacao = pontuacao[indice]
			}
		limpa()
		}
		para (inteiro indice = 0 ; indice < TOTAL_VALORES ; indice++) {
			escreva(indice + 1 ,"ª pontuação - ", pontuacao[indice], "\n")
		}
		escreva("----------------------------\n")
		escreva("A maior pontuação foi: ", maiorPontuacao)
		escreva("\n----------------------------")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 614; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {maiorPontuacao, 12, 33, 14};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */