import org.openrndr.application
import org.openrndr.color.ColorRGBa
import org.openrndr.math.Polar
import org.openrndr.math.Vector2
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
//            val subRect = drawer.bounds.sub(0.0, 0.0, 0.5, 1.0)
            val subRect = drawer.bounds

            drawer.clear(ColorRGBa.CYAN)
            drawer.rectangle(subRect)
            drawer.fill = ColorRGBa.PINK
            drawer.circle(subRect.center, mainRadius)

            repeat(10) {
                val a = 360.0 * it / 10
                val p = subRect.center + Polar(a, mainRadius).cartesian
                drawer.circle(p, radius)
            }
        }
    }
}
