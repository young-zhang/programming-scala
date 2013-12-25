object OptionalUserProfileInfo {
  val UnknownLocation = ""
  val UnknownAge = -1
  val UnknownWebSite = ""
}

class OptionalUserProfileInfo(location: String = OptionalUserProfileInfo.UnknownLocation,
                              age: Int = OptionalUserProfileInfo.UnknownAge,
                              webSite: String = OptionalUserProfileInfo.UnknownWebSite) {
  override def toString(): String = return f"age: $age; location: $location%s; webSite: $webSite%s"
}

object UserProfile {
  def main(args: Array[String]) = {
    println(new OptionalUserProfileInfo)
    println(new OptionalUserProfileInfo(age = 29))
    println(new OptionalUserProfileInfo(age = 29, location = "Earth"))
  }
}