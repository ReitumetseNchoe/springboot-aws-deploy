package springboot_aws_deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot-aws-deploy")

public class TestController {
    
    @GetMapping("/data")
    public String getData() {
        return "First message from AWS ECS";
    }

}
