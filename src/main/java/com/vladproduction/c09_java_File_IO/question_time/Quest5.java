package com.vladproduction.c09_java_File_IO.question_time;

public class Quest5 {
}
/*Assuming that the variable path points to a valid Path object, which one of the following
statements is the correct way to create a WatchService?
A) WatchService watchService = WatchService.getInstance(path);
B) WatchService watchService = FileSystem.newWatchService();
C) WatchService watchService = path.getFileSystem().newWatchService();
D) WatchService watchService = FileSystem("default").getWatchService(path);
Answer: C) WatchService watchService = path.getFileSystem().newWatchService();
(The newWatchService() method is an abstract method defined in the FileSystem class. To get a
WatchService instance associated with a given path object, you need to first get the associated
FileSystem object and call the newWatchService() method on that FileSystem object. Hence,
option C) is the right answer.)*/
