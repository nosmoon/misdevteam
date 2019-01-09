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


package chosun.ciis.pl.rtn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.rtn.dm.*;
import chosun.ciis.pl.rtn.rec.*;

/**
 * 
 */


public class PL_RTN_1030_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList deal_ptcrcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_RTN_1030_LDataSet(){}
	public PL_RTN_1030_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			PL_RTN_1030_LDEAL_PTCRCURRecord rec = new PL_RTN_1030_LDEAL_PTCRCURRecord();
			rec.deal_dt = Util.checkString(rset0.getString("deal_dt"));
			rec.deal_grp_seq = Util.checkString(rset0.getString("deal_grp_seq"));
			rec.deal_seq = Util.checkString(rset0.getString("deal_seq"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset0.getString("medi_ser_no"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.deal_qty = Util.checkString(rset0.getString("deal_qty"));
			rec.deal_uprc = Util.checkString(rset0.getString("deal_uprc"));
			rec.dcrate = Util.checkString(rset0.getString("dcrate"));
			rec.deal_amt = Util.checkString(rset0.getString("deal_amt"));
			rec.wh_cd = Util.checkString(rset0.getString("wh_cd"));
			rec.prv_deli_qty = Util.checkString(rset0.getString("prv_deli_qty"));
			rec.prv_widr_qty = Util.checkString(rset0.getString("prv_widr_qty"));
			rec.prv_retn_qty = Util.checkString(rset0.getString("prv_retn_qty"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.deal_ptcrcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_RTN_1030_LDataSet ds = (PL_RTN_1030_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.deal_ptcrcur.size(); i++){
		PL_RTN_1030_LDEAL_PTCRCURRecord deal_ptcrcurRec = (PL_RTN_1030_LDEAL_PTCRCURRecord)ds.deal_ptcrcur.get(i);%>
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
<%= deal_ptcrcurRec.medi_cd%>
<%= deal_ptcrcurRec.medi_ser_no%>
<%= deal_ptcrcurRec.medi_nm%>
<%= deal_ptcrcurRec.deal_qty%>
<%= deal_ptcrcurRec.deal_uprc%>
<%= deal_ptcrcurRec.dcrate%>
<%= deal_ptcrcurRec.deal_amt%>
<%= deal_ptcrcurRec.wh_cd%>
<%= deal_ptcrcurRec.prv_deli_qty%>
<%= deal_ptcrcurRec.prv_widr_qty%>
<%= deal_ptcrcurRec.prv_retn_qty%>
<%= deal_ptcrcurRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 30 21:18:29 KST 2009 */