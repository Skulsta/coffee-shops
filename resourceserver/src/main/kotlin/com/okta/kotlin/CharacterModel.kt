package com.okta.kotlin

import javax.persistence.*

@Entity
class CharacterModel(
    val name: String,
    val livesIn: String,
    val address: String,
    @ElementCollection
    val bestGifts: List<String>)
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = -1
}
