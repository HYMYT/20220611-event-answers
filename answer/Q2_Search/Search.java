class Main {

  public static void main(String args[]) {
    // 昇順にソートされた配列
    int[] sortedArray = { 1, 2, 3, 5, 12, 7890, 12345 };
    // 探索対象の番号
    int targetNumber = 1;
    // 探索実行
    int targetIndex = new Main().serchIndex(sortedArray, targetNumber);
    // 結果出力
    System.out.println(targetIndex);
  }

  private int serchIndex(int[] sortedArray, int targetNumber) {

    // ここから記述
    int min = 0;
    int max = sortedArray.length - 1;
    int targetIndex = 0;
    while((max - min) + 1 > 1){
      targetIndex = min + (max - min)/2;
      if(targetNumber > sortedArray[targetIndex]){
        min = targetIndex;
      }else if(targetNumber < sortedArray[targetIndex]){
        max = targetIndex;
      }else {
        return targetIndex;
      }
    }
    // ここまで記述

    // 探索対象が存在しない場合、-1を返却
    return -1;
  }
}
