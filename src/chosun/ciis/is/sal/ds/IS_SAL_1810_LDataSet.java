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


package chosun.ciis.is.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.sal.dm.*;
import chosun.ciis.is.sal.rec.*;

/**
 * 
 */


public class IS_SAL_1810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_SAL_1810_LDataSet(){}
	public IS_SAL_1810_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			IS_SAL_1810_LCURLISTRecord rec = new IS_SAL_1810_LCURLISTRecord();
			rec.asnt_dstc_cd = Util.checkString(rset0.getString("asnt_dstc_cd"));
			rec.asnt_dstc_cd_nm = Util.checkString(rset0.getString("asnt_dstc_cd_nm"));
			rec.dstc_seqo = Util.checkString(rset0.getString("dstc_seqo"));
			rec.dlco_clsf_cd_seq = Util.checkString(rset0.getString("dlco_clsf_cd_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.setl_bank_nm = Util.checkString(rset0.getString("setl_bank_nm"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.rcpm_main_nm = Util.checkString(rset0.getString("rcpm_main_nm"));
			rec.purc_amt = Util.checkString(rset0.getString("purc_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_SAL_1810_LDataSet ds = (IS_SAL_1810_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_SAL_1810_LCURLISTRecord curlistRec = (IS_SAL_1810_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.asnt_dstc_cd%>
<%= curlistRec.asnt_dstc_cd_nm%>
<%= curlistRec.dstc_seqo%>
<%= curlistRec.dlco_clsf_cd_seq%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.setl_bank_nm%>
<%= curlistRec.acct_no%>
<%= curlistRec.rcpm_main_nm%>
<%= curlistRec.purc_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 15 17:09:01 KST 2012 */