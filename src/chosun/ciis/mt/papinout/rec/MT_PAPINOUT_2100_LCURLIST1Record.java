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


public class MT_PAPINOUT_2100_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf_nm;
	public String clos_clsf;

	public MT_PAPINOUT_2100_LCURLIST1Record(){}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setClos_clsf(String clos_clsf){
		this.clos_clsf = clos_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getClos_clsf(){
		return this.clos_clsf;
	}
}

/* �ۼ��ð� : Mon Jun 22 19:00:22 KST 2009 */