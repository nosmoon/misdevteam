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


package chosun.ciis.is.bus.rec;

import java.sql.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;

/**
 * 
 */


public class IS_BUS_1610_SCURLIST_6Record extends java.lang.Object implements java.io.Serializable{

	public String sale_clsf_nm;
	public String dm_amt_1;

	public IS_BUS_1610_SCURLIST_6Record(){}

	public void setSale_clsf_nm(String sale_clsf_nm){
		this.sale_clsf_nm = sale_clsf_nm;
	}

	public void setDm_amt_1(String dm_amt_1){
		this.dm_amt_1 = dm_amt_1;
	}

	public String getSale_clsf_nm(){
		return this.sale_clsf_nm;
	}

	public String getDm_amt_1(){
		return this.dm_amt_1;
	}
}

/* �ۼ��ð� : Tue Jun 19 18:11:56 KST 2012 */