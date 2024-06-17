public class tvModel {
  int canal = 1;
  int volume = 10;
  boolean ligada = false;

  public void mudarCanal (int novoCanal) {
    canal = novoCanal;
    // ou this.canal = novoCanal
    System.out.println("canal mudado para: " + novoCanal);
  }

  public void passarCanal() {
    canal++;
    System.out.println("canal passado: " + canal);
  }

  public void voltarCanal() {
    canal--;
    System.out.println("canal voltado: " + canal);
  }

  public void aumentarVolume() {
    volume++;
    System.out.println("volume aumentado: " + volume);
  }

  public void diminuirVolume() {
    volume--;
    System.out.println("volume diminuido: " + volume);
  }
}
