

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


public class HD_APPMT_1300_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_APPMT_1300_LDataSet(){}
	public HD_APPMT_1300_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			HD_APPMT_1300_LCURLISTRecord rec = new HD_APPMT_1300_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.appmt_cd = Util.checkString(rset0.getString("appmt_cd"));
			rec.appmt_nm = Util.checkString(rset0.getString("appmt_nm"));
			rec.appmt_resn_cd = Util.checkString(rset0.getString("appmt_resn_cd"));
			rec.appmt_resn_nm = Util.checkString(rset0.getString("appmt_resn_nm"));
			rec.appmt_dt = Util.checkString(rset0.getString("appmt_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.emp_clsf_cd = Util.checkString(rset0.getString("emp_clsf_cd"));
			rec.emp_clsf_nm = Util.checkString(rset0.getString("emp_clsf_nm"));
			rec.base_saly = Util.checkString(rset0.getString("base_saly"));
			rec.posk_saly = Util.checkString(rset0.getString("posk_saly"));
			rec.saly_stot = Util.checkString(rset0.getString("saly_stot"));
			rec.lvcmpy_acml_amt = Util.checkString(rset0.getString("lvcmpy_acml_amt"));
			rec.bns_incd_servcost = Util.checkString(rset0.getString("bns_incd_servcost"));
			rec.appmt_sort = Util.checkString(rset0.getString("appmt_sort"));
			rec.appmt_cont = Util.checkString(rset0.getString("appmt_cont"));
			rec.clos_proc_yn = Util.checkString(rset0.getString("clos_proc_yn"));
			rec.clos_proc_yn_nm = Util.checkString(rset0.getString("clos_proc_yn_nm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_APPMT_1300_LDataSet ds = (HD_APPMT_1300_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_APPMT_1300_LCURLISTRecord curlistRec = (HD_APPMT_1300_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.appmt_cd%>
<%= curlistRec.appmt_nm%>
<%= curlistRec.appmt_resn_cd%>
<%= curlistRec.appmt_resn_nm%>
<%= curlistRec.appmt_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.emp_clsf_cd%>
<%= curlistRec.emp_clsf_nm%>
<%= curlistRec.base_saly%>
<%= curlistRec.posk_saly%>
<%= curlistRec.saly_stot%>
<%= curlistRec.lvcmpy_acml_amt%>
<%= curlistRec.bns_incd_servcost%>
<%= curlistRec.appmt_sort%>
<%= curlistRec.appmt_cont%>
<%= curlistRec.clos_proc_yn%>
<%= curlistRec.clos_proc_yn_nm%>
<%= curlistRec.seq%>
<%= curlistRec.occr_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Oct 28 14:27:19 KST 2010 */