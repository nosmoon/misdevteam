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


package chosun.ciis.hd.hlywrk.rec;

import java.sql.*;
import chosun.ciis.hd.hlywrk.dm.*;
import chosun.ciis.hd.hlywrk.ds.*;

/**
 * 
 */


public class HD_HLYWRK_1000_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;

	public HD_HLYWRK_1000_LCURLIST2Record(){}

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

/* �ۼ��ð� : Fri Apr 17 10:24:49 KST 2009 */