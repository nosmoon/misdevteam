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


package chosun.ciis.sp.sup.rec;

import java.sql.*;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.ds.*;

/**
 * 
 */


public class SP_SUP_1220_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String stafclsfcd_nm;
	public String jursareanm;
	public String stafnm;
	public String ptph_no;

	public SP_SUP_1220_LCURLISTRecord(){}

	public void setStafclsfcd_nm(String stafclsfcd_nm){
		this.stafclsfcd_nm = stafclsfcd_nm;
	}

	public void setJursareanm(String jursareanm){
		this.jursareanm = jursareanm;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public String getStafclsfcd_nm(){
		return this.stafclsfcd_nm;
	}

	public String getJursareanm(){
		return this.jursareanm;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}
}

/* �ۼ��ð� : Fri Jul 20 16:17:12 KST 2012 */