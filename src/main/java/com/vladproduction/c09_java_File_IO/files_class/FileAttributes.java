package com.vladproduction.c09_java_File_IO.files_class;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * There are many other methods that can be used to fetch file properties. Let’s use the getAttribute() method to
 * get some attributes of a file. The method takes variable number of parameters: first, a Path object; second, an attribute
 * name; and subsequently, the link options.
 * */
public class FileAttributes {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(args[0]);
        try {
            Object object = Files.getAttribute(path, "creationTime",
                    LinkOption.NOFOLLOW_LINKS);
            System.out.println("Creation time: " + object);

            object = Files.getAttribute(path, "lastModifiedTime",
                    LinkOption.NOFOLLOW_LINKS);
            System.out.println("Last modified time: " + object);

            object = Files.getAttribute(path, "size", LinkOption.NOFOLLOW_LINKS);
            System.out.println("Size: " + object);

            object = Files.getAttribute(path, "dos:hidden", LinkOption.NOFOLLOW_LINKS);
            System.out.println("isHidden: " + object);
            object = Files.getAttribute(path, "isDirectory", LinkOption.NOFOLLOW_LINKS);
            System.out.println("isDirectory: " + object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
