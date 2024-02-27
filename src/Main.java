import service.ClassService;
import service.StudentService;
import service.TechmasterService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TechmasterService techmasterService = new TechmasterService();
        techmasterService.inputInfo(scanner);

    }
}