package mycafe;

import java.time.LocalDate;
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
            System.out.println("3: 訪問を記録する");
            System.out.println("9: アプリを終了する");
            System.out.print("操作を選んでください > ");
    		
            int choice = scanner.nextInt();
            
            if (choice == 1) {
//            	System.out.println("（喫茶店登録機能は未実装です）");
            	System.out.println("店名を入力してください > ");
            	String name = scanner.next();
            	
            	System.out.println("住所を入力してください > ");
            	String address = scanner.next();
            	
            	System.out.println("評価を入力してください > ");
            	int rating = scanner.nextInt();
            	
            	Cafe newCafe = new Cafe(name,address,rating);
            	
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
            } else if (choice == 3) {
            	System.out.println("訪問を記録する喫茶店を選んでください。");
            	
            	for (int i = 0; i < cafeList.size(); i++) {
            		System.out.println((i + 1) + ": " + cafeList.get(i).getName());
            	}
            	
            	System.out.println("番号を入力 > ");
            	int cafeNum = scanner.nextInt();
            	scanner.nextLine();
            	Cafe selectedCafe = cafeList.get(cafeNum - 1);
            	
            	System.out.println("コメントを入力してください。");
            	String comment = scanner.nextLine();
            	
            	VisitRecord newRecord = new VisitRecord(LocalDate.now());
            	newRecord.setComment(comment);
            	
            	selectedCafe.addVisitRecord(newRecord);
            	
            	System.out.println(selectedCafe.getName() + "に訪問記録を追加しました。");
                
            } else if (choice == 9) {
                System.out.println("アプリを終了します。");
                break; 
            } else {
                System.out.println("無効な選択です。");
            }
            
    	}
    }
}
