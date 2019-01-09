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


package chosun.ciis.mc.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_1042_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_COST_1042_LDataSet(){}
	public MC_COST_1042_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MC_COST_1042_LCURLISTRecord rec = new MC_COST_1042_LCURLISTRecord();
			rec.offi_nm = Util.checkString(rset1.getString("offi_nm"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.dept_cdnm = Util.checkString(rset1.getString("dept_cdnm"));
			rec.emp_nm = Util.checkString(rset1.getString("emp_nm"));
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.emp_clsf_nm = Util.checkString(rset1.getString("emp_clsf_nm"));
			rec.emp_cost_dstb_cd = Util.checkString(rset1.getString("emp_cost_dstb_cd"));
			rec.emp_dstb_clsf = Util.checkString(rset1.getString("emp_dstb_clsf"));
			rec.qunt = Util.checkString(rset1.getString("qunt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_COST_1042_LDataSet ds = (MC_COST_1042_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_1042_LCURLISTRecord curlistRec = (MC_COST_1042_LCURLISTRecord)ds.curlist.get(i);%>
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


/* �ۼ��ð� : Wed Apr 29 21:19:46 KST 2009 */