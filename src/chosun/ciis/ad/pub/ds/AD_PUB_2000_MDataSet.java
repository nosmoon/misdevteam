/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ��ȣ��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ad.pub.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.pub.rec.AD_PUB_2000_MCURLIST2Record;
import chosun.ciis.ad.pub.rec.AD_PUB_2000_MCURLIST3Record;
import chosun.ciis.ad.pub.rec.AD_PUB_2000_MCURLISTRecord;

/**
 * 
 */


public class AD_PUB_2000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_2000_MDataSet(){}
	public AD_PUB_2000_MDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AD_PUB_2000_MCURLISTRecord rec = new AD_PUB_2000_MCURLISTRecord();
			rec.acct_id = Util.checkString(rset0.getString("acct_id"));
			rec.acct_nm = Util.checkString(rset0.getString("acct_nm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			AD_PUB_2000_MCURLIST2Record rec = new AD_PUB_2000_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset1.getString("mang_cd_1"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			AD_PUB_2000_MCURLIST3Record rec = new AD_PUB_2000_MCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset2.getString("mang_cd_1"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_PUB_2000_MDataSet ds = (AD_PUB_2000_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_2000_MCURLISTRecord curlistRec = (AD_PUB_2000_MCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_PUB_2000_MCURLIST2Record curlist2Rec = (AD_PUB_2000_MCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_PUB_2000_MCURLIST3Record curlist3Rec = (AD_PUB_2000_MCURLIST3Record)ds.curlist3.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.acct_id%>
<%= curlistRec.acct_nm%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.mang_cd_1%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist3Rec.mang_cd_1%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 24 17:40:31 KST 2009 */