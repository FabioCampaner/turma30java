programa
{
	
	funcao inicio()
	{

/* 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final 
 *  o total do somatório, a média e o total de valores lidos. O programa deve fazer as leituras dos 
 *  valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve parar 
 *  quando o usuário fornecer um valor negativo.
*/
		real somaTotal = 0.0, numeroDigitado = 0.0, media = 0.0
		inteiro contador = 0

		enquanto (numeroDigitado >= 0) {
			limpa()
			somaTotal += numeroDigitado
			escreva("Digite um número positivo para somarmos (caso queira parar, digite um número negativo): ")
			leia(numeroDigitado)
			se (numeroDigitado > 0) {
				contador ++
			}
		}
		limpa()
		media = (somaTotal / contador)
		escreva("A soma de todos os números positivos digitados, é: ", somaTotal)
		escreva("\nA média de todos os números positivos digitados, é: ", media)
		escreva("\nO total de valores lidos, é: ", contador)


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 728; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */