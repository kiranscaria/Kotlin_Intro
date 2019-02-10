open class BaseBuildingMaterial() {
    open val numberNeeded: Int = 1
}

class Wood: BaseBuildingMaterial() {
    override val numberNeeded = 4
}  

class Brick: BaseBuildingMaterial() {
    override val numberNeeded = 8
}  

class Building<T: BaseBuildingMaterial>(val buildingMaterial: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded
    fun build() {
        println("${actualMaterialsNeeded} ${buildingMaterial::class.simpleName} required")
    }
}

fun <T: BaseBuildingMaterial> isBuildingSmall(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("small building")
    } else {
        println("large building")
    }
}

fun main(args: Array<String>) {
    Building( Wood() ).build()
    isBuildingSmall( Building( Wood() ) )
}