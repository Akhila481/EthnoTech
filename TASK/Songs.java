import java.util.ArrayList;
public class Songs {
    public static void main(String[] args) {
        //Arraylist of songs
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Dilbar");
        songs.add("Vaasthe");
        songs.add("O Saki Saki");
        songs.add("Tum Hi Ho");
        songs.add("Tera Ban Jaunga");
        System.out.println("These are the songs in the list.");
        for (String song : songs) {
            System.out.println(song);
        }
        // remove the Fifth song
        songs.remove(4);
        System.out.println("After removing the fifth song:");
        for (String song : songs) {
            System.out.println(song);
        }
        //get the remaining songs
        System.out.println("Remaining songs:");
        for (String song : songs) {       
            System.out.println(song);
        }
        //checking if song is in the list or not
        if (songs.contains("Life of Ram")) {
            System.out.println("The song 'Life of Ram' is in the list.");
        } else {
            System.out.println("The song 'Life of Ram' is not in the list.");
        }
        //clear the list
        songs.clear();
        System.out.println("The list is now empty.");
        //printing contaains method after clearing the list
        if (songs.contains("Dilbar")) {
            System.out.println("The song 'Dilbar' is in the list.");
        } else {
            System.out.println("The song 'Dilbar' is not in the list.");
        }
    }
}