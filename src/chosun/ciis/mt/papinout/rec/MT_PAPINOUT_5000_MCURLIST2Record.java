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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_5000_MCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String pj_kind;
	public String pj_kind_nm;

	public MT_PAPINOUT_5000_MCURLIST2Record(){}

	public void setPj_kind(String pj_kind){
		this.pj_kind = pj_kind;
	}

	public void setPj_kind_nm(String pj_kind_nm){
		this.pj_kind_nm = pj_kind_nm;
	}

	public String getPj_kind(){
		return this.pj_kind;
	}

	public String getPj_kind_nm(){
		return this.pj_kind_nm;
	}
}

/* �ۼ��ð� : Fri Sep 04 21:35:22 KST 2009 */