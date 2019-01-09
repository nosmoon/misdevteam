

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


public class HD_SALY_2401_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_2401_LDataSet(){}
	public HD_SALY_2401_LDataSet(String errcode, String errmsg){
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
			HD_SALY_2401_LCURLISTRecord rec = new HD_SALY_2401_LCURLISTRecord();
			rec.offi_nm = Util.checkString(rset0.getString("offi_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dept_cdnm = Util.checkString(rset0.getString("dept_cdnm"));
			rec.emp_nm = Util.checkString(rset0.getString("emp_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.emp_clsf_nm = Util.checkString(rset0.getString("emp_clsf_nm"));
			rec.emp_cost_dstb_cd = Util.checkString(rset0.getString("emp_cost_dstb_cd"));
			rec.emp_dstb_clsf = Util.checkString(rset0.getString("emp_dstb_clsf"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_SALY_2401_LDataSet ds = (HD_SALY_2401_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_2401_LCURLISTRecord curlistRec = (HD_SALY_2401_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.offi_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dept_cdnm%>
<%= curlistRec.emp_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.emp_clsf_nm%>
<%= curlistRec.emp_cost_dstb_cd%>
<%= curlistRec.emp_dstb_clsf%>
<%= curlistRec.qunt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jul 30 17:52:32 KST 2010 */