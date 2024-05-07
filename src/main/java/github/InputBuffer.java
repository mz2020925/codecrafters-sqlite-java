package github;

public class InputBuffer {
    public char[] buffer;
    public int buffer_length;
    public int input_length;

    public InputBuffer() {
        this.buffer = null;
        this.buffer_length = 0;
        this.input_length = 0;
    }
}
