programa
{
	
	funcao inicio() {
/* 4 - Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
 *  e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
 *  ou seja, diagonal principal.

*/
		const inteiro VALOR_QUADRADO = 3
		
		inteiro
		matrizQuadrada[VALOR_QUADRADO][VALOR_QUADRADO],
		soma = 0,
		somaDiagonal = 0
	
		para(inteiro indiceLinha = 0 ; indiceLinha < VALOR_QUADRADO ; indiceLinha++){
			para(inteiro indiceColuna = 0 ; indiceColuna < VALOR_QUADRADO ; indiceColuna++){
				escreva("Digite valores para a matriz quadrada: ")
				leia(matrizQuadrada[indiceLinha][indiceColuna])
				soma += matrizQuadrada[indiceLinha][indiceColuna]
				se(indiceLinha == indiceColuna) {
					somaDiagonal += matrizQuadrada[indiceLinha][indiceColuna]
				}
			}
		}
		limpa()
		escreva("Soma de todos os valores: ", soma ,";")
		escreva("\nSoma dos valores da diagonal principal: ", somaDiagonal, ".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 959; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */