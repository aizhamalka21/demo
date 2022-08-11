//package com.example.Money.boot;
//
//import com.example.Money.entity.User;
//import com.example.Money.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDate;
//
//@Component
//public class ApplicationStartRunner implements CommandLineRunner {
//
//
//    @Autowired
//    private UserService userService;
//
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        if(userService.getByUsername("admin") == null) {
//            User admin = new User();
//            admin.setUsername("admin");
//            admin.setPassword("1234");
//            admin.setActive(1L);
//            userService.createAdmin(admin);

//            ClientInfoModel clientInfo = new ClientInfoModel();
//            clientInfo.setName("Mirlan");
//            clientInfo.setSerName("Erik uulu");
//            clientInfo.setAddress("Togolok Moldo");
//            clientInfo.setBalance(1000.0);
//            clientInfo.setDateOfBirth(LocalDate.ofEpochDay(2002-02-21));
//            clientInfo.setEmail("zhumataevmirlan@gmail.com");
//            clientInfo.setGender(true);
//            clientInfo.setPhone("+996 708 046 305");
//            clientInfoService.createClient(clientInfo);
//
//            WorkersInfoModel workersInfoModel = new WorkersInfoModel();
//            workersInfoModel.setName("Artyr");
//            workersInfoModel.setSerName("Pendragon");
//            workersInfoModel.setEmail("kamilot.drago@gmail.com");
//            workersInfoModel.setAddress("Kamilot");
//            workersInfoModel.setGender(true);
//            workersInfoModel.setPhone("+999 999 999 999");
//            workersInfoModel.setDateOfBirth(LocalDate.ofEpochDay(1609-01-01));
//            workersInfoService.createWorker(workersInfoModel);

//        }
//    }
//}
