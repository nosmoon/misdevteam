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


package chosun.ciis.hd.insr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.rec.*;

/**
 * 
 */


public class HD_INSR_1722_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INSR_1722_LDataSet(){}
	public HD_INSR_1722_LDataSet(String errcode, String errmsg){
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
			HD_INSR_1722_LCURLISTRecord rec = new HD_INSR_1722_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.rnum = Util.checkString(rset0.getString("rnum"));
			rec.tms = Util.checkString(rset0.getString("tms"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.insr_amt_recp_resn = Util.checkString(rset0.getString("insr_amt_recp_resn"));
			rec.rela_spc_agrmnt = Util.checkString(rset0.getString("rela_spc_agrmnt"));
			rec.recp_insr_amt = Util.checkString(rset0.getString("recp_insr_amt"));
			rec.dlay_int = Util.checkString(rset0.getString("dlay_int"));
			rec.clam_resn_occr_dt = Util.checkString(rset0.getString("clam_resn_occr_dt"));
			rec.insr_amt_recp_dt = Util.checkString(rset0.getString("insr_amt_recp_dt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_INSR_1722_LDataSet ds = (HD_INSR_1722_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INSR_1722_LCURLISTRecord curlistRec = (HD_INSR_1722_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.rnum%>
<%= curlistRec.tms%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.insr_amt_recp_resn%>
<%= curlistRec.rela_spc_agrmnt%>
<%= curlistRec.recp_insr_amt%>
<%= curlistRec.dlay_int%>
<%= curlistRec.clam_resn_occr_dt%>
<%= curlistRec.insr_amt_recp_dt%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 19 16:42:17 KST 2009 */