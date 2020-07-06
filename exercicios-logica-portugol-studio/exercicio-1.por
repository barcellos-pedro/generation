programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//Exercício 1
		inteiro total_dias, ano, mes, dia
	
		escreva("Digite sua idade em anos, meses e dias: \n")
		leia(ano, mes, dia)

		total_dias = ano*365+mes*30+dia

		escreva("Sua idade em dias: ", total_dias)

		//Exercício 2
		inteiro idade_dias, ano2, mes2, dias2

		escreva("\nDigite sua idade em dias: ")
		leia(idade_dias)

		ano2 = idade_dias / 365
		mes2 = (idade_dias % 365) / 30
		dias2 = (idade_dias % 365) % 30

		escreva("\nVocê tem ", ano2, " anos e ", mes2," meses e ", dias2, " dias\n")

		//Exercício 3
		real tempo_segundos, horas, minutos
		
		escreva("\nDigite o tempo de duração do evento em segundos: ")
		leia(tempo_segundos)

		horas = tempo_segundos / 3600
		minutos = tempo_segundos / 60

		escreva("\nTempo do evento em horas: ", horas, " e em minutos ", minutos)

		//Exercício 4
		inteiro a, b, c, d, r, s

		escreva("\nDigite 3 números positivos: \n")
		leia(a, b , c)

		r = mat.potencia((a+b), 2)
		s = mat.potencia((b+c), 2)

		d = (r + s) / 2
		
		escreva("\nResultado: ", d)

		//Exercício 5
		inteiro nota1 = 2, nota2 = 3, nota3 = 5, media

		media = (nota1+nota2+nota3)/3

		escreva("Resultado da média: ", media)

		//Exercício 6
		inteiro resultado_d, px1, py1, px2, py2

		escreva("\nDigite a entrada de dois pontos\n")
		leia(px1, py1, px2, py2)
		
		resultado_d = mat.raiz((mat.potencia(px2-px1, 2))+(mat.potencia(py2-py1, 2)), 2)
		
		escreva("Resultado: ", resultado_d)

		//Exercício 7

		inteiro a1, b2, c3, d4, ee, f, x, y

		escreva("\nDigite os 6 valores da equação: \n")
		leia(a1, b2, c3, d4, ee, f)

		x = (c3*ee) - (b2*f) / (a1*ee) - (b2*d4)

		y = (a1*f) - (c3*d4) / (a1*ee) - (b2*d4)

		escreva("Resultado de x: ", x)
		escreva("\nResultado de y: ", y)

		//Exercício 8
		real custo_fabrica, custo_consumidor, distribuidor, impostos

		escreva("\nDigite o custo de fábrica: \n")
		leia(custo_fabrica)

		distribuidor = custo_fabrica * 0.28
		impostos = custo_fabrica * 0.45

		custo_consumidor = custo_fabrica + distribuidor + impostos

		escreva("Custo ao consumidor: ", custo_consumidor)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 786; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */