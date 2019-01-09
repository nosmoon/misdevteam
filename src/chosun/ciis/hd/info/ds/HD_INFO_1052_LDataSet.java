/***************************************************************************************************
* ���ϸ� : .java
* ��� : �λ�޿�-�λ�������ȸ
* �ۼ����� : 2014-12-23
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : ��󿬶�ó �߰�
* ������ : ���½�
* �������� :2014-12-23
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_1052_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_1052_LDataSet(){}
	public HD_INFO_1052_LDataSet(String errcode, String errmsg){
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
			HD_INFO_1052_LCURLISTRecord rec = new HD_INFO_1052_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.addr_clsf = Util.checkString(rset0.getString("addr_clsf"));
			rec.zip_1 = Util.checkString(rset0.getString("zip_1"));
			rec.zip_2 = Util.checkString(rset0.getString("zip_2"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtls_addr = Util.checkString(rset0.getString("dtls_addr"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.fax_no = Util.checkString(rset0.getString("fax_no"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.email_addr = Util.checkString(rset0.getString("email_addr"));
			rec.email_cd = Util.checkString(rset0.getString("email_cd"));
			rec.forn_zip = Util.checkString(rset0.getString("forn_zip"));
			rec.forn_addr = Util.checkString(rset0.getString("forn_addr"));
			rec.cntc_rshp = Util.checkString(rset0.getString("cntc_rshp"));
			this.curlist.add(rec);
		}

	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_INFO_1052_LDataSet ds = (HD_INFO_1052_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_1052_LCURLISTRecord curlistRec = (HD_INFO_1052_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.addr_clsf%>
<%= curlistRec.zip_1%>
<%= curlistRec.zip_2%>
<%= curlistRec.addr%>
<%= curlistRec.dtls_addr%>
<%= curlistRec.tel_no%>
<%= curlistRec.fax_no%>
<%= curlistRec.ptph_no%>
<%= curlistRec.email_addr%>
<%= curlistRec.forn_zip%>
<%= curlistRec.forn_addr%>
<%= curlistRec.cntc_rshp%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Dec 24 15:19:49 KST 2014 */