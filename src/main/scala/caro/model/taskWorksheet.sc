val x = 1
val y = 2

println(y + x)

case class Name(nachname: String, vorname: String)

val meinname = Name("Braun","Rebecca")

printf("Ich heiße %s %s", meinname.vorname, meinname.nachname)

case class Liste(namen: Array[Name])

