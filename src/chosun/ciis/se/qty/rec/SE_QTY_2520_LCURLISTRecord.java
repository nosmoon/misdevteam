/***************************************************************************************************
* ���ϸ� : SE_QTY_2520_LCURLISTRecord.java
* ��� : �μ����� - �߼ۺμ� - �뼱���߼ۺμ���Ȳ
* �ۼ����� : 2009-03-06
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.qty.rec;

import java.sql.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */


public class SE_QTY_2520_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_nm		;
	public String send_plac_nm	;
	public String qty			;

	public SE_QTY_2520_LCURLISTRecord(){}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getQty(){
		return this.qty;
	}
}

/* �ۼ��ð� : Fri Mar 06 16:23:27 KST 2009 */