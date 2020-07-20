package com.example.quiz;

public class Questions {

    public String mQuestions[] = {
            "What company established the Hololive Agency?",
            "How many members does the Hololive (JP) has?",
            "These members made an appearance in Hololive's collaboration with Azur Lane, except?",
            "What is Matsuri's mascot name?",
            "Which hololive member is associated by corn?",
            "Which Hololive member starred a role in Watanuki-san Chi No?",
            "Which Hololive member that has the same character designer for Oregairu?",
            "Which Hololive member is the first gen of hololive China?",
            "Which Hololive member is often symbolized by alien monster emoji?"

    };

    private String mChoices[][] = {
            {"Holopro", "Hololive", "Cover", "Ichikara"},
            {"26", "28", "30", "31"},
            {"Tokino Sora", "Roboco", "Aki Rosenthal", "Yuzuki Choco"},
            {"Kintoki", "Ankimo", "Ebifuraion", "Bibi"},
            {"Shirakami Fubuki", "Murasaki Shion", "Inugami Korone", "Ookami Mio"},
            {"Natsuiro Matsuri", "Oozora Subaru", "Inugami Korone", "Tokino Sora"},
            {"Sakura Miko", "Aki Rosenthal", "Shiranui Flare", "Himemori Luna"},
            {"Artia", "Civia", "Rosalyn", "Doris"},
            {"Moona Hoshinova", "Airani Iofifteen", "Amane Canata", "Tokoyami Towa"}
    };

    private String mCorrectAnswers[] = {
            "Cover",
            "28",
            "Tokino Sora",
            "Ebifuraion",
            "Shirakami Fubuki",
            "Tokino Sora",
            "Sakura Miko",
            "Civia",
            "Tokoyami Towa"
    };

    public String getQuestion (int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
