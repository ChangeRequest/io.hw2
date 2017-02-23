package school.lemon.changerequest.java.io.hw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;

/**
 * Created by lera on 13.02.17.
 */
public class FileCopyUtilImpl_NIO implements FileCopyUtil {
    @Override
    public boolean copy(String src, String dst) throws FileNotFoundException, FileAlreadyExistsException, FileCopyException {
        File fileSource = new File(src);
        if (!fileSource.exists()) throw new FileNotFoundException(src);
        File fileDst = new File(dst);
        if (fileDst.exists()) throw new FileAlreadyExistsException(dst);
        try {
            Files.copy(fileSource.toPath(), fileDst.toPath());
        } catch (IOException e) {
            new FileCopyException(e);
        }
        return true;
    }
}
