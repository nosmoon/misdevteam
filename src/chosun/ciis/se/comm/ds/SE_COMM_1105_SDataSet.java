/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.comm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.rec.*;

/**
 * 
 */


public class SE_COMM_1105_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public long rsltcnt;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;

	public SE_COMM_1105_SDataSet(){}
	public SE_COMM_1105_SDataSet(String errcode, String errmsg, long rsltcnt, String bo_cd, String bo_seq, String bo_nm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rsltcnt = rsltcnt;
		this.bo_cd = bo_cd;
		this.bo_seq = bo_seq;
		this.bo_nm = bo_nm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRsltcnt(long rsltcnt){
		this.rsltcnt = rsltcnt;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getRsltcnt(){
		return this.rsltcnt;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.rsltcnt = cstmt.getLong(7);
		this.bo_cd = Util.checkString(cstmt.getString(8));
		this.bo_seq = Util.checkString(cstmt.getString(9));
		this.bo_nm = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_COMM_1105_SDataSet ds = (SE_COMM_1105_SDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRsltcnt()%>
<%= ds.getBo_cd()%>
<%= ds.getBo_seq()%>
<%= ds.getBo_nm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 23 13:19:18 KST 2009 */