package edu.wctc.report.impl;

import edu.wctc.report.Sale;
import edu.wctc.report.iface.SalesInput;

import java.io.BufferedReader;
//import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class ReadSalesFile implements SalesInput {

    @Override
    public List<Sale> getSales() {

        String pathToCsv = "C:\\Users\\jerry\\Downloads\\sales-report\\src\\main\\java\\edu\\wctc\\report\\sales.txt";
        // pass the path to the file as a parameter
//        File file = new File(pathToCsv);
//        if (file.isFile()){
//            Scanner sc = new Scanner(file);
//            while (sc.hasNextLine()){
//                System.out.println(sc.nextLine());
//            }
//        }

        String line = "";
        String delimiter = ",";
        List<Sale> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToCsv))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] data = line.split(delimiter);

                BigDecimal bigDecimal1 = new BigDecimal(data[2]);
                BigDecimal bigDecimal2 = new BigDecimal(data[3]);
                Sale sale = new Sale(data[0], data[1], bigDecimal1, bigDecimal2);
                list.add(sale);

                //System.out.printf("Buyer name = " + data[0] + ", Country = " + data[1] + ", Purchase Amount = " + data[2] + ", Tax Amount = " + data[3]);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
