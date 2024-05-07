package github;

import org.junit.Test;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputBuffer input_buffer = new InputBuffer();
        REPL repl = new REPL();
        while (true) {
            repl.print_prompt();
            repl.read_input(input_buffer);

            String curLine = String.valueOf(input_buffer.buffer, 0, input_buffer.input_length);
            if(curLine.equals(".exit")) {
                input_buffer = null;
                repl.close_input_buffer();
                System.exit(0);
            }else {
                System.out.printf("Unrecognized command '%s'.\n", new String(input_buffer.buffer));
            }
        }
    }
}
