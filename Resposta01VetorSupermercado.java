class Resposta01VetorSupermercado {
    public static void main(String[] args) {
        int[] caixa = new int[5];
        caixa[0] = 1000;
        caixa[1] = 1200;
        caixa[2] = 2000;
        caixa[3] = 3200;
        caixa[4] = 3100;

        // total vendido no dia
        int total = 0;
        for (int i = 0; i  < caixa.length; i++) {
            total += caixa[i];
        }


        // media por caixa
        float media = (float) total / caixa.length;

        // qual caixa teve a maior venda
        int maiorValor = caixa[0];
        int maiorCaixa = 0;
        for (int i = 1; i  < caixa.length - 1; i++) {
            maiorCaixa = (caixa[i] > maiorValor) ? i : 0;
            maiorValor = (caixa[i] > maiorValor) ? caixa[i] : maiorValor;
        }

        // qual caixa teve a menor venda
        int menorValor = caixa[0];
        int menorCaixa = 0;
        for (int i = 1; i  < caixa.length - 1; i++) {
            menorCaixa = (caixa[i] < menorValor) ? i : 0;
            menorValor = (caixa[i] < menorValor) ? caixa[i] : menorValor;
        }

        System.out.println("Total do dia: R$" + total);
        System.out.printf("Media por caixa: R$%.2f\n", media);
        System.out.println("Maior venda: Caixa " + maiorCaixa + " com " + "R$" + maiorValor);
        System.out.println("Menor venda: Caixa " + menorCaixa + " com " + "R$" + menorValor);

    }
}
