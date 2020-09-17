package me.job.phlyt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class PhlytApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhlytApplication.class, args);
    }

    @GetMapping(value = "/points", produces = MediaType.APPLICATION_JSON_VALUE)
    //@ResponseBody
    public List<Point> getPoints(/*@Param("location") */String location){
        System.out.println("Location: " + location);

        List<Point> points = new ArrayList<>();

        points.add(new Point(100));
        points.add(new Point(400));
        points.add(new Point(300));
        points.add(new Point(160));

        return points;
    }

    /**
     * curl:
     * curl localhost:8080/points2?requestId=108&requestSeq=208
     *
     * @param pointRequest
     * @return
     */
    @GetMapping(path = "/points2")
    public List<Point> getPoints2(PointRequest pointRequest){
        System.out.println("Request: " + pointRequest);

        List<Point> points = new ArrayList<>();

        points.add(new Point(100));
        points.add(new Point(400));
        points.add(new Point(300));
        points.add(new Point(160));

        return points;
    }

    /**
     * curl:
     * curl localhost:8080/points3?pointRequest=%7B%22requestId%22%3A%22abc%22%2C+%22requestSeq%22%3A+%22300%22%7D
     * Before encoded: pointRequest={"requestId":"abc", "requestSeq": "300"}
     *
     * @param pointRequest
     * @return
     */
    @GetMapping(path = "/points3")
    public List<Point> getPoints3(@Param("pointRequest") String pointRequest){  //@RequestParam does the same
        System.out.println("Request: " + pointRequest);

        List<Point> points = new ArrayList<>();

        points.add(new Point(100));
        points.add(new Point(400));
        points.add(new Point(300));
        points.add(new Point(160));

        return points;
    }
}
