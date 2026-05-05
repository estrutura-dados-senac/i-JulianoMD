class Resposta01VetorSupermercado {
    public static void main(String[] args) {
        double[] caixa = new double[5];
        caixa[0] = 1000f;
        caixa[1] = 1200f;
        caixa[2] = 2000f;
        caixa[3] = 3200f;
        caixa[4] = 3100f;

        // total vendido no dia
        double total = 0f;
        for (int i = 0; i  < caixa.length; i++) {
            total += caixa[i];
        }


        // media por caixa
        double media = total / caixa.length;

        // qual caixa teve a maior venda
        double maiorValor = caixa[0];
        double maiorCaixa = 0f;
        for (int i = 1; i  < caixa.length - 1; i++) {
            maiorCaixa = (caixa[i] > maiorValor) ? i : 0f;
            maiorValor = (caixa[i] > maiorValor) ? caixa[i] : maiorValor;
        }

        // qual caixa teve a menor venda
        double menorValor = caixa[0];
        double menorCaixa = 0f;
        for (int i = 1; i  < caixa.length - 1; i++) {
            menorCaixa = (caixa[i] < menorValor) ? i : 0f;
            menorValor = (caixa[i] < menorValor) ? caixa[i] : menorValor;
        }

        System.out.printf("Total do dia: %.2f\n", total);
        System.out.printf("Media por caixa: %.2f\n", media);
        System.out.printf("Maior venda: Caixa %.0f com %.2f\n", maiorCaixa, maiorValor);
        System.out.printf("Menor venda: Caixa %.0f com %.2f\n", menorCaixa, menorValor);

    }
}
