package com.vladproduction.c09_java_File_IO.walking_file_tree;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * // Our File visitor implementation that performs copy
 * */
public class MyFileCopyVisitor  extends SimpleFileVisitor<Path> {
    private Path source, destination;

    public MyFileCopyVisitor(Path s, Path d) {
        source = s;
        destination = d;
    }
    public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) {
        Path newd = destination.resolve(source.relativize(path));
        try {
            Files.copy(path, newd, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return FileVisitResult.CONTINUE;
    }
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes fileAttributes) {
        Path newd = destination.resolve(source.relativize(path));
        try {
            Files.copy(path, newd, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e) {
            e.printStackTrace();
        }
        return FileVisitResult.CONTINUE;
    }
}
