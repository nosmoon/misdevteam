/***************************************************************************************************
* ���ϸ� : SL_L_DTLSADDRCURCOMMLISTRecord.java
* ��� :  �ش������Ǿ���Ʈ �ּ��ڵ忡 ���� �� ����Ʈ ����_����Ͽ�
* �ۼ����� : 2017-01-13
* �ۼ��� : �� �� ��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 *
 */

public class SL_L_DTLSADDRCURCOMMLISTRecord extends java.lang.Object implements
		java.io.Serializable {

	public String dongno;
	public int florcnt;
	public int flor_houscnt;
	public int hoscnt;
	public int pyong;
	public String stairyn;
	public String under_exne;

	public SL_L_DTLSADDRCURCOMMLISTRecord() {
	}

	public void setDongno(String dongno) {
		this.dongno = dongno;
	}

	public void setFlorcnt(int florcnt) {
		this.florcnt = florcnt;
	}

	public void setFlor_houscnt(int flor_houscnt) {
		this.flor_houscnt = flor_houscnt;
	}

	public void setHoscnt(int hoscnt) {
		this.hoscnt = hoscnt;
	}

	public void setPyong(int pyong) {
		this.pyong = pyong;
	}

	public void setStairyn(String stairyn) {
		this.stairyn = stairyn;
	}

	public void setUnder_exne(String under_exne) {
		this.under_exne = under_exne;
	}

	public String getDongno() {
		return this.dongno;
	}

	public int getFlorcnt() {
		return this.florcnt;
	}

	public int getFlor_houscnt() {
		return this.flor_houscnt;
	}

	public int getHoscnt() {
		return this.hoscnt;
	}

	public int getPyong() {
		return this.pyong;
	}

	public String getStairyn() {
		return this.stairyn;
	}

	public String getUnder_exne() {
		return this.under_exne;
	}
}

/* �ۼ��ð� : Mon May 15 10:55:42 KST 2006 */