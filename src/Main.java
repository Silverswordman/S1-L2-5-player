import entities.ElementoMultimedia;
import entities.Audio;
import entities.Immagine;
import entities.Video;
import interfaces.Luminosità;
import interfaces.PlayAndVolume;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimedia[] elementi = new ElementoMultimedia[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("Cosa vuoi creare un video , un' immagine o un audio?");
            String tipo = scanner.nextLine().toLowerCase();
            System.out.println("Inserisci il titolo dell'elemento " + (i + 1));
            String titolo = scanner.nextLine();

            switch (tipo.toLowerCase()) {
                case "audio" -> {
                    System.out.println("Inserisci il volume da uno a 5 ! :");
                    String volumeInput = scanner.nextLine();
                    if (volumeInput.length() > 5) {
                        System.out.println("Il volume deve avere al massimo 5 punti esclamativi.");
                        i--;
                    }
                    char[] volumeValue = volumeInput.toCharArray();

                    System.out.println("Inserisci la durata:");
                    int durata = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Audio(durata, PlayAndVolume.volumeValue);
                }


                case "video" -> {
                    System.out.println("Inserisci il volume inserendo il carattere ! da una a 5 volte:");
                    String volumeVideoInput = scanner.nextLine();
                    if (volumeVideoInput.length() > 5) {
                        System.out.println("Il volume deve avere al massimo 5 punti esclamativi.");
                        i--;
                        break;
                    }
                    char[] volumeVideoValue = volumeVideoInput.toCharArray();

                    System.out.println("Inserisci la durata:");
                    int durataVideo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Inserisci l' asterisco inserendo il carattere * da una a 5 volte:");
                    String lumVideoInput = scanner.nextLine();
                    if (lumVideoInput.length() > 5) {
                        System.out.println("La luminosità deve avere al massimo 5 asterischi");
                        i--;

                    }
                    char[] lumVideoValue = lumVideoInput.toCharArray();

                    elementi[i] = new Video(durataVideo, PlayAndVolume.volumeValue, Luminosità.luminositàValue);
                }

                case "immagine" -> {
                    System.out.println("Inserisci l' asterisco inserendo il carattere * da una a 5 volte:");
                    String lumInput = scanner.nextLine();
                    if (lumInput.length() > 5) {
                        System.out.println("La luminosità deve avere al massimo 5 asterischi");
                        i--;
                        break;
                    }
                    char[] lumValue = lumInput.toCharArray();

                    elementi[i] = new Immagine(Luminosità.luminositàValue);
                }

                default -> {
                    System.out.println("Tipo non esistente");
                    i--;
                }

            }
        }
//        int elementoScelto;
//        do {
//            System.out.println("Quale elemento vuoi eseguire (1-5)? ");
//            elementoScelto = scanner.nextInt();
//            if (elementoScelto >= 1 && elementoScelto <= 5) {
//                ElementoMultimedia elemento = elementi[elementoScelto - 1];
//                elemento.view();

                scanner.close();
            }
        }
