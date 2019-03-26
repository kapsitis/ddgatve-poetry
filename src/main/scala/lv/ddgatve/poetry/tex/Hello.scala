package lv.ddgatve.poetry.tex

import scala.io.Source
import play.api.libs.json._
 

object Hello {
  def main(args:Array[String]): Unit = {
    val rawJson = Source.fromFile(
        "src/main/resources/talu-celu-vejs.json").getLines.mkString
    val json1 = Json.parse(rawJson)
    val title = (json1 \ "book" \ "title").as[String]
    print("title is " + title)
  }
  
}
