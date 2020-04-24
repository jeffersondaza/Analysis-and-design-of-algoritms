from collections import deque


class Grafo(object):
    def __init__(self):
        self.relaciones = {}

    def __str__(self):
        return str(self.relaciones)


def agregar(grafo, elemento):
    grafo.relaciones.update({elemento: []})


def relacionar(grafo, elemento1, elemento2):
    relacionDireccional(grafo, elemento1, elemento2)
    relacionDireccional(grafo, elemento2, elemento1)


def relacionDireccional(grafo, origen, destino):
    grafo.relaciones[origen].append(destino)

a = "A"
b = "B"
c = "C"
d = "D"
e = "E"
f = "F"
g = "G"
h = "H"



grafo = Grafo()
agregar(grafo, a)
agregar(grafo, c)
agregar(grafo, b)
agregar(grafo, f)
agregar(grafo, h)
agregar(grafo, g)
agregar(grafo, d)
agregar(grafo, e)

relacionar(grafo, a, b)
relacionar(grafo, a, c)
relacionar(grafo, a, d)
relacionar(grafo, a, c)
relacionar(grafo, c, e)
relacionar(grafo, c, g)
relacionar(grafo, c, d)
relacionar(grafo, g, h)
relacionar(grafo, g, f)
relacionar(grafo, f, b)

def lecturaAncho(grafo, elementoInicial, funcion, cola = deque(), elementosRecorridos = []):
    if not elementoInicial in elementosRecorridos:
        funcion(elementoInicial)
        elementosRecorridos.append(elementoInicial)
        if(len(grafo.relaciones[elementoInicial]) > 0):
            cola.extend(grafo.relaciones[elementoInicial])
    if len(cola) != 0 :
        lecturaAncho(grafo, cola.popleft(), funcion, cola, elementosRecorridos)

def imprimir (elemento):
    print (elemento)

lecturaAncho(grafo, a, imprimir)

