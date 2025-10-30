import java.io.*;

public class LowStockAlert {
    public static void main(String[] args) {
        try {
            File inputFile = new File("inventory.txt");
            File outputFile = new File("low_stock_alert.txt");

            
            if (!inputFile.exists()) {
                BufferedWriter sampleWriter = new BufferedWriter(new FileWriter(inputFile));
                sampleWriter.write("USB Cable,3,199\n");
                sampleWriter.write("Laptop,12,72000\n");
                sampleWriter.write("Mouse,1,450\n");
                sampleWriter.write("Tab,3,25000\n");
                sampleWriter.close();
                System.out.println("inventory.txt not found — sample file created!");
            }

            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            bw.write("***** LOW STOCK REPORT *****\n");
            bw.write(String.format("%-15s %-10s %-10s\n", "Product", "Stock", "Price"));
            bw.write("-----------------------------------------\n");

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String productName = parts[0].trim();
                    int stock = Integer.parseInt(parts[1].trim());
                    double price = Double.parseDouble(parts[2].trim());

                    if (stock < 5) {
                        bw.write(String.format("%-15s %-10d %-10.2f\n", productName, stock, price));
                    }
                }
            }

            br.close();
            bw.close();

            System.out.println("Low stock items written to low_stock_alert.txt successfully!");
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
