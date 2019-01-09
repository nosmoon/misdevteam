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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_2220_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String reg_clsf;

	public SP_SAL_2220_LDataSet(){}
	public SP_SAL_2220_LDataSet(String errcode, String errmsg, String reg_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.reg_clsf = reg_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setReg_clsf(String reg_clsf){
		this.reg_clsf = reg_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getReg_clsf(){
		return this.reg_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.reg_clsf = Util.checkString(cstmt.getString(10));
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SP_SAL_2220_LCURLISTRecord rec = new SP_SAL_2220_LCURLISTRecord();
			rec.work_yymm = Util.checkString(rset0.getString("work_yymm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.rcpm_dt = Util.checkString(rset0.getString("rcpm_dt"));
			rec.purc_adjm_clsf_nm = Util.checkString(rset0.getString("purc_adjm_clsf_nm"));
			rec.c_dlco_no = Util.checkString(rset0.getString("c_dlco_no"));
			rec.c_dlco_nm = Util.checkString(rset0.getString("c_dlco_nm"));
			rec.b_dlco_no = Util.checkString(rset0.getString("b_dlco_no"));
			rec.b_dlco_nm = Util.checkString(rset0.getString("b_dlco_nm"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.rdr_nm = Util.checkString(rset0.getString("rdr_nm"));
			rec.rdr_addr = Util.checkString(rset0.getString("rdr_addr"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SP_SAL_2220_LDataSet ds = (SP_SAL_2220_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_SAL_2220_LCURLISTRecord curlistRec = (SP_SAL_2220_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getReg_clsf()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.work_yymm%>
<%= curlistRec.seq%>
<%= curlistRec.rcpm_dt%>
<%= curlistRec.purc_adjm_clsf_nm%>
<%= curlistRec.c_dlco_no%>
<%= curlistRec.c_dlco_nm%>
<%= curlistRec.b_dlco_no%>
<%= curlistRec.b_dlco_nm%>
<%= curlistRec.amt%>
<%= curlistRec.rdr_nm%>
<%= curlistRec.rdr_addr%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 09 14:20:25 KST 2012 */