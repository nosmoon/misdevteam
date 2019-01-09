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


public class PL_ASS_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList asin_plancur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String ewh_qty;
	public String deli_qty;
	public String stok_qty;

	public PL_ASS_1110_LDataSet(){}
	public PL_ASS_1110_LDataSet(String errcode, String errmsg, String ewh_qty, String deli_qty, String stok_qty){
		this.errcode = errcode;
		this.errmsg = errmsg;
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
		this.ewh_qty = Util.checkString(cstmt.getString(12));
		this.deli_qty = Util.checkString(cstmt.getString(13));
		this.stok_qty = Util.checkString(cstmt.getString(14));
		ResultSet rset1 = (ResultSet) cstmt.getObject(15);
		while(rset1.next()){
			PL_ASS_1110_LASIN_PLANCURRecord rec = new PL_ASS_1110_LASIN_PLANCURRecord();
			rec.dlco_clsf = Util.checkString(rset1.getString("dlco_clsf"));
			rec.dlco_clsf_nm = Util.checkString(rset1.getString("dlco_clsf_nm"));
			rec.area = Util.checkString(rset1.getString("area"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset1.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset1.getString("dlco_abrv_nm"));
			rec.send_plac_seq = Util.checkString(rset1.getString("send_plac_seq"));
			rec.send_plac_nm = Util.checkString(rset1.getString("send_plac_nm"));
			rec.sale_clsf = Util.checkString(rset1.getString("sale_clsf"));
			rec.sendclsf = Util.checkString(rset1.getString("sendclsf"));
			rec.wh_cd = Util.checkString(rset1.getString("wh_cd"));
			rec.sell_type = Util.checkString(rset1.getString("sell_type"));
			rec.dcrate = Util.checkString(rset1.getString("dcrate"));
			rec.asin_qty = Util.checkString(rset1.getString("asin_qty"));
			rec.calc_qty = Util.checkString(rset1.getString("calc_qty"));
			rec.avg_sell_qty = Util.checkString(rset1.getString("avg_sell_qty"));
			rec.ocpy_rate = Util.checkString(rset1.getString("ocpy_rate"));
			rec.tot_deli_qty = Util.checkString(rset1.getString("tot_deli_qty"));
			rec.avg_deli_qty = Util.checkString(rset1.getString("avg_deli_qty"));
			rec.tot_sell_qty = Util.checkString(rset1.getString("tot_sell_qty"));
			rec.tot_rtgqty = Util.checkString(rset1.getString("tot_rtgqty"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			this.asin_plancur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_ASS_1110_LDataSet ds = (PL_ASS_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.asin_plancur.size(); i++){
		PL_ASS_1110_LASIN_PLANCURRecord asin_plancurRec = (PL_ASS_1110_LASIN_PLANCURRecord)ds.asin_plancur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getEwh_qty()%>
<%= ds.getDeli_qty()%>
<%= ds.getStok_qty()%>
<%= ds.getAsin_plancur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= asin_plancurRec.dlco_clsf%>
<%= asin_plancurRec.dlco_clsf_nm%>
<%= asin_plancurRec.area%>
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
<%= asin_plancurRec.calc_qty%>
<%= asin_plancurRec.avg_sell_qty%>
<%= asin_plancurRec.ocpy_rate%>
<%= asin_plancurRec.tot_deli_qty%>
<%= asin_plancurRec.avg_deli_qty%>
<%= asin_plancurRec.tot_sell_qty%>
<%= asin_plancurRec.tot_rtgqty%>
<%= asin_plancurRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 17 11:42:03 KST 2009 */