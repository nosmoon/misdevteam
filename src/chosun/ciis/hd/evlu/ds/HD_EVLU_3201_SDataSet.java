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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_3201_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String evlu_pers_meda_opn_1tms;
	public String evlu_pers_meda_grad_1tms;
	public String evlu_proc_stat_1tms;
	public String tmp_grad;

	public HD_EVLU_3201_SDataSet(){}
	public HD_EVLU_3201_SDataSet(String errcode, String errmsg, String evlu_pers_meda_opn_1tms, String evlu_pers_meda_grad_1tms, String evlu_proc_stat_1tms, String tmp_grad){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.evlu_pers_meda_opn_1tms = evlu_pers_meda_opn_1tms;
		this.evlu_pers_meda_grad_1tms = evlu_pers_meda_grad_1tms;
		this.evlu_proc_stat_1tms = evlu_proc_stat_1tms;
		this.tmp_grad = tmp_grad;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setEvlu_pers_meda_opn_1tms(String evlu_pers_meda_opn_1tms){
		this.evlu_pers_meda_opn_1tms = evlu_pers_meda_opn_1tms;
	}

	public void setEvlu_pers_meda_grad_1tms(String evlu_pers_meda_grad_1tms){
		this.evlu_pers_meda_grad_1tms = evlu_pers_meda_grad_1tms;
	}

	public void setEvlu_proc_stat_1tms(String evlu_proc_stat_1tms){
		this.evlu_proc_stat_1tms = evlu_proc_stat_1tms;
	}

	public void setTmp_grad(String tmp_grad){
		this.tmp_grad = tmp_grad;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getEvlu_pers_meda_opn_1tms(){
		return this.evlu_pers_meda_opn_1tms;
	}

	public String getEvlu_pers_meda_grad_1tms(){
		return this.evlu_pers_meda_grad_1tms;
	}

	public String getEvlu_proc_stat_1tms(){
		return this.evlu_proc_stat_1tms;
	}

	public String getTmp_grad(){
		return this.tmp_grad;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.evlu_pers_meda_opn_1tms = Util.checkString(cstmt.getString(7));
		this.evlu_pers_meda_grad_1tms = Util.checkString(cstmt.getString(8));
		this.evlu_proc_stat_1tms = Util.checkString(cstmt.getString(9));
		this.tmp_grad = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_EVLU_3201_SDataSet ds = (HD_EVLU_3201_SDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getEvlu_pers_meda_opn_1tms()%>
<%= ds.getEvlu_pers_meda_grad_1tms()%>
<%= ds.getEvlu_proc_stat_1tms()%>
<%= ds.getTmp_grad()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Nov 26 14:44:01 KST 2015 */