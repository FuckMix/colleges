package cn.edu.zjut.colleges.controller;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Tim on 2018/3/12
 */
public class CollegeApiController {

    private static final String GET_TOP_100_COLLEGES = "college.getTop100Colleges";

    private String method;

    private String result;

    private InputStream inputStream;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String methodRequest() {
        return null;
//        if (method.equals(GET_TOP_100_COLLEGES)) {
//            result = getTop100Colleges();
//            inputStream = new ByteArrayInputStream(result.getBytes());
//            System.out.println(result);
//        }
//        return SUCCESS;
    }

    private String getTop100Colleges() {
        return null;
//        CollegeDao dao = new CollegeDao();
//        List<College> colleges = dao.selectTop100Colleges(2017);
////        System.out.println(colleges);
////        List<MapPoint> mapPoints = convertToMapPoints(colleges);
//        Gson gson = new Gson();
//
//
//        return gson.toJson(colleges);
    }

//    private List<MapPoint> convertToMapPoints(List<College> colleges) {
//        colleges.sort(Comparator.comparing(College::getDistrict));
//
//        List<MapPoint> resultList = new ArrayList<>();
//        MapPoint cur = new MapPoint();
//        List<College> areaColleges = new ArrayList<>();
//        for (int i = 0; i < colleges.size(); ++i) {
//            College curCollege = colleges.get(i);
//            if (i == 0) {
//                areaColleges.add(curCollege);
//                cur.increaseValue();
//                cur.setName(curCollege.getDistrict());
//            } else {
//                if (curCollege.getDistrict().equals(colleges.get(i - 1).getDistrict())) {
//                    cur.increaseValue();
//                    areaColleges.add(curCollege);
//                } else {
//                    cur.setColleges(areaColleges);
//                    resultList.add(cur);
//                    cur = new MapPoint();
//                    areaColleges = new ArrayList<>();
//                    cur.setName(curCollege.getDistrict());
//                    cur.increaseValue();
//                    areaColleges.add(curCollege);
//                }
//            }
//        }
//        cur.setColleges(areaColleges);
//        resultList.add(cur);
//
//        return resultList;
//    }
}
