print("inresa la cantidad de numeros que seran ingresados: ")
n=input()
n=int(n)

A=[0 for i in range(n)]

for i in range(n):
     A[i]=int(input("Ingrese un numero: "))

#Metodo Burbuja

for i in range(n-1):
    for j in range(n-1):
        if A[j]>A[j+1]: # si numeroActual > numeroSiguiente
            aux=A[j]
            A[j]=A[j+1]
            A[j+1]=aux

print("Los numero de mayor a menor son:")
for i in range(n):
    print (A[i])
