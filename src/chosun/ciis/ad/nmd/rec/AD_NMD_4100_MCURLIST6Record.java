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


package chosun.ciis.ad.nmd.rec;

import java.sql.*;
import chosun.ciis.ad.nmd.dm.*;
import chosun.ciis.ad.nmd.ds.*;

/**
 * 
 */


public class AD_NMD_4100_MCURLIST6Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;

	public AD_NMD_4100_MCURLIST6Record(){}

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

/* �ۼ��ð� : Mon Apr 07 16:48:38 KST 2014 */