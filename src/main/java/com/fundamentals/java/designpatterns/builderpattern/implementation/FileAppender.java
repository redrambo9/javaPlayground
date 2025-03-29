package com.fundamentals.java.designpatterns.builderpattern.implementation;

import com.fundamentals.java.designpatterns.builderpattern.interfaces.Appender;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class FileAppender implements Appender {

    private Path path;
    private static final String LOG_EXT = ".log";
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
    private String fileName;
    private static final String UNDERSCORE = "_";

    FileAppender(Path path, String fileName) {
        this.path = path;
        this.fileName = fileName;
    }

    @Override
    public void log(String message) {
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(createFile(), true),
                        StandardCharsets.UTF_8))) {
            writer.append(message).append(System.lineSeparator());
            writer.flush();
        } catch (IOException e) {
            //Ignore
        }
    }

    private File createFile() throws IOException {
        File file = new File(path.toFile().getAbsolutePath(),
                fileName + UNDERSCORE + dateFormat.format(new Date()) + LOG_EXT);
        return file;
    }
}
