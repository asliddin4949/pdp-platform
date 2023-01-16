package Lesson7.Task2;

import Lesson6.Task3.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.poi.xssf.usermodel.XSSFPicture;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/posts.txt");
        FileReader fileReader = new FileReader(file);
        Gson gson = new Gson();
        Type type = new TypeToken<List<Post>>() {
        }.getType();
        List<Post> postList = gson.fromJson(fileReader, type);
        FileOutputStream outputStream = new FileOutputStream(new File("src/main/resources/workbook.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet posts = workbook.createSheet("Posts");
        posts.createRow(0);

        posts.getRow(0).createCell(0).setCellValue("UserId");
        posts.getRow(0).createCell(1).setCellValue("Id");
        posts.getRow(0).createCell(2).setCellValue("Title");
        posts.getRow(0).createCell(3).setCellValue("Body");
        for (int i = 0; i < postList.size(); i++) {
            posts.createRow(i + 1);
            posts.getRow(i + 1).createCell(0).setCellValue("" + postList.get(i).getUserId());
            posts.getRow(i + 1).createCell(1).setCellValue("" + postList.get(i).getId());
            posts.getRow(i + 1).createCell(2).setCellValue(postList.get(i).getTitle());
            posts.getRow(i + 1).createCell(3).setCellValue(postList.get(i).getBody());
        }
        posts.autoSizeColumn(0);
        posts.autoSizeColumn(1);
        posts.autoSizeColumn(2);
        posts.autoSizeColumn(3);
        File picture = new File("src/main/resources/image.jpg");



        workbook.write(outputStream);
        outputStream.close();
        workbook.close();


    }
}
