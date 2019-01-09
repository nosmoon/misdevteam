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


package chosun.ciis.co.work.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.work.dm.*;
import chosun.ciis.co.work.rec.*;

/**
 * 
 */


public class CO_WORK_1000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cdlist = new ArrayList();
	public ArrayList jobclsflist = new ArrayList();
	public ArrayList cdclsflist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_WORK_1000_MDataSet(){}
	public CO_WORK_1000_MDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			CO_WORK_1000_MJOBCLSFLISTRecord rec = new CO_WORK_1000_MJOBCLSFLISTRecord();
			rec.job_clsf = Util.checkString(rset0.getString("job_clsf"));
			rec.job_clsf_nm = Util.checkString(rset0.getString("job_clsf_nm"));
			this.jobclsflist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			CO_WORK_1000_MCDCLSFLISTRecord rec = new CO_WORK_1000_MCDCLSFLISTRecord();
			rec.job_clsf = Util.checkString(rset1.getString("job_clsf"));
			rec.cd_clsf = Util.checkString(rset1.getString("cd_clsf"));
			rec.cd_clsf_nm = Util.checkString(rset1.getString("cd_clsf_nm"));
			this.cdclsflist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			CO_WORK_1000_MCDLISTRecord rec = new CO_WORK_1000_MCDLISTRecord();
			rec.job_clsf = Util.checkString(rset2.getString("job_clsf"));
			rec.cd_clsf = Util.checkString(rset2.getString("cd_clsf"));
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cd_nm = Util.checkString(rset2.getString("cd_nm"));
			this.cdlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	CO_WORK_1000_MDataSet ds = (CO_WORK_1000_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.jobclsflist.size(); i++){
		CO_WORK_1000_MJOBCLSFLISTRecord jobclsflistRec = (CO_WORK_1000_MJOBCLSFLISTRecord)ds.jobclsflist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.cdclsflist.size(); i++){
		CO_WORK_1000_MCDCLSFLISTRecord cdclsflistRec = (CO_WORK_1000_MCDCLSFLISTRecord)ds.cdclsflist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.cdlist.size(); i++){
		CO_WORK_1000_MCDLISTRecord cdlistRec = (CO_WORK_1000_MCDLISTRecord)ds.cdlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getJobclsflist()%>
<%= ds.getCdclsflist()%>
<%= ds.getCdlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= jobclsflistRec.job_clsf%>
<%= jobclsflistRec.job_clsf_nm%>
<%= cdclsflistRec.job_clsf%>
<%= cdclsflistRec.cd_clsf%>
<%= cdclsflistRec.cd_clsf_nm%>
<%= cdlistRec.job_clsf%>
<%= cdlistRec.cd_clsf%>
<%= cdlistRec.cd%>
<%= cdlistRec.cd_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jun 04 17:51:12 KST 2009 */