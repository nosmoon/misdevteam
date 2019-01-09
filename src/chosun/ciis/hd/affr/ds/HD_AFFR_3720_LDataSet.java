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


public class HD_AFFR_3720_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_3720_LDataSet(){}
	public HD_AFFR_3720_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			HD_AFFR_3720_LCURLISTRecord rec = new HD_AFFR_3720_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.aply_yy = Util.checkString(rset0.getString("aply_yy"));
			rec.aply_no = Util.checkString(rset0.getString("aply_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.aplc_dt = Util.checkString(rset0.getString("aplc_dt"));
			rec.cmpy_insr_cd = Util.checkString(rset0.getString("cmpy_insr_cd"));
			rec.pay_cd = Util.checkString(rset0.getString("pay_cd"));
			rec.pay_dt = Util.checkString(rset0.getString("pay_dt"));
			rec.pay_amt = Util.checkString(rset0.getString("pay_amt"));
			rec.acpn_dt = Util.checkString(rset0.getString("acpn_dt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.org_cd = Util.checkString(rset0.getString("org_cd"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.patyinsr_yn = Util.checkString(rset0.getString("patyinsr_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_AFFR_3720_LDataSet ds = (HD_AFFR_3720_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_3720_LCURLISTRecord curlistRec = (HD_AFFR_3720_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.aply_yy%>
<%= curlistRec.aply_no%>
<%= curlistRec.flnm%>
<%= curlistRec.prn%>
<%= curlistRec.aplc_dt%>
<%= curlistRec.cmpy_insr_cd%>
<%= curlistRec.pay_cd%>
<%= curlistRec.pay_dt%>
<%= curlistRec.pay_amt%>
<%= curlistRec.acpn_dt%>
<%= curlistRec.remk%>
<%= curlistRec.org_cd%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.patyinsr_yn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jul 24 16:51:27 KST 2015 */