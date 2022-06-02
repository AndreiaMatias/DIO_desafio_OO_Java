/*Um cliente tem 10 dias para pagar uma fatura após sua data de vencimento sem que os juros sejam
* cobrados.
*
* Caso essa data caia em um sábado ou domingo, o cliente pode pagar na segunda-feira seguinte.
*
* Crie uma estrutura que receba uma data de vencimento e calcule quantos dias ele tem para pagar.
* */

//importando bibliotecas
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Calendario {
    private Calendar dataPagamento = Calendar.getInstance();
    private Calendar dataVencimento = Calendar.getInstance();

    //método para imprimir os dias e data-limite
    protected void diasExtras(int diasExtras) {
        System.out.println("Você tem " + diasExtras + " dias além do vencimento para pagar o título");
        System.out.println("A data limite é " + dataVencimento.getTime());
    }

    public static void main(String[] args) {
        int dia;
        int mes;
        int ano;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            //solicita a data de vencimento do título ao usuário
            System.out.println("Informe a data de vencimento no formato \"dd/mm/aaaa\":");
            String data = reader.readLine();
            String[] dataExtraida = data.split("/");
            dia = Integer.parseInt(dataExtraida[0]);
            mes = Integer.parseInt(dataExtraida[1]);
            ano = Integer.parseInt(dataExtraida[2]);

            Integer diasExtrasPagamento = 0;
            Calendario cal = new Calendario();
            //ajusta a data de vencimento conforme entrada do usuário
            cal.dataVencimento.set(ano, mes-1, dia);
            //verifica se a data de pagamento ocorre antes do vencimento
            if(cal.dataPagamento.before(cal.dataVencimento)){
                System.out.println("Título no vencimento. Basta efetuar o pagamento.");
                //verifica se a data de pagamento ocorre depois do vencimento
            }else if (cal.dataPagamento.after(cal.dataVencimento)) {
                long end = cal.dataPagamento.getTimeInMillis();
                long start = cal.dataVencimento.getTimeInMillis();
                int diasAposVencimento = (int) TimeUnit.MILLISECONDS.toDays(Math.abs(end - start));
                //verifica se o intervalo entre data de vencimento e pagamento é menor que 10 dias
                if (diasAposVencimento < 10) {
                    diasExtrasPagamento = 10;
                    cal.dataVencimento.add(Calendar.DATE, diasExtrasPagamento);
                    //verifica se o 10º dia após o vencimento cai no sábado. Se verdadeiro, adiciona 2 dias.
                    if (cal.dataVencimento.get(Calendar.DAY_OF_WEEK) == 7) {
                        diasExtrasPagamento += 2;
                        cal.dataVencimento.add(Calendar.DATE, 2);
                        cal.diasExtras(diasExtrasPagamento);
                        //verifica se o 10º dia após o vencimento cai no domingo. Se verdadeiro, adiciona 1 dias.
                    } else if (cal.dataVencimento.get(Calendar.DAY_OF_WEEK) == 1) {
                        diasExtrasPagamento += 1;
                        cal.dataVencimento.add(Calendar.DATE, 1);
                        cal.diasExtras(diasExtrasPagamento);
                    } else {
                        cal.diasExtras(diasExtrasPagamento);
                    }
                } else {
                    System.out.println("Não é possível efetuar o pagamento deste título.");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
