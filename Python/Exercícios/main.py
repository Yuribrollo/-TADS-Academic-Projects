nome_vendedor = input("Nome do vendedor: ")
salario_fixo = float(input("Salário fixo: "))
montante = float(input("Montante de vendas: "))

comissao = montante * 0.15

valor_a_receber = salario_fixo + comissao

print(f"O vendedor {nome_vendedor} receberá: R$ %.2f" %valor_a_receber)