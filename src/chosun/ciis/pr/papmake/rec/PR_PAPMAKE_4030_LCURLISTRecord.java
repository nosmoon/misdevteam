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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_4030_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String base_servcost;
	public String basi_excs_servcost1;
	public String basi_sep_prtn_servcost1;
	public String total;

	public PR_PAPMAKE_4030_LCURLISTRecord(){}

	public void setBase_servcost(String base_servcost){
		this.base_servcost = base_servcost;
	}

	public void setBasi_excs_servcost1(String basi_excs_servcost1){
		this.basi_excs_servcost1 = basi_excs_servcost1;
	}

	public void setBasi_sep_prtn_servcost1(String basi_sep_prtn_servcost1){
		this.basi_sep_prtn_servcost1 = basi_sep_prtn_servcost1;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public String getBase_servcost(){
		return this.base_servcost;
	}

	public String getBasi_excs_servcost1(){
		return this.basi_excs_servcost1;
	}

	public String getBasi_sep_prtn_servcost1(){
		return this.basi_sep_prtn_servcost1;
	}

	public String getTotal(){
		return this.total;
	}
}

/* �ۼ��ð� : Mon Apr 20 18:46:10 KST 2009 */