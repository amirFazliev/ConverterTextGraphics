package ru.netology.graphics;

import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.image.TextGraphicsConverterImplem;
import ru.netology.graphics.server.GServer;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new TextGraphicsConverterImplem(); // Создайте тут объект вашего класса конвертера
        converter.setMaxRatio(8);
        converter.setMaxWidth(250);
        converter.setMaxHeight(250);
        converter.convert("https://i.ibb.co/6DYM05G/edu0.jpg");
        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

        //Или то же, но с выводом на экран:
        //String url = "https://i.ibb.co/6DYM05G/edu0.jpg";
        //String imgTxt = converter.convert(url);
        //System.out.println(imgTxt);
    }
}
