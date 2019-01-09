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


public class PL_SAL_1020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList deli_ptcrcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String basi_yymm;
	public String basi_dt;
	public String ewh_qty;
	public String deli_qty;
	public String stok_qty;

	public PL_SAL_1020_LDataSet(){}
	public PL_SAL_1020_LDataSet(String errcode, String errmsg, String basi_yymm, String basi_dt, String ewh_qty, String deli_qty, String stok_qty){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.basi_yymm = basi_yymm;
		this.basi_dt = basi_dt;
		this.ewh_qty = ewh_qty;
		this.deli_qty = deli_qty;
		this.stok_qty = stok_qty;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setEwh_qty(String ewh_qty){
		this.ewh_qty = ewh_qty;
	}

	public void setDeli_qty(String deli_qty){
		this.deli_qty = deli_qty;
	}

	public void setStok_qty(String stok_qty){
		this.stok_qty = stok_qty;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getEwh_qty(){
		return this.ewh_qty;
	}

	public String getDeli_qty(){
		return this.deli_qty;
	}

	public String getStok_qty(){
		return this.stok_qty;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.basi_yymm = Util.checkString(cstmt.getString(7));
		this.basi_dt = Util.checkString(cstmt.getString(8));
		this.ewh_qty = Util.checkString(cstmt.getString(9));
		this.deli_qty = Util.checkString(cstmt.getString(10));
		this.stok_qty = Util.checkString(cstmt.getString(11));
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			PL_SAL_1020_LDELI_PTCRCURRecord rec = new PL_SAL_1020_LDELI_PTCRCURRecord();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset0.getString("medi_ser_no"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset0.getString("dlco_abrv_nm"));
			rec.send_plac_seq = Util.checkString(rset0.getString("send_plac_seq"));
			rec.send_plac_nm = Util.checkString(rset0.getString("send_plac_nm"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.dlco_clsf_nm = Util.checkString(rset0.getString("dlco_clsf_nm"));
			rec.sale_clsf = Util.checkString(rset0.getString("sale_clsf"));
			rec.sale_clsf_nm = Util.checkString(rset0.getString("sale_clsf_nm"));
			rec.sendclsf = Util.checkString(rset0.getString("sendclsf"));
			rec.sendclsf_nm = Util.checkString(rset0.getString("sendclsf_nm"));
			rec.sell_type = Util.checkString(rset0.getString("sell_type"));
			rec.sell_type_nm = Util.checkString(rset0.getString("sell_type_nm"));
			rec.wh_cd = Util.checkString(rset0.getString("wh_cd"));
			rec.wh_cd_nm = Util.checkString(rset0.getString("wh_cd_nm"));
			rec.deal_uprc = Util.checkString(rset0.getString("deal_uprc"));
			rec.dcrate = Util.checkString(rset0.getString("dcrate"));
			rec.deal_qty = Util.checkString(rset0.getString("deal_qty"));
			rec.deal_amt = Util.checkString(rset0.getString("deal_amt"));
			rec.deal_dt = Util.checkString(rset0.getString("deal_dt"));
			rec.deal_grp_seq = Util.checkString(rset0.getString("deal_grp_seq"));
			rec.deal_seq = Util.checkString(rset0.getString("deal_seq"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.deli_ptcrcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_SAL_1020_LDataSet ds = (PL_SAL_1020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.deli_ptcrcur.size(); i++){
		PL_SAL_1020_LDELI_PTCRCURRecord deli_ptcrcurRec = (PL_SAL_1020_LDELI_PTCRCURRecord)ds.deli_ptcrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBasi_yymm()%>
<%= ds.getBasi_dt()%>
<%= ds.getEwh_qty()%>
<%= ds.getDeli_qty()%>
<%= ds.getStok_qty()%>
<%= ds.getDeli_ptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= deli_ptcrcurRec.medi_cd%>
<%= deli_ptcrcurRec.medi_ser_no%>
<%= deli_ptcrcurRec.dlco_cd%>
<%= deli_ptcrcurRec.dlco_seq%>
<%= deli_ptcrcurRec.dlco_nm%>
<%= deli_ptcrcurRec.dlco_abrv_nm%>
<%= deli_ptcrcurRec.send_plac_seq%>
<%= deli_ptcrcurRec.send_plac_nm%>
<%= deli_ptcrcurRec.dlco_clsf%>
<%= deli_ptcrcurRec.dlco_clsf_nm%>
<%= deli_ptcrcurRec.sale_clsf%>
<%= deli_ptcrcurRec.sale_clsf_nm%>
<%= deli_ptcrcurRec.sendclsf%>
<%= deli_ptcrcurRec.sendclsf_nm%>
<%= deli_ptcrcurRec.sell_type%>
<%= deli_ptcrcurRec.sell_type_nm%>
<%= deli_ptcrcurRec.wh_cd%>
<%= deli_ptcrcurRec.wh_cd_nm%>
<%= deli_ptcrcurRec.deal_uprc%>
<%= deli_ptcrcurRec.dcrate%>
<%= deli_ptcrcurRec.deal_qty%>
<%= deli_ptcrcurRec.deal_amt%>
<%= deli_ptcrcurRec.deal_dt%>
<%= deli_ptcrcurRec.deal_grp_seq%>
<%= deli_ptcrcurRec.deal_seq%>
<%= deli_ptcrcurRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 18 21:28:32 KST 2009 */