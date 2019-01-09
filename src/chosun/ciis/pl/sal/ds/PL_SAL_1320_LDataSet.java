/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.sal.dm.*;
import chosun.ciis.pl.sal.rec.*;

/**
 * 
 */


public class PL_SAL_1320_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList deal_ptcrcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_SAL_1320_LDataSet(){}
	public PL_SAL_1320_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			PL_SAL_1320_LDEAL_PTCRCURRecord rec = new PL_SAL_1320_LDEAL_PTCRCURRecord();
			rec.deal_dt = Util.checkString(rset0.getString("deal_dt"));
			rec.deal_grp_seq = Util.checkString(rset0.getString("deal_grp_seq"));
			rec.deal_seq = Util.checkString(rset0.getString("deal_seq"));
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.send_plac_seq = Util.checkString(rset0.getString("send_plac_seq"));
			rec.send_plac_nm = Util.checkString(rset0.getString("send_plac_nm"));
			rec.deal_qty = Util.checkString(rset0.getString("deal_qty"));
			rec.deal_uprc = Util.checkString(rset0.getString("deal_uprc"));
			rec.dcrate = Util.checkString(rset0.getString("dcrate"));
			rec.deal_amt = Util.checkString(rset0.getString("deal_amt"));
			rec.sale_clsf = Util.checkString(rset0.getString("sale_clsf"));
			rec.sendclsf = Util.checkString(rset0.getString("sendclsf"));
			rec.wh_cd = Util.checkString(rset0.getString("wh_cd"));
			rec.sell_type = Util.checkString(rset0.getString("sell_type"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.deal_ptcrcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_SAL_1320_LDataSet ds = (PL_SAL_1320_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.deal_ptcrcur.size(); i++){
		PL_SAL_1320_LDEAL_PTCRCURRecord deal_ptcrcurRec = (PL_SAL_1320_LDEAL_PTCRCURRecord)ds.deal_ptcrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDeal_ptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= deal_ptcrcurRec.deal_dt%>
<%= deal_ptcrcurRec.deal_grp_seq%>
<%= deal_ptcrcurRec.deal_seq%>
<%= deal_ptcrcurRec.medi_clsf%>
<%= deal_ptcrcurRec.dlco_cd%>
<%= deal_ptcrcurRec.dlco_seq%>
<%= deal_ptcrcurRec.dlco_nm%>
<%= deal_ptcrcurRec.send_plac_seq%>
<%= deal_ptcrcurRec.send_plac_nm%>
<%= deal_ptcrcurRec.deal_qty%>
<%= deal_ptcrcurRec.deal_uprc%>
<%= deal_ptcrcurRec.dcrate%>
<%= deal_ptcrcurRec.deal_amt%>
<%= deal_ptcrcurRec.sale_clsf%>
<%= deal_ptcrcurRec.sendclsf%>
<%= deal_ptcrcurRec.wh_cd%>
<%= deal_ptcrcurRec.sell_type%>
<%= deal_ptcrcurRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 27 15:12:20 KST 2009 */