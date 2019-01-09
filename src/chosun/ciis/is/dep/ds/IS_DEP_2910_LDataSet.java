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


package chosun.ciis.is.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_2910_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_DEP_2910_LDataSet(){}
	public IS_DEP_2910_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			IS_DEP_2910_LCURLISTRecord rec = new IS_DEP_2910_LCURLISTRecord();
			rec.tax_stmt_no = Util.checkString(rset0.getString("tax_stmt_no"));
			rec.prof_type_cd_nm = Util.checkString(rset0.getString("prof_type_cd_nm"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.total_amt = Util.checkString(rset0.getString("total_amt"));
			rec.erplace_cd_nm = Util.checkString(rset0.getString("erplace_cd_nm"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.sub_dept_cd_nm = Util.checkString(rset0.getString("sub_dept_cd_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.clamt_plan_dt = Util.checkString(rset0.getString("clamt_plan_dt"));
			rec.clamt_plan_dt_cnt = Util.checkString(rset0.getString("clamt_plan_dt_cnt"));
			rec.tot_rcpm_amt = Util.checkString(rset0.getString("tot_rcpm_amt"));
			rec.misu_amt = Util.checkString(rset0.getString("misu_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_DEP_2910_LDataSet ds = (IS_DEP_2910_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_DEP_2910_LCURLISTRecord curlistRec = (IS_DEP_2910_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.tax_stmt_no%>
<%= curlistRec.prof_type_cd_nm%>
<%= curlistRec.make_dt%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.ern%>
<%= curlistRec.suply_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.total_amt%>
<%= curlistRec.erplace_cd_nm%>
<%= curlistRec.dept_cd_nm%>
<%= curlistRec.sub_dept_cd_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.clamt_plan_dt%>
<%= curlistRec.clamt_plan_dt_cnt%>
<%= curlistRec.tot_rcpm_amt%>
<%= curlistRec.misu_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 24 09:53:05 KST 2012 */