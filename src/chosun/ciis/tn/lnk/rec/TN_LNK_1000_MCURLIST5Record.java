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


package chosun.ciis.tn.lnk.rec;

import java.sql.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;

/**
 * 
 */


public class TN_LNK_1000_MCURLIST5Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;

	public TN_LNK_1000_MCURLIST5Record(){}

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

/* �ۼ��ð� : Fri Jul 15 17:28:50 KST 2016 */