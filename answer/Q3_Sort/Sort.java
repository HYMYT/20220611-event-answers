import java.util.Arrays;
import java.util.stream.IntStream;

class Main {

  public static void main(String[] args) {
    // ランダムに並べられた重複のない整数の配列
    var array = new int[] { 5, 4, 6, 2, 1, 9, 8, 3, 7, 10 };
    // ソート実行
    var sortedArray = new Main().sort(array);
    // 結果出力
    Arrays.stream(sortedArray).forEach(System.out::println);
  }

  private int[] sort(int[] array) {
    // 要素が一つの場合はソートの必要がないので、そのまま返却
    if (array.length == 1) {
      return array;
    }

    // 配列の先頭を基準値とする
    var pivot = array[0];

    // ここから記述
    int head = 0;
    int tail = array.length-1;
    int temp = 0;

    while(true){
      while(array[head]<pivot){head++;}

      while(array[tail]>=pivot){
        tail--;
        if(tail == -1){break;}
      }
      
      if(head >= tail){break;}
      
      temp = array[head];
      array[head] = array[tail];
      array[tail] = temp;

      head++; tail--;
    }
    if(tail==-1){
      head++;
      tail = array.length-1;
    }

    int[] a = IntStream.range(0, head).map(i -> array[i]).toArray();
    int[] b = IntStream.range(head, array.length).map(i -> array[i]).toArray();
    
    return IntStream.concat(IntStream.of(sort(a)), IntStream.of(sort(b))).toArray();
    
    // ここまで記述
  }
}
