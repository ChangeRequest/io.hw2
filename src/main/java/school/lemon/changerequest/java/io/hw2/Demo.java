package school.lemon.changerequest.java.io.hw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

/**
 * Created by lera on 22.02.17.
 */
public class Demo {

    public static void copyFile(String src, String dst, FileCopyUtil fileCopyUtil) {
        try {
            long result = 0;
            File newFile = new File(dst);
            for (int i = 0; i < 1000; i++) {
                long before = System.currentTimeMillis();
                fileCopyUtil.copy(src, dst);
                long after = System.currentTimeMillis();
                result += after - before;
                newFile.delete();
            }
            System.out.println("Taken time fore copying file using " + fileCopyUtil.getClass().getSimpleName() + " is " + result / 1000);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (FileAlreadyExistsException e) {
            e.printStackTrace();
        } catch (FileCopyException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String src = "FileSrc";
        String dst = "FileDst";

        copyFile(src, dst, new FileCopyUtilImpl_bufferedStreams());
        copyFile(src, dst, new FileCopyUtilImpl_BytePerByte());
        copyFile(src, dst, new FileCopyUtilImpl_Channels());
        copyFile(src, dst, new FileCopyUtilImpl_NIO());
    }
}

