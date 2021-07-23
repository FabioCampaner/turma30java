programa
{
	
	funcao inicio()
	{
		/*
		3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos
		e mostre-o expresso em horas, minutos e segundos. 
		*/
		
		inteiro segundos, horas, minutos, segundoFinal, minutoFinal
		
		
		escreva("Digite o tempo de duração do evento da fábrica (em segundos): ")
		leia(segundos)
		

		minutos = (segundos / 60)

		horas = (minutos / 60)

		segundoFinal = (segundos % 60)
		
		minutoFinal = (minutos % 60)
		

		escreva("O tempo em horas foi de: " + horas)
		
		escreva("\nO tempo em minutos foi de: " + minutos)
		
		escreva("\nO tempo em segundos foi de: " + segundos)
		
		
		escreva("\nTotalizando " + horas + " horas " + minutoFinal + " minutos e " + segundoFinal + " segundos. ")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 258; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */