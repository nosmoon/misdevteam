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


package chosun.ciis.ad.mg.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.mg.rec.AD_MG_1010_LCURLISTRecord;

/**
 * 
 */


public class AD_MG_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_MG_1010_LDataSet(){}
	public AD_MG_1010_LDataSet(String errcode, String errmsg){
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
			AD_MG_1010_LCURLISTRecord rec = new AD_MG_1010_LCURLISTRecord();
			rec.work_clsf = Util.checkString(rset0.getString("work_clsf"));
			rec.sub_cd = Util.checkString(rset0.getString("sub_cd"));
			rec.exec_no = Util.checkString(rset0.getString("exec_no"));
			rec.clos_dt = Util.checkString(rset0.getString("clos_dt"));
			rec.basi_dt = Util.checkString(rset0.getString("basi_dt"));
			rec.mang_frdt = Util.checkString(rset0.getString("mang_frdt"));
			rec.mang_todt = Util.checkString(rset0.getString("mang_todt"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.totz_yn = Util.checkString(rset0.getString("totz_yn"));
			rec.deposit_yn = Util.checkString(rset0.getString("deposit_yn"));
			rec.agn_eval_yn = Util.checkString(rset0.getString("agn_eval_yn"));
			rec.bo_eval_yn = Util.checkString(rset0.getString("bo_eval_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_MG_1010_LDataSet ds = (AD_MG_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_MG_1010_LCURLISTRecord curlistRec = (AD_MG_1010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.work_clsf%>
<%= curlistRec.sub_cd%>
<%= curlistRec.exec_no%>
<%= curlistRec.clos_dt%>
<%= curlistRec.basi_dt%>
<%= curlistRec.mang_frdt%>
<%= curlistRec.mang_todt%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.totz_yn%>
<%= curlistRec.deposit_yn%>
<%= curlistRec.agn_eval_yn%>
<%= curlistRec.bo_eval_yn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 13 15:52:57 KST 2009 */