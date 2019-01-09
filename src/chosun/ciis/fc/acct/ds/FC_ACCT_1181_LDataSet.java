/***************************************************************************************************
* ���ϸ� : .java
* ��� :  �ŷ�ó��ȸ
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
 *  �ŷ�ó��ȸ
 */


public class FC_ACCT_1181_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_1181_LDataSet(){}
	public FC_ACCT_1181_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			FC_ACCT_1181_LCURLIST1Record rec = new FC_ACCT_1181_LCURLIST1Record();
			rec.clsf_cd = Util.checkString(rset0.getString("clsf_cd"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			rec.intg_cd = Util.checkString(rset0.getString("intg_cd"));
			rec.intg_nm = Util.checkString(rset0.getString("intg_nm"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.bizcond = Util.checkString(rset0.getString("bizcond"));
			rec.item = Util.checkString(rset0.getString("item"));
			rec.zip1 = Util.checkString(rset0.getString("zip1"));
			rec.zip2 = Util.checkString(rset0.getString("zip2"));
			rec.addr1 = Util.checkString(rset0.getString("addr1"));
			rec.addr2 = Util.checkString(rset0.getString("addr2"));
			rec.addr3 = Util.checkString(rset0.getString("addr3"));
			rec.addr4 = Util.checkString(rset0.getString("addr4"));
			rec.email = Util.checkString(rset0.getString("email"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_1181_LDataSet ds = (FC_ACCT_1181_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_1181_LCURLIST1Record curlist1Rec = (FC_ACCT_1181_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.clsf_cd%>
<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.cd_abrv_nm%>
<%= curlist1Rec.cdnm_cd%>
<%= curlist1Rec.cdabrvnm_cd%>
<%= curlist1Rec.intg_cd%>
<%= curlist1Rec.intg_nm%>
<%= curlist1Rec.presi_nm%>
<%= curlist1Rec.bizcond%>
<%= curlist1Rec.item%>
<%= curlist1Rec.zip1%>
<%= curlist1Rec.zip2%>
<%= curlist1Rec.addr1%>
<%= curlist1Rec.addr2%>
<%= curlist1Rec.addr3%>
<%= curlist1Rec.addr4%>
<%= curlist1Rec.email%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 22 17:26:11 KST 2010 */