package com.example.samost1408;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class HelloController {
    @FXML
    TextField txtFileName;
    @FXML
    TextArea txtLines;
    @FXML
    Button btnLoad;
    @FXML
    Label info;

    public void initialize() {
        System.out.println("Все актеры расставлены, начинаем");
    }

    public void loadText()
    {
        String fname = txtFileName.getText();
        int stringCount = 0;
        int words = 0;
        int letters = 0;
        try{
            txtLines.clear();
        List<String> lines = Files.readAllLines(Path.of(fname), StandardCharsets.UTF_8);
        for (String str: lines)
        {
           txtLines.setText(txtLines.getText() + "\n"+str);
        }
        int countStr = lines.size();
        int countLetters = 0;
        int countWords = 0;
            for (String str:lines  ) {
                countLetters += lines.size();
                String[] mas = str.split(" ");
                countWords += mas.length;
            }
            info.setText("Строк " + countStr + " Слов "+ countWords + " Букв "+ countLetters);
        }
        catch (IOException e)
        {
            txtLines.setText("Файл не открылся");
        }

       /* Scanner scanner = new Scanner(txtLines.getText());
        while (scanner.hasNextLine()) {
            stringCount++;
            String[] array = scanner.nextLine().split(" ");
            String allwords = "";
            for (String s : array) {
                allwords += s;
            }
            words = words + array.length;
            letters = allwords.;
        }

        System.out.println("Number of words: " + words);
        System.out.println("Number of lines: " + stringCount);
        System.out.println("Number of letters: " + letters);*/
    }



}