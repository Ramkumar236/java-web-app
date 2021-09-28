package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.print("Enter two numbers: ");
// nextDouble() reads the next double from the keyboard
double first = 12.5
double second = 15.5
System.out.print("Enter an operator (+, -, *, /): ");
	for(int i=0;i<4;i++){
		char operator = i
double result;
//switch case for each of the operations
switch(operator)
{
case '0':
result = first + second;
break;
case '1':
result = first - second;
break;
case '2':
result = first * second;
break;
case '3':
result = first / second;
break;
// operator doesn't match any case constant (+, -, *, /)
 
 
default:
System.out.printf("Error! operator is not correct");
return;
}
}
//printing the result of the operations
System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
	}

	@RequestMapping("/")
  public String home() {
    return "Hello Docker World!";
  }
}
