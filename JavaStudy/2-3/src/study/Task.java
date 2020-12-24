package study;

// ① TaskクラスにCalculatorクラスを継承させなさい。
public class Task extends Calculator{
    /**
     * タスクの実行
     */
    public void doTask() {

        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
    	final int one = plus(10);
    	final int two = plus(10, 20);
    	final int three = plus(10, 20, 30);

    	System.out.println("plusメソッドの引数が一つの場合：" + one);
    	System.out.println("plusメソッドの引数が一つの場合：" + two);
    	System.out.println("plusメソッドの引数が一つの場合：" + three);


    }
}
