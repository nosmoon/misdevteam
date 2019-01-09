/***************************************************************************************************
* 파일명 : AttachFileVO.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.common.wb;

/**
 * 
 */

public class AttachFileVO {

	private String attcFilNm;
	private int    attcFilCpc;
	private String attcFilTypeNm;
	private String attcFilPathAdr;
	private String filepath;
	private byte[] attcFilCont;
	public byte[] getAttcFilCont() {
		return attcFilCont;
	}
	public void setAttcFilCont(byte[] attcFilCont) {
		this.attcFilCont = attcFilCont;
	}
	public int getAttcFilCpc() {
		return attcFilCpc;
	}
	public void setAttcFilCpc(int attcFilCpc) {
		this.attcFilCpc = attcFilCpc;
	}
	public String getAttcFilNm() {
		return attcFilNm;
	}
	public void setAttcFilNm(String attcFilNm) {
		this.attcFilNm = attcFilNm;
	}
	public String getAttcFilPathAdr() {
		return attcFilPathAdr;
	}
	public void setAttcFilPathAdr(String attcFilPathAdr) {
		this.attcFilPathAdr = attcFilPathAdr;
	}
	public String getAttcFilTypeNm() {
		return attcFilTypeNm;
	}
	public void setAttcFilTypeNm(String attcFilTypeNm) {
		this.attcFilTypeNm = attcFilTypeNm;
	} 
	
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}	
}
