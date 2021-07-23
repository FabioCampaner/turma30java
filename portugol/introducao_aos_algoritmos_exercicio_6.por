programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
/*6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:
*/

		real x1, x2, y1, y2, d, raiz
		
		
		escreva("Digite a localização do ponto P1 no eixo horizontal: ")
		leia(x1)

		escreva("Digite a localização do ponto P1 no eixo vertical: ")
		leia(y1)
		
		escreva("Digite a localização do ponto P2 no eixo horizontal: ")
		leia(x2)

		escreva("Digite a localização do ponto P2 no eixo vertical: ")
		leia(y2)

		raiz = mat.potencia((x2 - x1), 2.0) + mat.potencia((y2 - y1), 2.0)
		d = mat.raiz(raiz, 2.0)

		escreva("A distância entre o ponto P1: (" + x1 + "; " + y1 + ") e P2: ("  + x2 + "; " + y2 + ") é: " + d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 823; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */