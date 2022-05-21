package instance;

import java.util.Objects;

public class Instance0fSato {
	private String firstName;
	
	public Instance0fSato(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Instance0fSato)) {
			return false;
		}
		Instance0fSato other = (Instance0fSato) obj;
		return Objects.equals(firstName, other.firstName);
	}
	 /** 変数（フィールド変数） */
    private int id = 0;
    /** static 変数（クラス変数） */
    private static int staticVarId = 0;
    
    /**
     * IDをインクリメント
     */
    public void incrementId() {
        this.id++;
        System.out.println("id: var          = " + this.id);
        Instance0fSato.staticVarId++;
        System.out.println("id: static var   = " + Instance0fSato.staticVarId);
    }

}
