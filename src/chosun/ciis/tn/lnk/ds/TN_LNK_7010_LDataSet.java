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


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_7010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_LNK_7010_LDataSet(){}
	public TN_LNK_7010_LDataSet(String errcode, String errmsg){
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
			TN_LNK_7010_LCURLISTRecord rec = new TN_LNK_7010_LCURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.subs_fld = Util.checkString(rset0.getString("subs_fld"));
			rec.subm_dt = Util.checkString(rset0.getString("subm_dt"));
			rec.subs_cd = Util.checkString(rset0.getString("subs_cd"));
			rec.work_nm = Util.checkString(rset0.getString("work_nm"));
			rec.char_nm = Util.checkString(rset0.getString("char_nm"));
			rec.char_email = Util.checkString(rset0.getString("char_email"));
			rec.char_tel = Util.checkString(rset0.getString("char_tel"));
			rec.char_hp = Util.checkString(rset0.getString("char_hp"));
			rec.subs_work_nm = Util.checkString(rset0.getString("subs_work_nm"));
			rec.work_cont = Util.checkString(rset0.getString("work_cont"));
			rec.tot_budget = Util.checkString(rset0.getString("tot_budget"));
			rec.myself_amt = Util.checkString(rset0.getString("myself_amt"));
			rec.attch_nm = Util.checkString(rset0.getString("attch_nm"));
			rec.attch_url = Util.checkString(rset0.getString("attch_url"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_LNK_7010_LDataSet ds = (TN_LNK_7010_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_7010_LCURLISTRecord curlistRec = (TN_LNK_7010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.seq%>
<%= curlistRec.subs_fld%>
<%= curlistRec.subm_dt%>
<%= curlistRec.subs_cd%>
<%= curlistRec.work_nm%>
<%= curlistRec.char_nm%>
<%= curlistRec.char_email%>
<%= curlistRec.char_tel%>
<%= curlistRec.char_hp%>
<%= curlistRec.subs_work_nm%>
<%= curlistRec.work_cont%>
<%= curlistRec.tot_budget%>
<%= curlistRec.myself_amt%>
<%= curlistRec.attch_nm%>
<%= curlistRec.attch_url%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 17 16:27:00 KST 2017 */