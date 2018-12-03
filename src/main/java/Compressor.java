import java.io.IOException;

public interface Compressor {

    String compress(String text) throws IOException;

    String deCompress(String text) throws IOException;
}
