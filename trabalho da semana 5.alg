algoritmo "ProjetoSemana 5"
// Função :
// Autor : Nicolas Pacher
// Data : 18/11/2022
// Seção de Declarações

var
//vcel: vetor da temp celcius
//vfah: vetor da temp fahrenheit
//vhora: vetor de hora
//auxtemp: auxiliar de temperatura
//auxhora: auxiliar de hora

vCel, vFah: vetor[1..4] de real
vHora:vetor[1..4]de inteiro
i,j,h: inteiro
auxTemp:real
auxHora:inteiro
opcaoMenu:inteiro

procedimento ConversaoCelsiusParaFahrenheit()
inicio

para i de 1 ate 4 faca
   Escreval ("Informe a temperatura em celcius")
   leia(vCel[i])
   vFah[i] <- (vCel[i]*1.8)+32

   Escreval ("Informe a hora")
   leia(vHora[i])
fimpara
para j de 1 ate 4 faca
   para h de 1 ate 4 faca
      se vCel[h] > vCel[j] entao
         auxTemp <- vCel[h]
         auxHora <- vHora[h]
         vCel[h] <- vCel[j]
         vHora[h] <- vHora[j]
         vCel[j] <- auxTemp
         vHora[j] <- auxHora
         
      fimse
   fimpara
fimpara

para i de 1 ate 4 faca
Escreval ("Temperatura",vCel[i], "Celsius,registrada ás:",vHora[i],"horas, corresponde a :",vFah[i],"Graus Fahrenheit")


fimpara

fimprocedimento
Procedimento ConversaoFahrenheitParaCelsius()
Inicio
para i de 1 ate 4 faca
   Escreval ("Informe a temperatura em Fahrenheit")
   leia(vFah[i])
   vCel[i] <-(vFah[i]-32)/1.8

   Escreval ("Informe a hora")
   leia(vHora[i])
fimpara
para j de 1 ate 4 faca
   para h de 1 ate 4 faca
      se vFah[h] > vFah[j] entao
         auxTemp <- vFah[h]
         auxHora <- vHora[h]
         vFah[h] <- vFah[j]
         vHora[h] <- vHora[j]
         vFah[j] <- auxTemp
         vHora[j] <- auxHora
      fimse
   fimpara
fimpara

para i de 1 ate 4 faca
Escreval ("Temperatura",vFah[i], "Fahrenheit,registrada ás:",vHora[i],"horas, corresponde a :",vCel[i],"Graus Celsius")


fimpara


fimprocedimento


inicio

Repita
Escreval ("1- Conversão de Celsius para Fahrenheit")
Escreval ("2- Conversão de Fahrenheit para Celsius")
Escreval ("3- Sair")
leia (opcaoMenu)

Escolha opcaoMenu
Caso 1
ConversaoCelsiusParaFahrenheit()
Caso 2
ConversaoFahrenheitParaCelsius()


fimescolha
ate opcaoMenu = 3

fimalgoritmo
