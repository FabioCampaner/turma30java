programa
{
	inclua biblioteca Tipos
	inclua biblioteca Util
	
	funcao inicio()
	{

/* 3 - Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
 *  
 *  a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das 
 *  matrizes N1 e N2;
 *  
 *  b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição 
 *  das matrizes N1 e N2.
*/	
		const inteiro 
		LINHAS = 4,
		COLUNAS = 6
		
		inteiro 
		N1[LINHAS][COLUNAS],
		N2[LINHAS][COLUNAS],
		M1[LINHAS][COLUNAS],
		M2[LINHAS][COLUNAS]

		pergunta(N1, LINHAS , COLUNAS, "N1")
		limpa()
		pergunta(N2, LINHAS , COLUNAS, "N2")
		limpa()
		
		para (inteiro indiceLinha = 0 ; indiceLinha < LINHAS ; indiceLinha++) {
			para (inteiro indiceColuna = 0 ; indiceColuna < COLUNAS ; indiceColuna++) {
				M1[indiceLinha][indiceColuna] = (N1[indiceLinha][indiceColuna] + N2[indiceLinha][indiceColuna])
				M2[indiceLinha][indiceColuna] = (N1[indiceLinha][indiceColuna] - N2[indiceLinha][indiceColuna])
			}
		}
		escreva("M1, matriz da soma:\n")
		resultados(M1, LINHAS, COLUNAS, "M1")
		
		escreva("-----------------------\n")
		escreva("M2, matriz da subtração:\n")
		resultados(M2, LINHAS, COLUNAS, "M2")


		
		
	}
	funcao pergunta (inteiro matrizNaFuncao[][], inteiro LINHAS, inteiro COLUNAS, cadeia nomeMatriz) {
		
		cadeia resposta = "n"
		
		inteiro 
		valorMinimo = 0,
		valorMaximo = 0,
		controle = 0
		
		para (inteiro indiceLinha = 0 ; indiceLinha < LINHAS ; indiceLinha++) {
			para (inteiro indiceColuna = 0 ; indiceColuna < COLUNAS ; indiceColuna++) {
				se (resposta != "A" e resposta != "a"){
					escreva("Digite valores para a matriz ", nomeMatriz ," ou digite 'A' para sortear todos os valores: ")
					leia(resposta)	
				}
				se (resposta == "A" ou resposta == "a") {
					se(controle == 0) {
						escreva("Defina um valor mínimo para o sorteio: ")
						leia(valorMinimo)
						escreva("Defina um valor máximo para o sorteio: ")
						leia(valorMaximo)
						controle++
					}
					matrizNaFuncao[indiceLinha][indiceColuna] = Util.sorteia(valorMinimo, valorMaximo)
				}
				senao {
					matrizNaFuncao[indiceLinha][indiceColuna] = Tipos.cadeia_para_inteiro(resposta, 10)
				}
			}
		}
	}
	funcao resultados (inteiro matrizNaFuncao[][], inteiro LINHAS, inteiro COLUNAS, cadeia nomeMatriz) {
			para (inteiro indiceLinha = 0 ; indiceLinha < LINHAS ; indiceLinha++) {
			
				para (inteiro indiceColuna = 0 ; indiceColuna < COLUNAS ; indiceColuna++) {
					
					escreva(matrizNaFuncao[indiceLinha][indiceColuna], "  ")
					
				}
				escreva("\n")
			}
		}
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1127; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */