package cn.edu.zjut.colleges.entity;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tim on 2018/4/26
 */
public class Districts {
    private static Map<String, District> map = null;


    private Districts() {
    }

    private static void init() {
//        map = new HashMap<>();
//        DistrictDao dao = new DistrictDao();
//        List<District> districts = dao.getDistricts();
//        for (District district : districts) {
//            map.put(district.getDistrict(), district);
//        }
    }

    public static District get(String dist) {
        if (map == null) init();
        return map.get(dist);
    }
}
