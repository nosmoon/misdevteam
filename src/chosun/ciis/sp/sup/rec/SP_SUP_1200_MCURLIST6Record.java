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


public class SP_SUP_1200_MCURLIST6Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;

	public SP_SUP_1200_MCURLIST6Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}
}

/* �ۼ��ð� : Fri Jul 20 11:33:18 KST 2012 */