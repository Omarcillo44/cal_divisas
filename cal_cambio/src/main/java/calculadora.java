public class calculadora {

    double peso = 17.80, dolar = 1, euro = 0.92, resultado = 4;

    public calculadora(double val1, double val2, int divisa1, int divisa2) {

        switch (divisa1) {
            case 1 -> resultado = val2 *= peso;
            case 2 -> resultado = val2 *= dolar;
            case 3 -> resultado = val2 *= euro;
        }

    }

}
