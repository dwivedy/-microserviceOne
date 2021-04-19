package com.example.demo;

import java.io.IOException;
import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceOneApplication.class, args);
	}

}



@RestController
@RequestMapping("/service1")
 class UsersController {
    
    @GetMapping("/status")
    public String status() {
        return "Working1";
    }
    
	 @RequestMapping(value = "/urservice", method = RequestMethod.POST)
	    public void uploadFile(MultipartHttpServletRequest request) throws IOException {

	    Iterator<String> itr = request.getFileNames();

	    // directory to save file
//	    String tempDir = System.getProperty("jboss.server.temp.dir");

	      MultipartFile file = request.getFile(itr.next());
	      String fileType = request.getParameter("fileType");
	      String fileName = file.getOriginalFilename();
	      System.out.println(file);
	      System.out.println(fileType);
	      System.out.println(fileName);

//	      File dir = new File(tempDir);
//	      File fileToImport = null;
//	      if (dir.isDirectory()) {
//
//	        try {
//	            fileToImport = new File(dir + File.separator + fileName);
//	            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(fileToImport));
//	            stream.write(file.getBytes());
//	            stream.close();
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//
//	}

	 }
}
