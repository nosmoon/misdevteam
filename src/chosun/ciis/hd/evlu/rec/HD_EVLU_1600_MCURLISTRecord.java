/***************************************************************************************************
* ���ϸ�		: 
* ���		:
* �ۼ�����	: 
* �ۼ���		: 
***************************************************************************************************/
/***************************************************************************************************
* ��������	: 
* ������		:   
* ��������	: 
* ���		: 
***************************************************************************************************/


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 *
 */

public class HD_EVLU_1600_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;

	public HD_EVLU_1600_MCURLISTRecord(){}

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

/* �ۼ��ð� : Wed May 20 20:29:35 KST 2009 */