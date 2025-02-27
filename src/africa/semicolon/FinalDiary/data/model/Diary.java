package africa.semicolon.FinalDiary.data.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Diary {

    @Id
    private String username;
    private String password;
    private boolean isLocked = true;

}
