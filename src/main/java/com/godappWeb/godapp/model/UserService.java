package com.godappWeb.godapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.godappWeb.godapp.api.User;

@Service
public class UserService {
    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1124, "Hoàng Chí Trung", "Kiro", "trunghoang1124@gmail.com", "kirohoang112k4@gmail.com", "11/11/2004", "0765238146", "Dev", "Active");
        User user2 = new User(1902, "Nguyễn Mạnh Hưng", "Dino", "hungmanh190204@gmail.com", " ", "19/02/2004", "0961359102", "Admin", "Inactive");
        User user3 = new User(0302, "Nguyễn Minh Hoàng", "Sow", "sowdeepttry@gmail.com", " ", "03/02/2004", "0868318479", "Admin", "Active");
        User user4 = new User(1002, "Nguyễn Vũ Anh Hào", "Issa", "anhhao5500@gmail.com", " ", "10/02/2002", "0795923719", "Mod", "Active");
        User user5 = new User(2707, "Đỗ Tuấn Khang", "Kay", "qab.dotuankhang2703@gmail.com", "kakhang041@gmail.com", "27/07/2009", "0347158551", "Trial", "Active");
        User user6 = new User(2603, "Trần Như Khải", "Hajin", "trankhai260324@gmail.com", " ", "26/03/2004", "0585355680", "Mod", "Inactive");
        User user7 = new User(02044, "Đỗ Hoài Huy", "Hyu", "huydo2k6@gmail.com", " ", "02/08/2006", "0349398427", "Mod", "Active");
        User user8 = new User(2908, "Ngô Anh Khôi", "AKi", "anhkhoi2908.ng@gmail.com", "khoingo965@gmail.com", "29/08/2004", "0327289867", "Mod", "Active");

        
        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8));
    }

    public Optional<User> getUser(int id) {
        Optional<User> optional = Optional.empty(); 
        for (User user : userList) {
            if (id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
