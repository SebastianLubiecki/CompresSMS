import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;


public class CompressBySpecialLibrary implements Compressor {

    @Override
    public String compress(String text) throws IOException {


        ByteArrayOutputStream bos = new ByteArrayOutputStream(text.length());
        GZIPOutputStream gzip = new GZIPOutputStream(bos);
        gzip.write(text.getBytes());
        gzip.close();
        byte[] compressed = bos.toByteArray();
        bos.close();

        return new String(compressed);
    }

    @Override
    public String deCompress(String text) throws IOException {

        // get the bytes for the compressed string
        byte[] compressed = text.getBytes(StandardCharsets.UTF_8);

        // convert the bytes from base64 to normal string
        Base64.Decoder d = Base64.getDecoder();
        compressed = d.decode(compressed);

        // decode.
        final int BUFFER_SIZE = 32;
        ByteArrayInputStream is = new ByteArrayInputStream(compressed);
        GZIPInputStream gis = new GZIPInputStream(is, BUFFER_SIZE);
        StringBuilder string = new StringBuilder();
        byte[] data = new byte[BUFFER_SIZE];
        int bytesRead;
        while ((bytesRead = gis.read(data)) != -1) {
            string.append(new String(data, 0, bytesRead));
        }
        gis.close();
        is.close();
        return string.toString();
    }

    public static void main(String[] args) throws IOException {
        CompressBySpecialLibrary compressBySpecialLibrary = new CompressBySpecialLibrary();

        System.out.println(compressBySpecialLibrary.compress("asd asdsadasdd sdasda"));
        System.out.println(compressBySpecialLibrary.deCompress("[B@4554617c"));
    }

}
