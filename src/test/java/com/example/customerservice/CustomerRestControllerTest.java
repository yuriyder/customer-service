//package com.example.customerservice;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//public class CustomerRestControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private CustomerService customerService;
//
//    @Test
//    public void shouldReturnCustomerById() throws Exception {
//
//        Mockito.when(customerService.findCustomerById(1L))
//                .thenReturn(new Customer(1L, "Michael", "Jordan"));
//
//        mockMvc.perform((MockMvcRequestBuilders.get("/customer/1")))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("id").value(1L))
//                .andExpect(MockMvcResultMatchers.jsonPath("firstName").value("Michael"))
//                .andExpect(MockMvcResultMatchers.jsonPath("lastName").value("Jordan"))
//                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
//    }
//}
