algoritmo "semnome"
// Fun??o :
// Autor :
// Data : 11/11/2022
// Se??o de Declara??es 
var
temperaturaCelsius, temperaturaFahrenheit: real
reais , dolares : real
menu: literal
cotacao: real

inicio
repita

   Escreval("Escolha uma das op??es:")
   Escreval("1 - Converter Celsius para Fahrenheit")
   Escreval("2 - Converter Fahrenheit para Celsius")
   Escreval("3 - Converter Reais para Dolares")
   Escreval("4 - Converter Dolares para Reais")
   Escreval("5 - Sair")
   leia(menu)

   Escolha menu

   //converter celsius para fahrenheit
   caso "1"
      Escreval("Insira a temperatura em Celsius")
      leia(temperaturaCelsius)
      TemperaturaFahrenheit <- (TemperaturaCelsius * 1.8) + 32
      limpatela
      Escreval("")
      Escreval("A temperatura em Fahrenheit ?: ", TemperaturaFahrenheit:1:2, " ? F")
      Escreval("")


   caso "2"
      Escreval("Insira a temperatura em Fahrenheit")
      leia(TemperaturaFahrenheit)
      TemperaturaCelsius <- (TemperaturaFahrenheit - 32) / 1.8
      limpatela
      Escreval("")
      Escreval("A temperatura em Celsius ?: ", TemperaturaCelsius:1:2, " ? C")
      Escreval("")

      //converter real para dolares
   caso "3"
      Escreval("Informe a cota??o")
      leia(cotacao)
      Escreval("informe quantos reais ser?o convertido")
      leia(reais)
      dolares <- reais/cotacao
      limpatela
      Escreval("")
      Escreval("O resultado da cota??o ?: $ ",dolares:1:2)
      Escreval("")

      //converter dolares para real
   caso "4"
      Escreval("Informe a cota??o")
      leia(cotacao)
      Escreval("informe quantos dolares ser?o convertido")
      leia(dolares)
      reais <- dolares*cotacao
      limpatela
      Escreval("")
      Escreval("O resultado da cota??o ?: R$",reais:1:2)
      Escreval("")


   outrocaso
     Escreval("Op??o inv?lida")
     
   fimescolha

ate menu= "5"


fimalgoritmo
