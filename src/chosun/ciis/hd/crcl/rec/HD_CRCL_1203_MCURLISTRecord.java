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


package chosun.ciis.hd.crcl.rec;

import java.sql.*;
import chosun.ciis.hd.crcl.dm.*;
import chosun.ciis.hd.crcl.ds.*;

/**
 * 
 */


public class HD_CRCL_1203_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;

	public HD_CRCL_1203_MCURLISTRecord(){}

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

/* �ۼ��ð� : Mon Feb 16 19:47:34 KST 2009 */