class Arbol:
    def __init__(self, elemento):
        self.hijos = []
        self.elemento = elemento

abuela = "ABUELA"
madre = "MADRE"
tia1 = "TIA1"
tia2 = "TIA2"
hijo1 = "HIJO1"
hijo2 = "HIJO2"
hijo3 = "HIJO3"
sobrino = "SOBRINO"

def agregarElemento(arbol, elemento, elementoPadre):
    subarbol = buscarSubarbol(arbol, elementoPadre);
    subarbol.hijos.append(Arbol(elemento))

def buscarSubarbol(arbol, elemento):
    if arbol.elemento == elemento:
        return arbol
    for subarbol in arbol.hijos:
        arbolBuscado = buscarSubarbol(subarbol, elemento)
        if (arbolBuscado != None):
            return arbolBuscado
    return None

arbol = Arbol(abuela)
agregarElemento(arbol, tia1, abuela)
agregarElemento(arbol, tia2, abuela)
agregarElemento(arbol, sobrino, tia2)
agregarElemento(arbol, madre, abuela)
agregarElemento(arbol, hijo1, madre)
agregarElemento(arbol, hijo2, madre)
agregarElemento(arbol, hijo3, madre)


def Profundidad(arbol, funcion):
    funcion(arbol.elemento)
    for hijo in arbol.hijos:
        Profundidad(hijo, funcion)

def printElement(element):
    print (element)
Profundidad(arbol, printElement)


