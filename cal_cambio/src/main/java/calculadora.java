public class calculadora {

    //Valor de las diferentes divisas en dólares
    double peso = 17.81, dolar = 1, euro = 0.93;
    double resultado;
    double conversor(double valor1, int divisa1, int divisa2){

        switch (divisa2) {
            case 1 -> valor1 *= peso;
            case 2 -> valor1 *= dolar;
            case 3 -> valor1 *= euro;
        }

        switch (divisa1) {
            case 1 -> resultado = valor1 / peso;
            case 2 -> resultado = valor1 / dolar;
            case 3 -> resultado = valor1 / euro;
        }

        return resultado;
    }


}
