
public class Circulo {
    private double raio;

    public Circulo() {
    }

    // Construtor da classe Circulo
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular área do círculo
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    // Método para calcular perímetro do círculo
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public static void main(String[] args) {
        // Criando uma instância de Circulo
        Circulo circulo1 = new Circulo(5.0);

        // Calculando e exibindo área e perímetro do círculo
        System.out.println("Área do círculo: " + circulo1.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo1.calcularPerimetro());
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}