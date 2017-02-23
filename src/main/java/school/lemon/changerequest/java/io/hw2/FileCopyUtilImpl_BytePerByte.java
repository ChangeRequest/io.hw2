package school.lemon.changerequest.java.io.hw2;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

/**
 * Created by lera on 13.02.17.
 */
public class FileCopyUtilImpl_BytePerByte implements FileCopyUtil {
    @Override
    public boolean copy(String src, String dst) throws FileNotFoundException, FileAlreadyExistsException, FileCopyException {
        File fileSource = new File(src);
        if (!fileSource.exists()) throw new FileNotFoundException(src);
        File fileDst = new File(dst);
        if (fileDst.exists()) throw new FileAlreadyExistsException(dst);
        try (InputStream is = new FileInputStream(src);
             OutputStream os = new FileOutputStream(fileDst)) {
            int byteRead;
            while ((byteRead = is.read()) != -1) {
                os.write(byteRead);
            }
        } catch (IOException e) {
            new FileCopyException(e);
        }
        return true;
    }
}
