interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Strumming the guitar strings.");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Pressing the piano keys.");
    }
}

 class Main5 {
    public static void main(String[] args) {

        Playable obj1 = new Guitar();
        Playable obj2 = new Piano();

        obj1.play();
        obj2.play();
    }
}
