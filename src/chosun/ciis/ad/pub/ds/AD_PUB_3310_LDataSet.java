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


package chosun.ciis.ad.pub.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_3310_LDataSet(){}
	public AD_PUB_3310_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			AD_PUB_3310_LCURLISTRecord rec = new AD_PUB_3310_LCURLISTRecord();
			rec.podr_yn = Util.checkString(rset0.getString("podr_yn"));
			rec.exct_yn = Util.checkString(rset0.getString("exct_yn"));
			rec.podr_ym = Util.checkString(rset0.getString("podr_ym"));
			rec.podr_clsf = Util.checkString(rset0.getString("podr_clsf"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.spl_dlco = Util.checkString(rset0.getString("spl_dlco"));
			rec.brnd_nm = Util.checkString(rset0.getString("brnd_nm"));
			rec.item_nm = Util.checkString(rset0.getString("item_nm"));
			rec.podr_cnt = Util.checkString(rset0.getString("podr_cnt"));
			rec.podr_uprc = Util.checkString(rset0.getString("podr_uprc"));
			rec.podr_amt = Util.checkString(rset0.getString("podr_amt"));
			rec.exct_tot_cnt = Util.checkString(rset0.getString("exct_tot_cnt"));
			rec.exct_cnt2 = Util.checkString(rset0.getString("exct_cnt2"));
			rec.exct_cnt1 = Util.checkString(rset0.getString("exct_cnt1"));
			rec.exct_cnt = Util.checkString(rset0.getString("exct_cnt"));
			rec.exct_uprc = Util.checkString(rset0.getString("exct_uprc"));
			rec.exct_amt = Util.checkString(rset0.getString("exct_amt"));
			rec.ccon_fee = Util.checkString(rset0.getString("ccon_fee"));
			rec.medi_fee = Util.checkString(rset0.getString("medi_fee"));
			rec.m_amt = Util.checkString(rset0.getString("m_amt"));
			rec.easy_amt = Util.checkString(rset0.getString("easy_amt"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.occr_seq = Util.checkString(rset0.getString("occr_seq"));
			rec.incmg_pers_nm = Util.checkString(rset0.getString("incmg_pers_nm"));
			rec.podr_slip_no = Util.checkString(rset0.getString("podr_slip_no"));
			rec.exct_slip_no = Util.checkString(rset0.getString("exct_slip_no"));
			rec.status = Util.checkString(rset0.getString("status"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_PUB_3310_LDataSet ds = (AD_PUB_3310_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_3310_LCURLISTRecord curlistRec = (AD_PUB_3310_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.podr_yn%>
<%= curlistRec.exct_yn%>
<%= curlistRec.podr_ym%>
<%= curlistRec.podr_clsf%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.spl_dlco%>
<%= curlistRec.brnd_nm%>
<%= curlistRec.item_nm%>
<%= curlistRec.podr_cnt%>
<%= curlistRec.podr_uprc%>
<%= curlistRec.podr_amt%>
<%= curlistRec.exct_tot_cnt%>
<%= curlistRec.exct_cnt2%>
<%= curlistRec.exct_cnt1%>
<%= curlistRec.exct_cnt%>
<%= curlistRec.exct_uprc%>
<%= curlistRec.exct_amt%>
<%= curlistRec.ccon_fee%>
<%= curlistRec.medi_fee%>
<%= curlistRec.m_amt%>
<%= curlistRec.easy_amt%>
<%= curlistRec.occr_dt%>
<%= curlistRec.occr_seq%>
<%= curlistRec.incmg_pers_nm%>
<%= curlistRec.podr_slip_no%>
<%= curlistRec.exct_slip_no%>
<%= curlistRec.status%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Sep 12 14:40:30 KST 2016 */