package org.example.Lesson17

fun main() {
    val secretFolder = Folder("ProjectX", 42, isSecret = true)

    println("Folder name: ${secretFolder.name}")
    println("File count: ${secretFolder.fileCount}")
}

class Folder(
    private val realName: String,
    private val realFileCount: Int,
    private val isSecret: Boolean
) {

    val name: String
        get() = if (isSecret) "hidden folder" else realName

    val fileCount: Int
        get() = if (isSecret) 0 else realFileCount
}
