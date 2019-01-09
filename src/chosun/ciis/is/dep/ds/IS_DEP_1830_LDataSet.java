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


public class IS_DEP_1830_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_DEP_1830_LDataSet(){}
	public IS_DEP_1830_LDataSet(String errcode, String errmsg){
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
			IS_DEP_1830_LCURLISTRecord rec = new IS_DEP_1830_LCURLISTRecord();
			rec.sale_proc_dt = Util.checkString(rset0.getString("sale_proc_dt"));
			rec.stmt_no = Util.checkString(rset0.getString("stmt_no"));
			rec.acwr_reg_dt_seq = Util.checkString(rset0.getString("acwr_reg_dt_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.tot_rvord_amt = Util.checkString(rset0.getString("tot_rvord_amt"));
			rec.trc_unrcp_amt = Util.checkString(rset0.getString("trc_unrcp_amt"));
			rec.chg_prv_dept_cd_nm = Util.checkString(rset0.getString("chg_prv_dept_cd_nm"));
			rec.chg_prv_sub_dept_cd_nm = Util.checkString(rset0.getString("chg_prv_sub_dept_cd_nm"));
			rec.chg_prv_chrg_pers = Util.checkString(rset0.getString("chg_prv_chrg_pers"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.sub_dept_cd_nm = Util.checkString(rset0.getString("sub_dept_cd_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.trc_reg_dt = Util.checkString(rset0.getString("trc_reg_dt"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_DEP_1830_LDataSet ds = (IS_DEP_1830_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_DEP_1830_LCURLISTRecord curlistRec = (IS_DEP_1830_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sale_proc_dt%>
<%= curlistRec.stmt_no%>
<%= curlistRec.acwr_reg_dt_seq%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.suply_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.tot_rvord_amt%>
<%= curlistRec.trc_unrcp_amt%>
<%= curlistRec.chg_prv_dept_cd_nm%>
<%= curlistRec.chg_prv_sub_dept_cd_nm%>
<%= curlistRec.chg_prv_chrg_pers%>
<%= curlistRec.dept_cd_nm%>
<%= curlistRec.sub_dept_cd_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.trc_reg_dt%>
<%= curlistRec.incmg_pers%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 23 10:14:52 KST 2012 */