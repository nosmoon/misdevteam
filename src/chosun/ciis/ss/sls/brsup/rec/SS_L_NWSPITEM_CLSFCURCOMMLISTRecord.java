/***************************************************************************************************
* ���ϸ� : SS_L_NWSPITEM_CLSFCURCOMMLISTRecord.java
* ��� : ��������-�Ź�������ǰ-��ǰ����� ���� Record
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * ��������-�Ź�������ǰ-���-��ǰ����� ���� Record
 */

public class SS_L_NWSPITEM_CLSFCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String itemcd;
	public String itemnm;

	public SS_L_NWSPITEM_CLSFCURCOMMLISTRecord(){}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public void setItemnm(String itemnm){
		this.itemnm = itemnm;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public String getItemnm(){
		return this.itemnm;
	}
}

/* �ۼ��ð� : Wed Jan 28 20:45:07 KST 2004 */