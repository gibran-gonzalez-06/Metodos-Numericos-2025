import math

def error_absoluto(valor_real, valor_aproximado):
    return abs(valor_real - valor_aproximado)
def error_relativo(valor_real, valor_aproximado):
    ea = error_absoluto(valor_real, valor_aproximado)
    return ea / abs (valor_real)

def cifras_significativas(numero):
    numero = str(numero).strip()
    if '.' in numero: 
        numero = numero.replace('.', '')
        numero = numero.lstrip('0')

        if numero == '':
            return 0
        return len(numero)
def propagacion_suma(error1, error2):
    return error1 + error2

def propagacion_multiplicacion(valor1, valor2, error1, error2):
    error_relativo_total = (error1 / abs(valor1)) + (error2 / abs(valor2))
    resultado = valor1 * valor2
    error_absoluto_total = abs(resultado) * error_relativo_total
    return resultado, error_absoluto_total

print("Programa de errores y cifras significativas")
print("-----------------------------------")

print("\n1. Error Absoluto y Relativo")
valor_real = float(input("Ingrese el valor real: "))
valor_aproximado = float(input("Ingrese el valor aproximado: "))
ea = error_absoluto(valor_real, valor_aproximado)
er = error_relativo(valor_real, valor_aproximado)
print ("Error Absoluto: ", ea)
print ("Error Relativo: ", er)
print ("Error relativo porcentual: ", er * 100, "%")
print("\n2. Cifras Significativas")
numero = input("Ingrese un número: ")
cs = cifras_significativas(numero)

print("Cantidad de cifras significativas: ", cs)
print("\n3. Propagacion de error en suma")
error1 = float(input("Ingrese el error absoluto del primer valor: "))
error2 = float(input("Ingrese el error absoluto del segundo valor: "))
error_suma = propagacion_suma(error1, error2)

print("Error propagado en la suma: ", error_suma)

print("\n4. Propagacion de error en multiplicacion")
valor1 = float(input("Ingrese el primer valor: "))
valor2 = float(input("Ingrese el segundo valor: "))
error1 = float(input("Ingrese el error absoluto del primer valor: "))
error2 = float(input("Ingrese el error absoluto del segundo valor: "))

resultado, error_mult = propagacion_multiplicacion(valor1, valor2, error1, error2)
print("Resultado de la multiplicación: ", resultado)
print("Error propagado en la multiplicación: ", error_mult)

