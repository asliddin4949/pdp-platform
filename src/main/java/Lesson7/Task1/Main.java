package Lesson7.Task1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File jsonFile = new File("src/main/resources/comments.json");
        Gson gson = new Gson();
        FileReader fileReader = new FileReader(jsonFile);
        JsonReader jsonReader = new JsonReader(fileReader);
        Type type = new TypeToken<List<Comment>>() {
        }.getType();
        List<Comment> commentList = gson.fromJson(jsonReader, type);

        File word = new File("src/main/resources/document.docx");
        FileOutputStream outputStream = new FileOutputStream(word);
        XWPFDocument document = new XWPFDocument();
        XWPFTable table = document.createTable(commentList.size() + 1, 5);
        table.getRow(0).getCell(0).setText("PostId");
        table.getRow(0).getCell(1).setText("Id");
        table.getRow(0).getCell(2).setText("Name");
        table.getRow(0).getCell(3).setText("Email");
        table.getRow(0).getCell(4).setText("Body");
        for (int i = 0; i < commentList.size(); i++) {
            table.getRow(i + 1).getCell(0).setText("" + commentList.get(i).getPostId());
            table.getRow(i + 1).getCell(1).setText("" + commentList.get(i).getId());
            table.getRow(i + 1).getCell(2).setText(commentList.get(i).getName());
            table.getRow(i + 1).getCell(3).setText(commentList.get(i).getEmail());
            table.getRow(i + 1).getCell(4).setText(commentList.get(i).getBody());
        }
        document.write(outputStream);
        outputStream.close();
    }


}
