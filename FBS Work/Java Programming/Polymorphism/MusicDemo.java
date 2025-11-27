import javax.sound.sampled.*;
import java.io.File;

class Instrument {
    String name;
    String brand;
    double price;
    String soundFile;

    Instrument(String name, String brand, double price, String soundFile) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.soundFile = soundFile;
    }

    void display() {
        System.out.println("Instrument Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    void play() throws Exception {
        File file = new File(soundFile);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        System.out.println("Playing generic instrument sound...");
        Thread.sleep(5000);
        clip.close();
    }
}

class Guitar extends Instrument {
    int numberOfStrings;

    Guitar(String brand, double price, int numberOfStrings) {
        super("Guitar", brand, price, "guitar.wav");
        this.numberOfStrings = numberOfStrings;
    }

    void display() {
        System.out.println("---- Guitar ----");
        super.display();
        System.out.println("Strings: " + numberOfStrings);
    }

    void play() throws Exception {
        File file = new File(soundFile);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        System.out.println("Playing Guitar sound...");
        Thread.sleep(5000);
        clip.close();
    }
}

class Piano extends Instrument {
    int keys;

    Piano(String brand, double price, int keys) {
        super("Piano", brand, price, "piano.wav");
        this.keys = keys;
    }

    void display() {
        System.out.println("---- Piano ----");
        super.display();
        System.out.println("Keys: " + keys);
    }

    void play() throws Exception {
        File file = new File(soundFile);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        System.out.println("Playing Piano sound...");
        Thread.sleep(5000);
        clip.close();
    }
}

class Drum extends Instrument {
    String drumType;

    Drum(String brand, double price, String drumType) {
        super("Drum", brand, price, "drum.wav");
        this.drumType = drumType;
    }

    void display() {
        System.out.println("---- Drum ----");
        super.display();
        System.out.println("Drum Type: " + drumType);
    }

    void play() throws Exception {
        File file = new File(soundFile);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        System.out.println("Playing Drum sound...");
        Thread.sleep(5000);
        clip.close();
    }
}

class Tabla extends Instrument {
    String material;

    Tabla(String brand, double price, String material) {
        super("Tabla", brand, price, "tabla.wav");
        this.material = material;
    }

    void display() {
        System.out.println("---- Tabla ----");
        super.display();
        System.out.println("Material: " + material);
    }

    void play() throws Exception {
        File file = new File(soundFile);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        System.out.println("Playing Tabla sound...");
        Thread.sleep(5000);
        clip.close();
    }
}

public class MusicDemo {
    public static void main(String[] args) throws Exception {
        Instrument[] instruments = {
            new Guitar("Yamaha", 12000, 6),
            new Piano("Casio", 25000, 88),
            new Drum("Roland", 18000, "Electric"),
            new Tabla("IndiaCraft", 8000, "Wood and Leather")
        };

        for (int i = 0; i < instruments.length; i++) {
            instruments[i].display();
            instruments[i].play();
            System.out.println();
        }
    }
}
