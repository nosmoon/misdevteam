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


package chosun.ciis.ad.evlu.rec;

import java.sql.*;
import chosun.ciis.ad.evlu.dm.*;
import chosun.ciis.ad.evlu.ds.*;

/**
 * 
 */


public class AD_EVLU_1001_MCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;

	public AD_EVLU_1001_MCURLIST1Record(){}

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

/* �ۼ��ð� : Mon Mar 15 13:44:38 KST 2010 */