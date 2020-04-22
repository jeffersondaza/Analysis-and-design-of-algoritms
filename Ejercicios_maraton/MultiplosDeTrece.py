print("ingrese el valor de x")
x=input()
x=int(x)

print("ingrese el valor de y")
y=input()
y=int(y)

resultado=0

for i in range(x,y+1):
	if i%13>0:
		resultado=resultado+i 

print("El resultado es: ",resultado)
