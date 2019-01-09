/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
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


public class AD_PUB_3510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_3510_LDataSet(){}
	public AD_PUB_3510_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			AD_PUB_3510_LCURLISTRecord rec = new AD_PUB_3510_LCURLISTRecord();
			rec.podr_dt = Util.checkString(rset0.getString("podr_dt"));
			rec.podr_slip_no = Util.checkString(rset0.getString("podr_slip_no"));
			rec.occr_arow = Util.checkString(rset0.getString("occr_arow"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.spl_dlco = Util.checkString(rset0.getString("spl_dlco"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.brnd_cd = Util.checkString(rset0.getString("brnd_cd"));
			rec.item_nm = Util.checkString(rset0.getString("item_nm"));
			rec.podr_uprc = Util.checkString(rset0.getString("podr_uprc"));
			rec.uprc_fee = Util.checkString(rset0.getString("uprc_fee"));
			rec.podr_cnt = Util.checkString(rset0.getString("podr_cnt"));
			rec.podr_amt = Util.checkString(rset0.getString("podr_amt"));
			rec.misu_amt = Util.checkString(rset0.getString("misu_amt"));
			rec.mms_uprc = Util.checkString(rset0.getString("mms_uprc"));
			rec.mms_cnt = Util.checkString(rset0.getString("mms_cnt"));
			rec.mms_fee = Util.checkString(rset0.getString("mms_fee"));
			rec.expct_amt = Util.checkString(rset0.getString("expct_amt"));
			rec.exct_yn = Util.checkString(rset0.getString("exct_yn"));
			rec.sale_stmt_issu_yn = Util.checkString(rset0.getString("sale_stmt_issu_yn"));
			rec.exct_dt = Util.checkString(rset0.getString("exct_dt"));
			rec.exct_uprc = Util.checkString(rset0.getString("exct_uprc"));
			rec.exct_cnt = Util.checkString(rset0.getString("exct_cnt"));
			rec.exct_amt = Util.checkString(rset0.getString("exct_amt"));
			rec.fee_rate = Util.checkString(rset0.getString("fee_rate"));
			rec.tot_fee = Util.checkString(rset0.getString("tot_fee"));
			rec.m_amt = Util.checkString(rset0.getString("m_amt"));
			rec.easy_amt = Util.checkString(rset0.getString("easy_amt"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			rec.mchrg_pers = Util.checkString(rset0.getString("mchrg_pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_3510_LDataSet ds = (AD_PUB_3510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_3510_LCURLISTRecord curlistRec = (AD_PUB_3510_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.podr_dt%>
<%= curlistRec.podr_slip_no%>
<%= curlistRec.occr_arow%>
<%= curlistRec.medi_cd%>
<%= curlistRec.spl_dlco%>
<%= curlistRec.dlco_no%>
<%= curlistRec.brnd_cd%>
<%= curlistRec.item_nm%>
<%= curlistRec.podr_uprc%>
<%= curlistRec.uprc_fee%>
<%= curlistRec.podr_cnt%>
<%= curlistRec.podr_amt%>
<%= curlistRec.misu_amt%>
<%= curlistRec.mms_uprc%>
<%= curlistRec.mms_cnt%>
<%= curlistRec.mms_fee%>
<%= curlistRec.expct_amt%>
<%= curlistRec.exct_yn%>
<%= curlistRec.sale_stmt_issu_yn%>
<%= curlistRec.exct_dt%>
<%= curlistRec.exct_uprc%>
<%= curlistRec.exct_cnt%>
<%= curlistRec.exct_amt%>
<%= curlistRec.fee_rate%>
<%= curlistRec.tot_fee%>
<%= curlistRec.m_amt%>
<%= curlistRec.easy_amt%>
<%= curlistRec.sale_amt%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.mchrg_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 19:34:19 KST 2015 */