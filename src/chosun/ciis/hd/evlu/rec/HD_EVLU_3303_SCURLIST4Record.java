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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_3303_SCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String cdnm;
	public String act_indx_def;

	public HD_EVLU_3303_SCURLIST4Record(){}

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

/* �ۼ��ð� : Tue Apr 01 20:31:20 KST 2014 */