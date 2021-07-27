programa
{
	
	funcao inicio() {

/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas 
 * de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas 
 * exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
 * A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário 
 * excedente.
*/

		real horasTrabalhadas, salarioExcedente, salarioTotal
		inteiro codigo
		const inteiro limiteHoras = 50
		const real salarioBase = 10.00
		
	
		escreva("Digite o seu código: ")
		leia(codigo)
		
		escreva("Digite o número de horas trabalhadas: ")
		leia(horasTrabalhadas)

		se (horasTrabalhadas > limiteHoras) {
			salarioExcedente = ((horasTrabalhadas - limiteHoras) * 20)
			salarioTotal = (salarioBase * limiteHoras) + salarioExcedente
			escreva("Boa tarde ", codigo ,", o total do seu salário é de R$", salarioTotal ," ,sendo R$", salarioExcedente ," por horas excedentes.")
		}
		senao {
			salarioTotal = (horasTrabalhadas * salarioBase)
			escreva("Boa tarde ", codigo ,", o total do seu salário é de R$", salarioTotal ,".")
			escreva("\nSem salário excedente.")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 764; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */