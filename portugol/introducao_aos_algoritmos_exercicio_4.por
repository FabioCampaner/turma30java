programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{

/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) 
 * e calcule a seguinte expressão: D=(R + S) sendo R=(A+B)² e S=(B+C)²
*/

		
		real a, b, c, r, s, d
		

		escreva("Vamos calcular o valor de D! Escolha números inteiros positivos: ")

		escreva("\nDigite o primeiro número: ")
		leia(a)
		
		escreva("\nDigite o primeiro número: ")
		leia(b)
		
		escreva("\nDigite o primeiro número: ")
		leia(c)


		r = mat.potencia((a + b), 2.0)
		
		s = mat.potencia((b + c), 2.0)

		d = (r + s) / 2
		
		
		escreva("\nO resultado da expressão é: " + d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 253; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */