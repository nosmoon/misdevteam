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


package chosun.ciis.pr.prtexec.rec;

import java.sql.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */


public class PR_PRTEXEC_5050_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm_cd;

	public PR_PRTEXEC_5050_LCURLIST1Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm_cd(String cdnm_cd){
		this.cdnm_cd = cdnm_cd;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm_cd(){
		return this.cdnm_cd;
	}
}

/* �ۼ��ð� : Mon Aug 03 11:57:28 KST 2009 */