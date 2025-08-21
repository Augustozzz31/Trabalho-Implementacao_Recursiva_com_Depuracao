# Trabalho-Implementacao_Recursiva_com_Depuracao

#Alunos: Eduardo Vieira Montagna, Gabriel Paz Ribeiro e Otávio Augusto Milioni Costa.

## Relato Step Over
>1- Breakpoit linha 5: O Scanner é instanaciado.
 
>2- Linha 6: É criado um vetor do tipo inteiro, chamado vet, que armazena até 5 valores.  

>3- Linha 7: São criadas duas variáveis do tipo inteiro, uma chamada num e a outra cont, ambas recebendod o valor de 0.

>4- Linha 8: Ocorre a chamada de um método recursivo com nome Menu, a qual recebe quatro parâmetros, sendo eles respectivamente sc, num, vet e cont.

>5- Linha 9: Ocorre o fechamendo do Scanner.

## Relato Step Into
>1- Breakpoint Linha 5: Ocorre a instanciação do Scanner.

>2- Linha 6: A criação de um vetor chamado vet, o qual armazena dados do tipo inteiro com tamanho 5.

>3- Linha 7: Criação de duas variáveis inteiras, num e cont, onde ambas recebem o o valor 0.

>4- Linha 8: Ocorre a chamada do método recursivo Menu(sc,num, vet, cont), o qual recebe por parâmetros o scanner, e as variáveis num, vet e cont.

>5- Linha 13: Exibição da mensagem "preencha o vetor de 5 números: ".

>6- Linha 14: O vetor vet recebe como valor a entrada do usuário através da variável num, a qual define a posição do valor definido pelo usuário (vet[num]).

>(introdução dos dados solicitados pelo scanner)

>7- Linha 15: num recebe +1 em seu valor (valor atual: num = 0).

>8- Linha 16: Ocorre a verificação do if(num == 5), que no momento é falsa (valor atual: num = 1).

>9- Linha 20: Chama novamente o método recursivo Menu(sc, num, vet, cont) para um looping.

>10- Linha 13: Exibição da mensagem "preencha o vetor de 5 números: ".

>11- Linha 14: O vetor vet[num] recebe como valor a entrada do usuário.

>(introdução dos dados solicitados pelo scanner)

>12- Linha 15: num recebe +1 em seu valor (valor atual: num = 1)

>13- Linha 16: Ocorre novamente a verificação do if(num == 5), que no momento é falsa (valor atual: num = 2).

>14- Linha 20: Chama novamente o método recursivo Menu(sc, num, vet, cont) para um looping.

>15- Linha 13: Exibição da mensagem "preencha o vetor de 5 números: ".

>16- Linha 14: O vetor vet[num] recebe como valor a entrada do usuário.

>(introdução dos dados solicitados pelo scanner)

>17- Linha 15: num recebe +1 em seu valor (valor atual: num = 2)

>18- Linha 16: Ocorre novamente a verificação do if(num == 5), que no momento é falsa (valor atual: num = 3).

>19- Linha 20: Chama novamente o método recursivo Menu(sc, num, vet, cont) para um looping.

>20- Linha 13: Exibição da mensagem "preencha o vetor de 5 números: ".

>21- Linha 14: O vetor vet[num] recebe como valor a entrada do usuário.

>(introdução dos dados solicitados pelo scanner)

>22- Linha 15: num recebe +1 em seu valor (num = 3)

>23- Linha 16: Ocorre novamente a verificação do if(num == 5), que no momento é falsa (valor atual: num = 4).

>24- Linha 20: Chama novamente o método recursivo Menu(sc, num, vet, cont) para um looping.

>26- Linha 13: Exibição da mensagem "preencha o vetor de 5 números: ".

>27- Linha 14: O vetor vet[num] recebe como valor a entrada do usuário.

>(introdução dos dados solicitados pelo scanner)

>28- Linha 15: num recebe +1 em seu valor (num = 4)

>29- Linha 16: Ocorre novamente a verificação do if(num == 5), que agora finalmente é verdadeira (valor atual: num = 5).

>30- Linha 17: Chama o método Mostrar(cont, vet), passando por parâmetros o valor de vet e cont (valor atual de cont: cont = 0).

>31- Linha 24: Ocorre a exibição do vet[cont] (no caso vet[0]).

>32- Linha 25: cont recebe +1 em seu valor (cont = 0).

>33- Linha 26: Ocorre a verificação do if(cont == 5), que no momento é falsa (valor atual: cont = 1).

>34-  Linha 29: Chama novamente o método recursivo Mostrar(cont, vet) para um looping.

>35- Linha 24: Ocorre a exibição do vet[cont] (no caso vet[1]).

>36- Linha 25: cont recebe +1 em seu valor (cont = 1).

>37- Linha 26: Ocorre a verificação do if(cont == 5), que no momento é falsa (valor atual: cont = 2).

>38- Linha 29: Chama novamente o método recursivo Mostrar(cont, vet) para um looping.

>39- Linha 24: Ocorre a exibição do vet[cont] (no caso vet[2]).

>40- Linha 25: cont recebe +1 em seu valor (cont = 2).

>41- Linha 26: Ocorre a verificação do if(cont == 5), que no momento é falsa (valor atual: cont = 3).

>42- Linha 29: Chama novamente o método recursivo Mostrar(cont, vet) para um looping.

>43- Linha 24: Ocorre a exibição do vet[cont] (no caso vet[3]).

>44- Linha 25: cont recebe +1 em seu valor (cont = 3).

>45- Linha 26: Ocorre a verificação do if(cont == 5), que no momento é falsa (valor atual: cont = 4).

>46- Linha 29: Chama novamente o método recursivo Mostrar(cont, vet) para um looping.

>47- Linha 24: Ocorre a exibição do vet[cont] (no caso vet[4]).

>48- Linha 25: cont recebe +1 em seu valor (cont = 4).

>49- Linha 26: Ocorre a verificação do if(cont == 5), que é verdadeira (valor atual: cont = 5).

>50- Linha 27: Ocorre o return do método Mostrar(cont,vet).

>51- Linha 30: Vai para o fechamento das chaves do método atual Mostrar(cont,vet).

>52- Linha 18: Ocorre o return do método Menu(sc,num, vet, cont).

>53- Linha 21: Vai para o fechamento das chaves do método atual Menu(sc,num, vet, cont).

>54- Linha 9: Ocorre o fechamento do Scanner (sc.close()).

>55- Linha 10: Vai para o fechamento das chaves do public static void main(String[] args).

>Fim do programa

## Relato de Step Into e Step Over com Step Out
>1- Breakpoint Linha 5: O Scanner é instanciado.

>2- (Step Over) Linha 6: É criado um vetor do tipo inteiro, chamado vet, que armazena até 5 valores.  

>3- (Step Over) Linha 7: São criadas duas variáveis do tipo inteiro, uma chamada num e a outra cont, ambas recebendod o valor de 0.

>4- (Step Over) Linha 8: Ocorre a chamada de um método recursivo com nome Menu, a qual recebe quatro parâmetros, sendo eles respectivamente sc, num, vet e cont.

>5- (Step Into) Linha 13: É mostrada a mensagem "preencha o valor de 5 números: ".

>6- (Step Over) Linha 14: O vetor vet recebe como valor inteiro a entrada do usuário.

>7- (Step Over) Linha 15: A variável num recebe 1 em seu valor.

>8- (Step Over) linha 16: É verificado através do if, uma condicional, se num é igual a 5. Como a condicional é falsa, o bloco de código dentro do if não é executado.

>9- (Step Over) Linha 20: É chamado o método recursivo Menu.

>10- (Step Into) Linha 13: É mostrada a mensagem "preencha o valor de 5 números: ".

>11- (Step Over) Linha 14: O vetor vet recebe como valor inteiro a entrada do usuário.

>12- (Step Over) Linha 15: A variável num recebe 1 em seu valor, portanto, num agora vale 2.

>13- (Step Over) Linha 16: É verificado através do if, uma condicional, se num é igual a 5. Como a condicional é falsa, o bloco de código dentro do if não é executado.

>15- (Step OVer) Linha 20: É chamado o método recursivo Menu.

>16- (Step Into) Linha 13: É mostrada a mensagem "preencha o valor de 5 números: ".

>17- (Step Over) Linha 14: O vetor vet recebe como valor inteiro a entrada do usuário.

>18- (Step Over) Linha 15: A variável num recebe 1 em seu valor, portanto, num agora vale 3.

>19- (Step Over) Linha 16: É verificado através do if, uma condicional, se num é igual a 5. Como a condicional é falsa, o bloco de código dentro do if não é executado.

>20- (Step OVer) Linha 20: É chamado o método recursivo Menu.

>21- (Step Into) Linha 13: É mostrada a mensagem "preencha o valor de 5 números: ".

>22- (Step Over) Linha 14: O vetor vet recebe como valor inteiro a entrada do usuário.

>23- (Step Over) Linha 15: A variável num recebe 1 em seu valor, portanto, num agora vale 4.

>25- (Step Over) Linha 16: É verificado através do if, uma condicional, se num é igual a 5. Como a condicional é falsa, o bloco de código dentro do if não é executado.

>26- (Step OVer) Linha 20: É chamado o método recursivo Menu.

>27- (Step Into) Linha 13: É mostrada a mensagem "preencha o valor de 5 números: ".

>28- (Step Over) Linha 14: O vetor vet recebe como valor inteiro a entrada do usuário.

>29- (Step Over) Linha 15: A variável num recebe 1 em seu valor, portanto, num agora vale 5.

>30- (Step Over) Linha 16: É verificado através do if, uma condicional, se num é igual a 5, sendo a condicional verdadeira.

>31- (Step OVer) Linha 17: É chamado um método recursivo chamado Mostrar, que recebe os parâmetros cont e vet, eles respectivamente com o valor de 0 e os 5 valores dados pelo usuário.

>32- (Step Into) Linha 24: É mostrado uma mensagem que mostra o valor do vetor no índice com o mesmo valor do cont, neste caso, com o valor de 0.

>33- (Step Out) Linha 18: É retornado o valor do método recursivo Mostrar. Além disso, após o Step Out, o método foi executado automáticamente, onde foi mostrado o valor do vetor de acordo com o índice cont, com cont aumentando 1 e cada vez que era verificado que ele não valesse 5, era executado o método de novo, até o ponto onde foi retornado.

>34- (Step Over) Linha 21: Fechamendo com chaves do método recursivo Menu.

>35- (Step Over) Linha 9: Fechamento do Scanner.

>36- (Step Over) Linha 10: Fechamento com chaves do método de execução principal main.

>Fim do programa.
