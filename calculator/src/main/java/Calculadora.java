public class Calculadora {
    public double somar(double valorA, double valorB){
        return valorA + valorB;
    }

    public double subtrair(double valorA, double valorB){
        return valorA - valorB;
    }

    public double multiplicar(double valorA, double valorB){
        return valorA * valorB;
    }

    public double dividir(double valorA, double valorB){
        return valorA / valorB;
    }

    public double exponenciar(double valorA){
        return valorA * valorA;
    }

    public double tirarRaizQuadrada(double valorA){
        return Math.sqrt(valorA);
        // o professor mandou estudar a biblioteca Math, e descobri que já vem instalada no Java
    }
}
