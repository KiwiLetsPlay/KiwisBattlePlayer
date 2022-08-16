package de.Kiwi.MusicPlayer.Config.SettingConfigCreate;

import java.io.File;
import java.io.IOException;

public class CreateSettings {
        public static File dir = new File("plugins/Kiwi'sMusicPlayer");
        public static File SetConfig = new File(dir.getPath() + "/Settings.yml");


        public static void CreateSettings() {

            if (!dir.exists()) {
                dir.mkdir();
            }
            if (!SetConfig.exists()) {
                try {
                    SetConfig.createNewFile();
                    SettingsManager.Settings();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        public static void DeleteSet() {
            SetConfig.delete();
        }


    }

