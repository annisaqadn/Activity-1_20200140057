/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.tugas.b;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.projectService;

/**
 *
 * @author annisaqadn
 */
@Controller
public class fileController {
    
    projectService serv = new projectService();
    
    @RequestMapping("/dataktp")
    @ResponseBody
    
    public ArrayList<List<String>> getDataKTP(){
      
        return serv.isidata();
    }
}