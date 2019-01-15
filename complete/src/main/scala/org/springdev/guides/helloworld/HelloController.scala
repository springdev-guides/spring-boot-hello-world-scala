package org.springdev.guides.helloworld

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class HelloController {

  @GetMapping(Array("/hello"))
  def hello() : String = {
    "Hello, World!"
  }

}
