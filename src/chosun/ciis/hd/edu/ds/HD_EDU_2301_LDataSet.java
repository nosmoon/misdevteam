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


package chosun.ciis.hd.edu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.edu.dm.*;
import chosun.ciis.hd.edu.rec.*;

/**
 * 
 */


public class HD_EDU_2301_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EDU_2301_LDataSet(){}
	public HD_EDU_2301_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_EDU_2301_LCURLISTRecord rec = new HD_EDU_2301_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.edu_frdt = Util.checkString(rset0.getString("edu_frdt"));
			rec.edu_todt = Util.checkString(rset0.getString("edu_todt"));
			rec.lecture_nm = Util.checkString(rset0.getString("lecture_nm"));
			rec.complt_yn_nm = Util.checkString(rset0.getString("complt_yn_nm"));
			rec.edu_cost = Util.checkString(rset0.getString("edu_cost"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.lang_aprv_tms_chk = Util.checkString(rset0.getString("lang_aprv_tms_chk"));
			rec.edu_clsf = Util.checkString(rset0.getString("edu_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_EDU_2301_LDataSet ds = (HD_EDU_2301_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EDU_2301_LCURLISTRecord curlistRec = (HD_EDU_2301_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.edu_frdt%>
<%= curlistRec.edu_todt%>
<%= curlistRec.lecture_nm%>
<%= curlistRec.complt_yn_nm%>
<%= curlistRec.edu_cost%>
<%= curlistRec.remk%>
<%= curlistRec.lang_aprv_tms_chk%>
<%= curlistRec.edu_clsf%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Sep 13 16:42:28 KST 2018 */