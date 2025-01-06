package codewars8kyu

/*

Total amount of points

Our football team has finished the championship.
私たちのサッカーチームは、選手権を終えました。

Our team's match results are recorded in a collection of strings. Each match is represented by a string in the format "x:y", where x is our team's score and y is our opponents score.
私たちのチームの試合結果は、文字列のコレクションに記録されています。各試合は「x:y」という形式の文字列で表され、xは私たちのチームの得点、yは相手の得点です。

For example: ["3:1", "2:2", "0:1", ...]

Points are awarded for each match as follows:
試合ごとに与えられるポイントは次の通りです：

if x > y: 3 points (win)
if x < y: 0 points (loss)
if x = y: 1 point (tie)

We need to write a function that takes this collection and returns the number of points our team (x) got in the championship by the rules given above.
このコレクションを受け取り、上記のルールに従って私たちのチーム（x）が選手権で獲得したポイント数を返す関数を作成する必要があります。

Notes:

- our team always plays 10 matches in the championship
  私たちのチームは選手権で常に10試合を行います。
- 0 <= x <= 4
- 0 <= y <= 4

*/

fun points(games: List<String>): Int {
    return games.map { game ->

        // game を ":" で分割して、得点 X と Y を取り出す
        // 取り出した X と Y を整数（Int）型に変換
        // 分割結果はタプル (scoreX, scoreY) に代入
        val (scoreX, scoreY) = game.split(":").map { it.toInt() }

        // 各試合の結果に応じた得点がリストに格納される
        when {
            scoreX > scoreY -> 3
            scoreX == scoreY -> 1
            else -> 0
        }
    }.sum()   // map の結果（各試合の得点が格納されたリスト）を合計
}