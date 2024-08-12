package Company;

/**
 * 人事部員クラス
 * @author fff
 */
public class HrEmployee extends AbsEmployee implements ExtPrintable {
	


	/******** フィールド ******************************************/
	/**
	 * 担当業務
	 */
	 private String workInChange;

	/******** コンストラクタ **************************************/
	/**
	 * コンストラクタ（フィールド初期化）
	 * @param id フィールド id への設定値
	 * @param name フィールド name への設定値
	 * @param workInCharge フィールド workInCharge への設定値
	 */
	public HrEmployee(int id,String name,String workInChange) {
		super(id, name, "人事部");
		this.workInChange =workInChange;
		
	}

	/******** メソッド ********************************************/
	/**
	 * 情報表示
	 */
	@Override
	public void displayInfo() {
		super.displayBasic();
		System.out.println("担当：" +workInChange);
	}

	/**
	 * 印刷処理（ExtPrintable インタフェースのメソッドをオーバーライド）
	 */
	@Override
	public void print() {
	  super.displayBasic();
	  System.out.println("--> 外部連絡書類を印刷しました。");
	}
	
	
	
	
}
