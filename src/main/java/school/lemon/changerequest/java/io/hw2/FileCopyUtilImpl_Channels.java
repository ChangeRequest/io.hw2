package school.lemon.changerequest.java.io.hw2;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.FileAlreadyExistsException;

/**
 * Created by lera on 09.02.17.
 */
public class FileCopyUtilImpl_Channels implements FileCopyUtil {

    @Override
    public boolean copy(String src, String dst) throws FileNotFoundException, FileAlreadyExistsException, FileCopyException {
        File fileSource = new File(src);
        if (!fileSource.exists()) throw new FileNotFoundException(src);
        File fileDst = new File(dst);
        if (fileDst.exists()) throw new FileAlreadyExistsException(dst);
        try (FileChannel sourceChannel = new FileInputStream(fileSource).getChannel();
             FileChannel destChannel = new FileOutputStream(fileDst).getChannel()) {
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        } catch (IOException e) {
            new FileCopyException(e);
        }
        return true;
    }
}
