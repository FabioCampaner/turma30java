programa
{
	
	funcao inicio()
	{
		inteiro numero, teste
		escreva("Digite um número inteiro positivo: ")
		leia(numero)
		enquanto (numero < 0){
			escreva("O número digitado não atende os requisitos, digite um número inteiro POSITIVO.")
			leia(numero)
		}
		se (numero == 0){
			escreva("O número digitado é neutro")
		}
		senao { 
			teste = (numero % 2)
			se (teste == 0){
				escreva("O número digitado é par.")
			}
			senao {
				escreva("O número digitado é ímpar.")	
			}
		}
		
		
		
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 418; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */