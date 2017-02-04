public class Player {
    private int health;
    private String name;
    private int inventory[10];
    private int[5] hotbar;
    
    player(String tname) {
        name = tname;
        health = 100;
        for(int i = 0; i<10; i++){
            inventory[i] = 0;
        }
        for(int i = 0; i<5; i++){
            hotbar[i] = 0;
        }
    }
    player(String tname, int h) {
        name = tname;
        health = h;
        for(int i = 0; i<10; i++){
            inventory[i] = 0;
        }
        for(int i = 0; i<5; i++){
            hotbar[i] = 0;
        }
    }
    public void setHealth(int h) {
        health = h
    }
}
public class main() {
    public static void main(String args[]) {
        System.out.println("This game is currently in development! We need more developers who will volunteer to work (as in no pay).");
    }
}
