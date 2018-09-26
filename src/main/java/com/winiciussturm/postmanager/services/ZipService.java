package com.winiciussturm.postmanager.services;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipService 
{
	
    public static void compress(String dirPath) 
    {
        Path sourceDir = Paths.get(dirPath);
        Integer id = 99;
        String zipFileName = id.toString().concat(".zip");
        try 
        {
            ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(zipFileName));
            Files.walkFileTree(sourceDir, new SimpleFileVisitor<Path>() 
            {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) {
                    try 
                    {
                        Path targetFile = sourceDir.relativize(file);
                        outputStream.putNextEntry(new ZipEntry(targetFile.toString()));
                        byte[] bytes = Files.readAllBytes(file);
                        outputStream.write(bytes, 0, bytes.length);
                        outputStream.closeEntry();
                    } 
                    catch (IOException e) 
                    {
                        e.printStackTrace();
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
            outputStream.close();
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}