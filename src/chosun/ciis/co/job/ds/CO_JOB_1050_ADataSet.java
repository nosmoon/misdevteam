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


package chosun.ciis.co.job.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.job.dm.*;
import chosun.ciis.co.job.rec.*;

/**
 * 
 */


public class CO_JOB_1050_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String cntc_seq;
	public String sm_rvmbno;

	public CO_JOB_1050_ADataSet(){}
	public CO_JOB_1050_ADataSet(String errcode, String errmsg, String cntc_seq, String sm_rvmbno){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.cntc_seq = cntc_seq;
		this.sm_rvmbno = sm_rvmbno;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCntc_seq(String cntc_seq){
		this.cntc_seq = cntc_seq;
	}

	public void setSm_rvmbno(String sm_rvmbno){
		this.sm_rvmbno = sm_rvmbno;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getCntc_seq(){
		return this.cntc_seq;
	}

	public String getSm_rvmbno(){
		return this.sm_rvmbno;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.cntc_seq = Util.checkString(cstmt.getString(26));
		this.sm_rvmbno = Util.checkString(cstmt.getString(27));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	CO_JOB_1050_ADataSet ds = (CO_JOB_1050_ADataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCntc_seq()%>
<%= ds.getSm_rvmbno()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 11 11:52:15 KST 2009 */