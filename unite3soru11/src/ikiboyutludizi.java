import java.util.Scanner;

public class ikiboyutludizi {

	//bir yordamın içerisinde 2 boyutlu temel float türünde bir dizi oluşturunuz.
	//Dizinin boyutları yordama gelen parametreler ile belirlenmelidir.Başka bir yordam da,bu dizi içerisindeki elemanları ekrana yazdırmalıdır.
	//Uygulama mainden sınanabilir olmalıdır.
	
	float yeniDizi[] [] ;
	
	 void ikiBoyutluDiziOlustur(int x,int y) {
		yeniDizi  = new float[x] [y];
		for(int i = 0 ; i<yeniDizi.length ; i++) {
			for(int j = 0 ; j < yeniDizi [i].length ; j++) {
				System.out.print("Dizinin["+i+"],["+j+"]. degerini giriniz :");
				Scanner sayiGir = new Scanner(System.in);
				float a = sayiGir.nextFloat();
				yeniDizi [i][j] = a;
				
				
			}
		}
	}
	 
	 void ekranaBas() {
		 
		 for (int i = 0 ;i<yeniDizi.length ; i++ ) {
			 for (int j= 0 ; j<yeniDizi[i].length ; j++) {
				 System.out.print(+yeniDizi[i][j]);
				 System.out.print("\t");
				 if(j == yeniDizi[i].length-1)
					 System.out.print("\n");
			 }
		 }
	 }
	 
	 
	
	public static void main(String[] args) {
		System.out.println("2 boyutlu dizi olusturacagım kac satir ka sutun olsun? (kaca kac?)"); 
		Scanner sayiGir = new Scanner(System.in);
		int a = sayiGir.nextInt();
		int b = sayiGir.nextInt();
		ikiboyutludizi ibd = new ikiboyutludizi();
		 ibd.ikiBoyutluDiziOlustur(a,b);
		 ibd.ekranaBas();
		 

		//System.out.println("asdfg");
	}

}
