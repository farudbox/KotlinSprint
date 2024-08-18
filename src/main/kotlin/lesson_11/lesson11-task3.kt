package org.example.lesson_11

class Participant(
    val nickname: String,
    val avatar: String,
    var status: String,
)

class Room(
    val cover: String,
    val title: String,
    val participants: MutableList<Participant> = mutableListOf()
) {
    fun addParticipant(participant: Participant) {
        participants.add(participant)
        println("Участник ${participant.nickname} добавлен в комнату $title")
    }

    fun updateStatus(nickname: String, newStatus: String) {
        val participant = participants.find { it.nickname == nickname }
        if (participant != null) {
            participant.status = newStatus
            println("Статус участника $participant обновлен на \"$newStatus\"")
        } else println("Участник с никнеймом $nickname не найден в комнате $title")
    }

    fun displayRoomInfo() {
        println("Комната: $title")
        println("Обложка: $cover")
        println("Участники:")
        participants.forEach { participant ->
            println(" - ${participant.nickname}: ${participant.status}")
        }
    }
}

fun main() {
    val room = Room(
        cover = "cover.jpg",
        title = "title",
    )

    val participant1 = Participant(nickname = "user1", avatar = "avatar.jpg", status = "разговаривает")
    val participant2 = Participant(nickname = "user2", avatar = "avatar.jpg", status = "микрофон выключен")
    val participant3 = Participant(nickname = "user3", avatar = "avatar.jpg", status = "пользователь заглушен")

    room.addParticipant(participant1)
    room.addParticipant(participant2)
    room.addParticipant(participant3)

    room.updateStatus(nickname = "Bob", newStatus = "разговаривает")

    room.displayRoomInfo()
}