/***************************************************************************************************
* ���ϸ� : SL_S_INFOEXGPREV_DTLRecord.java_����Ͽ� / agency/commun_111120 ����
* ��� : �������� �󼼸� ���� DM
* �ۼ����� : 2017-01-24
* �ۼ��� : �弱��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * ��Ž�-�������� ��
 *
 */

public class SL_S_INFOEXGPREV_DTLRecord extends java.lang.Object implements
		java.io.Serializable {

	public int seq;
	public String titl;
	public int brwscnt;

	public SL_S_INFOEXGPREV_DTLRecord() {
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public void setTitl(String titl) {
		this.titl = titl;
	}

	public void setBrwscnt(int brwscnt) {
		this.brwscnt = brwscnt;
	}

	public int getSeq() {
		return this.seq;
	}

	public String getTitl() {
		return this.titl;
	}

	public int getBrwscnt() {
		return this.brwscnt;
	}
}

/* �ۼ��ð� : Thu Feb 19 15:59:09 KST 2004 */