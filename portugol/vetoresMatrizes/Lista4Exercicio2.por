programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{

/* 2- Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um 
 *  vetor com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética 
 *  dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
*/
		const inteiro JOGADAS =  10
		inteiro dados[JOGADAS], quantidadeMaior = 0, maiorDado = 0
		real media, total = 0.0

		para(inteiro indice = 0 ; indice < JOGADAS ; indice++) {
			dados[indice] = Util.sorteia(1, 6)
			escreva(indice + 1 ,"º lançamento - ", dados[indice] ,"\n")
			
			total += dados[indice]
			se (dados[indice] > maiorDado) {
					maiorDado = dados[indice]
			}
		}
		para(inteiro indice = 0 ; indice < JOGADAS ; indice++) {
			se(dados[indice] == maiorDado) {
				quantidadeMaior++
			}
		}
		
		media = (total / JOGADAS)
		escreva("-------------------------------------\n")
		escreva("Média aritmética dos lançamentos: ", media ,"\n")
		escreva("-------------------------------------\n")
		escreva("Ocorrência da maior pontuação: ", quantidadeMaior)
		escreva("\n-------------------------------------")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */