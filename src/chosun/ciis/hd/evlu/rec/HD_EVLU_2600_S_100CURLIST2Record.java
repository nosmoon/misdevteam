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


public class HD_EVLU_2600_S_100CURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cdnm;
	public String act_indx_def;

	public HD_EVLU_2600_S_100CURLIST2Record(){}

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

/* �ۼ��ð� : Wed Jul 20 10:31:43 KST 2016 */