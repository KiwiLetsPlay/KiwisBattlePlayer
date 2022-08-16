package de.Kiwi.MusicPlayer.Config.ItemsConfigCreate;

import java.io.File;
import java.io.IOException;

public class CreateMusic {
        public static File dir = new File("plugins/Kiwi'sBattlePlayer");
        public static File MConfig = new File(dir.getPath() + "/MusicSettings.yml");


        public static void CreateMuisc() {

            if (!dir.exists()) {
                dir.mkdir();
            }
            if (!MConfig.exists()) {
                try {
                    MConfig.createNewFile();
                    MusicManager.Music();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        public static void DeleteSet() {
            MConfig.delete();
        }


    }


