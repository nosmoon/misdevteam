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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_1110_SCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String dept_nm;
	public String chrg_pers_nm;
	public String cntc_plac;

	public AD_BAS_1110_SCURLIST2Record(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setCntc_plac(String cntc_plac){
		this.cntc_plac = cntc_plac;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getCntc_plac(){
		return this.cntc_plac;
	}
}

/* �ۼ��ð� : Wed Jun 05 18:01:23 KST 2013 */