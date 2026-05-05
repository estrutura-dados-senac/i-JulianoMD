class Resposta01VetorSupermercado {
    public static void main(String[] args) {
        float[] caixa = new float[5];
        caixa[0] = 1000;
        caixa[1] = 1200;
        caixa[2] = 2000;
        caixa[3] = 3200;
        caixa[4] = 3100;

        // total vendido no dia
        float total = 0;
        for (int i = 0; i  < caixa.length; i++) {
            total += caixa[i];
        }


        // media por caixa
        float media = (float) total / caixa.length;

        // qual caixa teve a maior venda
        float maiorValor = caixa[0];
        float maiorCaixa = 0;
        for (int i = 1; i  < caixa.length - 1; i++) {
            maiorCaixa = (caixa[i] > maiorValor) ? i : 0;
            maiorValor = (caixa[i] > maiorValor) ? caixa[i] : maiorValor;
        }

        // qual caixa teve a menor venda
        float menorValor = caixa[0];
        float menorCaixa = 0;
        for (int i = 1; i  < caixa.length - 1; i++) {
            menorCaixa = (caixa[i] < menorValor) ? i : 0;
            menorValor = (caixa[i] < menorValor) ? caixa[i] : menorValor;
        }

        System.out.printf("Total do dia: R$%.2f\n", total);
        System.out.printf("Media por caixa: R$%.2f\n", media);
        System.out.printf("Maior venda: Caixa %d com R$%.2f\n", maiorCaixa, maiorValor);
        System.out.printf("Menor venda: Caixa %d com R$%.2f\n", menorCaixa, menorValor);

    }
}
