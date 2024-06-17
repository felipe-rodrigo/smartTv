public class smartTvApplication {
  public static void main(String[] args) {
    tvComportamento tv = new tvComportamento();
    tv.ligarTv();
    tv.aumentarVolume();
    tv.diminuirVolume();
    tv.mudarCanal(15);
    tv.passarCanal();
    tv.voltarCanal();
    tv.desligarTv();
  }
}
