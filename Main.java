import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int selecao;
        int contador = 0;

        // Seleção de atividade:
        do {
            System.out.println("0. Sair");
            System.out.println("1. Exercício 1");
            System.out.println("2. Exercício 2");
            System.out.println("3. Exercício 3");
            System.out.println("4. Exercício 4");
            System.out.println("5. Exercício 5");
            System.out.println("6. Exercício 6");
            System.out.println("7. Exercício 7");
            System.out.println("8. Exercício 8");
            System.out.println("9. Exercício 9");
            System.out.println("10. Exercício 10");

            System.out.print("Digite o número da atividade desejada (1-10). Digite 0 caso queira sair: ");
            selecao = input.nextInt();
            if (selecao == 0) {
                System.out.print("Programa Encerrado");
            } else if (selecao < 0 || selecao > 10) {
                System.out.println("Número inválido digitado.");
            } else if (selecao == 1) {
                // Exercicio 1
                int numero_1;
                int resultado_1;

                System.out.print("Digite um número: ");

                numero_1 = input.nextInt();
                resultado_1 = (numero_1 % 2);

                if (resultado_1 == 0) {
                    System.out.println("O número digitado é par");
                } else {
                    System.out.println("O número digitado é impar");
                }

            } else if (selecao == 2) {
                // Exercicio 2
                int numero1_2;
                int numero2_2;

                System.out.print("Digite o primeiro número: ");
                numero1_2 = input.nextInt();
                System.out.print("Digite o segundo número: ");
                numero2_2 = input.nextInt();

                if (numero1_2 > numero2_2) {
                    System.out.println("O número " + numero1_2 + " é maior");
                } else if (numero2_2 > numero1_2) {
                    System.out.println("O número " + numero2_2 + " é maior");
                } else {
                    System.out.print("Os números " + numero1_2 + " e " + numero2_2 + " são iguais");
                }

            } else if (selecao == 3) {
                // Exercicio 3
                int opcao_3;
                double resultado_3;
                double numero1_3;
                double numero2_3;

                System.out.println("1. Soma");
                System.out.println("2. Subtração");
                System.out.println("3. Multiplicação");
                System.out.println("4. Divisão");
                System.out.print("Escolha uma das opções acima: ");

                opcao_3 = input.nextInt();

                System.out.println("Digite o primeiro número: ");
                numero1_3 = input.nextDouble();

                System.out.println("Digite o segundo número: ");
                numero2_3 = input.nextDouble();

                if (opcao_3 == 1) {
                    resultado_3 = numero1_3 + numero2_3;
                    System.out.println("A soma dos números é: " + resultado_3);
                } else if (opcao_3 == 2) {
                    resultado_3 = numero1_3 - numero2_3;
                    System.out.println("A substração dos números é: " + resultado_3);
                } else if (opcao_3 == 3) {
                    resultado_3 = numero1_3 * numero2_3;
                    System.out.println("A multiplicação dos números é: " + resultado_3);
                } else if (opcao_3 == 4) {
                    if (numero2_3 == 0) {
                        System.out.println("Não é possível dividir por 0.");
                    } else {
                        resultado_3 = numero1_3 / numero2_3;
                        System.out.println("A divisão dos números é: " + resultado_3);
                    }
                } else {
                    System.out.println("Opção inválida.");
                }

            } else if (selecao == 4) {
                // Exercicio 4
                double nota4;

                do {
                    System.out.print("Escreva um número entre 0 a 100:");
                    nota4 = input.nextDouble();
                } while (nota4 < 0 || nota4 > 100);
                System.out.print("Sua nota é: " + nota4);

            } else if (selecao == 5) {
                // Exercicio 5
                int maior_numero5 = 0;
                int menor_numero5 = 0;

                System.out.print("Informe um número ou digite 0 para encerrar: ");
                int numero5 = input.nextInt();
                if (numero5 > maior_numero5 && menor_numero5 == 0) {
                    maior_numero5 = numero5;
                    menor_numero5 = numero5;
                    System.out.println("O maior número já digitado foi: " + maior_numero5);
                    System.out.println("O menor número já digitado foi: " + menor_numero5);
                } else if (numero5 > maior_numero5) {
                    maior_numero5 = numero5;
                    System.out.println("O maior número já digitado foi: " + maior_numero5);
                    System.out.println("O menor número já digitado foi: " + menor_numero5);
                } else if (numero5 < menor_numero5) {
                    menor_numero5 = numero5;
                    System.out.println("O maior número já digitado foi: " + maior_numero5);
                    System.out.println("O menor número já digitado foi: " + menor_numero5);
                }
                while (numero5 != 0) {
                    System.out.print("Informe um número ou digite 0 para encerrar: ");
                    numero5 = input.nextInt();
                    if (numero5 > maior_numero5 && menor_numero5 == 0) {
                        maior_numero5 = numero5;
                        menor_numero5 = numero5;
                        System.out.println("O maior número já digitado foi: " + maior_numero5);
                        System.out.println("O menor número já digitado foi: " + menor_numero5);
                    } else if (numero5 > maior_numero5) {
                        maior_numero5 = numero5;
                        System.out.println("O maior número já digitado foi: " + maior_numero5);
                        System.out.println("O menor número já digitado foi: " + menor_numero5);
                    } else if (numero5 < menor_numero5 && numero5 != 0) {
                        menor_numero5 = numero5;
                        System.out.println("O maior número já digitado foi: " + maior_numero5);
                        System.out.println("O menor número já digitado foi: " + menor_numero5);
                    } else {
                        System.out.println("O maior número já digitado foi: " + maior_numero5);
                        System.out.println("O menor número já digitado foi: " + menor_numero5);
                    }
                }

            } else if (selecao == 6) {
                // Exercicio 6
                int opcao_6;
                double saldo = 1000;
                double valor_6;

                System.out.println("Bem vindo ao Banco!");

                do {
                    System.out.println("1. Depositar");
                    System.out.println("2. Sacar");
                    System.out.println("3. Ver Saldo");
                    System.out.println("4. Sair");
                    System.out.print("Por favor selecione uma das opções acima: ");
                    opcao_6 = input.nextInt();

                    if (opcao_6 == 1) {
                        System.out.print("Digite o valor a ser depositado:");
                        valor_6 = input.nextDouble();
                        if (valor_6 == 0) {
                            do {
                                System.out.print("Esse valor de depósito é inválido, tente digitar outro: ");
                                valor_6 = input.nextDouble();
                            } while (valor_6 == 0);
                        } else if (valor_6 < 0) {
                            do {
                                System.out.print("Esse valor de depósito é inválido, tente digitar outro: ");
                                valor_6 = input.nextDouble();
                            } while (valor_6 < 0);
                        }
                        saldo = saldo + valor_6;
                    } else if (opcao_6 == 2) {
                        System.out.print("Digite o valor a ser sacado: ");
                        valor_6 = input.nextDouble();
                        if (valor_6 == 0) {
                            do {
                                System.out.print("Esse valor de saque é inválido, tente digitar outro: ");
                                valor_6 = input.nextDouble();
                            } while (valor_6 == 0);
                        } else if (valor_6 > saldo) {
                            do {
                                System.out.print("Seu saldo de R$" + saldo + " é insuficiente para essa transação, tente digitar outro: ");
                                valor_6 = input.nextDouble();
                            } while (valor_6 > saldo);
                        } else if (valor_6 < 0) {
                            do {
                                System.out.print("Esse valor de saque é inválido, tente digitar outro: ");
                                valor_6 = input.nextDouble();
                            } while (valor_6 < 0);
                        }
                        saldo = saldo - valor_6;
                    } else if (opcao_6 == 3) {
                        System.out.println("O seu saldo atual é de: R$" + saldo);
                    } else {
                        System.out.println("Opção inválida.");
                    }
                } while (opcao_6 != 4);
                System.out.println("Seu saldo final foi de: R$" + saldo);

            } else if (selecao == 7) {
                // Exercicio 7
                int categoria_7;
                double valor_7;
                double desconto_7;
                double total_7;

                System.out.print("Por favor, digite o valor da compra: R$");
                valor_7 = input.nextDouble();

                System.out.println("Categorias:");
                System.out.println("1. Comum");
                System.out.println("2. Premium");
                System.out.println("3. Funcionário");
                System.out.print("Selecione a categoria do cliente:");
                categoria_7 = input.nextInt();

                do {
                    if (categoria_7 == 1) {
                        total_7 = valor_7 * 0.95;
                        desconto_7 = valor_7 - total_7;
                        System.out.println("O valor da total compra é R$" + total_7 + " e o desconto de 5% foi de R$" + desconto_7);
                        break;
                    } else if (categoria_7 == 2) {
                        total_7 = valor_7 * 0.90;
                        desconto_7 = valor_7 - total_7;
                        System.out.println("O valor total da compra é R$" + total_7 + " e o desconto de 10% foi de R$" + desconto_7);
                        break;
                    } else if (categoria_7 == 3) {
                        total_7 = valor_7 * 0.85;
                        desconto_7 = valor_7 - total_7;
                        System.out.println("O valor total da compra é R$" + total_7 + " e o desconto de 15% foi de R$" + desconto_7);
                        break;
                    } else {
                        System.out.println("Categoria inválida.");
                        System.out.println("Por favor, selecione uma dessas opções de categorias:");
                        System.out.println("1. Comum");
                        System.out.println("2. Premium");
                        System.out.println("3. Funcionário");
                        System.out.print("Digite a categoria do cliente:");
                        categoria_7 = input.nextInt();
                    }

                } while (categoria_7 > 0 && categoria_7 < 4);

            } else if (selecao == 8) {
                //Exercicio 8
                int contador_8 = 0;
                int positivos_8 = 0;
                int negativos_8 = 0;
                int zeros_8 = 0;
                int numero_8;

                do {
                    System.out.print("Digite um número inteiro (" + (contador_8 + 1) + "/10) " + " : ");
                    numero_8 = input.nextInt();
                    if (numero_8 < 0) {
                        negativos_8++;
                        contador_8++;
                    } else if (numero_8 > 0) {
                        positivos_8++;
                        contador_8++;
                    } else if (numero_8 == 0) {
                        zeros_8++;
                        contador_8++;
                    }

                } while (contador_8 != 10);
                System.out.println("Os 10 números foram digitados, entre eles:");
                if (positivos_8 > 1) {
                    System.out.println(positivos_8 + " são positivos.");
                } else if (positivos_8 == 1) {
                    System.out.println(positivos_8 + " é positivo.");
                } else {
                    System.out.println("Nenhum número positivo foi digitado.");
                }

                if (negativos_8 > 1) {
                    System.out.println(negativos_8 + " são negativos.");
                } else if (negativos_8 == 1) {
                    System.out.println(negativos_8 + " é negativo.");
                } else {
                    System.out.println("Nenhum número negativo foi digitado.");
                }

                if (zeros_8 > 1) {
                    System.out.println("O número 0 foi digitado " + zeros_8 + " vezes.");
                } else if (positivos_8 == 1) {
                    System.out.println("O número 0 foi digitado " + zeros_8 + " vez.");
                } else {
                    System.out.println("O número 0 não foi digitado nenhuma vez.");
                }

            } else if (selecao == 9) {
                // Exercicio 9
                int n_8;
                int soma;

                System.out.print("Digite um número: ");
                n_8 = input.nextInt();
                soma = n_8 * (n_8 + 1) / 2;
                System.out.print("A soma de " + n_8 + " com seus antecessores até 1 é " + soma);

            } else if (selecao == 10) {
                // Atividade 10
                int n_10, soma_10;
                int contagem_10;

                System.out.print("Por favor, digite um número inteiro maior que 0: ");
                n_10 = input.nextInt();

                do {
                    if (n_10 <= 0) {
                        System.out.print("O número digitado é inválido, favor digitar outro número: ");
                        n_10 = input.nextInt();
                    } else {
                        soma_10 = n_10 * (n_10 + 1) / 2;
                        contagem_10 = n_10;
                        System.out.println("Contagem regressiva: ");
                        do {
                            System.out.print(contagem_10 + " ");
                            contagem_10--;
                        } while (contagem_10 >= 1);
                        System.out.println("");
                        System.out.println("Soma dos números: " + soma_10);
                    }

                } while (n_10 <= 0);
            }
        } while (selecao < 0 || selecao > 10);
    }
}