fun main() {
    var NewHeroes: HeroGenerator = HeroGenerator()
    NewHeroes.run(3, 8)
}

class Hero() {
    val intelligence: Int = (0..100).random()
    val strenght: Int = (0..100).random()
    val agility: Int = (0..100).random()
    val stamina: Int = (0..100).random()
}

class HeroGenerator() {
    fun run(MinBoard: Int, MaxBoard: Int){
        val NumberOfHeroes: Int = (MinBoard..MaxBoard).random()
        for (i in 1..NumberOfHeroes){
            var NewHero: Hero = Hero()
            println("Intelligence: ${NewHero.intelligence}  Strenght: ${NewHero.strenght} Agility: ${NewHero.agility} Stamina: ${NewHero.stamina}")
        } 
    }
}
