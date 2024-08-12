package Company;

/**
 * 経理部員クラス
 * @author bbb
 */
public class AccountingEmployee extends AbsEmployee {

	/******** フィールド ******************************************/
	/**
	 * 担当業務
	 */
	private String workInchange;

	/******** コンストラクタ **************************************/
	/**
	 * コンストラクタ（フィールド初期化）
	 * @param id フィールド id への設定値
	 * @param name フィールド name への設定値
	 * @param workInCharge フィールド workInCharge への設定値
	 */
	public AccountingEmployee(int id, String name, String workInchange) {
		super(id, name, "経理部");
		this.workInchange = workInchange;
	}

	/******** メソッド ********************************************/
	/**
	 * 情報表示
	 */
	public void displayInfo() {
		super.displayBasic();
		System.out.println("担当：" + workInchange);

	}

}
