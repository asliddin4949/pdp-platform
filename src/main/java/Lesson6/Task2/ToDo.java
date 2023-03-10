package Lesson6.Task2;

import lombok.Getter;

@Getter
public class ToDo {
    int userId;
    int id;
    String title;
    boolean completed;

    public ToDo(int userId, int id, String title, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public void setStatus(boolean status) {
        this.completed = status;
    }

    @Override
    public String toString() {
        return "{" +
                "\nuserId=" + userId +
                "\nid=" + id +
                "\ntitle='" + title + '\'' +
                "\ncompleted=" + completed +
                '}';
    }
}
