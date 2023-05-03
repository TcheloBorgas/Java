// Marcelo Henrique Góes da Costa Borgas RM --> 98893
// Daniel Alves de Souza RM -->252310

import java.util.Scanner;


public class Temperatura {
    
    private double[][] temperaturas;

    public Temperatura() {
        this.temperaturas = new double[0][0];
    }

    public void solicitarPeriodo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o numero de dias a serem mapeados: ");
        int dias = scanner.nextInt();
        System.out.print("Informe o numero de semanas a serem mapeadas: ");
        int semanas = scanner.nextInt();
        this.temperaturas = new double[dias][semanas];
    }

    public void mapearTemperaturas() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[0].length; j++) {
                System.out.println("");
                System.out.printf("Informe a temperatura para o dia %d da semana %d: ", i + 1, j + 1);
                System.out.println(' ');
                temperaturas[i][j] = scanner.nextDouble();
            }
        }
    }

    public double getMaiorTemperatura() {
        double maior = this.temperaturas[0][0];
        for (int i = 0; i < this.temperaturas.length; i++) {
            for (int j = 0; j < this.temperaturas[0].length; j++) {
                if (this.temperaturas[i][j] > maior) {
                    maior = this.temperaturas[i][j];
                }
            }
        }
        return maior;
    }

    public double getMenorTemperatura() {
        double menor = this.temperaturas[0][0];
        for (int i = 0; i < this.temperaturas.length; i++) {
            for (int j = 0; j < this.temperaturas[0].length; j++) {
                if (this.temperaturas[i][j] < menor) {
                    menor = this.temperaturas[i][j];
                }
            }
        }
        return menor;
    }

    public double[] getTemperaturasNegativas() {
        int countNegativas = 0;
        for (int i = 0; i < this.temperaturas.length; i++) {
            for (int j = 0; j < this.temperaturas[0].length; j++) {
                if (this.temperaturas[i][j] < 0) {
                    countNegativas++;
                }
            }
        }
        double[] negativas = new double[countNegativas];
        int index = 0;
        for (int i = 0; i < this.temperaturas.length; i++) {
            for (int j = 0; j < this.temperaturas[0].length; j++) {
                if (this.temperaturas[i][j] < 0) {
                    negativas[index] = this.temperaturas[i][j];
                    index++;
                }
            }
        }
        return negativas;
    }

    public double getTemperaturaMedia() {
        double soma = 0;
        for (int i = 0; i < this.temperaturas.length; i++) {
            for (int j = 0; j < this.temperaturas[0].length; j++) {
                soma += this.temperaturas[i][j];
            }
        }
        return soma / (this.temperaturas.length * this.temperaturas[0].length);
    }

    public void imprimirTemperaturas() {
        for (int i = 0; i < this.temperaturas.length; i++) {
            for (int j = 0; j < this.temperaturas[0].length; j++) {
                
                System.out.printf("Temperatura para o dia %d da semana %d: %.2f%n", i + 1, j + 1, this.temperaturas[i][j]);
            }
        }
    }

    public void testarPrograma() {
        solicitarPeriodo();
        mapearTemperaturas();
        System.out.println("\nTodas as temperaturas mapeadas:");
        
        imprimirTemperaturas();
        
        System.out.printf("Maior temperatura: %.2f%n", getMaiorTemperatura());

        
        
        System.out.printf("Menor temperatura: %.2f%n", getMenorTemperatura());

        double[] negativas = getTemperaturasNegativas();
        
        System.out.println("Temperaturas negativas:");
        
        for (double temperatura : negativas) {
            
            System.out.printf("%.2f%n", temperatura);
        }
        
        System.out.printf("Temperatura media: %.2f%n", getTemperaturaMedia());
        
    }

    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura();
        temperatura.testarPrograma();
    }
}