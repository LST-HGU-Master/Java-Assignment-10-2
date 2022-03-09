# 課題 10-2: 多態性

### 課題の説明
課題10-1で使用したスライムクラスは、勇者にしか攻撃できない。
Slimeクラスのattackメソッドを変更し、勇者と聖職者に攻撃をするプログラムを作成しなさい。

### ProgA2.java (提出不要)
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
敵に５ポイントのダメージをあたえた！
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