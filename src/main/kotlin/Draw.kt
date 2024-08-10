import org.openrndr.application
import org.openrndr.color.ColorRGBa
import org.openrndr.extra.color.presets.DARK_RED


fun main() = application {
    configure {
        width = 600
        height = 400
    }
    program {
        extend {
            drawer.fill = ColorRGBa.PINK
            drawer.stroke = ColorRGBa.fromHex("#a700ff")
            drawer.strokeWeight = 2.0
            drawer.circle(width / 2.0, height / 2.0, 200.0)
        }
    }
}
