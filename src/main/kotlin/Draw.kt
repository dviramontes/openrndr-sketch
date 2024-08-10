import org.openrndr.application
import org.openrndr.color.ColorRGBa
import kotlin.math.cos
import kotlin.math.sin


fun main() = application {
    configure {
        width = 600
        height = 400
    }
    program {
        extend {
            val mainRadius = 100.0
            val radius = 12.0
            drawer.clear(ColorRGBa.CYAN)
            drawer.circle(drawer.bounds.center, mainRadius)
            repeat(10) {
                val a = it * 2 * Math.PI / 10
                val x = (mainRadius + radius) * cos(a) + drawer.bounds.center.x
                val y = (mainRadius + radius) * sin(a) + drawer.bounds.center.y
                drawer.circle(x, y, radius)
            }
        }
    }
}
