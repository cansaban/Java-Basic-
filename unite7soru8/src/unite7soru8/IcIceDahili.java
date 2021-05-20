package unite7soru8;

public class IcIceDahili {

	public IcIceDahili() {
		System.out.println("IcIceDahili cevreleyici sinifinin yapılandırıcısı - IcIceDahili nesnesi olusturuluyor");
	}
	
	public class IcIceDahili1 {
		public IcIceDahili1() {
			System.out.println("IcIceDahili1 sinifinin yapılandırıcısı - IcIceDahili1 nesnesi olusturuluyor");
		}
		
		public class IciceDahili2 {
			public IciceDahili2() {
				System.out.println("IcIceDahili2 sinifinin yapılandırıcısı - IcIceDahili2 nesnesi olusturuluyor");
			}
			
			public class IcIceDahili3 {
				public IcIceDahili3() {
					System.out.println("IcIceDahili3 sinifinin yapılandırıcısı - IcIceDahili3 nesnesi olusturuluyor");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		new IcIceDahili();
		System.out.println("- - - - - - - - - - - - - - - - - - -");
		new IcIceDahili().new IcIceDahili1();
		System.out.println("- - - - - - - - - - - - - - - - - - -");
		new IcIceDahili().new IcIceDahili1().new IciceDahili2();
		System.out.println("- - - - - - - - - - - - - - - - - - -");
		new IcIceDahili().new IcIceDahili1().new IciceDahili2().new IcIceDahili3();
		System.out.println("- - - - - - - - - - - - - - - - - - -");
		
	}

}
