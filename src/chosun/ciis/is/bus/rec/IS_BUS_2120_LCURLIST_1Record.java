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


public class IS_BUS_2120_LCURLIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String advcs_nm;
	public String std;
	public String c_is;
	public String c_ad;
	public String bo_nm;

	public IS_BUS_2120_LCURLIST_1Record(){}

	public void setAdvcs_nm(String advcs_nm){
		this.advcs_nm = advcs_nm;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setC_is(String c_is){
		this.c_is = c_is;
	}

	public void setC_ad(String c_ad){
		this.c_ad = c_ad;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public String getAdvcs_nm(){
		return this.advcs_nm;
	}

	public String getStd(){
		return this.std;
	}

	public String getC_is(){
		return this.c_is;
	}

	public String getC_ad(){
		return this.c_ad;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}
}

/* �ۼ��ð� : Thu Jun 21 14:17:22 KST 2012 */