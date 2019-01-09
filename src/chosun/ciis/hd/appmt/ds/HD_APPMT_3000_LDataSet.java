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


package chosun.ciis.hd.appmt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.appmt.dm.*;
import chosun.ciis.hd.appmt.rec.*;

/**
 * 
 */


public class HD_APPMT_3000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_APPMT_3000_LDataSet(){}
	public HD_APPMT_3000_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			HD_APPMT_3000_LCURLISTRecord rec = new HD_APPMT_3000_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.team_nm = Util.checkString(rset0.getString("team_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.gender = Util.checkString(rset0.getString("gender"));
			rec.posk_clas_nm = Util.checkString(rset0.getString("posk_clas_nm"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.su_dt = Util.checkString(rset0.getString("su_dt"));
			rec.fst_dt = Util.checkString(rset0.getString("fst_dt"));
			rec.sec_dt = Util.checkString(rset0.getString("sec_dt"));
			rec.dspch_enpr_main_nm = Util.checkString(rset0.getString("dspch_enpr_main_nm"));
			rec.mang_liab_pers_flnm = Util.checkString(rset0.getString("mang_liab_pers_flnm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_APPMT_3000_LDataSet ds = (HD_APPMT_3000_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_APPMT_3000_LCURLISTRecord curlistRec = (HD_APPMT_3000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.team_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.gender%>
<%= curlistRec.posk_clas_nm%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.su_dt%>
<%= curlistRec.fst_dt%>
<%= curlistRec.sec_dt%>
<%= curlistRec.dspch_enpr_main_nm%>
<%= curlistRec.mang_liab_pers_flnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jun 03 16:01:01 KST 2009 */