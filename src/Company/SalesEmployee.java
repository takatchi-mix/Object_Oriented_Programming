package Company;

/**
 * 営業部員クラス
 * @author aaa
 */
    public class SalesEmployee extends Employee {
    	
  
   
	/******** フィールド ******************************************/
	/**
	 * 売上合計金額
	 */
	private int SalesAmt;
	
	
	
	/******** コンストラクタ **************************************/
	/**
	 * コンストラクタ（フィールド初期化）
	 * @param id フィールド id への設定値
	 * @param name フィールド name への設定値
	 * @param salesAmt フィールド salesAmt への設定値
	 */
	public SalesEmployee(int id,String name,int SalesAmt) {
		super(id, name);
		this.SalesAmt = SalesAmt;
	}

	/**
	 * コンストラクタ（フィールド初期化）
	 * @param id フィールド id への設定値
	 * @param name フィールド name への設定値
	 */
	public SalesEmployee(int id, String name) {
		this(id, name, 0);
	}


	/******** メソッド ********************************************/
	/*--------------------getter/setter--------------------*/
	/**
	 * フィールド salesAmt の値をゲットする
	 * @return salesAmt
	 */
	 public int getSalesAmt() {
		return SalesAmt; 
	 }
	/**
	 * フィールド salesAmt の値をセットする
	 * @param salesAmt セットする salesAmt
	 */
	 public void setSalesAmt(int SalesAmt) {
		if(0<=SalesAmt) {
		 this.SalesAmt=SalesAmt;	
		}else {
		System.out.println("0は設定できません");
		this.SalesAmt =0;
		}

		 }

	/*--------------------通常メソッド--------------------*/
	/**
	 * 売上げる
	 * @param amt	売上金額
	 * @return		処理後の売上合計金額
	 */
	 public int sell(int amt) {
		return SalesAmt += amt; 
	 }
	 
	/**
	 * 返品を受け付ける
	 * @param amt	返品金額（売上マイナス）
	 * @return		処理後の売上合計金額
	 */
	 public int refund(int amt) {
			return SalesAmt += amt; 
		 }
	/**
	 * 売上金額表示
	 */
	 public void displaySalesAmt() {
	 System.out.println("売上：" + SalesAmt + "円");
	 }
	 
	@Override
	public void DisplayInfo() {
		super.DisplayInfo();
		displaySalesAmt();
	}
	 
	 
	 
	 
	 
	
 }