/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_1000_500_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String gag2;
	public String gag1;
	public String rowcnt;

	public MT_ETCCAR_1000_500_LCURLIST3Record(){}

	public void setGag2(String gag2){
		this.gag2 = gag2;
	}

	public void setGag1(String gag1){
		this.gag1 = gag1;
	}

	public void setRowcnt(String rowcnt){
		this.rowcnt = rowcnt;
	}

	public String getGag2(){
		return this.gag2;
	}

	public String getGag1(){
		return this.gag1;
	}

	public String getRowcnt(){
		return this.rowcnt;
	}
}

/* �ۼ��ð� : Tue Sep 18 14:37:10 KST 2012 */