/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_RCP_1010_LDataSet(){}
	public SE_RCP_1010_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SE_RCP_1010_LCURLISTRecord rec = new SE_RCP_1010_LCURLISTRecord();
			rec.cnfm_yn = Util.checkString(rset0.getString("cnfm_yn"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.chrg_flnm = Util.checkString(rset0.getString("chrg_flnm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.biz_reg_no = Util.checkString(rset0.getString("biz_reg_no"));
			rec.bank_id = Util.checkString(rset0.getString("bank_id"));
			rec.acct_num = Util.checkString(rset0.getString("acct_num"));
			rec.tran_date = Util.checkString(rset0.getString("tran_date"));
			rec.tran_date_seq = Util.checkString(rset0.getString("tran_date_seq"));
			rec.tran_time = Util.checkString(rset0.getString("tran_time"));
			rec.rcpm_pers = Util.checkString(rset0.getString("rcpm_pers"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.tran_amt = Util.checkString(rset0.getString("tran_amt"));
			rec.cntr_stat_nm = Util.checkString(rset0.getString("cntr_stat_nm"));
			rec.rcpm_cnfm_dt = Util.checkString(rset0.getString("rcpm_cnfm_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_RCP_1010_LDataSet ds = (SE_RCP_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_RCP_1010_LCURLISTRecord curlistRec = (SE_RCP_1010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cnfm_yn%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.chrg_flnm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.biz_reg_no%>
<%= curlistRec.bank_id%>
<%= curlistRec.acct_num%>
<%= curlistRec.tran_date%>
<%= curlistRec.tran_date_seq%>
<%= curlistRec.tran_time%>
<%= curlistRec.rcpm_pers%>
<%= curlistRec.acct_no%>
<%= curlistRec.tran_amt%>
<%= curlistRec.cntr_stat_nm%>
<%= curlistRec.rcpm_cnfm_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 12 17:43:31 KST 2009 */