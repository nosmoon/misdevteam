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


public class PR_PAPMAKE_1009_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String ecnt;
	public String ecnt_nm;

	public PR_PAPMAKE_1009_LCURLIST1Record(){}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setEcnt_nm(String ecnt_nm){
		this.ecnt_nm = ecnt_nm;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getEcnt_nm(){
		return this.ecnt_nm;
	}
}

/* �ۼ��ð� : Thu Jul 30 09:50:34 KST 2009 */