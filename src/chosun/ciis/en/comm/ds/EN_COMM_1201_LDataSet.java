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


package chosun.ciis.en.comm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.comm.dm.*;
import chosun.ciis.en.comm.rec.*;

/**
 * 
 */


public class EN_COMM_1201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_COMM_1201_LDataSet(){}
	public EN_COMM_1201_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			EN_COMM_1201_LCURLISTRecord rec = new EN_COMM_1201_LCURLISTRecord();
			rec.chk_flag = Util.checkString(rset0.getString("chk_flag"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.rcpm_unit_clsf = Util.checkString(rset0.getString("rcpm_unit_clsf"));
			rec.tran_date = Util.checkString(rset0.getString("tran_date"));
			rec.cms_code = Util.checkString(rset0.getString("cms_code"));
			rec.tran_content = Util.checkString(rset0.getString("tran_content"));
			rec.tran_amt = Util.checkString(rset0.getString("tran_amt"));
			rec.occr_no = Util.checkString(rset0.getString("occr_no"));
			rec.biz_reg_no = Util.checkString(rset0.getString("biz_reg_no"));
			rec.bank_id = Util.checkString(rset0.getString("bank_id"));
			rec.acct_num = Util.checkString(rset0.getString("acct_num"));
			rec.tran_date_seq = Util.checkString(rset0.getString("tran_date_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	EN_COMM_1201_LDataSet ds = (EN_COMM_1201_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		EN_COMM_1201_LCURLISTRecord curlistRec = (EN_COMM_1201_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.chk_flag%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.rcpm_unit_clsf%>
<%= curlistRec.tran_date%>
<%= curlistRec.cms_code%>
<%= curlistRec.tran_content%>
<%= curlistRec.tran_amt%>
<%= curlistRec.occr_no%>
<%= curlistRec.biz_reg_no%>
<%= curlistRec.bank_id%>
<%= curlistRec.acct_num%>
<%= curlistRec.tran_date_seq%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jun 18 16:23:48 KST 2009 */