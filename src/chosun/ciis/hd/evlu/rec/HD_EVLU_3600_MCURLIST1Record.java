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

public class HD_EVLU_3600_MCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String evlu_cd;
	public String evlu_cdnm;

	public HD_EVLU_3600_MCURLIST1Record(){}

	public void setEvlu_cd(String evlu_cd){
		this.evlu_cd = evlu_cd;
	}

	public void setEvlu_cdnm(String evlu_cdnm){
		this.evlu_cdnm = evlu_cdnm;
	}

	public String getEvlu_cd(){
		return this.evlu_cd;
	}

	public String getEvlu_cdnm(){
		return this.evlu_cdnm;
	}
}

/* �ۼ��ð� : Wed Jun 03 14:05:13 KST 2009 */