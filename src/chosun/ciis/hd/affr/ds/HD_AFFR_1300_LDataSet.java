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


public class HD_AFFR_1300_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_1300_LDataSet(){}
	public HD_AFFR_1300_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_AFFR_1300_LCURLISTRecord rec = new HD_AFFR_1300_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.reg_dt = Util.checkString(rset0.getString("reg_dt"));
			rec.faml_seq = Util.checkString(rset0.getString("faml_seq"));
			rec.child_flnm = Util.checkString(rset0.getString("child_flnm"));
			rec.faml_rshp_cd = Util.checkString(rset0.getString("faml_rshp_cd"));
			rec.faml_rshp_nm = Util.checkString(rset0.getString("faml_rshp_nm"));
			rec.obcl_grad = Util.checkString(rset0.getString("obcl_grad"));
			rec.faml_prn = Util.checkString(rset0.getString("faml_prn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_AFFR_1300_LDataSet ds = (HD_AFFR_1300_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_1300_LCURLISTRecord curlistRec = (HD_AFFR_1300_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.emp_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.reg_dt%>
<%= curlistRec.faml_seq%>
<%= curlistRec.child_flnm%>
<%= curlistRec.faml_rshp_cd%>
<%= curlistRec.faml_rshp_nm%>
<%= curlistRec.obcl_grad%>
<%= curlistRec.faml_prn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 30 13:17:30 KST 2009 */