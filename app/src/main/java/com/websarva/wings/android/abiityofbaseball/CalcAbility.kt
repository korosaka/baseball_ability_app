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

    var contact = 0
    var power = 0
    var speed = 0
    var armStrength = 0
    var fielding = 0

    var chance = 1.0


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
                plusAbility("c",2)
            }
            "161~170cm" -> {
                plusAbility("p",4)
                plusAbility("s",2)
            }
            "171~180cm" -> {
                plusAbility("p",7)
                plusAbility("a",1)
            }
            "181~190cm" -> {
                plusAbility("p",13)
                plusAbility("a",3)
            }
            "191cm~" -> {
                plusAbility("p",16)
                plusAbility("a",5)
            }
        }

        when(a2_a){
            "ふつう" -> {
                plusAbility("p",2)
                plusAbility("s",2)
            }
            "スリム" -> {
                plusAbility("s",2)
                plusAbility("f",2)
            }
            "ぽっちゃり" -> {
                plusAbility("p",6)
                plusAbility("s",-5)
            }
            "ややマッチョ" -> {
                plusAbility("p",12)
                plusAbility("s",3)
                plusAbility("a",5)
            }
            "ゴリマッチョ" -> {
                plusAbility("p",18)
                plusAbility("s",-2)
                plusAbility("a",2)
            }
        }

        when(a3_a){
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("p",2)
                plusAbility("s",2)
                plusAbility("a",2)
                plusAbility("f",1)
            }
            "イケメン" -> {
                plusAbility("c",8)
                plusAbility("p",4)
                plusAbility("s",5)
                plusAbility("a",5)
                plusAbility("f",7)
            }
            "ワイルド" -> {
                plusAbility("p",8)
                plusAbility("s",5)
                plusAbility("a",12)
            }
            "かわいい" -> {
                plusAbility("c",12)
                plusAbility("p",2)
                plusAbility("s",3)
                plusAbility("a",2)
                plusAbility("f",5)
            }
            "強面" -> {
                plusAbility("p",5)
                plusAbility("s",2)
                plusAbility("a",12)
            }
        }

        when(a4_a){
            "優男" -> {
                plusAbility("c",5)
                plusAbility("p",2)
                plusAbility("s",3)
                plusAbility("a",2)
                plusAbility("f",5)
            }
            "マジメ君" -> {
                plusAbility("p",2)
                plusAbility("s",2)
                plusAbility("a",2)
                plusAbility("f",7)
                plusSpecial("chance",-0.05)
            }
            "クール" -> {
                plusAbility("p",2)
                plusAbility("s",7)
                plusAbility("a",5)
                plusAbility("f",5)
            }
            "おとぼけ" -> {
                plusAbility("c",2)
                plusAbility("p",2)
                plusAbility("s",3)
                plusAbility("a",2)
                plusAbility("f",2)
            }
            "チャラ男" -> {
                plusAbility("p",2)
                plusAbility("s",7)
                plusAbility("a",5)
            }
        }

        when(a5_a){
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("p",2)
                plusAbility("s",1)
                plusAbility("a",2)
                plusAbility("f",1)
            }
            "オシャレ" -> {
                plusAbility("c",4)
                plusAbility("p",2)
                plusAbility("s",4)
                plusAbility("a",3)
                plusAbility("f",4)
            }
            "地味め" -> {
                plusAbility("c",2)
                plusAbility("p",2)
                plusAbility("a",3)
                plusAbility("f",6)
            }
            "派手め" -> {
                plusAbility("p",5)
                plusAbility("s",5)
                plusAbility("a",5)
            }
            "独創的" -> {
                plusAbility("p",3)
                plusAbility("a",3)
                plusSpecial("chance",0.08)
            }
        }

        when(a1_p){
            "穏やか" -> {
                plusAbility("c",3)
                plusAbility("p",2)
                plusAbility("s",1)
                plusAbility("a",2)
                plusAbility("f",3)
            }
            "おとなしい" -> {
                plusAbility("c",2)
                plusAbility("a",2)
                plusAbility("f",5)
            }
            "淡々" -> {
                plusAbility("p",4)
                plusAbility("s",3)
                plusAbility("a",6)
            }
            "騒がしい" -> {
                plusAbility("c",-2)
                plusAbility("p",5)
                plusAbility("s",4)
                plusAbility("a",4)
                plusAbility("f",-2)
            }
            "ミステリアス" -> {
                plusAbility("c",5)
                plusAbility("p",3)
                plusSpecial("chance",0.05)
            }
        }

        when(a2_p){
            "優しい" -> {
                plusAbility("c",3)
                plusAbility("p",1)
                plusAbility("s",2)
                plusAbility("a",2)
                plusAbility("f",4)
            }
            "気が強い" -> {
                plusAbility("c",-2)
                plusAbility("a",12)
            }
            "無気力" -> {
                plusAbility("c",1)
                plusAbility("s",1)
                plusAbility("a",1)
                plusAbility("f",1)
            }
            "目立ちたがり" -> {
                plusAbility("p",2)
                plusAbility("s",4)
                plusAbility("a",5)
                plusAbility("f",2)
                plusSpecial("chance",0.05)
            }
            "一匹オオカミ" -> {
                plusAbility("p",1)
                plusAbility("s",4)
                plusAbility("a",5)
                plusSpecial("chance",0.03)
            }
        }

        when(a3_p){
            "リーダー" -> {
                plusAbility("c",2)
                plusAbility("p",4)
                plusAbility("s",2)
                plusAbility("a",7)
                plusAbility("f",7)
            }
            "控えめ" -> {
                plusAbility("c",5)
                plusAbility("f",6)
            }
            "ムードメーカー" -> {
                plusAbility("c",1)
                plusAbility("p",4)
                plusAbility("s",3)
                plusAbility("a",6)
                plusAbility("f",2)
                plusSpecial("chance",0.03)

            }
            "評論家" -> {
                plusAbility("c",-2)
                plusAbility("p",1)
                plusAbility("s",-2)
                plusAbility("a",7)
                plusAbility("f",-1)
                plusSpecial("chance",-0.03)
            }
            "アイデアマン" -> {
                plusAbility("c",5)
                plusAbility("p",2)
                plusAbility("s",1)
                plusAbility("a",5)
                plusAbility("f",5)
            }
        }

        when(a4_p){
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("p",1)
                plusAbility("s",1)
                plusAbility("a",2)
                plusAbility("f",1)
            }
            "お勉強得意" -> {
                plusAbility("c",2)
                plusAbility("s",3)
                plusAbility("a",2)
                plusAbility("f",8)
                plusSpecial("chance",-0.02)
            }
            "頭キレキレ" -> {
                plusAbility("c",3)
                plusAbility("s",9)
                plusAbility("a",7)
                plusAbility("f",5)
                plusSpecial("chance",0.03)
            }
            "頭からっぽ" -> {
                plusAbility("c",-1)
                plusAbility("p",3)
                plusAbility("a",7)
                plusAbility("f",-4)
                plusSpecial("chance",0.03)
            }
            "脳筋" -> {
                plusAbility("c",-3)
                plusAbility("p",6)
                plusAbility("s",2)
                plusAbility("a",6)
                plusAbility("f",-3)
                plusSpecial("chance",-0.12)
            }
        }

        when(a5_p){
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("p",1)
                plusAbility("s",1)
                plusAbility("a",2)
                plusAbility("f",1)
            }
            "冗談多め" -> {
                plusAbility("p",4)
                plusAbility("a",3)
                plusAbility("s",3)
                plusSpecial("chance",0.02)
            }
            "話が面白い" -> {
                plusAbility("c",2)
                plusAbility("p",2)
                plusAbility("s",6)
                plusAbility("a",3)
                plusAbility("f",3)
                plusSpecial("chance",0.02)
            }
            "つまらない" -> {
                plusAbility("p",-2)
                plusAbility("f",-2)
                plusSpecial("chance",-0.05)
            }
            "全てが面白い" -> {
                plusAbility("c",3)
                plusAbility("p",5)
                plusAbility("s",8)
                plusAbility("a",8)
                plusAbility("f",3)
                plusSpecial("chance",0.05)
            }
        }

        when(a1_o){
            "王子様" -> {
                plusAbility("c",11)
                plusAbility("p",7)
                plusAbility("s",8)
                plusAbility("a",5)
                plusAbility("f",3)
            }
            "モテる" -> {
                plusAbility("c",6)
                plusAbility("p",5)
                plusAbility("s",6)
                plusAbility("a",3)
                plusAbility("f",3)
            }
            "ハンター" -> {
                plusAbility("c",3)
                plusAbility("p",7)
                plusAbility("s",8)
                plusAbility("a",8)
                plusSpecial("chance",0.02)
            }
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("f",1)
            }
            "ぷぅ〜" -> {
                plusAbility("c",-3)
                plusAbility("p",-3)
                plusAbility("s",-2)
                plusAbility("a",-1)
                plusAbility("f",-1)
            }
        }

        when(a2_o){
            "大人気" -> {
                plusAbility("c",4)
                plusAbility("p",4)
                plusAbility("s",6)
                plusAbility("a",12)
                plusAbility("f",12)
            }
            "まぁまぁ" -> {
                plusAbility("c",2)
                plusAbility("p",2)
                plusAbility("s",3)
                plusAbility("a",7)
                plusAbility("f",7)
            }
            "ふつう" -> {
                plusAbility("a",3)
                plusAbility("f",3)
            }
            "あんまり" -> {
                plusAbility("a",-1)
                plusAbility("f",-1)
            }
            "ぷぅ〜" -> {
                plusAbility("c",-1)
                plusAbility("p",-1)
                plusAbility("s",-2)
                plusAbility("a",-3)
                plusAbility("f",-3)
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
            }
            "スポーツ万能" -> {
                plusAbility("c",3)
                plusAbility("p",10)
                plusAbility("s",15)
                plusAbility("a",10)
                plusAbility("f",6)
            }
            "天才頭脳" -> {
                plusAbility("c",8)
                plusAbility("s",5)
                plusAbility("a",3)
                plusAbility("f",15)
            }
            "どヤンキー" -> {
                plusAbility("p",8)
                plusAbility("a",15)
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

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    fun calcAbility_w(){

        when(a1_a){
            "~150cm" -> {
                plusAbility("s",4)
                plusAbility("c",2)
            }
            "151~160cm" -> {
                plusAbility("p",4)
                plusAbility("s",2)
            }
            "161~170cm" -> {
                plusAbility("p",7)
                plusAbility("a",1)
            }
            "171~180cm" -> {
                plusAbility("p",13)
                plusAbility("a",3)
            }
            "181cm~" -> {
                plusAbility("p",18)
                plusAbility("a",5)
            }
        }

        when(a2_a){
            "ふつう" -> {
                plusAbility("p",2)
                plusAbility("s",2)
            }
            "スリム" -> {
                plusAbility("c",3)
                plusAbility("s",8)
                plusAbility("a",3)
                plusAbility("f",3)
            }
            "ぽっちゃり" -> {
                plusAbility("p",7)
                plusAbility("s",-5)
            }
            "マッチョ" -> {
                plusAbility("p",12)
                plusAbility("s",3)
                plusAbility("a",5)
            }
            "グラマラス" -> {
                plusAbility("c",10)
                plusAbility("p",12)
            }
        }

        when(a3_a){
            "ふつう" -> {
                plusAbility("c",3)
                plusAbility("p",4)
                plusAbility("s",3)
                plusAbility("a",4)
                plusAbility("f",3)
            }
            "カワイイ系" -> {
                plusAbility("c",10)
                plusAbility("p",4)
                plusAbility("s",5)
                plusAbility("a",6)
                plusAbility("f",5)
            }
            "美人系" -> {
                plusAbility("c",5)
                plusAbility("p",7)
                plusAbility("s",7)
                plusAbility("a",10)
                plusAbility("f",10)
            }
            "地味め" -> {
                plusAbility("c",2)
                plusAbility("a",2)
                plusAbility("f",10)
            }
            "派手め" -> {
                plusAbility("p",6)
                plusAbility("s",8)
                plusAbility("a",10)
                plusSpecial("chance",0.02)
            }
        }

        when(a4_a){
            "優しそう" -> {
                plusAbility("c",5)
                plusAbility("s",3)
                plusAbility("f",5)
            }
            "こわそう" -> {
                plusAbility("p",6)
                plusAbility("s",4)
                plusAbility("a",10)
            }
            "元気そう" -> {
                plusAbility("p",8)
                plusAbility("s",6)
                plusAbility("a",8)
            }
            "大人しそう" -> {
                plusAbility("c",4)
                plusAbility("s",2)
                plusAbility("f",6)
            }
            "チャラそう" -> {
                plusAbility("p",3)
                plusAbility("s",6)
                plusAbility("a",7)
            }
        }

        when(a5_a){
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("p",2)
                plusAbility("s",1)
                plusAbility("a",2)
                plusAbility("f",1)
            }
            "オシャレ" -> {
                plusAbility("c",4)
                plusAbility("p",2)
                plusAbility("s",4)
                plusAbility("a",3)
                plusAbility("f",4)
            }
            "地味め" -> {
                plusAbility("c",2)
                plusAbility("p",2)
                plusAbility("a",3)
                plusAbility("f",6)
            }
            "派手め" -> {
                plusAbility("p",5)
                plusAbility("s",5)
                plusAbility("a",5)
            }
            "独創的" -> {
                plusAbility("p",3)
                plusAbility("a",3)
                plusSpecial("chance",0.05)
            }
        }

        when(a1_p){
            "穏やか" -> {
                plusAbility("c",3)
                plusAbility("p",2)
                plusAbility("s",1)
                plusAbility("a",2)
                plusAbility("f",3)
            }
            "おとなしい" -> {
                plusAbility("c",2)
                plusAbility("a",2)
                plusAbility("f",5)
            }
            "サバサバ" -> {
                plusAbility("p",4)
                plusAbility("s",3)
                plusAbility("a",6)
            }
            "うるさい" -> {
                plusAbility("c",-2)
                plusAbility("p",4)
                plusAbility("s",4)
                plusAbility("a",6)
                plusAbility("f",-2)
            }
            "メンヘラ" -> {
                plusAbility("c",-3)
                plusAbility("f",-6)
                plusSpecial("chance",0.1)
            }

        }

        when(a2_p){
            "優しい" -> {
                plusAbility("c",3)
                plusAbility("p",2)
                plusAbility("s",2)
                plusAbility("a",2)
                plusAbility("f",4)
            }
            "気が強い" -> {
                plusAbility("c",-2)
                plusAbility("a",12)
                plusSpecial("chance",0.03)
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
                plusAbility("a",5)
                plusAbility("f",2)
            }
            "一匹オオカミ" -> {
                plusAbility("p",4)
                plusAbility("s",4)
                plusAbility("a",5)
                plusSpecial("chance",0.02)
            }
        }

        when(a3_p){
            "リーダー" -> {
                plusAbility("c",2)
                plusAbility("p",5)
                plusAbility("s",2)
                plusAbility("a",7)
                plusAbility("f",7)
            }
            "控えめ" -> {
                plusAbility("c",5)
                plusAbility("f",6)
            }
            "ムードメーカー" -> {
                plusAbility("c",1)
                plusAbility("p",5)
                plusAbility("s",3)
                plusAbility("a",6)
                plusAbility("f",2)
                plusSpecial("chance",0.03)
            }
            "評論家" -> {
                plusAbility("c",-2)
                plusAbility("p",2)
                plusAbility("s",-2)
                plusAbility("a",7)
                plusAbility("f",-1)
                plusSpecial("chance",-0.03)
            }
            "アイデアマン" -> {
                plusAbility("c",5)
                plusAbility("p",3)
                plusAbility("s",1)
                plusAbility("a",5)
                plusAbility("f",5)
            }

        }

        when(a4_p){
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("p",2)
                plusAbility("s",1)
                plusAbility("a",2)
                plusAbility("f",1)
            }
            "お勉強得意" -> {
                plusAbility("c",2)
                plusAbility("s",3)
                plusAbility("a",2)
                plusAbility("f",8)
                plusSpecial("chance",-0.03)
            }
            "頭キレキレ" -> {
                plusAbility("c",3)
                plusAbility("s",9)
                plusAbility("a",7)
                plusAbility("f",5)
                plusSpecial("chance",0.05)
            }
            "頭からっぽ" -> {
                plusAbility("c",-1)
                plusAbility("p",4)
                plusAbility("a",7)
                plusAbility("f",-4)
                plusSpecial("chance",0.03)
            }
            "脳筋" -> {
                plusAbility("c",-3)
                plusAbility("p",7)
                plusAbility("s",2)
                plusAbility("a",7)
                plusAbility("f",-3)
                plusSpecial("chance",-0.1)
            }
        }

        when(a5_p){
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("p",2)
                plusAbility("s",1)
                plusAbility("a",2)
                plusAbility("f",1)
            }
            "冗談多め" -> {
                plusAbility("p",5)
                plusAbility("a",3)
                plusAbility("s",3)
                plusSpecial("chance",0.02)
            }
            "話が面白い" -> {
                plusAbility("c",2)
                plusAbility("p",3)
                plusAbility("s",6)
                plusAbility("a",3)
                plusAbility("f",3)
                plusSpecial("chance",0.02)
            }
            "つまらない" -> {
                plusAbility("p",-2)
                plusAbility("f",-2)
                plusSpecial("chance",-0.05)
            }
            "全てが面白い" -> {
                plusAbility("c",3)
                plusAbility("p",6)
                plusAbility("s",8)
                plusAbility("a",8)
                plusAbility("f",3)
                plusSpecial("chance",0.05)
            }
        }

        when(a1_o){
            "マドンナ" -> {
                plusAbility("c",15)
                plusAbility("p",10)
                plusAbility("s",8)
                plusAbility("a",7)
                plusAbility("f",5)
            }
            "モテる" -> {
                plusAbility("c",9)
                plusAbility("p",7)
                plusAbility("s",6)
                plusAbility("a",5)
                plusAbility("f",5)
            }
            "一部から" -> {
                plusAbility("c",6)
                plusAbility("p",5)
                plusAbility("s",6)
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
            }
        }

        when(a2_o){
            "大人気" -> {
                plusAbility("c",5)
                plusAbility("p",6)
                plusAbility("s",8)
                plusAbility("a",12)
                plusAbility("f",15)
            }
            "まぁまぁ" -> {
                plusAbility("c",2)
                plusAbility("p",3)
                plusAbility("s",5)
                plusAbility("a",8)
                plusAbility("f",10)
            }
            "ふつう" -> {
                plusAbility("c",1)
                plusAbility("p",1)
                plusAbility("s",3)
                plusAbility("a",5)
                plusAbility("f",5)
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
            }
        }

        when(a3_o){
            "最強" -> {
                plusSpecial("chance",0.15)
            }
            "なかなか" -> {
                plusSpecial("chance",0.8)
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
            "ボスキャラ" -> {
                plusAbility("c",1)
                plusAbility("p",8)
                plusAbility("s",1)
                plusAbility("a",10)
                plusAbility("f",2)
                plusSpecial("chance",0.05)
            }
            "お色気" -> {
                plusAbility("c",10)
                plusAbility("p",15)
                plusAbility("s",-5)
                plusAbility("a",-6)
                plusAbility("f",-8)
            }
            "大和撫子" -> {
                plusAbility("c",5)
                plusAbility("p",5)
                plusAbility("s",5)
                plusAbility("a",5)
                plusAbility("f",10)
            }
            "スポーツ万能" -> {
                plusAbility("p",7)
                plusAbility("s",15)
                plusAbility("a",12)
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
        }
    }

    fun plusSpecial(initial:String,point:Double){
        when(initial){
            "chance" -> chance += point
        }
    }




}