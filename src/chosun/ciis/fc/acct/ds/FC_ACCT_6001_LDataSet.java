/***************************************************************************************************
* ���ϸ� : .java
* ��� :  �ΰ�������-����� ���
* �ۼ����� : 2010-01-22
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 *  �ΰ�������-����� ���
 */


public class FC_ACCT_6001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_6001_LDataSet(){}
	public FC_ACCT_6001_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_6001_LCURLISTRecord rec = new FC_ACCT_6001_LCURLISTRecord();
			rec.erplace_cd = Util.checkString(rset0.getString("erplace_cd"));
			rec.ernm = Util.checkString(rset0.getString("ernm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.erplace_addr = Util.checkString(rset0.getString("erplace_addr"));
			rec.erplace_bizcond = Util.checkString(rset0.getString("erplace_bizcond"));
			rec.erplace_item = Util.checkString(rset0.getString("erplace_item"));
			rec.taxoff = Util.checkString(rset0.getString("taxoff"));
			rec.corp_reg_no = Util.checkString(rset0.getString("corp_reg_no"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			rec.ernm_tax = Util.checkString(rset0.getString("ernm_tax"));
			rec.erplace_cd_tax = Util.checkString(rset0.getString("erplace_cd_tax"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_6001_LDataSet ds = (FC_ACCT_6001_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_6001_LCURLISTRecord curlistRec = (FC_ACCT_6001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.erplace_cd%>
<%= curlistRec.ernm%>
<%= curlistRec.ern%>
<%= curlistRec.presi_nm%>
<%= curlistRec.erplace_addr%>
<%= curlistRec.erplace_bizcond%>
<%= curlistRec.erplace_item%>
<%= curlistRec.taxoff%>
<%= curlistRec.corp_reg_no%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.use_yn%>
<%= curlistRec.ernm_tax%>
<%= curlistRec.erplace_cd_tax%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jan 27 15:50:57 KST 2010 */