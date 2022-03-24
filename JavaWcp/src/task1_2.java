
public class task1_2 {
	public static void main(String[] args) {
		// 変数sumの宣言と初期化
		int sum = 0;

		// 変数iの宣言と初期化
		// 100以下まで1ずつ処理を繰り返し
		for (int i = 0; i <= 100; i++) {
			// 偶数のみ処理する条件設定
			if (i % 2 == 0) {
				// 1ずつ数値を足していく
				sum += i;
			}
		}

		// 処理結果の数値を表示
		System.out.println(sum);
	}
}
