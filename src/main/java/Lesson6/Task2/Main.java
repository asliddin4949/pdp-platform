package Lesson6.Task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/todos.json");

        File completedTodo = showCompleted(2, file);
        File uncompletedTodo = unCompleted(1, file);
        ToDo toDo = new ToDo(10, 101, "Todo", false);
        File addedTodo = addTodo(file, toDo);
      //  File removedTodo = deleteTodo(file, toDo);
        File found = searchByTitle(file, "Todo");
        File edited = editStatus(file, toDo, true);

    }

    public static List<ToDo> jsonToList(File file) throws FileNotFoundException {
        Gson gson = new Gson();
        FileReader reader = new FileReader(file);
        JsonReader jsonReader = new JsonReader(reader);
        Type type = new TypeToken<List<ToDo>>() {
        }.getType();
        List<ToDo> list = gson.fromJson(jsonReader, type);
        return list;
    }

    public static File showCompleted(int userId, File file) throws IOException {

        List<ToDo> list = jsonToList(file);
        List<ToDo> returnList = new ArrayList<>();
        list.forEach(toDo -> {
            if (toDo.getUserId() == userId && toDo.isCompleted()) {
                returnList.add(toDo);
            }
        });
        File completed = new File(file.getParentFile().getPath() + "/" + "completed.json");
        completed.createNewFile();
        writeJson(completed, returnList);
        return completed;
    }

    public static void writeJson(File file, List<ToDo> list) throws IOException {
        FileWriter writer = new FileWriter(file, true);
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonWriter.flush();
        Gson gson = new Gson();
        Type type = new TypeToken<List<ToDo>>() {
        }.getType();
        gson.toJson(list, type, jsonWriter);
        jsonWriter.close();
    }

    public static File unCompleted(int userId, File file) throws IOException {

        List<ToDo> list = jsonToList(file);
        List<ToDo> returnList = new ArrayList<>();
        list.forEach(toDo -> {
            if (toDo.getUserId() == userId && !toDo.isCompleted()) {
                returnList.add(toDo);
            }
        });
        File uncompleted = new File(file.getParentFile().getPath() + "/" + "uncompleted.json");
        uncompleted.createNewFile();
        writeJson(uncompleted, returnList);
        return uncompleted;
    }

    public static File addTodo(File file, ToDo toDo) throws IOException {
        List<ToDo> list = jsonToList(file);
        list.add(toDo);
        File added = new File(file.getParentFile().getPath() + "/" + "added.json");
        added.createNewFile();
        writeJson(added, list);
        return added;
    }

    public static File deleteTodo(File file, ToDo toDo) throws IOException {
        List<ToDo> list = jsonToList(file);
        list.remove(toDo);
        File added = new File(file.getParentFile().getPath() + "/" + "removed.json");
        added.createNewFile();
        writeJson(added, list);
        return added;
    }

    public static File searchByTitle(File file, String title) throws IOException {
        List<ToDo> list = jsonToList(file);
        List<ToDo> founds = new ArrayList<>();
        list.forEach(toDo -> {
                    if (toDo.getTitle().equalsIgnoreCase(title)) {
                        founds.add(toDo);
                    }
                }
        );
        File found = new File(file.getParentFile().getPath() + "/" + "found.json");
        found.createNewFile();
        writeJson(found, founds);
        return found;
    }

    public static File editStatus(File file, ToDo toDo, boolean status) throws IOException {
        List<ToDo> list = jsonToList(file);
        list.forEach(toDo1 -> {
            if (toDo1.equals(toDo)) {
                toDo1.setStatus(status);
            }
        });
        File edited = new File(file.getParentFile().getPath() + "/" + "edited.json");
        edited.createNewFile();
        writeJson(edited, list);
        return edited;

    }


}
