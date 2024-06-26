package kz.teacher.forge.teacherforge.models.dto;

import kz.teacher.forge.teacherforge.models.QuestionType;
import lombok.Data;

import java.util.Map;
import java.util.UUID;

@Data
public class QuestionDto {
    private UUID id;
    private UUID testId;
    private QuestionType questionType;
    private int number;
    private Map<String , Object> details;
}
