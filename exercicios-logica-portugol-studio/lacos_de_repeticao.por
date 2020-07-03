programa
{
	
	funcao inicio()
	{
		// Exercício PARA 1
		/*
		
		// Obter média do salario da população, média do número de filhos, maior salário, percentual de pessoas com salário até R$ 100,00
		real salario = 0.0, media_salario_populacao = 0.0, maior_salario = 0.0, percentual = 0.0
		inteiro numero_de_filhos = 0, media_numero_de_filhos = 0, habitantes = 20, contador = 0, habitantes_salario_minimo = 0

		para(contador = habitantes; contador > 0; contador --){
			escreva("Digite seu salário: ")
			leia(salario)
			escreva("Digite o número de filhos: ")
			leia(numero_de_filhos)

			media_salario_populacao += salario
			media_numero_de_filhos += numero_de_filhos

			se(maior_salario < salario){
				maior_salario = salario
			}
			se(salario <= 100){
				habitantes_salario_minimo += 1
			}
		}
		
		media_salario_populacao /= habitantes
		media_numero_de_filhos /= habitantes
		percentual = (habitantes_salario_minimo * 100) / habitantes
		
		limpa()
		
		escreva("Média de salário da população: ",media_salario_populacao)
		escreva("\nMédia de número de filhos: ", media_numero_de_filhos)
		escreva("\nMaior salário: ", maior_salario)
		escreva("\nPercentual de pessoas que recebem até R$ 100: ", percentual)
		*/
		
		//Exercício PARA 2
		/*
		
		inteiro i, soma = 0

		para(i = 0; i <= 500; i++){
			se(i % 2 == 1 e i % 3 == 0){
				soma += i
			}
		}
		escreva("Resultado da soma: ", soma)
		*/

		//Exercício ENQUANTO 1
		/*
		
		inteiro n1, soma_total = 0, media = 0, valores_lidos = 0

		escreva("Digite um número: ")
		leia(n1)

		enquanto(n1 >= 0){
			soma_total += n1
			valores_lidos += 1

			escreva("Digite um número: ")
			leia(n1)
		}

		media = soma_total / valores_lidos
		
		escreva("\nSoma total: ", soma_total)
		escreva("\nTotal de valores lidos: ", valores_lidos)
		escreva("\nMédia: ", media)
		*/
		
		//Exercício ENQUANTO 2
		/* 
		 
		inteiro num_digitado
		
		escreva("Digite um número: ")
		leia(num_digitado)
		escreva(num_digitado)
		
		enquanto(num_digitado <= 100){
			num_digitado *= 3
			escreva("\n",num_digitado)
		}
		*/
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2067; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */