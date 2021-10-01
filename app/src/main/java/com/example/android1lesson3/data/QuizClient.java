package com.example.android1lesson3.data;

import java.util.ArrayList;
import java.util.List;

public class QuizClient {
   public static List<QuestionModel> list = new ArrayList();

    public static List<QuestionModel> getLevel(){
        list.add(new QuestionModel("One","Зимой и летом одним цветом?",
                "Ель","Ель","Яйцо","Кровь","Президент"));

        list.add(new QuestionModel("Two","H2o что это?",
                "Вода","огонь","Вода","Уголь","Соль"));

        list.add(new QuestionModel("Three","H2o что это?",
                "Вода","огонь","Вода","Уголь","Соль"));

        return list;
    }
}
