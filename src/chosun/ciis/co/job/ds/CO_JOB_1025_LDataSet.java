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


public class CO_JOB_1025_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String job_clsf;
	public String cntc_seq;

	public CO_JOB_1025_LDataSet(){}
	public CO_JOB_1025_LDataSet(String errcode, String errmsg, String job_clsf, String cntc_seq){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.job_clsf = job_clsf;
		this.cntc_seq = cntc_seq;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setCntc_seq(String cntc_seq){
		this.cntc_seq = cntc_seq;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getCntc_seq(){
		return this.cntc_seq;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.job_clsf = Util.checkString(cstmt.getString(4));
		this.cntc_seq = Util.checkString(cstmt.getString(5));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			CO_JOB_1025_LCURLISTRecord rec = new CO_JOB_1025_LCURLISTRecord();
			rec.job_clsf = Util.checkString(rset0.getString("job_clsf"));
			rec.cntc_seq = Util.checkString(rset0.getString("cntc_seq"));
			rec.rmsg_seq = Util.checkString(rset0.getString("rmsg_seq"));
			rec.rmsg_pers_nm = Util.checkString(rset0.getString("rmsg_pers_nm"));
			rec.answer_cont = Util.checkString(rset0.getString("answer_cont"));
			rec.add_file_nm = Util.checkString(rset0.getString("add_file_nm"));
			rec.answer_dt = Util.checkString(rset0.getString("answer_dt"));
			rec.team_nm = Util.checkString(rset0.getString("team_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	CO_JOB_1025_LDataSet ds = (CO_JOB_1025_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_JOB_1025_LCURLISTRecord curlistRec = (CO_JOB_1025_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getJob_clsf()%>
<%= ds.getCntc_seq()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.job_clsf%>
<%= curlistRec.cntc_seq%>
<%= curlistRec.rmsg_seq%>
<%= curlistRec.rmsg_pers_nm%>
<%= curlistRec.answer_cont%>
<%= curlistRec.add_file_nm%>
<%= curlistRec.answer_dt%>
<%= curlistRec.team_nm%>
<%= curlistRec.part_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 22 11:36:12 KST 2009 */