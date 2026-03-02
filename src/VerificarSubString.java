public class VerificarSubString {
    public boolean VerificarContidaOuN(String a, String b){
        return b.contains(a);
    }
    public int ContadorOcorrencias(String a, String b){ 
        int contador = 0;
        int i = 0;
        while((i = b.indexOf(a, i ))!=  -1){
            contador ++;
            i += a.length();
        }
        return contador;
    }
}
