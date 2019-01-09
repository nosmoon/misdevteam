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


package chosun.ciis.hd.lvcmpy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_2801_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_2801_LDataSet(){}
	public HD_LVCMPY_2801_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			HD_LVCMPY_2801_LCURLISTRecord rec = new HD_LVCMPY_2801_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.lvcmpy_dt = Util.checkString(rset0.getString("lvcmpy_dt"));
			rec.mm_avg_charg_amt = Util.checkString(rset0.getString("mm_avg_charg_amt"));
			rec.cont_svc_yys = Util.checkString(rset0.getString("cont_svc_yys"));
			rec.lvcmpy_amt = Util.checkString(rset0.getString("lvcmpy_amt"));
			rec.real_lvcmpy_amt = Util.checkString(rset0.getString("real_lvcmpy_amt"));
			rec.lvcmpy_clsf = Util.checkString(rset0.getString("lvcmpy_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_LVCMPY_2801_LDataSet ds = (HD_LVCMPY_2801_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_LVCMPY_2801_LCURLISTRecord curlistRec = (HD_LVCMPY_2801_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.lvcmpy_dt%>
<%= curlistRec.mm_avg_charg_amt%>
<%= curlistRec.cont_svc_yys%>
<%= curlistRec.lvcmpy_amt%>
<%= curlistRec.real_lvcmpy_amt%>
<%= curlistRec.lvcmpy_clsf%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 21 19:10:31 KST 2009 */