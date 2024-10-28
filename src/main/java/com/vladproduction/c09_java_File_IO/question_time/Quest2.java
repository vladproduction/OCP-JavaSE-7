package com.vladproduction.c09_java_File_IO.question_time;

public class Quest2 {
}
/*Which two of the following statements are correct regarding the SimpleFileVisitor interface?
A) The postVisitDirectory method, declared in SimpleFileVisitor, will be invoked after all the
entries (i.e., files and subdirectories) of the directory have been visited.
B) the visitFile method, declared in SimpleFileVisitor, will be invoked when a file is visited.
c) the visitFileOrDirectory method, declared in SimpleFileVisitor, will be invoked when a file
or subdirectory is visited.
D) the walkFileTree method, declared in SimpleFileVisitor, will walk the file tree.
        Answer: a) and B) are correct statements.
        (regarding option c), there is no such method as visitFileOrDirectory in SimpleFileVisitor
interface. regarding option D), the walkFileTree method is a static method defined in the Files
class that will walk the file tree. the walkFileTree method is not declared in SimpleFileVisitor.
        in fact, FileVisitor is one of the arguments this method takes for which you can pass a
SimpleFileVisitor object as an argument.)*/
