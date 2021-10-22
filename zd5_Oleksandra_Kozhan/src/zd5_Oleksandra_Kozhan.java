import java.math.BigDecimal;

public class zd5_Oleksandra_Kozhan {
    public static void main(String[] args) {
        float netto_OleksandraKozhan  = 9.99f;
        float VAT_OleksandraKozhan = netto_OleksandraKozhan * 23 / 100;
        float brutto_OleksandraKozhan = netto_OleksandraKozhan + VAT_OleksandraKozhan;
        BigDecimal bigDecimal_BRUTTO_OleksandraKozhan = new BigDecimal(brutto_OleksandraKozhan * 10000);
        BigDecimal bigDecimal_NETTO_OleksandraKozhan = new BigDecimal(netto_OleksandraKozhan * 10000);
        System.out.println("Wartość z VAT jest " + bigDecimal_BRUTTO_OleksandraKozhan);
        System.out.println("Wartość bez VAT jest " + bigDecimal_NETTO_OleksandraKozhan);
        System.out.println("Różnica jest " +
                bigDecimal_BRUTTO_OleksandraKozhan.subtract(bigDecimal_NETTO_OleksandraKozhan));
    }
}
