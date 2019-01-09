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


package chosun.ciis.hd.ddemp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.ddemp.dm.*;
import chosun.ciis.hd.ddemp.rec.*;

/**
 * 
 */


public class HD_DDEMP_3000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DDEMP_3000_LDataSet(){}
	public HD_DDEMP_3000_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_DDEMP_3000_LCURLISTRecord rec = new HD_DDEMP_3000_LCURLISTRecord();
			rec.duty_yymm = Util.checkString(rset0.getString("duty_yymm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.studt_wk_yn = Util.checkString(rset0.getString("studt_wk_yn"));
			rec.emp_insr_dduc_yn = Util.checkString(rset0.getString("emp_insr_dduc_yn"));
			rec.proc_nm = Util.checkString(rset0.getString("proc_nm"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.pay_amt = Util.checkString(rset0.getString("pay_amt"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.hd_decid_pers = Util.checkString(rset0.getString("hd_decid_pers"));
			rec.hd_decid_dt_tm = Util.checkString(rset0.getString("hd_decid_dt_tm"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.all_insr_dduc_yn = Util.checkString(rset0.getString("all_insr_dduc_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_DDEMP_3000_LDataSet ds = (HD_DDEMP_3000_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DDEMP_3000_LCURLISTRecord curlistRec = (HD_DDEMP_3000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.duty_yymm%>
<%= curlistRec.prn%>
<%= curlistRec.flnm%>
<%= curlistRec.studt_wk_yn%>
<%= curlistRec.emp_insr_dduc_yn%>
<%= curlistRec.proc_nm%>
<%= curlistRec.nm_korn%>
<%= curlistRec.pay_amt%>
<%= curlistRec.dept_nm%>
<%= curlistRec.hd_decid_pers%>
<%= curlistRec.hd_decid_dt_tm%>
<%= curlistRec.clos_yn%>
<%= curlistRec.all_insr_dduc_yn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Dec 01 18:07:12 KST 2017 */