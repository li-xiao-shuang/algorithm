/*
 * Copyright 2021 Gypsophila open source organization.
 *
 * Licensed under the Apache License,Version2.0(the"License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sort;

/**
 * 插入排序
 *
 * @author lixiaoshuang
 */
public class InsertSort {
    
    
    public static void main(String[] args) {
        int[] data = {20, 40, 30, 10, 60, 50};
        
        System.out.println("排序前：");
        for (int datum : data) {
            System.out.println(datum);
        }
        
        int[] sort = sort(data);
        
        System.out.println("排序后：");
        for (int s : sort) {
            System.out.println(s);
        }
    }
    
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int tmp = data[i];
            
            int j = i;
            while (j > 0 && tmp < data[j - 1]) {
                data[j] = data[j - 1];
                j--;
            }
            
            if (j != i) {
                data[j] = tmp;
            }
        }
        return data;
    }
}
