package github;

import java.io.InputStream;
import java.util.Scanner;

public class REPL {
    public void print_prompt() {
        System.out.print("db > ");
    }

    public int getline(InputBuffer input_buffer, InputStream in) {
        Scanner sc = new Scanner(in);
        char[] input = sc.nextLine().toCharArray();
        input_buffer.input_length = input.length;

        input_buffer.buffer_length = 16;
        input_buffer.buffer = new char[input_buffer.buffer_length];
        for (int i = 0; i < input_buffer.input_length; i++) {
            input_buffer.buffer[i] = input[i];
        }

        return input_buffer.input_length;
    }

    public void read_input(InputBuffer input_buffer) {
        int bytes_read = getline(input_buffer, System.in);
        if (bytes_read <= 0) {
            System.out.println("Error reading input");
            System.exit(-1);
        }

        // input_buffer.input_length = bytes_read - 1;
        // input_buffer.buffer[bytes_read - 1] = 0;
    }

    public void close_input_buffer() {
        System.gc();
    }
}
