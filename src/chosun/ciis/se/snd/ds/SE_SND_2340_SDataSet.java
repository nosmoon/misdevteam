/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2340_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2340_SDataSet(){}
	public SE_SND_2340_SDataSet(String errcode, String errmsg){
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

		ResultSet rset5 = (ResultSet) cstmt.getObject(6);
		while(rset5.next()){
			SE_SND_2340_SCURLISTRecord rec = new SE_SND_2340_SCURLISTRecord();
			rec.dlco_no = Util.checkString(rset5.getString("dlco_no"));
			rec.zip = Util.checkString(rset5.getString("zip"));
			rec.addr = Util.checkString(rset5.getString("addr"));
			rec.dtls_addr = Util.checkString(rset5.getString("dtls_addr"));
			rec.tel_no = Util.checkString(rset5.getString("tel_no"));
			rec.natn_tel_no = Util.checkString(rset5.getString("natn_tel_no"));
			rec.corp_clsf = Util.checkString(rset5.getString("corp_clsf"));
			rec.setl_bank = Util.checkString(rset5.getString("setl_bank"));
			rec.acct_no = Util.checkString(rset5.getString("acct_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_2340_SDataSet ds = (SE_SND_2340_SDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2340_SCURLISTRecord curlistRec = (SE_SND_2340_SCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_no%>
<%= curlistRec.zip%>
<%= curlistRec.addr%>
<%= curlistRec.dtls_addr%>
<%= curlistRec.tel_no%>
<%= curlistRec.natn_tel_no%>
<%= curlistRec.corp_clsf%>
<%= curlistRec.setl_bank%>
<%= curlistRec.acct_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Aug 18 20:01:13 KST 2009 */