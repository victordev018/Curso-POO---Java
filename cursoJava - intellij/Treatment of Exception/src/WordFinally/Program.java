package WordFinally;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Program {

    public static void main (String[] args){
        // instanciando objeto do tipo File com um caminho para o arquivo
        File file = new File("C:\\JV past\\in.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            // enquanto exitsir uma próxima linha no arquivo para ser feita a leitura
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        // caso não encontre o arquivo especificado
        catch (FileNotFoundException e ){
            System.out.println("Error oppening file: "+e.getMessage());
        }
        // finally é executado independente se houve ou não exceção
        finally{
            if (sc != null){
                sc.close();
            }
            System.out.println("Finally block exected!");
        }

    }

}
