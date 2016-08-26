package com.hzit.day1;

/**
 * Created by Administrator on 2016/8/5.
 */
import java.util.Random;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        //玩家选牌
        Scanner input=new Scanner(System.in);
        Random r=new Random();
        PuKe [] p=new PuKe[4];

        for (int i = 0; i < 4; i++) {
            int h=r.nextInt(4);
            int n=r.nextInt(13);
            p[i]=new PuKe();
            p[i].setHuaSe(HuaSe.values()[h]);
            p[i].setNeiRong(NeiRong.values()[n]);
            System.out.print(p[i]+"\t");
        }
        PuKe [ ] pk=new PuKe[2];
        int j;
        for( j=0;j<2;j++){
            pk[j]=new PuKe();
            System.out.println("\n请选择一张扑克牌：（1,2,3,4）");
            int choose=input.nextInt();
            pk[j]=p[choose-1];
            System.out.println("你选择的扑克牌是："+p[choose-1]);
        }
        input.close();

        //电脑出牌

        PuKe [] diannao=new PuKe[2];
        int k;
        for ( k = 0; k< 2; k++) {
            int h=r.nextInt(4);
            int n=r.nextInt(13);
            diannao[k]=new PuKe();
            diannao[k].setHuaSe(HuaSe.values()[h]);
            diannao[k].setNeiRong(NeiRong.values()[n]);
            System.out.println("电脑选择的扑克牌是："+diannao[k]);
        }
        
        //比较电脑跟玩家的点数
		/*int player=pk[j].getNeiRong().ordinal()+pk[j].getNeiRong().ordinal();
		int computer=diannao[k].getNeiRong().ordinal()+diannao[k].getNeiRong().ordinal();
		if(computer>player){
			System.out.println("Default");
		}else if(computer<player){
			System.out.println("Victory");
		}else{
			System.out.println("平局");
		}*/
    }
}
