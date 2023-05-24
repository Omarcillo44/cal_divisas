public class calculadora {

    double peso = 17.80, dolar = 1, euro = 0.92;
    double resultado, tipo_cambio;
    double ekisde(double valor, int divisa1, int divisa2){

        if (divisa2 == 1){

            valor *= peso;

        } else if (divisa2 == 2){

            valor *= dolar;

        } else if (divisa2 == 3){

            valor *= euro;

        }

        if (divisa1 == 1 ){


            resultado = valor / peso;

        } else if (divisa1 == 2 ){


            resultado = valor / dolar;

        } else if (divisa1 == 3){


            resultado = valor / euro;

        }


        return resultado;
    }


}
