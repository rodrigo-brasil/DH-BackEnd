package Proxy.Spotify;

public class Main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Rodrigo", false);
        Usuario user2 = new Usuario("Larissa",true);

        user1.salvarMusicaOffline("stairway to heaven");
        System.out.println("---------------------------");
        user2.salvarMusicaOffline(" lightning & snow");
    }
}
