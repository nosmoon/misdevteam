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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_1600_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_1600_LDataSet(){}
	public HD_SALY_1600_LDataSet(String errcode, String errmsg){
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
			HD_SALY_1600_LCURLISTRecord rec = new HD_SALY_1600_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.lvcmpy_dt = Util.checkString(rset0.getString("lvcmpy_dt"));
			rec.emp_clsf = Util.checkString(rset0.getString("emp_clsf"));
			rec.emp_clsf_nm = Util.checkString(rset0.getString("emp_clsf_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.non_tax_yn_jrnst = Util.checkString(rset0.getString("non_tax_yn_jrnst"));
			rec.non_tax_yn_frnc = Util.checkString(rset0.getString("non_tax_yn_frnc"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_SALY_1600_LDataSet ds = (HD_SALY_1600_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_1600_LCURLISTRecord curlistRec = (HD_SALY_1600_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.nm_korn%>
<%= curlistRec.prn%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.lvcmpy_dt%>
<%= curlistRec.emp_clsf%>
<%= curlistRec.emp_clsf_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.non_tax_yn_jrnst%>
<%= curlistRec.non_tax_yn_frnc%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 20 13:47:57 KST 2009 */