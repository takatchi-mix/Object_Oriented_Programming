package Company;

/**
 * 社員クラス
 * @author aaa
 */
public class Employee {
	/******** フィールド ******************************************/
	/**
	 * 社員番号
	 */
	private int id;
	
	/**
	 * 名前
	 */
	private String name;
	
	
	/******** コンストラクタ **************************************/
	/**
	 * コンストラクタ（フィールド初期化）
	 * @param id フィールド id への設定値
	 * @param name フィールド name への設定値
	 */
	public Employee(int id,String name) {
		this.id =id;
		this.name =name;
	}
	
	/******** メソッド ********************************************/
	/*--------------------getter/setter--------------------*/
	/**
	 * フィールド id を取得する
	 * @return 取得した id
	 */
	public int getId() {
		return id;
	}

	/**
	 * フィールド id を設定する
	 * @param id 設定する id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * フィールド name を取得する
	 * @return 取得した name
	 */
	public String getName() {
		return name;
	}
	/**
	 * フィールド name を設定する
	 * @param name 設定する name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/*--------------------通常メソッド--------------------*/
	/**
	 * 情報の表示
	 */
	public void DisplayInfo() {
		System.out.println("社員番号は"+id);
		System.out.println("名前は"+name);
	}
}
