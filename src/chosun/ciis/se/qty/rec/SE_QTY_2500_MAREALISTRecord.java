/***************************************************************************************************
* ���ϸ� : SE_QTY_2500_MAREALISTRecord.java
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


public class SE_QTY_2500_MAREALISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_cd;
	public String area_nm;

	public SE_QTY_2500_MAREALISTRecord(){}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}
}

/* �ۼ��ð� : Fri Mar 06 10:36:50 KST 2009 */