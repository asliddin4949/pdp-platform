package Lesson6.Task3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();
        File file = new File("src/main/resources/users.json");
        FileReader fileReader = new FileReader(file);
        JsonReader jsonReader = new JsonReader(fileReader);
        Type type = new TypeToken<List<User>>() {
        }.getType();
        List<User> userListGson = gson.fromJson(jsonReader, type);

        showInfoByEmail(userListGson,"Nathan@yesenia.net");
        showInfoByUsername(userListGson,"Moriah.Stanton");


    }

    public static void showInfoByUsername(List<User> users, String username) {
        users.forEach(user -> {
            if (user.getUsername().equals(username)) {
                System.out.println(user.getCompany());
                System.out.println(user.getAddress().getGeo());
            }
        });
    }

    public static void showInfoByEmail(List<User> users, String email) {
        users.forEach(user -> {
            if (user.getEmail().equals(email)) {
                System.out.println(user.getCompany());
                System.out.println(user.getAddress().getGeo());
            }
        });
    }
}
