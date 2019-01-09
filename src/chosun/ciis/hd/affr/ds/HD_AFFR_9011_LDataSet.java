/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_9011_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_9011_LDataSet(){}
	public HD_AFFR_9011_LDataSet(String errcode, String errmsg){
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
			HD_AFFR_9011_LCURLISTRecord rec = new HD_AFFR_9011_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.basi_yy = Util.checkString(rset0.getString("basi_yy"));
			rec.basi_no = Util.checkString(rset0.getString("basi_no"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.usag_clsf_cd = Util.checkString(rset0.getString("usag_clsf_cd"));
			rec.journal_cd = Util.checkString(rset0.getString("journal_cd"));
			rec.journal_nm = Util.checkString(rset0.getString("journal_nm"));
			rec.prvmm_qty = Util.checkString(rset0.getString("prvmm_qty"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.icdc_qty = Util.checkString(rset0.getString("icdc_qty"));
			rec.subs_pay = Util.checkString(rset0.getString("subs_pay"));
			rec.subs_tot_sum = Util.checkString(rset0.getString("subs_tot_sum"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.clos_nm = Util.checkString(rset0.getString("clos_nm"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.new_occr_yn = Util.checkString(rset0.getString("new_occr_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_AFFR_9011_LDataSet ds = (HD_AFFR_9011_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_9011_LCURLISTRecord curlistRec = (HD_AFFR_9011_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.basi_yy%>
<%= curlistRec.basi_no%>
<%= curlistRec.seq%>
<%= curlistRec.dept_cd%>
<%= curlistRec.cd_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.usag_clsf_cd%>
<%= curlistRec.journal_cd%>
<%= curlistRec.journal_nm%>
<%= curlistRec.prvmm_qty%>
<%= curlistRec.qty%>
<%= curlistRec.icdc_qty%>
<%= curlistRec.subs_pay%>
<%= curlistRec.subs_tot_sum%>
<%= curlistRec.remk%>
<%= curlistRec.clos_yn%>
<%= curlistRec.clos_nm%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_dt_tm%>
<%= curlistRec.new_occr_yn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Aug 26 18:41:08 KST 2016 */