package de.Kiwi.BattlePlayer.Config.ItemsConfigCreate;

import de.Kiwi.BattlePlayer.Config.SettingConfigCreate.SettingsManager;

import java.io.File;
import java.io.IOException;

public class CreateMusic {
        public static File dir = new File("plugins/Kiwi'sBattlePlayer");
        public static File MConfig = new File(dir.getPath() + "/Music - Settings.yml");


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


