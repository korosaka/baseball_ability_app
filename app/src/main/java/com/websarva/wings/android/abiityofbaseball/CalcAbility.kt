package com.websarva.wings.android.abiityofbaseball

class CalcAbility(a1_a: String, a2_a: String, a3_a: String, a4_a: String, a5_a: String,
                  a1_p: String, a2_p: String, a3_p: String, a4_p: String, a5_p: String,
                  a1_o: String, a2_o: String, a3_o: String, a4_o: String, a5_o: String) {


    val STARTER_INDEX = 0
    val MIDLLE_INDEX = 1
    val CLOSER_INDEX = 2


    val a1_a = a1_a
    val a2_a = a2_a
    val a3_a = a3_a
    val a4_a = a4_a
    val a5_a = a5_a

    val a1_p = a1_p
    val a2_p = a2_p
    val a3_p = a3_p
    val a4_p = a4_p
    val a5_p = a5_p


    val a1_o = a1_o
    val a2_o = a2_o
    val a3_o = a3_o
    val a4_o = a4_o
    val a5_o = a5_o

    // 野手能力ポイント
    var ballistic = 0
    var contact = 0
    var power = 0
    var speed = 0
    var armStrength = 0
    var fielding = 0
    var catching = 0

    var chance = 1.0

    // 投手能力ポイント
    var ballSpeed = 0
    var control = 0
    var stamina = 0
    var kindsOfChangeBall = 0
    var amountOfCange = 0
    var priorityOfChange = arrayListOf(0, 0, 0, 0, 0)

    var pitcherTypes = intArrayOf(0, 0, 0)
    private var pitcherType = ""
    fun getPitcherType(): String {
        return pitcherType
    }


    init {

        if (PlayerMakingActivity.sex_id == 0) {
            calcAbility_m()
        } else {
            calcAbility_w()
        }

    }

    fun calcAbility_m() {

        when (a1_a) {
            "~160cm" -> {
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.CONTROL, 5)
                plusAbility(Constants.STAMINA, 1)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 5)
                plusAbility(Constants.MIDDLE, 5)

            }
            "161~170cm" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 7)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.CURB, 3)
                plusAbility(Constants.MIDDLE, 3)

            }
            "171~180cm" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.POWER, 10)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 4)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.FOLK, 5)
                plusAbility(Constants.STARTER, 3)
            }
            "181~190cm" -> {
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.POWER, 16)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.BALL_SPEED, 12)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 6)
                plusAbility(Constants.SLIDER, 4)
                plusAbility(Constants.FOLK, 12)
                plusAbility(Constants.STARTER, 3)
                plusAbility(Constants.MIDDLE, -3)
            }
            "191cm~" -> {
                plusAbility(Constants.BALLISTIC, 7)
                plusAbility(Constants.POWER, 20)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.BALL_SPEED, 16)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.SLIDER, 5)
                plusAbility(Constants.FOLK, 18)
                plusAbility(Constants.STARTER, 3)
                plusAbility(Constants.MIDDLE, -5)

            }
        }

        when (a2_a) {
            "ふつう" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)

            }
            "スリム" -> {
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 3)
                plusAbility(Constants.CLOSER, -3)
            }
            "ぽっちゃり" -> {
                plusAbility(Constants.BALLISTIC, 18)
                plusAbility(Constants.POWER, 6)
                plusAbility(Constants.SPEED, -12)
                plusAbility(Constants.BALL_SPEED, 9)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.CURB, 5)
                plusAbility(Constants.CLOSER, 1)
            }
            "ムッチリ" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, -3)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.SHOOT, 3)
                plusAbility(Constants.CLOSER, 2)
            }
            "ややマッチョ" -> {
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.POWER, 12)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.BALL_SPEED, 15)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 13)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SHOOT, 2)
                plusAbility(Constants.STARTER, 5)
            }
            "ゴリマッチョ" -> {
                plusAbility(Constants.BALLISTIC, 8)
                plusAbility(Constants.POWER, 18)
                plusAbility(Constants.SPEED, -10)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.BALL_SPEED, 25)
                plusAbility(Constants.CONTROL, -1)
                plusAbility(Constants.STAMINA, -5)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SHOOT, 2)
                plusAbility(Constants.CLOSER, 4)
            }
        }

        when (a3_a) {
            "ふつう" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
            }
            "イケメン" -> {
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 8)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 5)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 7)
                plusAbility(Constants.CATCHING, 3)
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.CONTROL, 7)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.KIND_CHANGE, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 2)
                plusAbility(Constants.STARTER, 5)
            }
            "ワイルド" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 8)
                plusAbility(Constants.SPEED, 5)
                plusAbility(Constants.ARM_STRENGTH, 8)
                plusAbility(Constants.BALL_SPEED, 11)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 12)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SHOOT, 5)

            }
            "かわいい" -> {
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 12)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 4)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 5)
                plusAbility(Constants.FOLK, 1)
                plusAbility(Constants.SINKER, 3)
                plusAbility(Constants.MIDDLE, 4)
            }
            "強面" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 8)
                plusAbility(Constants.BALL_SPEED, 10)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SHOOT, 10)
            }
        }

        when (a4_a) {
            "優しそう" -> {
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 6)
                plusAbility(Constants.BALL_SPEED, 2)
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.CURB, 3)
                plusAbility(Constants.FOLK, 1)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.MIDDLE, 2)
            }
            "明るそう" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 4)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 2)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.STARTER, 3)
            }
            "マジメそう" -> {
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 7)
                plusAbility(Constants.CATCHING, 5)
                plusSpecial(Constants.CHANCE, -0.05)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 10)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
                plusAbility(Constants.FOLK, 1)
                plusAbility(Constants.CLOSER, -3)
            }
            "クールそう" -> {
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 7)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 1)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 4)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 4)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 3)
            }
            "おとぼけ者" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, 1)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 4)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 4)
                plusAbility(Constants.SINKER, 7)
                plusAbility(Constants.MIDDLE, 2)
            }
            "チャラそう" -> {
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 7)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.CONTROL, -1)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SHOOT, 5)
                plusAbility(Constants.CLOSER, -2)
            }
        }

        when (a5_a) {
            "ふつう" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.CATCHING, 1)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
            }
            "オシャレ" -> {
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 4)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 2)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 12)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 3)
                plusAbility(Constants.STARTER, 1)
            }
            "地味め" -> {
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 6)
                plusAbility(Constants.CATCHING, 5)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.STAMINA, 8)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.MIDDLE, 4)
            }
            "派手め" -> {
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.CATCHING, -1)
                plusAbility(Constants.BALL_SPEED, 9)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.STAMINA, 2)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.SHOOT, 5)
                plusAbility(Constants.CLOSER, 4)
            }
            "独創的" -> {
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusSpecial(Constants.CHANCE, 0.08)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.STARTER, -5)
            }
        }

        when (a1_p) {
            "穏やか" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 4)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 9)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.CLOSER, -2)
            }
            "おとなしい" -> {
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 3)
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
                plusAbility(Constants.MIDDLE, 3)
            }
            "淡々" -> {
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 5)
                plusAbility(Constants.MIDDLE, 2)
            }
            "騒がしい" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, -2)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, -2)
                plusAbility(Constants.CATCHING, -3)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, -3)
                plusAbility(Constants.STAMINA, 2)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.CLOSER, 2)

            }
            "ミステリアス" -> {
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.POWER, 3)
                plusSpecial(Constants.CHANCE, 0.05)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.FOLK, 5)
                plusAbility(Constants.MIDDLE, 2)
            }
        }

        when (a2_p) {
            "優しい" -> {
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 5)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 10)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 7)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.FOLK, 1)
                plusAbility(Constants.SINKER, 1)
            }
            "頑張り屋さん" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 1)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.STAMINA, 15)
                plusAbility(Constants.KIND_CHANGE, 6)
                plusAbility(Constants.AMOUNT_CHANGE, 6)
                plusAbility(Constants.STARTER, 10)
            }
            "気が強い" -> {
                plusAbility(Constants.CONTACT, -2)
                plusAbility(Constants.ARM_STRENGTH, 8)
                plusAbility(Constants.CATCHING, -1)
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 12)
                plusAbility(Constants.CLOSER, 4)
            }
            "無気力" -> {
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.MIDDLE, 4)
            }
            "目立ちたがり" -> {
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 2)
                plusSpecial(Constants.CHANCE, 0.05)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.CLOSER, 6)

            }
            "一匹オオカミ" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 5)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.CLOSER, 2)
                plusAbility(Constants.STARTER, 4)
            }
        }

        when (a3_p) {
            "リーダー" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, 7)
                plusAbility(Constants.CATCHING, 4)
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 20)
                plusAbility(Constants.KIND_CHANGE, 4)
                plusAbility(Constants.AMOUNT_CHANGE, 4)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SHOOT, 2)
                plusAbility(Constants.STARTER, 10)
            }
            "控えめ" -> {
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.FIELDING, 6)
                plusAbility(Constants.CATCHING, 3)
                plusAbility(Constants.BALL_SPEED, 2)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.CURB, 1)
                plusAbility(Constants.MIDDLE, 3)
            }
            "ムードメーカー" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, 2)
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 6)
                plusAbility(Constants.AMOUNT_CHANGE, 7)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SINKER, 4)
                plusAbility(Constants.MIDDLE, 1)
            }
            "批評家" -> {
                plusAbility(Constants.CONTACT, -2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, -2)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, -1)
                plusSpecial(Constants.CHANCE, -0.03)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, -1)
                plusAbility(Constants.KIND_CHANGE, -1)
                plusAbility(Constants.SHOOT, 7)
                plusAbility(Constants.MIDDLE, 2)
            }
            "アイデアマン" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 3)
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.KIND_CHANGE, 12)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 4)
                plusAbility(Constants.MIDDLE, 1)
            }
        }

        when (a4_p) {
            "ふつう" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.CATCHING, 1)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
            }
            "お勉強得意" -> {
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 8)
                plusAbility(Constants.CATCHING, 7)
                plusSpecial(Constants.CHANCE, -0.02)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 9)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.CLOSER, -2)
            }
            "頭キレキレ" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.SPEED, 9)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 3)
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 15)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SINKER, 2)
            }
            "頭からっぽ" -> {
                plusAbility(Constants.BALLISTIC, 4)
                plusAbility(Constants.CONTACT, -1)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, -4)
                plusAbility(Constants.CATCHING, -2)
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, -5)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, -5)
                plusAbility(Constants.AMOUNT_CHANGE, -4)
                plusAbility(Constants.MIDDLE, -2)
            }
            "脳筋" -> {
                plusAbility(Constants.CONTACT, -3)
                plusAbility(Constants.POWER, 6)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, -3)
                plusAbility(Constants.CATCHING, -3)
                plusSpecial(Constants.CHANCE, -0.12)
                plusAbility(Constants.BALL_SPEED, 9)
                plusAbility(Constants.CONTROL, -3)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.KIND_CHANGE, -2)
                plusAbility(Constants.AMOUNT_CHANGE, -2)
                plusAbility(Constants.STARTER, 5)
            }
        }

        when (a5_p) {
            "ふつう" -> {
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.CATCHING, 1)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
            }
            "天然" -> {
                plusAbility(Constants.BALLISTIC, 4)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, -1)
                plusSpecial(Constants.CHANCE, 0.05)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
            }
            "冗談多め" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.SPEED, 3)
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
            }
            "話が面白い" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 3)
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 6)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.STARTER, 3)
            }
            "つまらない" -> {
                plusAbility(Constants.POWER, -2)
                plusAbility(Constants.FIELDING, -2)
                plusAbility(Constants.CATCHING, -1)
                plusSpecial(Constants.CHANCE, -0.05)
                plusAbility(Constants.CONTROL, -2)
                plusAbility(Constants.KIND_CHANGE, -3)
                plusAbility(Constants.AMOUNT_CHANGE, -3)
            }
            "芸人" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 3)
                plusSpecial(Constants.CHANCE, 0.04)
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.KIND_CHANGE, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
            }
        }

        when (a1_o) {
            "王子様" -> {
                plusAbility(Constants.BALLISTIC, 8)
                plusAbility(Constants.CONTACT, 11)
                plusAbility(Constants.POWER, 7)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 3)
                plusAbility(Constants.BALL_SPEED, 15)
                plusAbility(Constants.CONTROL, 5)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 12)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.STARTER, 4)
            }
            "モテる" -> {
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.CONTACT, 6)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 3)
                plusAbility(Constants.BALL_SPEED, 11)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 9)
                plusAbility(Constants.AMOUNT_CHANGE, 9)
                plusAbility(Constants.STARTER, 2)
            }
            "ハンター" -> {
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 6)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 7)
                plusSpecial(Constants.CHANCE, 0.05)
                plusAbility(Constants.BALL_SPEED, 11)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 6)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.STARTER, -3)
            }
            "ふつう" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, 1)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.MIDDLE, 2)
            }
            "ぷぅ〜" -> {
                plusAbility(Constants.CONTACT, -3)
                plusAbility(Constants.POWER, -3)
                plusAbility(Constants.SPEED, -2)
                plusAbility(Constants.ARM_STRENGTH, -1)
                plusAbility(Constants.FIELDING, -1)
                plusAbility(Constants.CATCHING, -1)
                plusAbility(Constants.BALL_SPEED, -2)
                plusAbility(Constants.CONTROL, -1)
                plusAbility(Constants.STAMINA, -1)
                plusAbility(Constants.KIND_CHANGE, -5)
                plusAbility(Constants.AMOUNT_CHANGE, -5)
                plusAbility(Constants.MIDDLE, 3)
            }
        }

        when (a2_o) {
            "大人気" -> {
                plusAbility(Constants.CONTACT, 4)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 10)
                plusAbility(Constants.FIELDING, 12)
                plusAbility(Constants.CATCHING, 15)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, 18)
                plusAbility(Constants.STAMINA, 18)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.STARTER, 5)

            }
            "まぁまぁ" -> {
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.FIELDING, 7)
                plusAbility(Constants.CATCHING, 10)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 12)
                plusAbility(Constants.STAMINA, 12)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.STARTER, 3)

            }
            "ふつう" -> {
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 5)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.CONTROL, 5)
                plusAbility(Constants.STAMINA, 5)
            }
            "あんまり" -> {
                plusAbility(Constants.ARM_STRENGTH, -1)
                plusAbility(Constants.FIELDING, -1)
                plusAbility(Constants.CATCHING, -3)
                plusAbility(Constants.CONTROL, -4)
                plusAbility(Constants.STAMINA, -4)
            }
            "ぷぅ〜" -> {
                plusAbility(Constants.CONTACT, -1)
                plusAbility(Constants.POWER, -1)
                plusAbility(Constants.SPEED, -2)
                plusAbility(Constants.ARM_STRENGTH, -3)
                plusAbility(Constants.FIELDING, -3)
                plusAbility(Constants.CATCHING, -6)
                plusAbility(Constants.BALL_SPEED, -1)
                plusAbility(Constants.CONTROL, -10)
                plusAbility(Constants.STAMINA, -10)
                plusAbility(Constants.KIND_CHANGE, -2)
                plusAbility(Constants.AMOUNT_CHANGE, -2)
            }
        }

        when (a3_o) {
            "最強" -> {
                plusSpecial(Constants.CHANCE, 0.15)
                plusAbility(Constants.CLOSER, 3)

            }
            "なかなか" -> {
                plusSpecial(Constants.CHANCE, 0.08)
                plusAbility(Constants.CLOSER, 2)
            }
            "ふつう" -> {
            }
            "あんまり" -> {
                plusSpecial(Constants.CHANCE, -0.08)
                plusAbility(Constants.MIDDLE, 2)
            }
            "豆腐メンタル" -> {
                plusSpecial(Constants.CHANCE, -0.15)
                plusAbility(Constants.MIDDLE, 4)
            }
        }

        when (a5_o) {
            "カリスマ" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 10)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 7)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 2)
                plusSpecial(Constants.CHANCE, 0.1)
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.CONTROL, 16)
                plusAbility(Constants.KIND_CHANGE, 16)
                plusAbility(Constants.AMOUNT_CHANGE, 16)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 4)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.MIDDLE, -5)
            }
            "スポーツマン" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 10)
                plusAbility(Constants.SPEED, 10)
                plusAbility(Constants.ARM_STRENGTH, 8)
                plusAbility(Constants.FIELDING, 6)
                plusAbility(Constants.CATCHING, 2)
                plusAbility(Constants.BALL_SPEED, 15)
                plusAbility(Constants.STAMINA, 25)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SHOOT, 3)
                plusAbility(Constants.STARTER, 8)
            }
            "天才頭脳" -> {
                plusAbility(Constants.CONTACT, 8)
                plusAbility(Constants.SPEED, 5)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 15)
                plusAbility(Constants.CATCHING, 8)
                plusAbility(Constants.CONTROL, 17)
                plusAbility(Constants.KIND_CHANGE, 12)
            }
            "酒豪" -> {
                plusAbility(Constants.BALLISTIC, 6)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, -1)
                plusAbility(Constants.CATCHING, -5)
                plusSpecial(Constants.CHANCE, 0.04)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, -5)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.CLOSER, 3)
            }
            "ヘビースモーカー" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, -1)
                plusAbility(Constants.CATCHING, -3)
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.STAMINA, -8)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SINKER, 3)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.CLOSER, 3)
            }
            "元ヤン" -> {
                plusAbility(Constants.POWER, 7)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 12)
                plusAbility(Constants.CATCHING, -3)
                plusAbility(Constants.BALL_SPEED, 10)
                plusAbility(Constants.CONTROL, -3)
                plusAbility(Constants.STAMINA, -3)
                plusAbility(Constants.SHOOT, 9)
                plusAbility(Constants.MIDDLE, 2)
            }
            "特になし" -> {
            }
        }


        when (a4_o) {
            "大好き" -> {
                contact = (contact * 1.3).toInt()
                power = (power * 1.3).toInt()
                speed = (speed * 1.3).toInt()
                armStrength = (armStrength * 1.3).toInt()
                fielding = (fielding * 1.3).toInt()
                catching = (catching * 1.3).toInt()
                ballSpeed = (ballSpeed * 1.15).toInt()
                control = (control * 1.15).toInt()
                stamina = (stamina * 1.15).toInt()
                kindsOfChangeBall = (kindsOfChangeBall * 1.3).toInt()
                amountOfCange = (amountOfCange * 1.3).toInt()
            }
            "まぁまぁ" -> {
                contact = (contact * 1.15).toInt()
                power = (power * 1.15).toInt()
                speed = (speed * 1.15).toInt()
                armStrength = (armStrength * 1.15).toInt()
                fielding = (fielding * 1.15).toInt()
                catching = (catching * 1.15).toInt()
                ballSpeed = (ballSpeed * 1.1).toInt()
                control = (control * 1.1).toInt()
                stamina = (stamina * 1.1).toInt()
                kindsOfChangeBall = (kindsOfChangeBall * 1.15).toInt()
                amountOfCange = (amountOfCange * 1.15).toInt()
            }
            "ふつう" -> {
            }
            "興味深い" -> {
                contact = (contact * 1.1).toInt()
                power = (power * 1.1).toInt()
                speed = (speed * 1.1).toInt()
                armStrength = (armStrength * 1.1).toInt()
                fielding = (fielding * 1.1).toInt()
                catching = (catching * 1.1).toInt()
                ballSpeed = (ballSpeed * 1.1).toInt()
                control = (control * 1.1).toInt()
                stamina = (stamina * 1.1).toInt()
                kindsOfChangeBall = (kindsOfChangeBall * 1.1).toInt()
                amountOfCange = (amountOfCange * 1.1).toInt()
            }
            "アンチ" -> {
                contact = (contact * 0.8).toInt()
                power = (power * 0.8).toInt()
                speed = (speed * 0.8).toInt()
                armStrength = (armStrength * 0.8).toInt()
                fielding = (fielding * 0.8).toInt()
                catching = (catching * 0.8).toInt()
                control = (control * 0.9).toInt()
                stamina = (stamina * 0.9).toInt()
                kindsOfChangeBall = (kindsOfChangeBall * 0.8).toInt()
                amountOfCange = (amountOfCange * 0.8).toInt()
            }
        }
        setPitcherType()
        calcBallistic()
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    fun calcAbility_w() {

        when (a1_a) {
            "~150cm" -> {
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 1)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 5)
                plusAbility(Constants.MIDDLE, 5)
            }
            "151~160cm" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.CURB, 1)
                plusAbility(Constants.MIDDLE, 3)
            }
            "161~170cm" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.POWER, 6)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusAbility(Constants.BALL_SPEED, 9)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 4)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.CURB, 1)
                plusAbility(Constants.FOLK, 5)
                plusAbility(Constants.STARTER, 2)
            }
            "171~180cm" -> {
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.POWER, 11)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.BALL_SPEED, 13)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 6)
                plusAbility(Constants.SLIDER, 4)
                plusAbility(Constants.FOLK, 12)
                plusAbility(Constants.MIDDLE, -2)
                plusAbility(Constants.STARTER, 3)
            }
            "181cm~" -> {
                plusAbility(Constants.BALLISTIC, 7)
                plusAbility(Constants.POWER, 15)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.BALL_SPEED, 16)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.SLIDER, 5)
                plusAbility(Constants.FOLK, 20)
                plusAbility(Constants.MIDDLE, -4)
                plusAbility(Constants.STARTER, 3)
            }
        }

        when (a2_a) {
            "ふつう" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 2)
            }
            "スリム" -> {
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 4)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 2)
                plusAbility(Constants.CLOSER, -2)
            }
            "ぽっちゃり" -> {
                plusAbility(Constants.BALLISTIC, 18)
                plusAbility(Constants.POWER, 7)
                plusAbility(Constants.SPEED, -5)
                plusAbility(Constants.BALL_SPEED, 9)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.CURB, 5)
                plusAbility(Constants.STARTER, -5)
            }
            "ムッチリ" -> {
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, -2)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.BALL_SPEED, 9)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 3)
                plusAbility(Constants.CLOSER, 2)
            }
            "マッチョ" -> {
                plusAbility(Constants.BALLISTIC, 4)
                plusAbility(Constants.POWER, 11)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.BALL_SPEED, 18)
                plusAbility(Constants.STAMINA, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.SLIDER, 5)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SHOOT, 2)
                plusAbility(Constants.MIDDLE, -3)
                plusAbility(Constants.STARTER, 3)
            }
            "グラマラス" -> {
                plusAbility(Constants.BALLISTIC, 20)
                plusAbility(Constants.CONTACT, 10)
                plusAbility(Constants.POWER, 9)
                plusAbility(Constants.CATCHING, -5)
                plusAbility(Constants.BALL_SPEED, 12)
                plusAbility(Constants.CONTROL, -4)
                plusAbility(Constants.KIND_CHANGE, 9)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 2)
                plusAbility(Constants.STARTER, -5)
            }
        }

        when (a3_a) {
            "ふつう" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 3)
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 2)
            }
            "カワイイ系" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 9)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 5)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 4)
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.CONTROL, 10)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 15)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.CURB, 4)
                plusAbility(Constants.FOLK, 1)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.CLOSER, -10)
            }
            "美人系" -> {
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 4)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 7)
                plusAbility(Constants.ARM_STRENGTH, 8)
                plusAbility(Constants.FIELDING, 10)
                plusAbility(Constants.CATCHING, 6)
                plusAbility(Constants.BALL_SPEED, 13)
                plusAbility(Constants.CONTROL, 11)
                plusAbility(Constants.STAMINA, 11)
                plusAbility(Constants.KIND_CHANGE, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 15)
                plusAbility(Constants.SLIDER, 5)
                plusAbility(Constants.FOLK, 5)
                plusAbility(Constants.SINKER, 1)
                plusAbility(Constants.SHOOT, 3)
                plusAbility(Constants.STARTER, 6)
            }
            "地味め" -> {
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 10)
                plusAbility(Constants.CATCHING, 6)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.CLOSER, -7)
            }
            "派手め" -> {
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 8)
                plusAbility(Constants.CATCHING, -1)
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 10)
                plusAbility(Constants.CONTROL, -5)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 15)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SHOOT, 8)
                plusAbility(Constants.CLOSER, 5)
            }
        }

        when (a4_a) {
            "優しそう" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 5)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 9)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 9)
                plusAbility(Constants.CURB, 3)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 1)
            }
            "マジメそう" -> {
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 9)
                plusAbility(Constants.CATCHING, 7)
                plusAbility(Constants.BALL_SPEED, 2)
                plusAbility(Constants.CONTROL, 7)
                plusAbility(Constants.STAMINA, 2)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 3)
                plusAbility(Constants.CLOSER, -4)
            }
            "こわそう" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.CATCHING, -2)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 7)
                plusAbility(Constants.CLOSER, 5)
            }
            "元気そう" -> {
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 7)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 7)
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.STAMINA, 15)
                plusAbility(Constants.KIND_CHANGE, 4)
                plusAbility(Constants.AMOUNT_CHANGE, 6)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 4)
                plusAbility(Constants.SHOOT, 3)
                plusAbility(Constants.STARTER, 7)
            }
            "大人しそう" -> {
                plusAbility(Constants.CONTACT, 4)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.FIELDING, 6)
                plusAbility(Constants.CATCHING, 4)
                plusAbility(Constants.CONTROL, 7)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.MIDDLE, 5)
            }
            "チャラそう" -> {
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.CATCHING, -2)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, -2)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 7)
            }
        }

        when (a5_a) {
            "ふつう" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.CATCHING, 1)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
            }
            "オシャレ" -> {
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 4)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 2)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 5)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 13)
                plusAbility(Constants.AMOUNT_CHANGE, 7)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 2)
            }
            "地味め" -> {
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 6)
                plusAbility(Constants.CATCHING, 3)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.STAMINA, 8)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 3)
                plusAbility(Constants.CLOSER, -6)
            }
            "派手め" -> {
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 5)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.CATCHING, -1)
                plusAbility(Constants.BALL_SPEED, 9)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.STAMINA, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.SHOOT, 5)
                plusAbility(Constants.MIDDLE, -6)
            }
            "独創的" -> {
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusSpecial(Constants.CHANCE, 0.05)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.AMOUNT_CHANGE, 15)
                plusAbility(Constants.STARTER, -5)
            }
        }

        when (a1_p) {
            "穏やか" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 5)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 9)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.CURB, 3)
            }
            "おとなしい" -> {
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 3)
                plusAbility(Constants.BALL_SPEED, 2)
                plusAbility(Constants.CONTROL, 7)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.CLOSER, -5)
            }
            "サバサバ" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 6)
            }
            "うるさい" -> {
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, -2)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, -2)
                plusAbility(Constants.CATCHING, -4)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, -3)
                plusAbility(Constants.STAMINA, 2)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.CLOSER, 2)
            }
            "メンヘラ" -> {
                plusAbility(Constants.CONTACT, -3)
                plusAbility(Constants.FIELDING, -6)
                plusAbility(Constants.CATCHING, -3)
                plusSpecial(Constants.CHANCE, -0.1)
                plusAbility(Constants.CONTROL, -7)
                plusAbility(Constants.STAMINA, -3)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SHOOT, 3)
                plusAbility(Constants.MIDDLE, 7)
            }

        }

        when (a2_p) {
            "優しい" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 4)
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 9)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 6)
                plusAbility(Constants.AMOUNT_CHANGE, 6)
                plusAbility(Constants.CURB, 3)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 1)
            }
            "頑張り屋さん" -> {
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 1)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.STAMINA, 16)
                plusAbility(Constants.KIND_CHANGE, 4)
                plusAbility(Constants.AMOUNT_CHANGE, 4)
                plusAbility(Constants.STARTER, 9)
            }
            "気が強い" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, -2)
                plusAbility(Constants.ARM_STRENGTH, 9)
                plusAbility(Constants.CATCHING, -1)
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.BALL_SPEED, 10)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 12)
                plusAbility(Constants.CLOSER, 5)
            }
            "無気力" -> {
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.MIDDLE, 8)
            }
            "かまってちゃん" -> {
                plusAbility(Constants.BALLISTIC, 4)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, -2)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 4)
                plusAbility(Constants.FOLK, 3)
            }
            "一匹オオカミ" -> {
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.STAMINA, 9)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.STARTER, 3)
            }
        }

        when (a3_p) {
            "リーダー" -> {
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.FIELDING, 7)
                plusAbility(Constants.CATCHING, 3)
                plusAbility(Constants.BALL_SPEED, 10)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 18)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 4)
                plusAbility(Constants.SHOOT, 2)
                plusAbility(Constants.STARTER, 9)
            }
            "控えめ" -> {
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.FIELDING, 6)
                plusAbility(Constants.CATCHING, 4)
                plusAbility(Constants.BALL_SPEED, 2)
                plusAbility(Constants.CONTROL, 7)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.MIDDLE, -7)
            }
            "ムードメーカー" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, 3)
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SINKER, 3)
                plusAbility(Constants.CLOSER, -4)
            }
            "批評家" -> {
                plusAbility(Constants.CONTACT, -2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, -2)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.FIELDING, -1)
                plusAbility(Constants.CATCHING, -2)
                plusSpecial(Constants.CHANCE, -0.03)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, -1)
                plusAbility(Constants.KIND_CHANGE, -2)
                plusAbility(Constants.SHOOT, 7)
            }
            "アイデアマン" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 3)
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.KIND_CHANGE, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 4)
                plusAbility(Constants.MIDDLE, 3)
            }

        }

        when (a4_p) {
            "ふつう" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.CATCHING, 1)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
            }
            "お勉強得意" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 8)
                plusAbility(Constants.CATCHING, 7)
                plusSpecial(Constants.CHANCE, -0.03)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 10)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.CLOSER, -5)
            }
            "頭キレキレ" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.SPEED, 9)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 3)
                plusSpecial(Constants.CHANCE, 0.05)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 5)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 13)
                plusAbility(Constants.AMOUNT_CHANGE, 7)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SINKER, 2)
            }
            "頭からっぽ" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, -1)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.FIELDING, -4)
                plusAbility(Constants.CATCHING, -2)
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, -5)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, -5)
                plusAbility(Constants.AMOUNT_CHANGE, -4)
            }
            "脳筋" -> {
                plusAbility(Constants.CONTACT, -3)
                plusAbility(Constants.POWER, 7)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.FIELDING, -3)
                plusAbility(Constants.CATCHING, -3)
                plusSpecial(Constants.CHANCE, -0.1)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, -3)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.KIND_CHANGE, -2)
                plusAbility(Constants.AMOUNT_CHANGE, -2)
                plusAbility(Constants.STARTER, 4)
            }
        }

        when (a5_p) {
            "ふつう" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
            }
            "天然" -> {
                plusAbility(Constants.BALLISTIC, 4)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, -2)
                plusSpecial(Constants.CHANCE, 0.05)
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
            }
            "冗談多め" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.SPEED, 3)
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
            }
            "話が面白い" -> {
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 3)
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 9)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.STARTER, 3)
            }
            "つまらない" -> {
                plusAbility(Constants.POWER, -2)
                plusAbility(Constants.FIELDING, -2)
                plusAbility(Constants.CATCHING, -2)
                plusSpecial(Constants.CHANCE, -0.05)
                plusAbility(Constants.CONTROL, -2)
                plusAbility(Constants.KIND_CHANGE, -3)
                plusAbility(Constants.AMOUNT_CHANGE, -3)
            }
            "芸人" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 6)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 7)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 2)
                plusSpecial(Constants.CHANCE, 0.04)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
            }
        }

        when (a1_o) {
            "マドンナ" -> {
                plusAbility(Constants.BALLISTIC, 9)
                plusAbility(Constants.CONTACT, 13)
                plusAbility(Constants.POWER, 8)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 3)
                plusAbility(Constants.BALL_SPEED, 15)
                plusAbility(Constants.CONTROL, 5)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 18)
                plusAbility(Constants.AMOUNT_CHANGE, 18)
                plusAbility(Constants.STARTER, 6)
            }
            "モテる" -> {
                plusAbility(Constants.BALLISTIC, 6)
                plusAbility(Constants.CONTACT, 9)
                plusAbility(Constants.POWER, 6)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.CATCHING, 3)
                plusAbility(Constants.BALL_SPEED, 12)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 12)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.STARTER, 3)
            }
            "一部から" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 6)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.BALL_SPEED, 10)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
            }
            "ふつう" -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
            }
            "ぷぅ〜" -> {
                plusAbility(Constants.CONTACT, -3)
                plusAbility(Constants.POWER, -3)
                plusAbility(Constants.SPEED, -2)
                plusAbility(Constants.ARM_STRENGTH, -1)
                plusAbility(Constants.FIELDING, -1)
                plusAbility(Constants.BALL_SPEED, -3)
                plusAbility(Constants.CONTROL, -1)
                plusAbility(Constants.STAMINA, -1)
                plusAbility(Constants.KIND_CHANGE, -3)
                plusAbility(Constants.AMOUNT_CHANGE, -3)
                plusAbility(Constants.MIDDLE, 5)
            }
        }

        when (a2_o) {
            "大人気" -> {
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 12)
                plusAbility(Constants.FIELDING, 15)
                plusAbility(Constants.CATCHING, 18)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 18)
                plusAbility(Constants.STAMINA, 18)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.STARTER, 6)
            }
            "まぁまぁ" -> {
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 5)
                plusAbility(Constants.ARM_STRENGTH, 8)
                plusAbility(Constants.FIELDING, 10)
                plusAbility(Constants.CATCHING, 12)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 12)
                plusAbility(Constants.STAMINA, 12)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.STARTER, 3)
            }
            "ふつう" -> {
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 6)
                plusAbility(Constants.BALL_SPEED, 1)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, 6)
            }
            "あんまり" -> {
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.BALL_SPEED, 1)
                plusAbility(Constants.CONTROL, -5)
                plusAbility(Constants.STAMINA, -1)
            }
            "ぷぅ〜" -> {
                plusAbility(Constants.CONTACT, -1)
                plusAbility(Constants.POWER, -1)
                plusAbility(Constants.SPEED, -1)
                plusAbility(Constants.ARM_STRENGTH, -5)
                plusAbility(Constants.FIELDING, -8)
                plusAbility(Constants.CATCHING, -6)
                plusAbility(Constants.BALL_SPEED, -1)
                plusAbility(Constants.CONTROL, -8)
                plusAbility(Constants.STAMINA, -3)
                plusAbility(Constants.KIND_CHANGE, -2)
                plusAbility(Constants.AMOUNT_CHANGE, -2)
            }
        }

        when (a3_o) {
            "最強" -> {
                plusSpecial(Constants.CHANCE, 0.15)
                plusAbility(Constants.CLOSER, 5)
            }
            "なかなか" -> {
                plusSpecial(Constants.CHANCE, 0.08)
                plusAbility(Constants.CLOSER, 2)
            }
            "ふつう" -> {
            }
            "あんまり" -> {
                plusSpecial(Constants.CHANCE, -0.08)
                plusAbility(Constants.CLOSER, -2)
            }
            "豆腐メンタル" -> {
                plusSpecial(Constants.CHANCE, -0.15)
                plusAbility(Constants.CLOSER, -5)
            }
        }

        when (a5_o) {
            "酒豪" -> {
                plusAbility(Constants.BALLISTIC, 7)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, -1)
                plusAbility(Constants.CATCHING, -3)
                plusSpecial(Constants.CHANCE, 0.04)
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, -5)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 4)
                plusAbility(Constants.CLOSER, 5)
            }
            "ヘビースモーカー" -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, -1)
                plusAbility(Constants.CATCHING, -2)
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.STAMINA, -7)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.STARTER, -6)
            }
            "ボスキャラ" -> {
                plusAbility(Constants.BALLISTIC, 6)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 8)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 10)
                plusAbility(Constants.FIELDING, 2)
                plusSpecial(Constants.CHANCE, 0.05)
                plusAbility(Constants.BALL_SPEED, 12)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 6)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.CLOSER, 15)
            }
            "お色気" -> {
                plusAbility(Constants.BALLISTIC, 20)
                plusAbility(Constants.CONTACT, 10)
                plusAbility(Constants.POWER, 15)
                plusAbility(Constants.SPEED, -5)
                plusAbility(Constants.ARM_STRENGTH, -5)
                plusAbility(Constants.FIELDING, -6)
                plusAbility(Constants.CATCHING, -10)
                plusAbility(Constants.BALL_SPEED, 15)
                plusAbility(Constants.CONTROL, -4)
                plusAbility(Constants.STAMINA, -4)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 16)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.SINKER, 4)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.STARTER, -8)
            }
            "大和撫子" -> {
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 5)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, 10)
                plusAbility(Constants.CATCHING, 8)
                plusAbility(Constants.BALL_SPEED, 10)
                plusAbility(Constants.CONTROL, 11)
                plusAbility(Constants.STAMINA, 11)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.SLIDER, 5)
                plusAbility(Constants.FOLK, 4)
                plusAbility(Constants.STARTER, 6)
            }
            "スポーツ少女" -> {
                plusAbility(Constants.BALLISTIC, 4)
                plusAbility(Constants.POWER, 7)
                plusAbility(Constants.SPEED, 14)
                plusAbility(Constants.ARM_STRENGTH, 10)
                plusAbility(Constants.BALL_SPEED, 14)
                plusAbility(Constants.STAMINA, 18)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SHOOT, 3)
                plusAbility(Constants.STARTER, 6)
            }
            "特になし" -> {
            }
        }


        when (a4_o) {
            "大好き" -> {
                contact = (contact * 1.3).toInt()
                power = (power * 1.3).toInt()
                speed = (speed * 1.3).toInt()
                armStrength = (armStrength * 1.3).toInt()
                fielding = (fielding * 1.3).toInt()
                catching = (catching * 1.3).toInt()
                ballSpeed = (ballSpeed * 1.15).toInt()
                control = (control * 1.15).toInt()
                stamina = (stamina * 1.15).toInt()
                kindsOfChangeBall = (kindsOfChangeBall * 1.3).toInt()
                amountOfCange = (amountOfCange * 1.3).toInt()
            }
            "まぁまぁ" -> {
                contact = (contact * 1.15).toInt()
                power = (power * 1.15).toInt()
                speed = (speed * 1.15).toInt()
                armStrength = (armStrength * 1.15).toInt()
                fielding = (fielding * 1.15).toInt()
                catching = (catching * 1.15).toInt()
                ballSpeed = (ballSpeed * 1.1).toInt()
                control = (control * 1.1).toInt()
                stamina = (stamina * 1.1).toInt()
                kindsOfChangeBall = (kindsOfChangeBall * 1.15).toInt()
                amountOfCange = (amountOfCange * 1.15).toInt()
            }
            "ふつう" -> {
            }
            "興味深い" -> {
                contact = (contact * 1.1).toInt()
                power = (power * 1.1).toInt()
                speed = (speed * 1.1).toInt()
                armStrength = (armStrength * 1.1).toInt()
                fielding = (fielding * 1.1).toInt()
                catching = (catching * 1.1).toInt()
                ballSpeed = (ballSpeed * 1.1).toInt()
                control = (control * 1.1).toInt()
                stamina = (stamina * 1.1).toInt()
                kindsOfChangeBall = (kindsOfChangeBall * 1.1).toInt()
                amountOfCange = (amountOfCange * 1.1).toInt()

            }
            "アンチ" -> {
                contact = (contact * 0.8).toInt()
                power = (power * 0.8).toInt()
                speed = (speed * 0.8).toInt()
                armStrength = (armStrength * 0.8).toInt()
                fielding = (fielding * 0.8).toInt()
                catching = (catching * 0.8).toInt()
                control = (control * 0.9).toInt()
                stamina = (stamina * 0.9).toInt()
                kindsOfChangeBall = (kindsOfChangeBall * 0.8).toInt()
                amountOfCange = (amountOfCange * 0.8).toInt()
            }
        }

        setPitcherType()
        calcBallistic()

    }

    private fun plusAbility(initial: String, point: Int) {
        when (initial) {
            Constants.BALLISTIC -> ballistic += point
            Constants.CONTACT -> contact += point
            Constants.POWER -> power += point
            Constants.SPEED -> speed += point
            Constants.ARM_STRENGTH -> armStrength += point
            Constants.FIELDING -> fielding += point
            Constants.CATCHING -> catching += point

            Constants.BALL_SPEED -> ballSpeed += point
            Constants.CONTROL -> control += point
            Constants.STAMINA -> stamina += point
            Constants.KIND_CHANGE -> kindsOfChangeBall += point
            Constants.AMOUNT_CHANGE -> amountOfCange += point

            Constants.SLIDER -> priorityOfChange[0] += point
            Constants.CURB -> priorityOfChange[1] += point
            Constants.FOLK -> priorityOfChange[2] += point
            Constants.SINKER -> priorityOfChange[3] += point
            Constants.SHOOT -> priorityOfChange[4] += point

            Constants.STARTER -> pitcherTypes[STARTER_INDEX] += point
            Constants.MIDDLE -> pitcherTypes[MIDLLE_INDEX] += point
            Constants.CLOSER -> pitcherTypes[CLOSER_INDEX] += point
        }
    }

    private fun plusSpecial(initial: String, point: Double) {
        when (initial) {
            Constants.CHANCE -> chance += point
        }
    }

    // decide pitcher type
    private fun setPitcherType() {

        val typeIndex = pitcherTypes.indices.maxBy {
            pitcherTypes[it]
        } ?: STARTER_INDEX
        when (typeIndex) {
            STARTER_INDEX -> {
                pitcherType = Constants.STARTER
                if (stamina < Constants.NEEDED_STARTER_STAMINA) setSecondType()
            }
            MIDLLE_INDEX -> {
                pitcherType = Constants.MIDDLE
            }
            CLOSER_INDEX -> {
                pitcherType = Constants.CLOSER
            }
        }
    }

    private fun setSecondType() {
        pitcherType = Constants.MIDDLE
        if (pitcherTypes[CLOSER_INDEX] > pitcherTypes[MIDLLE_INDEX]) pitcherType = Constants.CLOSER
    }

    private fun calcBallistic() {
        ballistic = when (ballistic) {
            in 0..10 -> 1
            in 11..20 -> 2
            in 21..30 -> when (power) {
                in 0..20 -> 2
                else -> 3
            }
            else -> when (power) {
                in 0..20 -> 2
                in 21..30 -> 3
                else -> 4
            }
        }
    }


}