package com.lambo.org;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Repository {
        void writedata(String factoryname,String cityname,Double avgwage,int workers,int stores){
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            FileOutputStream fout;
            byte b[];
            try{
//                fout = new FileOutputStream("src/FactoryRepo.txt");
//                b = factoryname.getBytes();
//                fout.write(b);
//                b = cityname.getBytes();
//                fout.write(b);
//                b = avgwage.toString().getBytes();
//                fout.write(b);
//                fout.write(workers);
//                fout.write(stores);
                try {
                    final Path path = Paths.get("src/FactoryRepo.txt");
                    Files.write(path, Arrays.asList(factoryname+" "+cityname +" " +avgwage+" "+workers+" "+stores+"\n"), StandardCharsets.UTF_8,
                            Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                } catch (final IOException ioe) {
                    // Add your own exception handling...
                }

            }
            catch(Exception e){
                System.out.print("Exception Occurred");
            }
        }

    void readdata(){
        try{
            FileOutputStream fout = new FileOutputStream("src/FactoryRepo.txt");
        }
        catch(Exception e){
            System.out.print("Exception Occurred");
        }
    }

}
