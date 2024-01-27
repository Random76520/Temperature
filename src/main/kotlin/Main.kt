import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter initial temperature value: ")
    val initialValue = scanner.nextDouble()

    print("Enter initial temperature type (Fahrenheit, Celsius, Kelvin): ")
    val initialTypeStr = scanner.next()
    val initialType = Temperature.TemperatureType.valueOf(initialTypeStr.uppercase(Locale.getDefault()))

    val temperature = Temperature(initialValue, initialType)

    println("Initial Temperature in Fahrenheit: ${temperature.getTemperatureInF()}")
    println("Initial Temperature in Celsius: ${temperature.getTemperatureInC()}")
    println("Initial Temperature in Kelvin: ${temperature.getTemperatureInK()}")

    // Setting a new temperature value
    print("Enter new temperature value: ")
    val newValue = scanner.nextDouble()

    print("Enter new temperature type (Fahrenheit, Celsius, Kelvin): ")
    val newTypeStr = scanner.next()
    val newType = Temperature.TemperatureType.valueOf(newTypeStr.uppercase(Locale.getDefault()))

    temperature.setTemperature(newValue, newType)

    println("Updated Temperature in Fahrenheit: ${temperature.getTemperatureInF()}")
    println("Updated Temperature in Celsius: ${temperature.getTemperatureInC()}")
    println("Updated Temperature in Kelvin: ${temperature.getTemperatureInK()}")

    scanner.close()
}