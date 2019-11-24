package com.websarva.wings.android.abiityofbaseball

class CalcAbility(a1_a:String,a2_a:String,a3_a:String,a4_a:String,a5_a:String,
                  a1_p:String,a2_p:String,a3_p:String,a4_p:String,a5_p:String,
                  a1_o:String,a2_o:String,a3_o:String,a4_o:String,a5_o:String) {

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
    var contact = 0
    var power = 0
    var speed = 0
    var armStrength = 0
    var fielding = 0

    var chance = 1.0

    // 投手能力ポイント
    var ballSpeed = 0
    var control = 0
    var stamina = 0
    var kindsOfChangeBall = 0
    var amountOfCange = 0
    var priorityOfChange = arrayListOf(0, 0, 0, 0, 0)


    init {

        if(PlayerMakingActivity.sex_id == 0){
            calcAbility_m()
        } else {
            calcAbility_w()
        }

    }

    fun calcAbility_m(){

        when(a1_a){
            "~160cm" -> {
                plusAbility("s",4)
                plusAbility("p",3)
                plusAbility("c",2)
                plusAbility("c_p",5)
                plusAbility("s_p",1)
                plusAbility("kc_p",2)
                plusAbility("ac_p",1)
                plusAbility("slider",1)
                plusAbility("curb",5)

            }
            "161~170cm" -> {
                plusAbility("p",7)
                plusAbility("s",2)
                plusAbility("b_p",3)
                plusAbility("c_p",4)
                plusAbility("s_p",3)
                plusAbility("kc_p",1)
                plusAbility("ac_p",2)
                plusAbility("slider",3)
                plusAbility("curb",3)
            }
            "171~180cm" -> {
                plusAbility("p",10)
                plusAbility("a",1)
                plusAbility("b_p",7)
                plusAbility("c_p",3)
                plusAbility("s_p",5)
                plusAbility("ac_p",4)
                plusAbility("slider",4)
                plusAbility("curb",2)
                plusAbility("folk",8)
            }
            "181~190cm" -> {
                plusAbility("p",16)
                plusAbility("a",3)
                plusAbility("b_p",12)
                plusAbility("c_p",2)
                plusAbility("s_p",7)
                plusAbility("ac_p",6)
                plusAbility("slider",4)
                plusAbility("folk",20)
            }
            "191cm~" -> {
                plusAbility("p",20)
                plusAbility("a",5)
                plusAbility("b_p",16)
                plusAbility("c_p",1)
                plusAbility("s_p",10)
                plusAbility("ac_p",8)
                plusAbility("slider",5)
                plusAbility("folk",25)

            }
        }

        when(a2_a){
            "ふつう" -> {
                plusAbility("p",2)
                plusAbility("s",2)
                plusAbility("b_p",4)
                plusAbility("c_p",3)
                plusAbility("s_p",4)
                plusAbility("kc_p",3)
                plusAbility("ac_p",3)
                plusAbility("slider",3)
                plusAbility("curb",3)

            }
            "スリム" -> {
                plusAbility("s",2)
                plusAbility("f",2)
                plusAbility("b_p",3)
                plusAbility("c_p",5)
                plusAbility("s_p",3)
                plusAbility("kc_p",3)
                plusAbility("ac_p",3)
                plusAbility("slider",3)
                plusAbility("shoot",3)
            }
            "ぽっちゃり" -> {
                plusAbility("p",6)
                plusAbility("s",-5)
                plusAbility("b_p",9)
                plusAbility("c_p",1)
                plusAbility("kc_p",1)
                plusAbility("ac_p",3)
                plusAbility("curb",5)
            }
            "ムッチリ" -> {
                plusAbility("p",5)
                plusAbility("s",-2)
                plusAbility("a",5)
                plusAbility("b_p",7)
                plusAbility("s_p",7)
                plusAbility("slider",4)
                plusAbility("shoot",3)
            }
            "ややマッチョ" -> {
                plusAbility("p",12)
                plusAbility("s",3)
                plusAbility("a",5)
                plusAbility("b_p",15)
                plusAbility("c_p",2)
                plusAbility("s_p",13)
                plusAbility("kc_p",3)
                plusAbility("ac_p",3)
                plusAbility("slider",6)
                plusAbility("folk",3)
                plusAbility("shoot",2)
            }
            "ゴリマッチョ" -> {
                plusAbility("p",18)
                plusAbility("s",-2)
                plusAbility("a",2)
                plusAbility("b_p",25)
                plusAbility("c_p",-1)
                plusAbility("s_p",6)
                plusAbility("kc_p",1)
                plusAbility("ac_p",1)
                plusAbility("slider",10)
                plusAbility("folk",1)
                plusAbility("shoot",1)
            }
        }

        when(a3_a){
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("p",2)
                plusAbility("s",2)
                plusAbility("a",2)
                plusAbility("f",1)
                plusAbility("b_p",4)
                plusAbility("c_p",3)
                plusAbility("s_p",3)
                plusAbility("kc_p",3)
                plusAbility("ac_p",3)
                plusAbility("slider",2)
                plusAbility("curb",3)
            }
            "イケメン" -> {
                plusAbility("c",8)
                plusAbility("p",4)
                plusAbility("s",5)
                plusAbility("a",4)
                plusAbility("f",7)
                plusAbility("b_p",8)
                plusAbility("c_p",6)
                plusAbility("s_p",7)
                plusAbility("kc_p",10)
                plusAbility("ac_p",8)
                plusAbility("slider",3)
                plusAbility("folk",2)
                plusAbility("sinker",3)
                plusAbility("shoot",1)
            }
            "ワイルド" -> {
                plusAbility("p",8)
                plusAbility("s",5)
                plusAbility("a",8)
                plusAbility("b_p",11)
                plusAbility("c_p",2)
                plusAbility("s_p",12)
                plusAbility("kc_p",2)
                plusAbility("ac_p",2)
                plusAbility("slider",1)
                plusAbility("folk",3)
                plusAbility("shoot",8)

            }
            "かわいい" -> {
                plusAbility("c",12)
                plusAbility("p",2)
                plusAbility("s",3)
                plusAbility("a",2)
                plusAbility("f",5)
                plusAbility("b_p",2)
                plusAbility("c_p",8)
                plusAbility("s_p",3)
                plusAbility("kc_p",8)
                plusAbility("ac_p",12)
                plusAbility("slider",1)
                plusAbility("curb",5)
                plusAbility("folk",2)
                plusAbility("sinker",8)
            }
            "強面" -> {
                plusAbility("p",5)
                plusAbility("s",2)
                plusAbility("a",8)
                plusAbility("b_p",10)
                plusAbility("c_p",1)
                plusAbility("s_p",7)
                plusAbility("kc_p",2)
                plusAbility("ac_p",2)
                plusAbility("slider",2)
                plusAbility("folk",2)
                plusAbility("shoot",16)
            }
        }

        when(a4_a){
            "優しそう" -> {
                plusAbility("c",5)
                plusAbility("p",2)
                plusAbility("s",3)
                plusAbility("a",3)
                plusAbility("f",5)
                plusAbility("b_p",1)
                plusAbility("c_p",10)
                plusAbility("s_p",6)
                plusAbility("kc_p",5)
                plusAbility("ac_p",10)
                plusAbility("slider",2)
                plusAbility("curb",4)
                plusAbility("folk",3)
                plusAbility("sinker",3)
            }
            "明るそう" -> {
                plusAbility("c",4)
                plusAbility("p",4)
                plusAbility("s",3)
                plusAbility("a",4)
                plusAbility("f",3)
                plusAbility("b_p",5)
                plusAbility("c_p",3)
                plusAbility("s_p",10)
                plusAbility("kc_p",3)
                plusAbility("ac_p",5)
                plusAbility("slider",3)
                plusAbility("curb",2)
                plusAbility("folk",3)
            }
            "マジメそう" -> {
                plusAbility("p",2)
                plusAbility("s",2)
                plusAbility("a",2)
                plusAbility("f",7)
                plusSpecial("chance",-0.05)
                plusAbility("b_p",2)
                plusAbility("c_p",15)
                plusAbility("s_p",10)
                plusAbility("kc_p",-1)
                plusAbility("ac_p",3)
                plusAbility("slider",3)
                plusAbility("curb",3)
                plusAbility("folk",1)
            }
            "クールそう" -> {
                plusAbility("p",2)
                plusAbility("s",7)
                plusAbility("a",3)
                plusAbility("f",5)
                plusAbility("b_p",6)
                plusAbility("c_p",4)
                plusAbility("s_p",5)
                plusAbility("kc_p",5)
                plusAbility("ac_p",4)
                plusAbility("slider",4)
                plusAbility("folk",5)
                plusAbility("sinker",5)
                plusAbility("shoot",3)
            }
            "おとぼけ者" -> {
                plusAbility("c",2)
                plusAbility("p",2)
                plusAbility("s",3)
                plusAbility("a",2)
                plusAbility("f",2)
                plusAbility("b_p",6)
                plusAbility("c_p",4)
                plusAbility("s_p",6)
                plusAbility("kc_p",4)
                plusAbility("ac_p",10)
                plusAbility("slider",2)
                plusAbility("folk",5)
                plusAbility("sinker",10)
            }
            "チャラそう" -> {
                plusAbility("p",2)
                plusAbility("s",7)
                plusAbility("a",4)
                plusAbility("b_p",8)
                plusAbility("c_p",-1)
                plusAbility("kc_p",5)
                plusAbility("ac_p",5)
                plusAbility("slider",5)
                plusAbility("folk",2)
                plusAbility("shoot",9)
            }
        }

        when(a5_a){
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("p",2)
                plusAbility("s",1)
                plusAbility("a",1)
                plusAbility("f",1)
                plusAbility("b_p",4)
                plusAbility("c_p",3)
                plusAbility("s_p",4)
                plusAbility("kc_p",3)
                plusAbility("ac_p",3)
                plusAbility("slider",2)
                plusAbility("curb",3)
            }
            "オシャレ" -> {
                plusAbility("c",4)
                plusAbility("p",2)
                plusAbility("s",8)
                plusAbility("a",2)
                plusAbility("f",4)
                plusAbility("b_p",4)
                plusAbility("c_p",6)
                plusAbility("s_p",4)
                plusAbility("kc_p",12)
                plusAbility("ac_p",5)
                plusAbility("slider",2)
                plusAbility("folk",3)
                plusAbility("sinker",4)
            }
            "地味め" -> {
                plusAbility("c",2)
                plusAbility("p",2)
                plusAbility("a",2)
                plusAbility("f",6)
                plusAbility("b_p",2)
                plusAbility("c_p",12)
                plusAbility("s_p",8)
                plusAbility("kc_p",1)
                plusAbility("ac_p",3)
                plusAbility("slider",2)
                plusAbility("curb",4)
            }
            "派手め" -> {
                plusAbility("p",5)
                plusAbility("s",6)
                plusAbility("a",4)
                plusAbility("b_p",9)
                plusAbility("c_p",1)
                plusAbility("s_p",2)
                plusAbility("kc_p",5)
                plusAbility("ac_p",5)
                plusAbility("slider",5)
                plusAbility("shoot",5)
            }
            "独創的" -> {
                plusAbility("p",3)
                plusAbility("a",1)
                plusSpecial("chance",0.08)
                plusAbility("b_p",5)
                plusAbility("c_p",4)
                plusAbility("s_p",4)
                plusAbility("kc_p",2)
                plusAbility("ac_p",12)
            }
        }

        when(a1_p){
            "穏やか" -> {
                plusAbility("c",3)
                plusAbility("p",2)
                plusAbility("s",1)
                plusAbility("a",2)
                plusAbility("f",3)
                plusAbility("c_p",12)
                plusAbility("s_p",5)
                plusAbility("kc_p",3)
                plusAbility("ac_p",3)
                plusAbility("slider",2)
                plusAbility("sinker",1)
            }
            "おとなしい" -> {
                plusAbility("c",2)
                plusAbility("a",1)
                plusAbility("f",5)
                plusAbility("c_p",8)
                plusAbility("s_p",6)
                plusAbility("kc_p",2)
                plusAbility("ac_p",2)
                plusAbility("slider",2)
                plusAbility("curb",3)
            }
            "淡々" -> {
                plusAbility("p",4)
                plusAbility("s",3)
                plusAbility("a",4)
                plusAbility("b_p",3)
                plusAbility("c_p",3)
                plusAbility("s_p",6)
                plusAbility("kc_p",3)
                plusAbility("ac_p",2)
                plusAbility("slider",2)
                plusAbility("shoot",6)
            }
            "騒がしい" -> {
                plusAbility("c",-2)
                plusAbility("p",5)
                plusAbility("s",4)
                plusAbility("a",3)
                plusAbility("f",-2)
                plusAbility("b_p",6)
                plusAbility("c_p",-3)
                plusAbility("s_p",2)
                plusAbility("kc_p",1)
                plusAbility("ac_p",1)
                plusAbility("folk",2)
                plusAbility("shoot",4)

            }
            "ミステリアス" -> {
                plusAbility("c",5)
                plusAbility("p",3)
                plusSpecial("chance",0.05)
                plusAbility("b_p",3)
                plusAbility("c_p",2)
                plusAbility("s_p",5)
                plusAbility("kc_p",3)
                plusAbility("ac_p",10)
                plusAbility("folk",5)
            }
        }

        when(a2_p){
            "優しい" -> {
                plusAbility("c",5)
                plusAbility("p",2)
                plusAbility("s",2)
                plusAbility("a",1)
                plusAbility("f",5)
                plusAbility("c_p",12)
                plusAbility("s_p",4)
                plusAbility("kc_p",7)
                plusAbility("ac_p",7)
                plusAbility("curb",3)
                plusAbility("folk",1)
                plusAbility("sinker",3)
            }
            "頑張り屋さん" -> {
                plusAbility("p",2)
                plusAbility("s",2)
                plusAbility("a",2)
                plusAbility("f",3)
                plusAbility("b_p",5)
                plusAbility("c_p",7)
                plusAbility("s_p",15)
                plusAbility("kc_p",6)
                plusAbility("ac_p",6)
            }
            "気が強い" -> {
                plusAbility("c",-2)
                plusAbility("a",8)
                plusAbility("b_p",8)
                plusAbility("kc_p",1)
                plusAbility("ac_p",1)
                plusAbility("slider",2)
                plusAbility("sinker",2)
                plusAbility("shoot",20)
            }
            "無気力" -> {
                plusAbility("c",1)
                plusAbility("s",1)
                plusAbility("f",1)
            }
            "目立ちたがり" -> {
                plusAbility("p",4)
                plusAbility("s",4)
                plusAbility("a",4)
                plusAbility("f",2)
                plusSpecial("chance",0.05)
                plusAbility("b_p",5)
                plusAbility("s_p",3)
                plusAbility("kc_p",3)
                plusAbility("ac_p",5)
                plusAbility("slider",4)
                plusAbility("folk",3)

            }
            "一匹オオカミ" -> {
                plusAbility("p",1)
                plusAbility("s",5)
                plusAbility("a",4)
                plusSpecial("chance",0.03)
                plusAbility("b_p",6)
                plusAbility("s_p",10)
                plusAbility("kc_p",1)
                plusAbility("ac_p",2)
                plusAbility("slider",4)
                plusAbility("shoot",4)
            }
        }

        when(a3_p){
            "リーダー" -> {
                plusAbility("c",2)
                plusAbility("p",5)
                plusAbility("s",2)
                plusAbility("a",5)
                plusAbility("f",7)
                plusAbility("b_p",7)
                plusAbility("c_p",4)
                plusAbility("s_p",20)
                plusAbility("kc_p",4)
                plusAbility("ac_p",4)
                plusAbility("slider",5)
                plusAbility("folk",3)
                plusAbility("shoot",1)
            }
            "控えめ" -> {
                plusAbility("c",5)
                plusAbility("f",6)
                plusAbility("c_p",10)
                plusAbility("s_p",6)
                plusAbility("kc_p",2)
                plusAbility("ac_p",2)
                plusAbility("slider",3)
                plusAbility("curb",3)
            }
            "ムードメーカー" -> {
                plusAbility("c",1)
                plusAbility("p",5)
                plusAbility("s",3)
                plusAbility("a",4)
                plusAbility("f",2)
                plusSpecial("chance",0.03)
                plusAbility("b_p",7)
                plusAbility("c_p",2)
                plusAbility("s_p",4)
                plusAbility("kc_p",6)
                plusAbility("ac_p",7)
                plusAbility("slider",4)
                plusAbility("sinker",7)
            }
            "批評家" -> {
                plusAbility("c",-2)
                plusAbility("p",2)
                plusAbility("s",-2)
                plusAbility("a",5)
                plusAbility("f",-1)
                plusSpecial("chance",-0.03)
                plusAbility("b_p",6)
                plusAbility("c_p",-1)
                plusAbility("kc_p",-2)
                plusAbility("shoot",13)
            }
            "アイデアマン" -> {
                plusAbility("c",5)
                plusAbility("p",2)
                plusAbility("s",1)
                plusAbility("a",3)
                plusAbility("f",4)
                plusAbility("c_p",7)
                plusAbility("kc_p",12)
                plusAbility("ac_p",12)
                plusAbility("folk",5)
                plusAbility("sinker",5)
            }
        }

        when(a4_p){
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("p",1)
                plusAbility("s",1)
                plusAbility("a",2)
                plusAbility("f",1)
                plusAbility("b_p",4)
                plusAbility("c_p",3)
                plusAbility("kc_p",3)
                plusAbility("ac_p",3)
                plusAbility("slider",3)
                plusAbility("curb",3)
            }
            "お勉強得意" -> {
                plusAbility("c",2)
                plusAbility("s",3)
                plusAbility("a",3)
                plusAbility("f",8)
                plusSpecial("chance",-0.02)
                plusAbility("b_p",2)
                plusAbility("c_p",10)
                plusAbility("s_p",3)
                plusAbility("kc_p",3)
                plusAbility("ac_p",3)
            }
            "頭キレキレ" -> {
                plusAbility("c",3)
                plusAbility("s",9)
                plusAbility("a",5)
                plusAbility("f",5)
                plusSpecial("chance",0.03)
                plusAbility("b_p",5)
                plusAbility("c_p",6)
                plusAbility("s_p",3)
                plusAbility("kc_p",15)
                plusAbility("ac_p",8)
                plusAbility("slider",6)
                plusAbility("folk",6)
            }
            "頭からっぽ" -> {
                plusAbility("c",-1)
                plusAbility("p",3)
                plusAbility("a",4)
                plusAbility("f",-4)
                plusSpecial("chance",0.03)
                plusAbility("b_p",5)
                plusAbility("c_p",-5)
                plusAbility("s_p",5)
                plusAbility("kc_p",-6)
                plusAbility("ac_p",-4)
            }
            "脳筋" -> {
                plusAbility("c",-3)
                plusAbility("p",6)
                plusAbility("s",2)
                plusAbility("a",4)
                plusAbility("f",-3)
                plusSpecial("chance",-0.12)
                plusAbility("b_p",8)
                plusAbility("c_p",-3)
                plusAbility("s_p",10)
                plusAbility("kc_p",-2)
                plusAbility("ac_p",-2)
                plusAbility("slider",3)
            }
        }

        when(a5_p){
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("p",1)
                plusAbility("s",1)
                plusAbility("a",2)
                plusAbility("f",1)
                plusAbility("b_p",3)
                plusAbility("c_p",3)
                plusAbility("kc_p",3)
                plusAbility("ac_p",3)
            }
            "天然" -> {
                plusAbility("c",1)
                plusAbility("p",1)
                plusAbility("s",1)
                plusAbility("a",2)
                plusAbility("f",2)
                plusSpecial("chance",0.07)
                plusAbility("b_p",3)
                plusAbility("c_p",1)
                plusAbility("kc_p",5)
                plusAbility("ac_p",5)
            }
            "冗談多め" -> {
                plusAbility("p",4)
                plusAbility("a",2)
                plusAbility("s",3)
                plusSpecial("chance",0.02)
                plusAbility("b_p",5)
                plusAbility("c_p",3)
                plusAbility("s_p",5)
                plusAbility("kc_p",5)
                plusAbility("ac_p",10)
            }
            "話が面白い" -> {
                plusAbility("c",2)
                plusAbility("p",2)
                plusAbility("s",6)
                plusAbility("a",2)
                plusAbility("f",3)
                plusSpecial("chance",0.02)
                plusAbility("b_p",3)
                plusAbility("c_p",12)
                plusAbility("s_p",5)
                plusAbility("kc_p",6)
                plusAbility("ac_p",5)
            }
            "つまらない" -> {
                plusAbility("p",-2)
                plusAbility("f",-2)
                plusSpecial("chance",-0.05)
                plusAbility("c_p",-2)
                plusAbility("kc_p",-3)
                plusAbility("ac_p",-3)
            }
            "芸人" -> {
                plusAbility("c",3)
                plusAbility("p",5)
                plusAbility("s",8)
                plusAbility("a",6)
                plusAbility("f",3)
                plusSpecial("chance",0.04)
                plusAbility("b_p",7)
                plusAbility("c_p",6)
                plusAbility("s_p",7)
                plusAbility("kc_p",10)
                plusAbility("ac_p",10)
            }
        }

        when(a1_o){
            "王子様" -> {
                plusAbility("c",11)
                plusAbility("p",7)
                plusAbility("s",8)
                plusAbility("a",5)
                plusAbility("f",3)
                plusAbility("b_p",13)
                plusAbility("c_p",8)
                plusAbility("s_p",3)
                plusAbility("kc_p",12)
                plusAbility("ac_p",12)
            }
            "モテる" -> {
                plusAbility("c",6)
                plusAbility("p",5)
                plusAbility("s",6)
                plusAbility("a",3)
                plusAbility("f",3)
                plusAbility("b_p",9)
                plusAbility("c_p",6)
                plusAbility("s_p",1)
                plusAbility("kc_p",9)
                plusAbility("ac_p",9)
            }
            "ハンター" -> {
                plusAbility("c",1)
                plusAbility("p",6)
                plusAbility("s",8)
                plusAbility("a",7)
                plusSpecial("chance",0.05)
                plusAbility("b_p",10)
                plusAbility("c_p",3)
                plusAbility("s_p",5)
                plusAbility("kc_p",6)
                plusAbility("ac_p",12)
            }
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("a",2)
                plusAbility("f",2)
            }
            "ぷぅ〜" -> {
                plusAbility("c",-3)
                plusAbility("p",-3)
                plusAbility("s",-2)
                plusAbility("a",-1)
                plusAbility("f",-1)
                plusAbility("b_p",-1)
                plusAbility("c_p",-1)
                plusAbility("s_p",-1)
                plusAbility("kc_p",-5)
                plusAbility("ac_p",-5)
            }
        }

        when(a2_o){
            "大人気" -> {
                plusAbility("c",4)
                plusAbility("p",4)
                plusAbility("s",6)
                plusAbility("a",10)
                plusAbility("f",12)
                plusAbility("b_p",10)
                plusAbility("c_p",20)
                plusAbility("s_p",20)
                plusAbility("kc_p",8)
                plusAbility("ac_p",8)

            }
            "まぁまぁ" -> {
                plusAbility("c",2)
                plusAbility("p",2)
                plusAbility("s",3)
                plusAbility("a",6)
                plusAbility("f",7)
                plusAbility("b_p",8)
                plusAbility("c_p",15)
                plusAbility("s_p",10)
                plusAbility("kc_p",6)
                plusAbility("ac_p",6)

            }
            "ふつう" -> {
                plusAbility("a",3)
                plusAbility("f",3)
                plusAbility("s_p",3)
            }
            "あんまり" -> {
                plusAbility("a",-1)
                plusAbility("f",-1)
                plusAbility("c_p",-5)
                plusAbility("s_p",-4)
            }
            "ぷぅ〜" -> {
                plusAbility("c",-1)
                plusAbility("p",-1)
                plusAbility("s",-2)
                plusAbility("a",-3)
                plusAbility("f",-3)
                plusAbility("b_p",-1)
                plusAbility("c_p",-14)
                plusAbility("s_p",-10)
                plusAbility("kc_p",-2)
                plusAbility("ac_p",-2)
            }
        }

        when(a3_o){
            "最強" -> {
                plusSpecial("chance",0.15)

            }
            "なかなか" -> {
                plusSpecial("chance",0.08)
            }
            "ふつう" -> {}
            "あんまり" -> {
                plusSpecial("chance",-0.08)
            }
            "豆腐メンタル" -> {
                plusSpecial("chance",-0.15)
            }
        }

        when(a5_o){
            "カリスマ" -> {
                plusAbility("c",10)
                plusAbility("p",4)
                plusAbility("s",7)
                plusAbility("a",4)
                plusAbility("f",4)
                plusSpecial("chance",0.1)
                plusAbility("b_p",7)
                plusAbility("c_p",10)
                plusAbility("s_p",4)
                plusAbility("kc_p",15)
                plusAbility("ac_p",15)
                plusAbility("slider",5)
                plusAbility("folk",10)
                plusAbility("sinker",5)
                plusAbility("shoot",5)
            }
            "スポーツマン" -> {
                plusAbility("c",3)
                plusAbility("p",10)
                plusAbility("s",15)
                plusAbility("a",8)
                plusAbility("f",6)
                plusAbility("b_p",14)
                plusAbility("c_p",5)
                plusAbility("s_p",25)
                plusAbility("ac_p",5)
                plusAbility("slider",10)
            }
            "天才頭脳" -> {
                plusAbility("c",8)
                plusAbility("s",5)
                plusAbility("a",3)
                plusAbility("f",15)
                plusAbility("c_p",20)
                plusAbility("kc_p",12)
            }
            "酒豪" -> {
                plusAbility("c",1)
                plusAbility("p",3)
                plusAbility("a",3)
                plusAbility("f",-1)
                plusSpecial("chance",0.04)
                plusAbility("b_p",4)
                plusAbility("c_p",-5)
                plusAbility("s_p",5)
                plusAbility("ac_p",3)
                plusAbility("slider",3)
                plusAbility("folk",4)
            }
            "ヘビースモーカー" -> {
                plusAbility("c",2)
                plusAbility("p",1)
                plusAbility("s",2)
                plusAbility("a",3)
                plusAbility("f",-1)
                plusSpecial("chance",0.02)
                plusAbility("b_p",4)
                plusAbility("s_p",-8)
                plusAbility("ac_p",2)
                plusAbility("sinker",5)
                plusAbility("shoot",5)
            }
            "元ヤン" -> {
                plusAbility("p",7)
                plusAbility("s",3)
                plusAbility("a",12)
                plusAbility("b_p",9)
                plusAbility("c_p",-3)
                plusAbility("s_p",-3)
                plusAbility("shoot",15)
            }
            "特になし" -> {}
        }


        when(a4_o){
            "大好き" -> {
                contact = (contact * 1.3).toInt()
                power = (power * 1.3).toInt()
                speed = (speed * 1.3).toInt()
                armStrength = (armStrength * 1.3).toInt()
                fielding = (fielding * 1.3).toInt()
                ballSpeed = (ballSpeed * 1.3).toInt()
                control = (control * 1.3).toInt()
                stamina = (stamina * 1.3).toInt()
                kindsOfChangeBall = (kindsOfChangeBall * 1.3).toInt()
                amountOfCange = (amountOfCange * 1.3).toInt()
            }
            "まぁまぁ" -> {
                contact = (contact * 1.15).toInt()
                power = (power * 1.15).toInt()
                speed = (speed * 1.15).toInt()
                armStrength = (armStrength * 1.15).toInt()
                fielding = (fielding * 1.15).toInt()
                ballSpeed = (ballSpeed * 1.15).toInt()
                control = (control * 1.15).toInt()
                stamina = (stamina * 1.15).toInt()
                kindsOfChangeBall = (kindsOfChangeBall * 1.15).toInt()
                amountOfCange = (amountOfCange * 1.15).toInt()
            }
            "ふつう" -> {}
            "興味深い" -> {
                contact = (contact * 1.1).toInt()
                power = (power * 1.1).toInt()
                speed = (speed * 1.1).toInt()
                armStrength = (armStrength * 1.1).toInt()
                fielding = (fielding * 1.1).toInt()
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
                ballSpeed = (ballSpeed * 0.8).toInt()
                control = (control * 0.8).toInt()
                stamina = (stamina * 0.8).toInt()
                kindsOfChangeBall = (kindsOfChangeBall * 0.8).toInt()
                amountOfCange = (amountOfCange * 0.8).toInt()
            }
        }

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    fun calcAbility_w(){

        when(a1_a){
            "~150cm" -> {
                plusAbility("s",4)
                plusAbility("c",2)
                plusAbility("c_p",4)
                plusAbility("s_p",1)
                plusAbility("kc_p",2)
                plusAbility("ac_p",1)
                plusAbility("slider",1)
                plusAbility("curb",5)
            }
            "151~160cm" -> {
                plusAbility("p",4)
                plusAbility("s",2)
                plusAbility("b_p",5)
                plusAbility("c_p",3)
                plusAbility("s_p",3)
                plusAbility("kc_p",1)
                plusAbility("ac_p",2)
                plusAbility("slider",3)
                plusAbility("curb",3)
            }
            "161~170cm" -> {
                plusAbility("p",6)
                plusAbility("a",1)
                plusAbility("b_p",8)
                plusAbility("c_p",3)
                plusAbility("s_p",5)
                plusAbility("ac_p",4)
                plusAbility("slider",5)
                plusAbility("curb",2)
                plusAbility("folk",8)
            }
            "171~180cm" -> {
                plusAbility("p",11)
                plusAbility("a",3)
                plusAbility("b_p",12)
                plusAbility("c_p",2)
                plusAbility("s_p",7)
                plusAbility("ac_p",6)
                plusAbility("slider",4)
                plusAbility("folk",20)
            }
            "181cm~" -> {
                plusAbility("p",15)
                plusAbility("a",5)
                plusAbility("b_p",16)
                plusAbility("c_p",1)
                plusAbility("s_p",10)
                plusAbility("ac_p",8)
                plusAbility("slider",5)
                plusAbility("folk",25)
            }
        }

        when(a2_a){
            "ふつう" -> {
                plusAbility("p",2)
                plusAbility("s",2)
                plusAbility("b_p",2)
                plusAbility("c_p",2)
                plusAbility("s_p",4)
                plusAbility("kc_p",3)
                plusAbility("ac_p",3)
                plusAbility("slider",3)
                plusAbility("curb",3)
            }
            "スリム" -> {
                plusAbility("c",3)
                plusAbility("s",8)
                plusAbility("a",2)
                plusAbility("f",3)
                plusAbility("b_p",2)
                plusAbility("c_p",5)
                plusAbility("s_p",3)
                plusAbility("kc_p",4)
                plusAbility("ac_p",3)
                plusAbility("slider",3)
                plusAbility("shoot",3)
            }
            "ぽっちゃり" -> {
                plusAbility("p",7)
                plusAbility("s",-5)
                plusAbility("b_p",9)
                plusAbility("c_p",1)
                plusAbility("ac_p",3)
                plusAbility("curb",5)
            }
            "ムッチリ" -> {
                plusAbility("p",5)
                plusAbility("s",-2)
                plusAbility("a",4)
                plusAbility("b_p",7)
                plusAbility("s_p",7)
                plusAbility("slider",4)
                plusAbility("shoot",3)
            }
            "マッチョ" -> {
                plusAbility("p",11)
                plusAbility("s",3)
                plusAbility("a",5)
                plusAbility("b_p",20)
                plusAbility("s_p",8)
                plusAbility("ac_p",1)
                plusAbility("slider",10)
                plusAbility("folk",1)
                plusAbility("shoot",1)
            }
            "グラマラス" -> {
                plusAbility("c",10)
                plusAbility("p",9)
                plusAbility("b_p",15)
                plusAbility("c_p",-3)
                plusAbility("kc_p",9)
                plusAbility("ac_p",12)
                plusAbility("slider",3)
                plusAbility("shoot",3)
            }
        }

        when(a3_a){
            "ふつう" -> {
                plusAbility("c",3)
                plusAbility("p",3)
                plusAbility("s",3)
                plusAbility("a",3)
                plusAbility("f",3)
                plusAbility("b_p",2)
                plusAbility("c_p",3)
                plusAbility("s_p",3)
                plusAbility("kc_p",3)
                plusAbility("ac_p",3)
                plusAbility("slider",2)
                plusAbility("curb",3)
            }
            "カワイイ系" -> {
                plusAbility("c",9)
                plusAbility("p",3)
                plusAbility("s",5)
                plusAbility("a",4)
                plusAbility("f",5)
                plusAbility("b_p",15)
                plusAbility("c_p",7)
                plusAbility("s_p",5)
                plusAbility("kc_p",18)
                plusAbility("ac_p",10)
                plusAbility("slider",1)
                plusAbility("curb",5)
                plusAbility("folk",2)
                plusAbility("sinker",8)
            }
            "美人系" -> {
                plusAbility("c",4)
                plusAbility("p",5)
                plusAbility("s",7)
                plusAbility("a",8)
                plusAbility("f",10)
                plusAbility("b_p",20)
                plusAbility("c_p",13)
                plusAbility("s_p",10)
                plusAbility("kc_p",13)
                plusAbility("ac_p",15)
                plusAbility("slider",5)
                plusAbility("folk",5)
                plusAbility("sinker",2)
                plusAbility("shoot",3)
            }
            "地味め" -> {
                plusAbility("c",2)
                plusAbility("a",2)
                plusAbility("f",10)
                plusAbility("b_p",2)
                plusAbility("c_p",7)
                plusAbility("s_p",3)
                plusAbility("kc_p",5)
                plusAbility("ac_p",2)
                plusAbility("slider",2)
                plusAbility("curb",5)
            }
            "派手め" -> {
                plusAbility("p",5)
                plusAbility("s",8)
                plusAbility("a",8)
                plusSpecial("chance",0.02)
                plusAbility("b_p",10)
                plusAbility("c_p",-5)
                plusAbility("s_p",3)
                plusAbility("kc_p",5)
                plusAbility("ac_p",5)
                plusAbility("slider",3)
                plusAbility("folk",2)
                plusAbility("shoot",10)
            }
        }

        when(a4_a){
            "優しそう" -> {
                plusAbility("c",5)
                plusAbility("s",3)
                plusAbility("f",5)
                plusAbility("c_p",10)
                plusAbility("s_p",6)
                plusAbility("kc_p",6)
                plusAbility("ac_p",10)
                plusAbility("slider",2)
                plusAbility("curb",4)
                plusAbility("folk",3)
                plusAbility("sinker",3)
            }
            "マジメそう" -> {
                plusAbility("s",1)
                plusAbility("a",3)
                plusAbility("f",9)
                plusAbility("c_p",8)
                plusAbility("s_p",2)
                plusAbility("kc_p",1)
                plusAbility("ac_p",1)
                plusAbility("slider",1)
                plusAbility("curb",3)
            }
            "こわそう" -> {
                plusAbility("p",5)
                plusAbility("s",4)
                plusAbility("a",6)
                plusAbility("b_p",7)
                plusAbility("s_p",3)
                plusAbility("kc_p",2)
                plusAbility("ac_p",5)
                plusAbility("slider",2)
                plusAbility("shoot",10)
            }
            "元気そう" -> {
                plusAbility("p",7)
                plusAbility("s",6)
                plusAbility("a",7)
                plusAbility("b_p",7)
                plusAbility("c_p",3)
                plusAbility("s_p",15)
                plusAbility("kc_p",5)
                plusAbility("ac_p",8)
                plusAbility("slider",5)
                plusAbility("folk",3)
                plusAbility("shoot",2)
            }
            "大人しそう" -> {
                plusAbility("c",4)
                plusAbility("s",2)
                plusAbility("f",6)
                plusAbility("c_p",8)
                plusAbility("s_p",3)
                plusAbility("kc_p",3)
                plusAbility("ac_p",3)
                plusAbility("slider",2)
                plusAbility("curb",4)
                plusAbility("sinker",2)
            }
            "チャラそう" -> {
                plusAbility("p",3)
                plusAbility("s",6)
                plusAbility("a",6)
                plusAbility("b_p",6)
                plusAbility("c_p",-1)
                plusAbility("s_p",3)
                plusAbility("kc_p",5)
                plusAbility("ac_p",8)
                plusAbility("slider",4)
                plusAbility("folk",2)
                plusAbility("sinker",2)
                plusAbility("shoot",9)
            }
        }

        when(a5_a){
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("p",2)
                plusAbility("s",1)
                plusAbility("a",2)
                plusAbility("f",1)
                plusAbility("b_p",3)
                plusAbility("c_p",3)
                plusAbility("s_p",4)
                plusAbility("kc_p",3)
                plusAbility("ac_p",3)
                plusAbility("slider",2)
                plusAbility("curb",3)
            }
            "オシャレ" -> {
                plusAbility("c",4)
                plusAbility("p",2)
                plusAbility("s",4)
                plusAbility("a",3)
                plusAbility("f",4)
                plusAbility("b_p",4)
                plusAbility("c_p",6)
                plusAbility("s_p",4)
                plusAbility("kc_p",15)
                plusAbility("ac_p",7)
                plusAbility("slider",2)
                plusAbility("folk",3)
                plusAbility("sinker",4)
            }
            "地味め" -> {
                plusAbility("c",2)
                plusAbility("p",2)
                plusAbility("a",3)
                plusAbility("f",6)
                plusAbility("b_p",2)
                plusAbility("c_p",12)
                plusAbility("s_p",8)
                plusAbility("kc_p",1)
                plusAbility("ac_p",3)
                plusAbility("slider",2)
                plusAbility("curb",4)
            }
            "派手め" -> {
                plusAbility("p",5)
                plusAbility("s",5)
                plusAbility("a",5)
                plusAbility("b_p",9)
                plusAbility("c_p",1)
                plusAbility("s_p",2)
                plusAbility("kc_p",6)
                plusAbility("ac_p",5)
                plusAbility("slider",5)
                plusAbility("shoot",5)
            }
            "独創的" -> {
                plusAbility("p",3)
                plusAbility("a",3)
                plusSpecial("chance",0.05)
                plusAbility("b_p",5)
                plusAbility("c_p",4)
                plusAbility("s_p",4)
                plusAbility("ac_p",16)
            }
        }

        when(a1_p){
            "穏やか" -> {
                plusAbility("c",3)
                plusAbility("p",2)
                plusAbility("s",1)
                plusAbility("a",2)
                plusAbility("f",3)
                plusAbility("c_p",12)
                plusAbility("s_p",7)
                plusAbility("kc_p",4)
                plusAbility("ac_p",4)
                plusAbility("slider",2)
                plusAbility("sinker",1)
            }
            "おとなしい" -> {
                plusAbility("c",2)
                plusAbility("a",2)
                plusAbility("f",5)
                plusAbility("c_p",8)
                plusAbility("s_p",6)
                plusAbility("kc_p",2)
                plusAbility("ac_p",2)
                plusAbility("slider",2)
                plusAbility("curb",3)
            }
            "サバサバ" -> {
                plusAbility("p",4)
                plusAbility("s",3)
                plusAbility("a",5)
                plusAbility("b_p",3)
                plusAbility("c_p",3)
                plusAbility("s_p",6)
                plusAbility("kc_p",3)
                plusAbility("ac_p",2)
                plusAbility("slider",3)
                plusAbility("shoot",8)
            }
            "うるさい" -> {
                plusAbility("c",-2)
                plusAbility("p",4)
                plusAbility("s",4)
                plusAbility("a",5)
                plusAbility("f",-2)
                plusAbility("b_p",6)
                plusAbility("c_p",-3)
                plusAbility("s_p",2)
                plusAbility("kc_p",1)
                plusAbility("ac_p",1)
                plusAbility("folk",2)
                plusAbility("shoot",4)
            }
            "メンヘラ" -> {
                plusAbility("c",-3)
                plusAbility("f",-6)
                plusSpecial("chance",-0.1)
                plusAbility("c_p",-7)
                plusAbility("s_p",-3)
                plusAbility("ac_p",5)
                plusAbility("folk",3)
                plusAbility("shoot",3)
            }

        }

        when(a2_p){
            "優しい" -> {
                plusAbility("c",3)
                plusAbility("p",2)
                plusAbility("s",2)
                plusAbility("a",2)
                plusAbility("f",4)
                plusAbility("c_p",12)
                plusAbility("s_p",6)
                plusAbility("kc_p",8)
                plusAbility("ac_p",8)
                plusAbility("curb",3)
                plusAbility("folk",1)
                plusAbility("sinker",3)
            }
            "頑張り屋さん" -> {
                plusAbility("p",2)
                plusAbility("s",2)
                plusAbility("a",3)
                plusAbility("f",3)
                plusAbility("b_p",5)
                plusAbility("c_p",7)
                plusAbility("s_p",15)
                plusAbility("kc_p",6)
                plusAbility("ac_p",6)
            }
            "気が強い" -> {
                plusAbility("c",-2)
                plusAbility("a",9)
                plusSpecial("chance",0.03)
                plusAbility("b_p",8)
                plusAbility("kc_p",1)
                plusAbility("ac_p",1)
                plusAbility("slider",2)
                plusAbility("sinker",2)
                plusAbility("shoot",20)
            }
            "無気力" -> {
                plusAbility("c",1)
                plusAbility("p",1)
                plusAbility("s",1)
                plusAbility("a",1)
                plusAbility("f",1)
            }
            "かまってちゃん" -> {
                plusAbility("p",3)
                plusAbility("s",4)
                plusAbility("a",4)
                plusAbility("f",2)
                plusAbility("b_p",3)
                plusAbility("ac_p",6)
                plusAbility("folk",3)
            }
            "一匹オオカミ" -> {
                plusAbility("p",4)
                plusAbility("s",4)
                plusAbility("a",4)
                plusSpecial("chance",0.02)
                plusAbility("b_p",6)
                plusAbility("s_p",9)
                plusAbility("kc_p",1)
                plusAbility("ac_p",2)
                plusAbility("slider",4)
                plusAbility("shoot",4)
            }
        }

        when(a3_p){
            "リーダー" -> {
                plusAbility("c",2)
                plusAbility("p",5)
                plusAbility("s",2)
                plusAbility("a",6)
                plusAbility("f",7)
                plusAbility("b_p",10)
                plusAbility("c_p",6)
                plusAbility("s_p",20)
                plusAbility("kc_p",3)
                plusAbility("ac_p",4)
                plusAbility("slider",5)
                plusAbility("folk",3)
                plusAbility("shoot",1)
            }
            "控えめ" -> {
                plusAbility("c",5)
                plusAbility("f",6)
                plusAbility("c_p",10)
                plusAbility("s_p",6)
                plusAbility("kc_p",2)
                plusAbility("ac_p",2)
                plusAbility("slider",3)
                plusAbility("curb",3)
            }
            "ムードメーカー" -> {
                plusAbility("c",1)
                plusAbility("p",5)
                plusAbility("s",3)
                plusAbility("a",5)
                plusAbility("f",2)
                plusSpecial("chance",0.03)
                plusAbility("b_p",5)
                plusAbility("c_p",4)
                plusAbility("s_p",5)
                plusAbility("kc_p",9)
                plusAbility("ac_p",7)
                plusAbility("slider",4)
                plusAbility("sinker",7)
            }
            "批評家" -> {
                plusAbility("c",-2)
                plusAbility("p",2)
                plusAbility("s",-2)
                plusAbility("a",6)
                plusAbility("f",-1)
                plusSpecial("chance",-0.03)
                plusAbility("b_p",6)
                plusAbility("c_p",-1)
                plusAbility("kc_p",-2)
                plusAbility("shoot",12)
            }
            "アイデアマン" -> {
                plusAbility("c",5)
                plusAbility("p",3)
                plusAbility("s",1)
                plusAbility("a",4)
                plusAbility("f",5)
                plusAbility("c_p",7)
                plusAbility("kc_p",13)
                plusAbility("ac_p",13)
                plusAbility("folk",3)
                plusAbility("sinker",7)
            }

        }

        when(a4_p){
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("p",2)
                plusAbility("s",1)
                plusAbility("a",2)
                plusAbility("f",1)
                plusAbility("b_p",4)
                plusAbility("c_p",3)
                plusAbility("kc_p",3)
                plusAbility("ac_p",3)
                plusAbility("slider",3)
                plusAbility("curb",3)
            }
            "お勉強得意" -> {
                plusAbility("c",2)
                plusAbility("s",3)
                plusAbility("a",2)
                plusAbility("f",8)
                plusSpecial("chance",-0.03)
                plusAbility("b_p",2)
                plusAbility("c_p",12)
                plusAbility("s_p",7)
                plusAbility("kc_p",4)
                plusAbility("ac_p",4)
            }
            "頭キレキレ" -> {
                plusAbility("c",3)
                plusAbility("s",9)
                plusAbility("a",6)
                plusAbility("f",5)
                plusSpecial("chance",0.05)
                plusAbility("b_p",5)
                plusAbility("c_p",6)
                plusAbility("s_p",3)
                plusAbility("kc_p",15)
                plusAbility("ac_p",8)
                plusAbility("slider",6)
                plusAbility("folk",6)
            }
            "頭からっぽ" -> {
                plusAbility("c",-1)
                plusAbility("p",4)
                plusAbility("a",6)
                plusAbility("f",-4)
                plusSpecial("chance",0.03)
                plusAbility("b_p",5)
                plusAbility("c_p",-5)
                plusAbility("s_p",5)
                plusAbility("kc_p",-6)
                plusAbility("ac_p",-4)
            }
            "脳筋" -> {
                plusAbility("c",-3)
                plusAbility("p",7)
                plusAbility("s",2)
                plusAbility("a",6)
                plusAbility("f",-3)
                plusSpecial("chance",-0.1)
                plusAbility("b_p",8)
                plusAbility("c_p",-3)
                plusAbility("s_p",10)
                plusAbility("kc_p",-2)
                plusAbility("ac_p",-2)
                plusAbility("slider",3)
            }
        }

        when(a5_p){
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("p",2)
                plusAbility("s",1)
                plusAbility("a",2)
                plusAbility("f",1)
                plusAbility("b_p",3)
                plusAbility("c_p",3)
                plusAbility("kc_p",3)
                plusAbility("ac_p",3)
            }
            "天然" -> {
                plusAbility("c",1)
                plusAbility("p",1)
                plusAbility("s",1)
                plusAbility("a",2)
                plusAbility("f",2)
                plusSpecial("chance",0.07)
                plusAbility("b_p",3)
                plusAbility("c_p",1)
                plusAbility("kc_p",5)
                plusAbility("ac_p",5)
            }
            "冗談多め" -> {
                plusAbility("p",5)
                plusAbility("a",3)
                plusAbility("s",3)
                plusSpecial("chance",0.02)
                plusAbility("b_p",5)
                plusAbility("c_p",3)
                plusAbility("s_p",5)
                plusAbility("kc_p",5)
                plusAbility("ac_p",10)
            }
            "話が面白い" -> {
                plusAbility("c",2)
                plusAbility("p",3)
                plusAbility("s",6)
                plusAbility("a",3)
                plusAbility("f",3)
                plusSpecial("chance",0.02)
                plusAbility("b_p",3)
                plusAbility("c_p",12)
                plusAbility("s_p",5)
                plusAbility("kc_p",8)
                plusAbility("ac_p",5)
            }
            "つまらない" -> {
                plusAbility("p",-2)
                plusAbility("f",-2)
                plusSpecial("chance",-0.05)
                plusAbility("c_p",-2)
                plusAbility("kc_p",-3)
                plusAbility("ac_p",-3)
            }
            "芸人" -> {
                plusAbility("c",3)
                plusAbility("p",6)
                plusAbility("s",8)
                plusAbility("a",7)
                plusAbility("f",3)
                plusSpecial("chance",0.04)
                plusAbility("b_p",7)
                plusAbility("c_p",6)
                plusAbility("s_p",7)
                plusAbility("kc_p",10)
                plusAbility("ac_p",10)
            }
        }

        when(a1_o){
            "マドンナ" -> {
                plusAbility("c",13)
                plusAbility("p",8)
                plusAbility("s",8)
                plusAbility("a",5)
                plusAbility("f",5)
                plusAbility("b_p",18)
                plusAbility("c_p",10)
                plusAbility("s_p",5)
                plusAbility("kc_p",20)
                plusAbility("ac_p",18)
            }
            "モテる" -> {
                plusAbility("c",9)
                plusAbility("p",6)
                plusAbility("s",6)
                plusAbility("a",3)
                plusAbility("f",3)
                plusAbility("b_p",13)
                plusAbility("c_p",8)
                plusAbility("s_p",3)
                plusAbility("kc_p",12)
                plusAbility("ac_p",10)
            }
            "一部から" -> {
                plusAbility("c",6)
                plusAbility("p",5)
                plusAbility("s",6)
                plusAbility("b_p",10)
                plusAbility("c_p",5)
                plusAbility("kc_p",8)
                plusAbility("ac_p",10)
            }
            "ふつう" -> {
                plusAbility("c",3)
                plusAbility("p",3)
            }
            "ぷぅ〜" -> {
                plusAbility("c",-3)
                plusAbility("p",-3)
                plusAbility("s",-2)
                plusAbility("a",-1)
                plusAbility("f",-1)
                plusAbility("b_p",-1)
                plusAbility("c_p",-1)
                plusAbility("s_p",-1)
                plusAbility("kc_p",-5)
                plusAbility("ac_p",-5)
            }
        }

        when(a2_o){
            "大人気" -> {
                plusAbility("c",5)
                plusAbility("p",5)
                plusAbility("s",8)
                plusAbility("a",12)
                plusAbility("f",15)
                plusAbility("b_p",8)
                plusAbility("c_p",22)
                plusAbility("s_p",22)
                plusAbility("kc_p",9)
                plusAbility("ac_p",9)
            }
            "まぁまぁ" -> {
                plusAbility("c",2)
                plusAbility("p",3)
                plusAbility("s",5)
                plusAbility("a",8)
                plusAbility("f",10)
                plusAbility("b_p",6)
                plusAbility("c_p",15)
                plusAbility("s_p",15)
                plusAbility("kc_p",7)
                plusAbility("ac_p",7)
            }
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("p",1)
                plusAbility("s",3)
                plusAbility("a",5)
                plusAbility("f",5)
                plusAbility("c_p",5)
                plusAbility("s_p",7)
            }
            "あんまり" -> {
                plusAbility("a",1)
                plusAbility("f",1)
            }
            "ぷぅ〜" -> {
                plusAbility("c",-1)
                plusAbility("p",-1)
                plusAbility("s",-1)
                plusAbility("a",-5)
                plusAbility("f",-8)
                plusAbility("b_p",-1)
                plusAbility("c_p",-10)
                plusAbility("s_p",-7)
                plusAbility("kc_p",-2)
                plusAbility("ac_p",-2)
            }
        }

        when(a3_o){
            "最強" -> {
                plusSpecial("chance",0.15)
            }
            "なかなか" -> {
                plusSpecial("chance",0.08)
            }
            "ふつう" -> {}
            "あんまり" -> {
                plusSpecial("chance",-0.08)
            }
            "豆腐メンタル" -> {
                plusSpecial("chance",-0.15)
            }
        }

        when(a5_o){
            "酒豪" -> {
                plusAbility("c",1)
                plusAbility("p",3)
                plusAbility("a",3)
                plusAbility("f",-1)
                plusSpecial("chance",0.04)
                plusAbility("b_p",4)
                plusAbility("c_p",-5)
                plusAbility("s_p",5)
                plusAbility("ac_p",3)
                plusAbility("slider",3)
                plusAbility("folk",4)
            }
            "ヘビースモーカー" -> {
                plusAbility("c",2)
                plusAbility("p",1)
                plusAbility("s",2)
                plusAbility("a",3)
                plusAbility("f",-1)
                plusSpecial("chance",0.02)
                plusAbility("b_p",4)
                plusAbility("s_p",-8)
                plusAbility("ac_p",2)
                plusAbility("sinker",5)
                plusAbility("shoot",5)
            }
            "ボスキャラ" -> {
                plusAbility("c",1)
                plusAbility("p",8)
                plusAbility("s",1)
                plusAbility("a",10)
                plusAbility("f",2)
                plusSpecial("chance",0.05)
                plusAbility("b_p",12)
                plusAbility("s_p",3)
                plusAbility("ac_p",10)
                plusAbility("slider",3)
                plusAbility("folk",10)
                plusAbility("shoot",7)
            }
            "お色気" -> {
                plusAbility("c",10)
                plusAbility("p",15)
                plusAbility("s",-5)
                plusAbility("a",-5)
                plusAbility("f",-6)
                plusAbility("b_p",14)
                plusAbility("c_p",-4)
                plusAbility("s_p",-2)
                plusAbility("kc_p",7)
                plusAbility("ac_p",18)
                plusAbility("slider",5)
                plusAbility("shoot",5)
            }
            "大和撫子" -> {
                plusAbility("c",5)
                plusAbility("p",5)
                plusAbility("s",5)
                plusAbility("a",5)
                plusAbility("f",10)
                plusAbility("b_p",10)
                plusAbility("c_p",18)
                plusAbility("s_p",12)
                plusAbility("kc_p",3)
                plusAbility("ac_p",8)
                plusAbility("slider",5)
                plusAbility("folk",5)
            }
            "スポーツ少女" -> {
                plusAbility("p",7)
                plusAbility("s",14)
                plusAbility("a",10)
                plusAbility("b_p",14)
                plusAbility("s_p",18)
                plusAbility("ac_p",3)
                plusAbility("slider",5)
                plusAbility("folk",3)
                plusAbility("shoot",3)
            }
            "特になし" -> {}
        }


        when(a4_o){
            "大好き" -> {
                contact = (contact * 1.3).toInt()
                power = (power * 1.3).toInt()
                speed = (speed * 1.3).toInt()
                armStrength = (armStrength * 1.3).toInt()
                fielding = (fielding * 1.3).toInt()
            }
            "まぁまぁ" -> {
                contact = (contact * 1.15).toInt()
                power = (power * 1.15).toInt()
                speed = (speed * 1.15).toInt()
                armStrength = (armStrength * 1.15).toInt()
                fielding = (fielding * 1.15).toInt()
            }
            "ふつう" -> {}
            "興味深い" -> {
                contact = (contact * 1.1).toInt()
                power = (power * 1.1).toInt()
                speed = (speed * 1.1).toInt()
                armStrength = (armStrength * 1.1).toInt()
                fielding = (fielding * 1.1).toInt()
            }
            "アンチ" -> {
                contact = (contact * 0.8).toInt()
                power = (power * 0.8).toInt()
                speed = (speed * 0.8).toInt()
                armStrength = (armStrength * 0.8).toInt()
                fielding = (fielding * 0.8).toInt()
            }
        }

    }

    fun plusAbility(initial:String,point:Int){
        when(initial){
            "c" -> contact += point
            "p" -> power += point
            "s" -> speed += point
            "a" -> armStrength += point
            "f" -> fielding += point

            "b_p" -> ballSpeed += point
            "c_p" -> control += point
            "s_p" -> stamina += point
            "kc_p" -> kindsOfChangeBall += point
            "ac_p" -> amountOfCange += point
            "slider" -> priorityOfChange[0] += point
            "curb" -> priorityOfChange[1] += point
            "folk" -> priorityOfChange[2] += point
            "sinker" -> priorityOfChange[3] += point
            "shoot" -> priorityOfChange[4] += point
        }
    }

    fun plusSpecial(initial:String,point:Double){
        when(initial){
            "chance" -> chance += point
        }
    }




}