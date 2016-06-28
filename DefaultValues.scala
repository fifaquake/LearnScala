def mail(destination:String="head office", mailClass:String="first") = 
	println(s"Sending to $destination by $mailClass class")

mail("Houston office", "Priority")
mail("Boston office")
mail()

mail(mailClass="Priority", destination="Shanghai")
