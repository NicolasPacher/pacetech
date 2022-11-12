algoritmo "entrega algoritmo semana 4"
// Função :
// Autor : Nicolas Pacher
// Data : 11/11/2022
// Seção de Declarações
var
temperaturaCelsius, temperaturaFahrenheit: real
reais , dolares : real
menu: literal
resultado: real

inicio
repita

   Escreval("Escolha uma das opções:")
   Escreval("1 - Converter Celsius para Fahrenheit")
   Escreval("2 - Converter Fahrenheit para Celsius")
   Escreval("3 - Converter Reais para Dolares")
   Escreval("4 - Converter Dolares para Reais")
   Escreval("5 - Sair")
   leia(menu)

   Escolha menu
   caso "1"
      Escreval("Insira a temperatura em Celsius")
      leia(temperaturaCelsius)
      TemperaturaFahrenheit <- (TemperaturaCelsius * 1.8) + 32
      Escreval("A temperatura em Fahrenheit é: ", TemperaturaFahrenheit:1:2, " ° F")
   caso "2"
      Escreval("Insira a temperatura em Fahrenheit")
      leia(TemperaturaFahrenheit)
      TemperaturaCelsius <- (TemperaturaFahrenheit - 32) / 1.8
      Escreval("A temperatura em Celsius é: ", TemperaturaCelsius:1:2, " ° C")
   caso "3"
      Escreval("Informe a cotação do dolares")
      leia(dolares)
      Escreval("informe quantos reais serão convertido")
      leia(reais)
      resultado <- reais/dolares
      Escreval("O resultado da cotação é: ",resultado:1:2)
   caso "4"
      Escreval("Informe a cotação do dolares")
      leia(dolares)
      Escreval("informe quantos reais serão convertido")
      leia(reais)
      resultado <- dolares*reais
      Escreval("O resultado da cotação é: ",resultado:1:2)



   fimescolha

ate menu= "5"


fimalgoritmo
