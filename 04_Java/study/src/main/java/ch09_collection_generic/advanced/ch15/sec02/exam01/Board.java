package main.java.ch09_collection_generic.advanced.ch15.sec02.exam01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NonNull
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private String subject;
    private String content;
    private String writer;
}
