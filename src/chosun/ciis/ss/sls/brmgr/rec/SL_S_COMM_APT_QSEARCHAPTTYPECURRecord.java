/***************************************************************************************************
 * ���ϸ�   : SP_SL_S_COMM_APT_QSEARCH.java
 * ���     : �����濵-����������-����Ʈ���� �ٷΰ���
 * �ۼ����� : 2006/06/21
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  SP_SL_S_COMM_APT_QSEARCH
**/

public class SL_S_COMM_APT_QSEARCHAPTTYPECURRecord extends java.lang.Object implements java.io.Serializable{

	public String arow;
	public String col;
	public String totalrowcol;

	public SL_S_COMM_APT_QSEARCHAPTTYPECURRecord(){}

	public void setArow(String arow){
		this.arow = arow;
	}

	public void setCol(String col){
		this.col = col;
	}

	public void setTotalrowcol(String totalrowcol){
		this.totalrowcol = totalrowcol;
	}

	public String getArow(){
		return this.arow;
	}

	public String getCol(){
		return this.col;
	}

	public String getTotalrowcol(){
		return this.totalrowcol;
	}
}

/* �ۼ��ð� : Thu Jun 22 11:08:44 KST 2006 */