package school.lemon.changerequest.java.io.hw2;


import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public interface FileCopyUtil {
    /**
     * Perform copying of src file into dst
     *
     * @param src file to copy
     * @param dst destination file
     * @return true if file was copied
     * @throws FileNotFoundException      if source file wasn't found
     * @throws FileAlreadyExistsException if destination file already exists
     * @throws FileCopyException          if any IO exception happened, or given src/dst is directory
     */
    boolean copy(String src, String dst) throws FileNotFoundException, FileAlreadyExistsException, FileCopyException;

}
