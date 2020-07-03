programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//Exercício 1
		/*
		real peso, excesso = 0, multa = 0, regulamento_peso = 50, regulamento_taxa = 4
		escreva("Digite o total do peso dos peixes: ")
		leia(peso)

		se(peso > regulamento_peso){
			excesso = peso - regulamento_peso
			multa = excesso * regulamento_taxa

			escreva("Você deverá pagar R$ ", multa, " de multa, por ter excedido ", excesso, " KG")
		}
		senao{
			escreva("Não será necessário paga multa \n Peso excedido: ",excesso, " KG | Valor de multa: R$ " ,multa)
		}
		*/

		//Exercício 2
		/*
		real horas_trabalhadas = 0, hora_extra = 0, valor_hora_extra = 0, salario = 0, valor_hora = 10, valor_hora_excedente = 20
		cadeia codigo

		escreva("\nDigite seu código identificador e as horas trabalhadas: ")
		leia(codigo, horas_trabalhadas)

		se(horas_trabalhadas > 50){
				hora_extra = horas_trabalhadas - 50
				valor_hora_extra = hora_extra * valor_hora_excedente
				salario = (horas_trabalhadas * valor_hora) + valor_hora_extra

				escreva("\nSeu salário total do mês: R$ ", salario, " | Horas extras: ", hora_extra, " | Bônus hora extra: R$ ", valor_hora_extra)
		}
		senao{
				salario = (horas_trabalhadas * valor_hora)
				escreva("\nSeu salário total do mês: R$ ", salario, " | Horas extras: ", hora_extra)				
		}
		*/

		//Exercício 3
		/*
		inteiro n1, n2, n3, n4, q1, q2, q3, q4

		escreva("Digite 4 números para saber o quadrado de cada um: ")
		leia(n1, n2, n3, n4)

		q1 = mat.potencia(n1, 2)
		q2 = mat.potencia(n2, 2)
		q3 = mat.potencia(n3, 2)
		q4 = mat.potencia(n4, 2)

		se(q3 >= 1000){
			escreva("\nO quadrado do número ", n3, " é: ", q3)
		}
		senao{
			escreva("\nO quadrado do número ", n1, " é: ", q1)
			escreva("\nO quadrado do número ", n2, " é: ", q2)
			escreva("\nO quadrado do número ", n3, " é: ", q3)
			escreva("\nO quadrado do número ", n4, " é: ", q4)
		}
		*/

		//Exercício 4
		/*
		inteiro numero

		escreva("Digite um número: ")
		leia(numero)

		se(numero % 2 == 0){
			se(numero < 0){
				escreva("O número é par e negativo: ", numero)
			}
			senao{
				escreva("O número é par e positivo: ", numero)
			}
		}
		senao{
			se(numero < 0){
				escreva("O número é ímpar e negativo: ", numero)
			}
			senao{
				escreva("O número é ímpar e positivo: ", numero)
			}
		}
		*/
		
		//Exercício 5
		//Indice varia de 0.05 até 0.5
		/*
		real poluicao

		escreva("Digite o índice de poluição atual: ")
		leia(poluicao)

		se (poluicao >= 0.3 e poluicao < 0.4){
			escreva("As indústrias do primeiro grupo serão intimadas a suspenderem suas atividades. ")
		}
		senao se (poluicao >= 0.4 e poluicao < 0.5){
			escreva("As indústrias do primeiro e segundo grupo serão intimadas a suspenderem suas atividades.")			
		}
		senao se (poluicao >= 0.5){
			escreva("As indústrias de todos os grupos serão notificadas à paralisarem suas atividades.")
		}
		senao{
			escreva("Nenhum grupo deverá ser notificado.")
		}
		*/

		//Exercício 6
		/*
		inteiro idade

		escreva("Digite sua idade: ")
		leia(idade)

		se(idade >= 5 e idade <= 7){
			escreva("Infantil A")
		}
		senao se(idade >= 8 e idade <= 11){
			escreva("Infantil B")
		}
		senao se(idade >= 12 e idade <= 13){
			escreva("Juvenil A")
		}
		senao se(idade >= 14 e idade <= 17){
			escreva("Juvenil B")
		}
		senao se(idade >= 18){
			escreva("Adultos")
		}
		senao{
			escreva("Idade incompatível.")
		}
		*/

		//Exercício 7
		/*
		real base, altura, area

		escreva("Digite base e altura do triângulo: ")
		leia(base, altura)

		se(base > 0 e altura > 0){
			area = (base * altura) / 2
			escreva("Área do triângulo: ", area)
		}
		senao{
			escreva("Valor negativos ou iguais a zero.")
		}
		*/

		//Exercício 8
		/*
		real n

		escreva("Digite um número: ")
		leia(n)

		se(n > 100){
			escreva("Número digitado: ", n)
		}
		senao{
			n = 0.0
			escreva("Seu número: ", n)
		}
		*/

		//Exercício 9
		/*
		cadeia sexo
		real altura, peso_ideal_homem = 0.0, peso_ideal_mulher = 0.0

		escreva("Digite sua altura: ")
		leia(altura)

		escreva("Digite seu sexo: ")
		leia(sexo)

		peso_ideal_homem = (72.7 * altura) - 58
		peso_ideal_mulher = (62.1 * altura) - 44.7
		
		se(sexo == "masculino"){
			escreva("Seu peso ideal: ", peso_ideal_homem)
		}
		
		senao se(sexo == "feminino"){
			escreva("Seu peso ideal: ", peso_ideal_mulher)
		}
		senao{
			escreva("Dados incorretos, digite novamente.")
		}
		*/
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3899; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */