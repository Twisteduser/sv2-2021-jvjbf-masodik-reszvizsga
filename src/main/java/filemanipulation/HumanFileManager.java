package filemanipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.ArrayList;
import java.util.List;

public class HumanFileManager {
    private List<Human> humans = new ArrayList<>();

    public List<Human> getHumans() {
        return humans;
    }


    public void readHumansFromFile(Path path){
        try {
            Files.readAllLines(path);
            List<String> humanList = Files.readAllLines(path);
            for (String s: humanList){
                String[] temp = s.split(";");
                humans.add(new Human(temp[0],temp[1]));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
    }

    public void writeMaleHumansToFile(Path path) {
        List<String> males = new ArrayList<>();
        for (Human h: humans) {
            if (h.getIdentityNumber().startsWith("1") || h.getIdentityNumber().startsWith("3")) {
                StringBuilder sb = new StringBuilder();
                males.add(sb.append(h.getName()).append(";").append(h.getIdentityNumber()).toString());
            }
        }
        try {
            Files.write(path,males);
        }  catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }


}
