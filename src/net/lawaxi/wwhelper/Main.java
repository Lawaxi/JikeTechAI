package net.lawaxi.wwhelper;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("欢迎来到人工智能对话助手, 您的任何信息都会被一瞬处理并给出答复.\n");
        Scanner a1=new Scanner(System.in);
        while(true){
            String a2=a1.next();
            System.out.print(ret(a2)+"\n");
        }
    }

    public static final String[] a = {"不","是"}; //随机“草”“啊这”“差不多得了”
    public static final String[] b = {"好","对","呵","怎","呀","啦","拜拜","再见","还","也"}; //“草”
    public static final String[] c = {"没","嗯","吧","哈","对不起","谢谢","只","才","比较","喜欢","的","吗","啊",}; //“啊这”
    public static final String[] d = {"哦","噢","什么","哪","还是","真","？","?","可以","无"}; //“差不多得了”
    public static final String[] res = {"草","啊这","差不多得了"};
    public static final Random r = new Random();

    public static final String ret(String in){
        if(has(in,d))
            return res[2];
        if(has(in,b))
            return res[0];
        if(has(in,c))
            return res[1];
        if(has(in,a))
            return RAD();
        return res[1];
    }

    public static final boolean has(String in, String[] res){
        for(String r : res)
        {
            if(in.contains(r))
                return true;
        }
        return false;
    }

    public static final String RAD(){
        return res[r.nextInt(3)];
    }
}
