/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_2905_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cdnm;
	public String act_indx_def;

	public HD_EVLU_2905_LCURLIST2Record(){}

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

/* �ۼ��ð� : Mon Sep 05 10:51:11 KST 2016 */