programa
{
	
	funcao inicio()
	{

/*7. Um sistema de equações lineares do tipo: 
, pode ser resolvido segundo mostrado abaixo : 
 
Escreva um sistema que lê os coeficientes 
a,b,c,d,e e f e calcula e mostra os valores de x e y. 
*/
		
		real a, b, c, d, E, f, x, y

		
		escreva("Digite um valor para a: ")
		leia(a)

		escreva("Digite um valor para b: ")
		leia(b)

		escreva("Digite um valor para c: ")
		leia(c)

		escreva("Digite um valor para d: ")
		leia(d)

		escreva("Digite um valor para e: ")
		leia(E)

		escreva("Digite um valor para f: ")
		leia(f)
		

		x = ((c*E) - (b*f)) / ((a*E) - (b*d))
		
		y = ((a*f) - (c*d)) / ((a*E) - (b*d))
		

		escreva("Os valores de X e Y são respectivamente " + x + " e " + y)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 308; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */