package Company;

/**
 * 企画部員クラス
 * @author ppp
 */

public class PlanningEmployee extends AbsEmployee implements Shippable {
	/******** フィールド ******************************************/
	/**
	 * 企画数
	 */
	private int planningCnt;

	/**
	 * 採用数
	 */
	private int okCnt;

	/******** コンストラクタ **************************************/
	/**
	 * コンストラクタ（フィールド初期化）
	 * @param id フィールド id への設定値
	 * @param name フィールド name への設定値
	 * @param planningCnt フィールド planningCnt への設定値
	 * @param okCnt フィールド okCnt への設定値
	 */
	public PlanningEmployee(int id, String name, 
							int planningCnt, int okCnt) {
		super(id, name, "企画部");
		this.planningCnt = planningCnt;
		this.okCnt = okCnt;
	}

	/******** メソッド ********************************************/
	/**
	 * 情報表示
	 */
	@Override
	public void displayInfo() {
		super.displayBasic();
		System.out.println("企画数：" + planningCnt);
		System.out.println("採用数：" + okCnt);
	}
	
	/**
	 * 出荷処理（Shippable インタフェースのメソッドをオーバーライド）
	 */
	@Override
	public void ship() {
		super.displayBasic();
		System.out.println("--> 試供品を出荷しました。");
	}
	
}

