def vueltasProgDin(listaValoresMonedas,vueltas,minMonedas,monedasUsadas):
   for pesos in range(vueltas+1):
      conteoMonedas = pesos
      nuevaMoneda = 1
      for j in [m for m in listaValoresMonedas if m <= pesos]:
            if minMonedas[pesos-j] + 1 < conteoMonedas:
               conteoMonedas = minMonedas[pesos-j]+1
               nuevaMoneda = j
      minMonedas[pesos] = conteoMonedas
      monedasUsadas[pesos] = nuevaMoneda
   return minMonedas[vueltas]

def imprimirMonedas(monedasUsadas,vueltas):
   moneda = vueltas
   while moneda > 0:
      estaMoneda = monedasUsadas[moneda]
      print(estaMoneda)
      moneda = moneda - estaMoneda

def main():
    cantidad = 1350
    listaM = [50,100,200,500,1000]
    monedasUsadas = [0]*(cantidad+1)
    conteoMonedas = [0]*(cantidad+1)

    print("Dar unas vueltas de",cantidad,"pesos requiere")
    print(vueltasProgDin(listaM,cantidad,conteoMonedas,monedasUsadas),"monedas")
    print("De los siguientes valores")
    imprimirMonedas(monedasUsadas,cantidad)
main()


