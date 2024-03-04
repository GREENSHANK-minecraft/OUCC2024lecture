import java.util.ArrayList;

import static section1.Section1_0.comment_0;
import static section1.Section1_0.name_0;
import static section1.Section1_1.comment_1;
import static section1.Section1_1.name_1;
import static section1.Section1_2.comment_2;
import static section1.Section1_2.name_2;
import static section1.Section1_3.comment_3;
import static section1.Section1_3.name_3;

public class Section1_main {
    public static void main(String[] args){

        ArrayList<String> list_section1_name = new ArrayList<>();//名前の配列
        //配列に名前を追加
        list_section1_name.add(name_0);
        list_section1_name.add(name_1);
        list_section1_name.add(name_2);
        list_section1_name.add(name_3);

        ArrayList<String> list_section1_comment = new ArrayList<>();//コメントの配列
        //配列にコメントを追加
        list_section1_comment.add(comment_0);
        list_section1_comment.add(comment_1);
        list_section1_comment.add(comment_2);
        list_section1_comment.add(comment_3);
        //仕切りを表示
        System.out.println("========================================");
        //名前、コメントを順番に表示
        for (int i = 0; i < Main.attendees_number + 1 ; i++ ) {
            if ( i == 0 ){
                System.out.println("担当者:" + list_section1_name.get(i));
                System.out.println(list_section1_comment.get(i));
                //仕切りを表示
                System.out.print("========================================");
                new java.util.Scanner(System.in).nextLine();
            }else{
                System.out.println(i + "番:" + list_section1_name.get(i));
                System.out.println(list_section1_comment.get(i));
                //仕切りを表示
                System.out.print("========================================");
                new java.util.Scanner(System.in).nextLine();
            }
        }
        //出席人数の表示
        System.out.println("以上" + Main.attendees_number + "名が受講しています");
    }
}
