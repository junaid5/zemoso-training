package intro.javaAssignment1;
import java.io.File;
import java.util.Scanner;

public class FindFile {
    String res="file not found";
    public void rFindFile(String fileToBeFound,File folders){
        String[] str=folders.list();
        if(str==null){
            return;
        }
        for (String currFile : str) {
            if(fileToBeFound.equals(currFile)){
                res="file found";
                return;
            }
            File NewFolder=new File(folders.getAbsolutePath()+"/"+currFile);
            if(NewFolder.exists()) {
                rFindFile(fileToBeFound, NewFolder);
            }
        }
    }

        public void findFile()
        {
            File folders = new File("C:\\Users\\ADMIN\\Desktop");
            String str ;
            Scanner in = new Scanner(System.in);
            while(true){
                res="file not found";
                System.out.println("ENTER THE NAME OF FILE OR FOLDER");
                str =in.nextLine();
                this.rFindFile(str,folders);
                System.out.println(res);
            }
        }

        public static void main(String[] args){
            FindFile obj =new FindFile();
            obj.findFile();
        }
    }

