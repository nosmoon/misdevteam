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


package chosun.ciis.pl.ass.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.ass.dm.*;
import chosun.ciis.pl.ass.rec.*;

/**
 * 
 */


public class PL_ASS_1020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList asin_plancur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String ref_ser_no_1;
	public String ref_ser_no_2;
	public String basi_bgn_ser_no;
	public String basi_end_ser_no;
	public String prd;
	public String remk;
	public String ewh_qty;
	public String deli_qty;
	public String stok_qty;

	public PL_ASS_1020_LDataSet(){}
	public PL_ASS_1020_LDataSet(String errcode, String errmsg, String ref_ser_no_1, String ref_ser_no_2, String basi_bgn_ser_no, String basi_end_ser_no, String prd, String remk, String ewh_qty, String deli_qty, String stok_qty){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.ref_ser_no_1 = ref_ser_no_1;
		this.ref_ser_no_2 = ref_ser_no_2;
		this.basi_bgn_ser_no = basi_bgn_ser_no;
		this.basi_end_ser_no = basi_end_ser_no;
		this.prd = prd;
		this.remk = remk;
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

	public void setRef_ser_no_1(String ref_ser_no_1){
		this.ref_ser_no_1 = ref_ser_no_1;
	}

	public void setRef_ser_no_2(String ref_ser_no_2){
		this.ref_ser_no_2 = ref_ser_no_2;
	}

	public void setBasi_bgn_ser_no(String basi_bgn_ser_no){
		this.basi_bgn_ser_no = basi_bgn_ser_no;
	}

	public void setBasi_end_ser_no(String basi_end_ser_no){
		this.basi_end_ser_no = basi_end_ser_no;
	}

	public void setPrd(String prd){
		this.prd = prd;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getRef_ser_no_1(){
		return this.ref_ser_no_1;
	}

	public String getRef_ser_no_2(){
		return this.ref_ser_no_2;
	}

	public String getBasi_bgn_ser_no(){
		return this.basi_bgn_ser_no;
	}

	public String getBasi_end_ser_no(){
		return this.basi_end_ser_no;
	}

	public String getPrd(){
		return this.prd;
	}

	public String getRemk(){
		return this.remk;
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
		this.ref_ser_no_1 = Util.checkString(cstmt.getString(7));
		this.ref_ser_no_2 = Util.checkString(cstmt.getString(8));
		this.basi_bgn_ser_no = Util.checkString(cstmt.getString(9));
		this.basi_end_ser_no = Util.checkString(cstmt.getString(10));
		this.prd = Util.checkString(cstmt.getString(11));
		this.remk = Util.checkString(cstmt.getString(12));
		this.ewh_qty = Util.checkString(cstmt.getString(13));
		this.deli_qty = Util.checkString(cstmt.getString(14));
		this.stok_qty = Util.checkString(cstmt.getString(15));
		ResultSet rset17 = (ResultSet) cstmt.getObject(16);
		while(rset17.next()){
			PL_ASS_1020_LASIN_PLANCURRecord rec = new PL_ASS_1020_LASIN_PLANCURRecord();
			rec.dlco_clsf = Util.checkString(rset17.getString("dlco_clsf"));
			rec.dlco_clsf_nm = Util.checkString(rset17.getString("dlco_clsf_nm"));
			rec.dlco_cd = Util.checkString(rset17.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset17.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset17.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset17.getString("dlco_abrv_nm"));
			rec.send_plac_seq = Util.checkString(rset17.getString("send_plac_seq"));
			rec.send_plac_nm = Util.checkString(rset17.getString("send_plac_nm"));
			rec.sale_clsf = Util.checkString(rset17.getString("sale_clsf"));
			rec.sendclsf = Util.checkString(rset17.getString("sendclsf"));
			rec.wh_cd = Util.checkString(rset17.getString("wh_cd"));
			rec.sell_type = Util.checkString(rset17.getString("sell_type"));
			rec.dcrate = Util.checkString(rset17.getString("dcrate"));
			rec.asin_qty = Util.checkString(rset17.getString("asin_qty"));
			rec.appndx_1 = Util.checkString(rset17.getString("appndx_1"));
			rec.appndx_2 = Util.checkString(rset17.getString("appndx_2"));
			rec.appndx_3 = Util.checkString(rset17.getString("appndx_3"));
			rec.bef_ser_no_asin_qty = Util.checkString(rset17.getString("bef_ser_no_asin_qty"));
			rec.ref_deli_qty_1 = Util.checkString(rset17.getString("ref_deli_qty_1"));
			rec.ref_sell_qty_1 = Util.checkString(rset17.getString("ref_sell_qty_1"));
			rec.ref_deli_qty_2 = Util.checkString(rset17.getString("ref_deli_qty_2"));
			rec.ref_sell_qty_2 = Util.checkString(rset17.getString("ref_sell_qty_2"));
			rec.calc_qty = Util.checkString(rset17.getString("calc_qty"));
			rec.avg_sell_qty = Util.checkString(rset17.getString("avg_sell_qty"));
			rec.ocpy_rate = Util.checkString(rset17.getString("ocpy_rate"));
			rec.tot_deli_qty = Util.checkString(rset17.getString("tot_deli_qty"));
			rec.avg_deli_qty = Util.checkString(rset17.getString("avg_deli_qty"));
			rec.tot_sell_qty = Util.checkString(rset17.getString("tot_sell_qty"));
			rec.tot_rtgqty = Util.checkString(rset17.getString("tot_rtgqty"));
			rec.remk = Util.checkString(rset17.getString("remk"));
			this.asin_plancur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_ASS_1020_LDataSet ds = (PL_ASS_1020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.asin_plancur.size(); i++){
		PL_ASS_1020_LASIN_PLANCURRecord asin_plancurRec = (PL_ASS_1020_LASIN_PLANCURRecord)ds.asin_plancur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRef_ser_no_1()%>
<%= ds.getRef_ser_no_2()%>
<%= ds.getBasi_bgn_ser_no()%>
<%= ds.getBasi_end_ser_no()%>
<%= ds.getPrd()%>
<%= ds.getRemk()%>
<%= ds.getEwh_qty()%>
<%= ds.getDeli_qty()%>
<%= ds.getStok_qty()%>
<%= ds.getAsin_plancur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= asin_plancurRec.dlco_clsf%>
<%= asin_plancurRec.dlco_clsf_nm%>
<%= asin_plancurRec.dlco_cd%>
<%= asin_plancurRec.dlco_seq%>
<%= asin_plancurRec.dlco_nm%>
<%= asin_plancurRec.dlco_abrv_nm%>
<%= asin_plancurRec.send_plac_seq%>
<%= asin_plancurRec.send_plac_nm%>
<%= asin_plancurRec.sale_clsf%>
<%= asin_plancurRec.sendclsf%>
<%= asin_plancurRec.wh_cd%>
<%= asin_plancurRec.sell_type%>
<%= asin_plancurRec.dcrate%>
<%= asin_plancurRec.asin_qty%>
<%= asin_plancurRec.appndx_1%>
<%= asin_plancurRec.appndx_2%>
<%= asin_plancurRec.appndx_3%>
<%= asin_plancurRec.bef_ser_no_asin_qty%>
<%= asin_plancurRec.ref_deli_qty_1%>
<%= asin_plancurRec.ref_sell_qty_1%>
<%= asin_plancurRec.ref_deli_qty_2%>
<%= asin_plancurRec.ref_sell_qty_2%>
<%= asin_plancurRec.calc_qty%>
<%= asin_plancurRec.avg_sell_qty%>
<%= asin_plancurRec.ocpy_rate%>
<%= asin_plancurRec.tot_deli_qty%>
<%= asin_plancurRec.avg_deli_qty%>
<%= asin_plancurRec.tot_sell_qty%>
<%= asin_plancurRec.tot_rtgqty%>
<%= asin_plancurRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 20:13:04 KST 2009 */