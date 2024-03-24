package musicgame;

import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Music extends Thread{

    private Player player;
    private boolean isLoop;
    private File file;
    private FileInputStream fis;
    private BufferedInputStream bis;

    public Music(String name, boolean isLoop) {
        try {
            this.isLoop = isLoop;
            file = new File(Main.class.getResource("../music/" + name).toURI());
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            player = new Player(bis);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        public int getTIme() {
            if(player == null)
                return 0;
            return player.getPosition();
        }

        public



    }


}
