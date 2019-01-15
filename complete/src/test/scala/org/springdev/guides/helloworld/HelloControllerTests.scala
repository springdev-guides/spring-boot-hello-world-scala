package org.springdev.guides.helloworld

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(classOf[SpringRunner])
@WebMvcTest  // <1>
class HelloControllerTests {
  @Autowired
  var mockMvc : MockMvc = _

  @Test
  def hello() : Unit = {
    this.mockMvc.perform(get("/hello"))  // <2>
      .andDo(print())
      .andExpect(status().isOk())  // <3>
      .andExpect(content().string("Hello, World!"))  // <4>
  }

}
