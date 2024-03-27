package menu;

import services.ManagementService;
import services.ManagementServiceImpl;
import util.InputUtil;

public class Menu {

    public static void menu() {
        while (true) {
        System.out.println(
                "======| Employe Management System |======\n" +
                        "[1]. See All Employee\n" +
                        "[2]. Find Employee\n" +
                        "[3]. Add New Employee\n" +
                        "[4]. Update \n" +
                        "[5]. Delete \n" +
                        "[6]. EXIT \n"

        );

        ManagementService managementService = new ManagementServiceImpl();

            int option = InputUtil.InputRequiredInt("Please Selecet Option: ");

            switch (option) {
                case 1:
                    managementService.seeAllEmployee();
                    break;
                case 2:
                    managementService.findEmployee();
                    break;
                case 3:
                    managementService.addNewEmployee();
                    break;
                case 4:
                    managementService.updateEmployee();
                    break;
                case 5:
                    managementService.deleteEmployee();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please select the correct Option!");

            }


        }
    }


}
