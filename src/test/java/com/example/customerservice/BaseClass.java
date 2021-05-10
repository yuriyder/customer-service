package com.example.customerservice;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = CustomerServiceApplication.class)
@ExtendWith(SpringExtension.class)
public class BaseClass {

    @Autowired
    private CustomerRestController customerRestController;

    @MockBean
    private CustomerService customerService;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(customerRestController);

        Mockito.when(customerService.findCustomerById(1L))
                .thenReturn(new Customer(1L, "Michael", "Jordan"));
    }
}
