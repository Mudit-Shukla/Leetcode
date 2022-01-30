/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 30-01-2022
 *   Time: 12:15
 *   File: FractionalKnapsack.java
 */

package problemset;

public class FractionalKnapsack {

//    double fractionalKnapsack(int W, Item arr[], int n)
//    {
//        // Your code here
//        NewItem[] items = new NewItem[n];
//        for(int i = 0; i< n; i++){
//            items[i] = new NewItem(arr[i].value, arr[i].weight);
//        }
//        Arrays.sort(items, new Comparator<NewItem>() {
//            @Override
//            public int compare(NewItem item1, NewItem item2) {
//                return item2.ratio.compareTo(item1.ratio);
//            }
//        });
//        double profit = 0.0;
//        for(int i = 0; i< n; i++){
//            if(items[i].weight <= W){
//                W = W - items[i].weight;
//                profit = profit + items[i].value;
//            }else if(items[i].weight > W && W > 0){
//                double fraction = (double) (W/items[i].weight);
//                profit = profit + W * items[i].ratio;
//                break;
//            }
//        }
//
//        return profit;
//    }
}

class NewItem{
    Integer value;
    Integer weight;
    Double ratio;

    NewItem(int value, int weight){
        this.weight = weight;
        this.value = value;
        this.ratio = (double) this.value/this.weight;
    }
}