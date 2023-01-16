package Lesson7.Task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
    int userId;
    int id;
    String title;
    String body;

    @Override
    public String toString() {
        return "Post{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
