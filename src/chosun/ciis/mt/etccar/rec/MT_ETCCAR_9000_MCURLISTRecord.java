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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_9000_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String cdnm_cd;

	public MT_ETCCAR_9000_MCURLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCdnm_cd(String cdnm_cd){
		this.cdnm_cd = cdnm_cd;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getCdnm_cd(){
		return this.cdnm_cd;
	}
}

/* �ۼ��ð� : Thu Aug 23 17:47:34 KST 2012 */