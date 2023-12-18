import java.util.Arrays

fun main(args: Array<String>) {
    while (true) {
        println(" Хотите закончить работу или составить план поезда? Введите ‘finish’ для окончания работы или ‘plan’ для составления плана поезда.")
        val input = readLine()
        if (input == "finish") {
            break
        } else if (input == "plan") {

            val cities = ArrayList<String>()
            cities.addAll(
                Arrays.asList(
                    "Бийск",
                    "Барнаул",
                    "Новосибирск",
                    "Томск",
                    "Кемерово",
                    "Красноярск",
                    "Иркутск",
                    "Чита",
                    "Улан-Удэ",
                    "Хабаровск",
                    "Владивосток",
                    "Благовещенск",
                    "Екатеринбург",
                    "Челябинск",
                    "Пермь"
                )
            )
            var startCity = cities.random()
            var endCity = cities.random()
            while (startCity == endCity) {
                startCity = cities.random()
            }
            println("$startCity - $endCity")

            var passengers = (5..200).random()
            print("Будет продано $passengers билетов.")

            var vagCapacity = (5..25).random()

            var vagost = passengers % vagCapacity
            var vagons = 0

            if (vagost > 0) {
                 vagons = (passengers / vagCapacity) + 1
            }
            else {
                 vagons = passengers / vagCapacity
            }
            print(" Вместимость каждого вагона $vagCapacity, всего вагонов $vagons.")
        }
    }
}