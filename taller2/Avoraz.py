denominaciones = [50, 100, 200, 500, 1000]

def devolverValor(cambio, denominaciones):
    vueltas = [0] * len(denominaciones)
    for pos, moneda in enumerate(reversed(denominaciones)):

        while moneda <= cambio:
            cambio = cambio \
                     - moneda
            vueltas[pos] += 1
    return (vueltas)

print(devolverValor(300, denominaciones))
