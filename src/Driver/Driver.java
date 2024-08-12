package Driver;

import Company.Company;

//実行クラス

public class Driver {
	public static void main(String[] args) {

		//インスタンス化·情報表示
		Company kawai = new Company("河合綾香");

		System.out.println("インスタンス");

		//		System.out.println("salesAmt参照の結果：" + kawai.salesAmt);
		System.out.println("getSalesAmt()の結果：" + kawai.getSalesAmt());

		kawai.setSalesAmt(500000);
		//		kawai.setSalesAmt(-100000);

		// 情報表示
		System.out.println();
		kawai.displayInfo();
	}

}
