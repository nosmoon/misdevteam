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


package chosun.ciis.en.innexp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_1502_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_INNEXP_1502_LDataSet(){}
	public EN_INNEXP_1502_LDataSet(String errcode, String errmsg){
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
			EN_INNEXP_1502_LCURLISTRecord rec = new EN_INNEXP_1502_LCURLISTRecord();
			rec.occr_no = Util.checkString(rset0.getString("occr_no"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.dr_budg_cd = Util.checkString(rset0.getString("dr_budg_cd"));
			rec.dr_budg_nm = Util.checkString(rset0.getString("dr_budg_nm"));
			rec.dr_amt = Util.checkString(rset0.getString("dr_amt"));
			rec.cr_budg_cd = Util.checkString(rset0.getString("cr_budg_cd"));
			rec.cr_budg_nm = Util.checkString(rset0.getString("cr_budg_nm"));
			rec.cr_amt = Util.checkString(rset0.getString("cr_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	EN_INNEXP_1502_LDataSet ds = (EN_INNEXP_1502_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		EN_INNEXP_1502_LCURLISTRecord curlistRec = (EN_INNEXP_1502_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.occr_no%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.titl%>
<%= curlistRec.dr_budg_cd%>
<%= curlistRec.dr_budg_nm%>
<%= curlistRec.dr_amt%>
<%= curlistRec.cr_budg_cd%>
<%= curlistRec.cr_budg_nm%>
<%= curlistRec.cr_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 24 09:48:07 KST 2009 */