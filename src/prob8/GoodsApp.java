package prob8;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) { 
 		Scanner scanner = new Scanner(System.in); 
 		Goods[] goods = new Goods[3];	// 객체 배열 생성 
 		 
 		for( int i = 0; i < 3 ; i++){ 
 			goods[i] = new Goods(); 
 			String line = scanner.nextLine(); 
 			String[] infos = line.split( " " ); 
 			 
 			goods[i].setName(infos[0]); 
 			goods[i].setPrice(Integer.parseInt(infos[1])); 
 			goods[i].setCountStock(Integer.parseInt(infos[2])); 
 		} 
 		 
 		System.out.println("========="); 
 		 
 		scanner.close(); 
 	} 		 
 } 
