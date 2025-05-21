package org.example.Lesson11

fun main() {
    val room = VoiceRoom(
        cover = "cover_art.jpg",
        title = "Rebel Chat"
    )

    room.addParticipant(Participant("avatar1.png", "Anna", "speaking"))
    room.addParticipant(Participant("avatar2.png", "Max", "microphone off"))
    room.addParticipant(Participant("avatar3.png", "Lera", "muted"))

    room.updateParticipantStatus("Max", "speaking")

    room.printRoomInfo()
}

// Represents a participant in a voice room
class Participant(
    val avatar: String,
    val nickname: String,
    var status: String
)

// Represents a voice room for communication
class VoiceRoom(
    val cover: String,
    val title: String
) {
    private val participants = mutableListOf<Participant>()

    fun addParticipant(participant: Participant) {
        participants.add(participant)
    }

    // Updates the status of a participant by nickname
    fun updateParticipantStatus(nickname: String, newStatus: String) {
        val participant = participants.find { it.nickname == nickname }
        if (participant != null) {
            participant.status = newStatus
            println("Status of $nickname updated to \"$newStatus\"")
        } else {
            println("Participant \"$nickname\" not found in the room.")
        }
    }

    fun printRoomInfo() {
        println("Room: $title")
        println("Cover image: $cover")
        println("Participants:")
        participants.forEach {
            println("- ${it.nickname} (${it.avatar}) — ${it.status}")
        }
    }
}
