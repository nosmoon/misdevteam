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


package chosun.ciis.pl.trn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.trn.dm.*;
import chosun.ciis.pl.trn.rec.*;

/**
 * 
 */


public class PL_TRN_1100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList wh_cdcur = new ArrayList();
	public ArrayList deal_ptcrcur = new ArrayList();
	public ArrayList medi_cdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_TRN_1100_MDataSet(){}
	public PL_TRN_1100_MDataSet(String errcode, String errmsg){
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

		ResultSet rset8 = (ResultSet) cstmt.getObject(5);
		while(rset8.next()){
			PL_TRN_1100_MMEDI_CDCURRecord rec = new PL_TRN_1100_MMEDI_CDCURRecord();
			rec.cd = Util.checkString(rset8.getString("cd"));
			rec.cdnm = Util.checkString(rset8.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset8.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset8.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset8.getString("cdabrvnm_cd"));
			this.medi_cdcur.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(6);
		while(rset9.next()){
			PL_TRN_1100_MWH_CDCURRecord rec = new PL_TRN_1100_MWH_CDCURRecord();
			rec.cd = Util.checkString(rset9.getString("cd"));
			rec.cdnm = Util.checkString(rset9.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset9.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset9.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset9.getString("cdabrvnm_cd"));
			this.wh_cdcur.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(7);
		while(rset10.next()){
			PL_TRN_1100_MDEAL_PTCRCURRecord rec = new PL_TRN_1100_MDEAL_PTCRCURRecord();
			rec.deal_dt = Util.checkString(rset10.getString("deal_dt"));
			rec.deal_grp_seq = Util.checkString(rset10.getString("deal_grp_seq"));
			rec.deal_seq = Util.checkString(rset10.getString("deal_seq"));
			rec.dlco_cd = Util.checkString(rset10.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset10.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset10.getString("dlco_nm"));
			rec.deal_qty = Util.checkString(rset10.getString("deal_qty"));
			rec.deal_uprc = Util.checkString(rset10.getString("deal_uprc"));
			rec.dcrate = Util.checkString(rset10.getString("dcrate"));
			rec.deal_amt = Util.checkString(rset10.getString("deal_amt"));
			rec.wh_cd = Util.checkString(rset10.getString("wh_cd"));
			rec.prv_deli_qty = Util.checkString(rset10.getString("prv_deli_qty"));
			rec.prv_widr_qty = Util.checkString(rset10.getString("prv_widr_qty"));
			rec.prv_retn_qty = Util.checkString(rset10.getString("prv_retn_qty"));
			rec.remk = Util.checkString(rset10.getString("remk"));
			this.deal_ptcrcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_TRN_1100_MDataSet ds = (PL_TRN_1100_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medi_cdcur.size(); i++){
		PL_TRN_1100_MMEDI_CDCURRecord medi_cdcurRec = (PL_TRN_1100_MMEDI_CDCURRecord)ds.medi_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.wh_cdcur.size(); i++){
		PL_TRN_1100_MWH_CDCURRecord wh_cdcurRec = (PL_TRN_1100_MWH_CDCURRecord)ds.wh_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.deal_ptcrcur.size(); i++){
		PL_TRN_1100_MDEAL_PTCRCURRecord deal_ptcrcurRec = (PL_TRN_1100_MDEAL_PTCRCURRecord)ds.deal_ptcrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_cdcur()%>
<%= ds.getWh_cdcur()%>
<%= ds.getDeal_ptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medi_cdcurRec.cd%>
<%= medi_cdcurRec.cdnm%>
<%= medi_cdcurRec.cd_abrv_nm%>
<%= medi_cdcurRec.cdnm_cd%>
<%= medi_cdcurRec.cdabrvnm_cd%>
<%= wh_cdcurRec.cd%>
<%= wh_cdcurRec.cdnm%>
<%= wh_cdcurRec.cd_abrv_nm%>
<%= wh_cdcurRec.cdnm_cd%>
<%= wh_cdcurRec.cdabrvnm_cd%>
<%= deal_ptcrcurRec.deal_dt%>
<%= deal_ptcrcurRec.deal_grp_seq%>
<%= deal_ptcrcurRec.deal_seq%>
<%= deal_ptcrcurRec.dlco_cd%>
<%= deal_ptcrcurRec.dlco_seq%>
<%= deal_ptcrcurRec.dlco_nm%>
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


/* 작성시간 : Wed Apr 01 16:59:58 KST 2009 */