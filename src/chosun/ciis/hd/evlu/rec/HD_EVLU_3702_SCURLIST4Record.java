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

public class HD_EVLU_3702_SCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String cdnm;
	public String act_indx_def;

	public HD_EVLU_3702_SCURLIST4Record(){}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setAct_indx_def(String act_indx_def){
		this.act_indx_def = act_indx_def;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getAct_indx_def(){
		return this.act_indx_def;
	}
}

/* �ۼ��ð� : Tue Oct 20 17:16:33 KST 2009 */