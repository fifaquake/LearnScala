def getPersonInfo(primaryKey : Int) = {
	("Venkat", "Subramaniam", "venkas@agiledeveloper.com")
}

val (firstName, lastName, emailAddress) = getPersonInfo(1)

println(s"First Name: $firstName")
println(s"Last Name: $lastName")
println(s"Email Address: $emailAddress")
