package Lesson6.Task2;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader("src/main/resources/todos.json");
        JsonReader jsonReader = new JsonReader(reader);
        Type type = new TypeToken<ArrayList<ToDo>>() {
        }.getType();
        List<ToDo> toDoList = gson.fromJson(jsonReader, type);



    }

}
