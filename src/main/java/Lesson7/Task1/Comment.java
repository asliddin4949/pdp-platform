package Lesson7.Task1;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    int postId;
    int id;
    String name;
    String email;
    String body;

}
