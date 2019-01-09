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


public class HD_EVLU_2901_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String asst_evlu_proc_stat;

	public HD_EVLU_2901_LDataSet(){}
	public HD_EVLU_2901_LDataSet(String errcode, String errmsg, String asst_evlu_proc_stat){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.asst_evlu_proc_stat = asst_evlu_proc_stat;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setAsst_evlu_proc_stat(String asst_evlu_proc_stat){
		this.asst_evlu_proc_stat = asst_evlu_proc_stat;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getAsst_evlu_proc_stat(){
		return this.asst_evlu_proc_stat;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.asst_evlu_proc_stat = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_EVLU_2901_LCURLISTRecord rec = new HD_EVLU_2901_LCURLISTRecord();
			rec.self_evlu_proc_stat = Util.checkString(rset0.getString("self_evlu_proc_stat"));
			rec.self_evlu_proc_stat_nm = Util.checkString(rset0.getString("self_evlu_proc_stat_nm"));
			rec.evlu_view = Util.checkString(rset0.getString("evlu_view"));
			rec.evlu_grp_nm = Util.checkString(rset0.getString("evlu_grp_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.tgt_evlu_pers_emp_no = Util.checkString(rset0.getString("tgt_evlu_pers_emp_no"));
			rec.tgt_evlu_pers_nm_korn = Util.checkString(rset0.getString("tgt_evlu_pers_nm_korn"));
			rec.evlu_grad_cd = Util.checkString(rset0.getString("evlu_grad_cd"));
			rec.evlu_opn = Util.checkString(rset0.getString("evlu_opn"));
			rec.db_status = Util.checkString(rset0.getString("db_status"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_EVLU_2901_LDataSet ds = (HD_EVLU_2901_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_2901_LCURLISTRecord curlistRec = (HD_EVLU_2901_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAsst_evlu_proc_stat()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.self_evlu_proc_stat%>
<%= curlistRec.self_evlu_proc_stat_nm%>
<%= curlistRec.evlu_view%>
<%= curlistRec.evlu_grp_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.tgt_evlu_pers_emp_no%>
<%= curlistRec.tgt_evlu_pers_nm_korn%>
<%= curlistRec.evlu_grad_cd%>
<%= curlistRec.evlu_opn%>
<%= curlistRec.db_status%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 11 20:12:08 KST 2014 */