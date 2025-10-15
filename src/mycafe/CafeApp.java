package mycafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CafeApp {

    public static void main(String[] args) {
    	
    	List<Cafe> cafeList = new ArrayList<>();
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	while (true) {
    		System.out.println("\n--- My Cafe メニュー ---");
    		System.out.println("1: 喫茶店を登録する");
            System.out.println("2: 登録済みの喫茶店を見る");
            System.out.println("9: アプリを終了する");
            System.out.print("操作を選んでください > ");
    		
            int choice = scanner.nextInt();
            
            if (choice == 1) {
//            	System.out.println("（喫茶店登録機能は未実装です）");
            	System.out.println("店名を入力してください > ");
            	String name = scanner.next();
            	
            	System.out.println("住所を入力してください > ");
            	String address = scanner.next();
            	
            	Cafe newCafe = new Cafe(name,address);
            	
            	cafeList.add(newCafe);
            	
            	System.out.println("「"+ newCafe.getName() + "」を登録しました。");
            } else if (choice == 2) {
//                System.out.println("（一覧表示機能は未実装です）");
                if (cafeList.isEmpty()) {
                	System.out.println("まだ喫茶店が登録されていません。");
                } else {
                	System.out.println("\n--- 登録済みの喫茶店一覧 ---");
                	
                	for (Cafe cafe : cafeList) {
                		System.out.println("店名: " + cafe.getName());
                        System.out.println("住所: " + cafe.getAddress());
                        System.out.println("評価: ★" + cafe.getRating()); 
                        System.out.println("--------------------");
                	}
                }
                
                
            } else if (choice == 9) {
                System.out.println("アプリを終了します。");
                break; 
            } else {
                System.out.println("無効な選択です。");
            }
            
    	}
    }
}
