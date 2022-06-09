# 課題 10-2: 多態性

### 課題の説明
課題10-1で使用したスライムクラスは、勇者にしか攻撃できない。
そこでHeroクラスとClericクラスが共にCharacterクラスを継承していることを利用してSlimeクラスのattackメソッドに変更を加えて、勇者と聖職者に攻撃をするプログラムProgA2.main()が動作するようにしなさい。

### ProgA2.java (提出不要。このコードはSlim.attack()を正しく変更するまでは文法エラーとなる)
```java
public class ProgA2 {

    public static void main(String arg[])
    {
        Hero hr = new Hero("工太", 100);
        Cleric clr = new Cleric("ホーリー",15, 15);
        Slime slm = new Slime('A');
        hr.attack(slm);
        clr.attack(slm);
        slm.attack(hr);
        slm.attack(clr);
        slm.run();
        clr.run();
    }
}
```

### 実行例
```
勇者工太は攻撃した！
敵に5ポイントのダメージをあたえた！
聖職者ホーリーは攻撃した！
敵に1ポイントのダメージをあたえた！
スライムAの攻撃！
5のダメージでHPが95になった
スライムAの攻撃！
5のダメージでHPが10になった
スライムAは逃げ出した！(HP:12)
ホーリーは逃げ出した。
最終HPは10でした。
```