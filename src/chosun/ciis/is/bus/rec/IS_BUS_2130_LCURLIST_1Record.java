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


public class IS_BUS_2130_LCURLIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String bo_cd;
	public String bo_nm;
	public String asnt_dstc_cd_nm;

	public IS_BUS_2130_LCURLIST_1Record(){}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setAsnt_dstc_cd_nm(String asnt_dstc_cd_nm){
		this.asnt_dstc_cd_nm = asnt_dstc_cd_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getAsnt_dstc_cd_nm(){
		return this.asnt_dstc_cd_nm;
	}
}

/* �ۼ��ð� : Thu Jun 21 15:20:31 KST 2012 */