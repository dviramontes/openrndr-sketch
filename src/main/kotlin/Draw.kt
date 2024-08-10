import org.openrndr.application
import org.openrndr.color.ColorRGBa
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
            val subRect = drawer.bounds.sub(0.0, 0.0, 0.5, 1.0)

            drawer.clear(ColorRGBa.CYAN)
            drawer.rectangle(subRect)
            drawer.fill = ColorRGBa.PINK
            drawer.circle(subRect.center, mainRadius)

            repeat(10) {
                val a = it * 2 * Math.PI / 10
                val p = subRect.center + Vector2(
                    cos(a) * mainRadius,
                    sin(a) * mainRadius
                )
                drawer.circle(p, radius)
            }
        }
    }
}
