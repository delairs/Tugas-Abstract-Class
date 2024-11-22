// Abstract class MakhlukHidup
abstract class MakhlukHidup {
    // Metode abstrak
    public abstract void bernapas();
    public abstract void makan();
    public abstract void berkembangBiak();

    // Metode konkret (opsional)
    public void info() {
        System.out.println("Ini adalah makhluk hidup.");
    }
}

// Subclass Manusia
class Manusia extends MakhlukHidup {
    @Override
    public void bernapas() {
        System.out.println("Manusia bernapas menggunakan paru-paru.");
    }

    @Override
    public void makan() {
        System.out.println("Manusia makan dengan mulut.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println("Manusia berkembang biak secara melahirkan (vivipar).");
    }
}

// Subclass Hewan
class Hewan extends MakhlukHidup {
    @Override
    public void bernapas() {
        System.out.println("Hewan bernapas menggunakan paru-paru atau insang, tergantung jenisnya.");
    }

    @Override
    public void makan() {
        System.out.println("Hewan makan sesuai jenisnya, ada yang herbivora, karnivora, atau omnivora.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println("Hewan berkembang biak secara bertelur (ovipar) atau melahirkan (vivipar).");
    }
}

// Subclass Tumbuhan
class Tumbuhan extends MakhlukHidup {
    @Override
    public void bernapas() {
        System.out.println("Tumbuhan bernapas melalui stomata dan lentisel.");
    }

    @Override
    public void makan() {
        System.out.println("Tumbuhan membuat makanan sendiri melalui fotosintesis.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println("Tumbuhan berkembang biak secara vegetatif atau generatif.");
    }
}

// Main Class untuk pengujian
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari masing-masing subclass
        MakhlukHidup manusia = new Manusia();
        MakhlukHidup hewan = new Hewan();
        MakhlukHidup tumbuhan = new Tumbuhan();

        // Menampilkan informasi dan metode
        System.out.println("Manusia:");
        manusia.info();
        manusia.bernapas();
        manusia.makan();
        manusia.berkembangBiak();

        System.out.println("\nHewan:");
        hewan.info();
        hewan.bernapas();
        hewan.makan();
        hewan.berkembangBiak();

        System.out.println("\nTumbuhan:");
        tumbuhan.info();
        tumbuhan.bernapas();
        tumbuhan.makan();
        tumbuhan.berkembangBiak();
    }
}
