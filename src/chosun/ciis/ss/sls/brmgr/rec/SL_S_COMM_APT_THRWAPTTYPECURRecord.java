/***************************************************************************************************
 * ���ϸ�   : SP_SL_S_COMM_APT_THRW.java
 * ���     : ����������
 * �ۼ����� : 2006/03/08
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  ����������-��Ȳ���
**/

public class SL_S_COMM_APT_THRWAPTTYPECURRecord extends java.lang.Object implements java.io.Serializable{

	public String arow;
	public String col;
	public String totalrowcol;

	public SL_S_COMM_APT_THRWAPTTYPECURRecord(){}

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

/* �ۼ��ð� : Mon Mar 13 16:22:03 KST 2006 */