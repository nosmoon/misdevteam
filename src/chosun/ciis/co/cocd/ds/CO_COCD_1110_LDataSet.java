/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2007-05-22
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.co.cocd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.rec.*;

/**
 * 
 */


public class CO_COCD_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList commcdcur1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_COCD_1110_LDataSet(){}
	public CO_COCD_1110_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			CO_COCD_1110_LCOMMCDCUR1Record rec = new CO_COCD_1110_LCOMMCDCUR1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.chg_seq = Util.checkString(rset0.getString("chg_seq"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.mang_cd_1 = Util.checkString(rset0.getString("mang_cd_1"));
			rec.mang_cd_2 = Util.checkString(rset0.getString("mang_cd_2"));
			rec.mang_cd_3 = Util.checkString(rset0.getString("mang_cd_3"));
			rec.mang_cd_4 = Util.checkString(rset0.getString("mang_cd_4"));
			rec.mang_cd_5 = Util.checkString(rset0.getString("mang_cd_5"));
			rec.mang_cd_6 = Util.checkString(rset0.getString("mang_cd_6"));
			rec.mang_cd_7 = Util.checkString(rset0.getString("mang_cd_7"));
			rec.mang_cd_8 = Util.checkString(rset0.getString("mang_cd_8"));
			rec.mang_cd_9 = Util.checkString(rset0.getString("mang_cd_9"));
			rec.mang_cd_10 = Util.checkString(rset0.getString("mang_cd_10"));
			rec.mang_cd_11 = Util.checkString(rset0.getString("mang_cd_11"));
			rec.mang_cd_12 = Util.checkString(rset0.getString("mang_cd_12"));
			rec.tbl_nm = Util.checkString(rset0.getString("tbl_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.upd_yn = Util.checkString(rset0.getString("upd_yn"));
			rec.incmg_pers_ip = Util.checkString(rset0.getString("incmg_pers_ip"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.chg_incmg_pers = Util.checkString(rset0.getString("chg_incmg_pers"));
			rec.chg_incmg_dt_tm = Util.checkString(rset0.getString("chg_incmg_dt_tm"));
			this.commcdcur1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	CO_COCD_1110_LDataSet ds = (CO_COCD_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.commcdcur1.size(); i++){
		CO_COCD_1110_LCOMMCDCUR1Record commcdcur1Rec = (CO_COCD_1110_LCOMMCDCUR1Record)ds.commcdcur1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCommcdcur1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= commcdcur1Rec.cd%>
<%= commcdcur1Rec.chg_seq%>
<%= commcdcur1Rec.use_yn%>
<%= commcdcur1Rec.cdnm%>
<%= commcdcur1Rec.cd_abrv_nm%>
<%= commcdcur1Rec.mang_cd_1%>
<%= commcdcur1Rec.mang_cd_2%>
<%= commcdcur1Rec.mang_cd_3%>
<%= commcdcur1Rec.mang_cd_4%>
<%= commcdcur1Rec.mang_cd_5%>
<%= commcdcur1Rec.mang_cd_6%>
<%= commcdcur1Rec.mang_cd_7%>
<%= commcdcur1Rec.mang_cd_8%>
<%= commcdcur1Rec.mang_cd_9%>
<%= commcdcur1Rec.mang_cd_10%>
<%= commcdcur1Rec.mang_cd_11%>
<%= commcdcur1Rec.mang_cd_12%>
<%= commcdcur1Rec.tbl_nm%>
<%= commcdcur1Rec.remk%>
<%= commcdcur1Rec.upd_yn%>
<%= commcdcur1Rec.incmg_pers_ip%>
<%= commcdcur1Rec.incmg_pers%>
<%= commcdcur1Rec.incmg_dt_tm%>
<%= commcdcur1Rec.chg_pers%>
<%= commcdcur1Rec.chg_dt_tm%>
<%= commcdcur1Rec.chg_incmg_pers%>
<%= commcdcur1Rec.chg_incmg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 10 20:15:50 KST 2009 */