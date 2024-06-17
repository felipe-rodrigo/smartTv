public class tvComportamento {

  tvModel tv = new tvModel();

  public void ligarTv() {
    tv.ligada = true;
    System.out.println("Tv ligada: " + tv.ligada);
  }

  public void mudarCanal (int novoCanal) {
    tv.canal = novoCanal;
    // ou this.canal = novoCanal
    System.out.println("canal mudado para: " + novoCanal);
  }

  public void passarCanal() {
    tv.canal++;
    System.out.println("canal passado: " + tv.canal);
  }

  public void voltarCanal() {
    tv.canal--;
    System.out.println("canal voltado: " + tv.canal);
  }

  public void aumentarVolume() {
    tv.volume++;
    System.out.println("volume aumentado: " + tv.volume);
  }

  public void diminuirVolume() {
    tv.volume--;
    System.out.println("volume diminuido: " + tv.volume);
  }

  public void desligarTv() {
    tv.ligada = false;
    System.out.println("Tv ligada: " + tv.ligada);
  }
}
