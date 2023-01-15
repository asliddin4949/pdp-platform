package Lesson6.Task1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/main/resources/comments.json");
        JsonReader jsonReader = new JsonReader(reader);
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Post>>() {
        }.getType();
        List<Post> posts = gson.fromJson(jsonReader, type);
        System.out.println("\n - - - - - 2 - - - - -");
        System.out.println("Comments: " + posts.size());
        System.out.println("\n - - - - - 3 - - - - -");
        int postsCount = 1;
        for (int i = 0; i < posts.size() - 1; i++) {
            if (posts.get(i).getPostId() != posts.get(i + 1).getPostId()) {
                postsCount++;
            }
        }
        System.out.println("Posts: " + postsCount);
        System.out.println("\n - - - - - 4 - - - - - ");
        posts.forEach(post -> {
            System.out.println("Name: " + post.getName()
                    + "\nBody: " + post.getBody());
        });
        System.out.println("\n - - - - - 5 - - - - - ");
        posts.forEach(post -> {
            System.out.println("E-mail: " + post.getEmail());
        });
        System.out.println("\n - - - - - 6 - - - - - ");
        Post minComment = posts.get(0);
        Post maxComment = posts.get(0);
        for (Post post : posts) {
            if (post.getBody().length() > maxComment.getBody().length()) {
                maxComment = post;
            }
            if (post.getBody().length() < minComment.getBody().length()) {
                minComment = post;
            }
        }
        System.out.println("MaxLength: "
                + "\nE-mail: " + maxComment.getEmail()
                + "\nComment: " + maxComment.getBody());
        System.out.println("MinLength: "
                + "\nE-mail: " + minComment.getEmail()
                + "\nComment: " + minComment.getBody());
        System.out.println("\n - - - - - 7 - - - - - ");
        for (int i = 0; i < posts.size(); i++) {
            String email = posts.get(i).getEmail();
            int count = 0;
            for (int j = i; j < posts.size(); j++) {
                if (posts.get(j).getEmail().equals(email)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(email);
            }
        }


    }
}
