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


public class HD_APPMT_2001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_APPMT_2001_LDataSet(){}
	public HD_APPMT_2001_LDataSet(String errcode, String errmsg){
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
			HD_APPMT_2001_LCURLISTRecord rec = new HD_APPMT_2001_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.appmt_dt = Util.checkString(rset0.getString("appmt_dt"));
			rec.base_saly = Util.checkString(rset0.getString("base_saly"));
			rec.posk_saly = Util.checkString(rset0.getString("posk_saly"));
			rec.saly_stot = Util.checkString(rset0.getString("saly_stot"));
			rec.yy_base_saly = Util.checkString(rset0.getString("yy_base_saly"));
			rec.yy_posk_saly = Util.checkString(rset0.getString("yy_posk_saly"));
			rec.yy_saly_stot = Util.checkString(rset0.getString("yy_saly_stot"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_APPMT_2001_LDataSet ds = (HD_APPMT_2001_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_APPMT_2001_LCURLISTRecord curlistRec = (HD_APPMT_2001_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.flnm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.appmt_dt%>
<%= curlistRec.base_saly%>
<%= curlistRec.posk_saly%>
<%= curlistRec.saly_stot%>
<%= curlistRec.yy_base_saly%>
<%= curlistRec.yy_posk_saly%>
<%= curlistRec.yy_saly_stot%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jun 01 17:05:17 KST 2009 */