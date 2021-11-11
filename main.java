import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Stream;

public class main {
    public static void main(String args[]) throws IOException {
        String temp, temp1, temp2;
        String filename = "partfile.txt";
        try(Stream<String> stream = Files.lines(Paths.get(filename))){
            Deque<String> stack = new ArrayDeque<>();
            stream.forEach(stack::push);
            stack.stream().forEach(System.out::println);
            for(int i = 0; i <= stack.size(); i++) {
                temp = stack.pop();
                temp1 = temp.substring(0,7);
                temp2 = temp.substring(15);
                System.out.println(temp1 + "\n" + temp2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
