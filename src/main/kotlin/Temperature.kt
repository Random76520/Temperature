class Temperature(temperatureValue: Double, temperatureType: TemperatureType) {

    private var temperature: Double = convertToFahrenheit(temperatureValue, temperatureType)

    enum class TemperatureType {
        FAHRENHEIT,
        CELSIUS,
        KELVIN
    }

    fun setTemperature(value: Double, type: TemperatureType) {
        temperature = convertToFahrenheit(value, type)
    }

    fun getTemperatureInF(): Double {
        return temperature
    }

    fun getTemperatureInC(): Double {
        return convertFromFahrenheit(temperature, TemperatureType.CELSIUS)
    }

    fun getTemperatureInK(): Double {
        return convertFromFahrenheit(temperature, TemperatureType.KELVIN)
    }

    private fun convertToFahrenheit(value: Double, type: TemperatureType): Double {
        return when (type) {
            TemperatureType.FAHRENHEIT -> value
            TemperatureType.CELSIUS -> value * 9/5 + 32
            TemperatureType.KELVIN -> (value - 273.15) * 9/5 + 32
        }
    }

    private fun convertFromFahrenheit(value: Double, targetUnit: TemperatureType): Double {
        return when (targetUnit) {
            TemperatureType.FAHRENHEIT -> value
            TemperatureType.CELSIUS -> (value - 32) * 5/9
            TemperatureType.KELVIN -> (value - 32) * 5/9 + 273.15
        }
    }
}