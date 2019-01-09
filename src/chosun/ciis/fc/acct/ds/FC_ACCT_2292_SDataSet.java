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


public class FC_ACCT_2292_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_budgmangcd_list = new ArrayList();
	public ArrayList cur_dlco_clsf_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2292_SDataSet(){}
	public FC_ACCT_2292_SDataSet(String errcode, String errmsg){
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
			FC_ACCT_2292_SCUR_DLCO_CLSF_LISTRecord rec = new FC_ACCT_2292_SCUR_DLCO_CLSF_LISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.cur_dlco_clsf_list.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_2292_SCUR_BUDGMANGCD_LISTRecord rec = new FC_ACCT_2292_SCUR_BUDGMANGCD_LISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.cur_budgmangcd_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2292_SDataSet ds = (FC_ACCT_2292_SDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.cur_dlco_clsf_list.size(); i++){
		FC_ACCT_2292_SCUR_DLCO_CLSF_LISTRecord cur_dlco_clsf_listRec = (FC_ACCT_2292_SCUR_DLCO_CLSF_LISTRecord)ds.cur_dlco_clsf_list.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.cur_budgmangcd_list.size(); i++){
		FC_ACCT_2292_SCUR_BUDGMANGCD_LISTRecord cur_budgmangcd_listRec = (FC_ACCT_2292_SCUR_BUDGMANGCD_LISTRecord)ds.cur_budgmangcd_list.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_dlco_clsf_list()%>
<%= ds.getCur_budgmangcd_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= cur_dlco_clsf_listRec.cd%>
<%= cur_dlco_clsf_listRec.cdnm%>
<%= cur_dlco_clsf_listRec.cd_abrv_nm%>
<%= cur_dlco_clsf_listRec.cdnm_cd%>
<%= cur_dlco_clsf_listRec.cdabrvnm_cd%>
<%= cur_budgmangcd_listRec.cd%>
<%= cur_budgmangcd_listRec.cdnm%>
<%= cur_budgmangcd_listRec.cd_abrv_nm%>
<%= cur_budgmangcd_listRec.cdnm_cd%>
<%= cur_budgmangcd_listRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 22 19:52:04 KST 2009 */