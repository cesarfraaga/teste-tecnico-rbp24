public class Verificar {
    public boolean pertenceOuNao(int numero) {
        int primeiro = 0;
        int segundo = 1;

        if (numero == primeiro || numero == segundo) {
            return true;
        }

        int proximo;
        while (true) {
            proximo = primeiro + segundo;
            if (proximo == numero) {
                return true;
                
            } else if (proximo > numero) {
                return false;
            }

            primeiro = segundo;
            segundo = proximo;
        }
    }
}
