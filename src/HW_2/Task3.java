package HW_2;

import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task3 {

    // Напишите программу, которая
// 1) по указанной строке URL скачивает файл и возвращает строковое содержимое файла+
// 2) изменяет строковое содержимое файла подставляя по маске "%s" ваше имя
// 3) сохраняет файл локально+
// 4) читает сохраненный файл и выводит содержимое в логгер
// 5) удаляет сохраненный файл+
    public static void main(String[] args) throws IOException {
        String fileUrl = "https://raw.githubusercontent.com/aksodar/JSeminar_2/master/src/main/resources/example.txt";
        String path = "C:\\Users\\alexr\\IdeaProjects\\HomeWorks\\src\\HW_2/text.txt";
        System.out.print("1) по указанной строке URL скачивает файл и возвращает строковое содержимое файла\n" +
                "2) изменяет строковое содержимое файла подставляя по маске \"%s\" ваше имя\n" +
                "3) сохраняет файл локально\n" +
                "4) читает сохраненный файл и выводит содержимое в логгер\n" +
                "5) удаляет сохраненный файл\nВведите номер действия: ");
        Scanner sc = new Scanner(System.in);
        String act = sc.nextLine();
        try {
            if (act.equals("1")) System.out.println(download(fileUrl));
            else if (act.equals("2")) {
                    System.out.print("What is your name? ");
                    String name = sc.nextLine();
                    change(name, path);
                }
            else if(act.equals("3")) saveOnLocal(fileUrl, path);
            else if(act.equals("4")) read(path);
            else if (act.equals("5")) removeFromLocale(path);
            else System.out.println("Wrong action!!!");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static String download(String url) throws IOException {
        URL x = new URL(url);
        String content;
        try (Scanner sc = new Scanner(x.openStream(), String.valueOf("UTF-8"))) {
            content = sc.useDelimiter("\\A").next();
        }
        return content;
    }

    public static void change(String name, String fileContent) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader(fileContent)) {
            int c;
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
        }
        String res = new String(sb).replace("%s", name);
        System.out.println(res);
        try (PrintWriter out = new PrintWriter(fileContent, StandardCharsets.UTF_8)) {
            out.print(res);
            System.out.println("Successfully written data to file");
        }
    }

    public static void read(String localFilename) throws IOException {
        Logger logger = Logger.getLogger(Task3.class.getName());
        logger.setLevel(Level.ALL);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        logger.log(Level.WARNING, "Test logging");
        logger.info("Test logging again");
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader(localFilename)) {
            int c;
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
        }
    }

    public static void saveOnLocal(String url, String localFilename) throws IOException {
        URL x = new URL(url);
        try (InputStream in = x.openStream();
             ReadableByteChannel rbc = Channels.newChannel(in);
             FileOutputStream fos = new FileOutputStream(localFilename)) {
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        }
        System.out.println("Download is completed");
    }

    public static void removeFromLocale(String fileName) {
        Path route = Paths.get(fileName);
        try {
            boolean result = Files.deleteIfExists(route);
            if (result) {
                System.out.println("File is successfully deleted.");
            } else {
                System.out.println("File  deletion failed");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}