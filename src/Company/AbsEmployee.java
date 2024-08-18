package Company;

/**
 * 抽象社員クラス
 * @author xxx
 */
     public abstract class AbsEmployee {
	 

	/******** フィールド ******************************************/
	/**
	 * 社員番号
	 */
     private int id;
	
	/**
	 * 名前
	 */
	private String name;

	/**
	 * 部署名
	 */
	private String section;

	/******** コンストラクタ **************************************/
	/**
	 * コンストラクタ（フィールド初期化）
	 * @param id フィールド id への設定値
	 * @param name フィールド name への設定値
	 * @param section フィールド section への設定値
	 */
	public AbsEmployee(int id,String name,String section) {
		this.id =id;
		this.name =name;
		this.section =section;
	}
	
	/******** メソッド ********************************************/
	/*--------------------抽象メソッド--------------------*/
	public abstract void displayInfo();
	
	/*--------------------通常メソッド--------------------*/
	/**
	 * 情報表示（ID および 名前の表示）
	 */
        public void displayBasic() {
    	
    	System.out.println("ＩＤ：" + id);
		System.out.println("名前：" + name);
		System.out.println("部署：" + section);
    	
    	
    }
	
	
	
}
