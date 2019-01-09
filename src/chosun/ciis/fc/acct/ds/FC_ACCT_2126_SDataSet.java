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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2126_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_mang_item_cd_list = new ArrayList();
	public ArrayList cur_mang_item_cd_list1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2126_SDataSet(){}
	public FC_ACCT_2126_SDataSet(String errcode, String errmsg){
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
			FC_ACCT_2126_SCUR_MANG_ITEM_CD_LISTRecord rec = new FC_ACCT_2126_SCUR_MANG_ITEM_CD_LISTRecord();
			rec.mang_item_cd = Util.checkString(rset0.getString("mang_item_cd"));
			rec.drcr_clsf = Util.checkString(rset0.getString("drcr_clsf"));
			rec.mang_item_val = Util.checkString(rset0.getString("mang_item_val"));
			this.cur_mang_item_cd_list.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_2126_SCUR_MANG_ITEM_CD_LIST1Record rec = new FC_ACCT_2126_SCUR_MANG_ITEM_CD_LIST1Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.cur_mang_item_cd_list1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2126_SDataSet ds = (FC_ACCT_2126_SDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.cur_mang_item_cd_list.size(); i++){
		FC_ACCT_2126_SCUR_MANG_ITEM_CD_LISTRecord cur_mang_item_cd_listRec = (FC_ACCT_2126_SCUR_MANG_ITEM_CD_LISTRecord)ds.cur_mang_item_cd_list.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.cur_mang_item_cd_list1.size(); i++){
		FC_ACCT_2126_SCUR_MANG_ITEM_CD_LIST1Record cur_mang_item_cd_list1Rec = (FC_ACCT_2126_SCUR_MANG_ITEM_CD_LIST1Record)ds.cur_mang_item_cd_list1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_mang_item_cd_list()%>
<%= ds.getCur_mang_item_cd_list1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= cur_mang_item_cd_listRec.mang_item_cd%>
<%= cur_mang_item_cd_listRec.drcr_clsf%>
<%= cur_mang_item_cd_listRec.mang_item_val%>
<%= cur_mang_item_cd_list1Rec.cd%>
<%= cur_mang_item_cd_list1Rec.cdnm%>
<%= cur_mang_item_cd_list1Rec.cd_abrv_nm%>
<%= cur_mang_item_cd_list1Rec.cdnm_cd%>
<%= cur_mang_item_cd_list1Rec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Aug 29 16:53:47 KST 2009 */