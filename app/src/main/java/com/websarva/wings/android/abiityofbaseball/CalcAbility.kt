package com.websarva.wings.android.abiityofbaseball

class CalcAbility {

    var tall = 0
    var bodyShape = 0
    var muscle = 0
    var looks = 0

    var kindness = 0
    var reliable = 0
    var attitude = 0
    var intelligence = 0


    var popularWithOpposite = 0
    var popularWithSame = 0
    var clutch = 0
    var favorabilityFromYou = 0

    var contact = 0
    var power = 0
    var speed = 0
    var armStrength = 0
    var fielding = 0

    fun calcAbility(){
        contact = bodyShape + looks*3 + kindness * 4 + reliable + intelligence*2 + popularWithOpposite + popularWithSame*2
        power = tall*4 + muscle*6 + looks + reliable + attitude*2
        speed = tall + bodyShape*3 + muscle*3 + looks*4 + attitude + popularWithOpposite*3
        armStrength = tall*2 + bodyShape*2 + muscle*2 + looks + attitude*7
        fielding =  kindness*4 + reliable*4 + intelligence*4 + popularWithSame*2

    }




}