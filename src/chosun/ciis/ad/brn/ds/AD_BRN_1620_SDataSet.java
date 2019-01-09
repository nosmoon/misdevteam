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


package chosun.ciis.ad.brn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.brn.dm.*;
import chosun.ciis.ad.brn.rec.*;

/**
 * 
 */


public class AD_BRN_1620_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String seq;
	public String icdc_clsf;
	public String upd_prv_amt;
	public String upd_aft_amt;
	public String icdc_amt;
	public String resn;
	public String make_dt;
	public String fr_pubc_dt;
	public String to_pubc_dt;

	public AD_BRN_1620_SDataSet(){}
	public AD_BRN_1620_SDataSet(String errcode, String errmsg, String seq, String icdc_clsf, String upd_prv_amt, String upd_aft_amt, String icdc_amt, String resn, String make_dt, String fr_pubc_dt, String to_pubc_dt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.seq = seq;
		this.icdc_clsf = icdc_clsf;
		this.upd_prv_amt = upd_prv_amt;
		this.upd_aft_amt = upd_aft_amt;
		this.icdc_amt = icdc_amt;
		this.resn = resn;
		this.make_dt = make_dt;
		this.fr_pubc_dt = fr_pubc_dt;
		this.to_pubc_dt = to_pubc_dt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setIcdc_clsf(String icdc_clsf){
		this.icdc_clsf = icdc_clsf;
	}

	public void setUpd_prv_amt(String upd_prv_amt){
		this.upd_prv_amt = upd_prv_amt;
	}

	public void setUpd_aft_amt(String upd_aft_amt){
		this.upd_aft_amt = upd_aft_amt;
	}

	public void setIcdc_amt(String icdc_amt){
		this.icdc_amt = icdc_amt;
	}

	public void setResn(String resn){
		this.resn = resn;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setFr_pubc_dt(String fr_pubc_dt){
		this.fr_pubc_dt = fr_pubc_dt;
	}

	public void setTo_pubc_dt(String to_pubc_dt){
		this.to_pubc_dt = to_pubc_dt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getIcdc_clsf(){
		return this.icdc_clsf;
	}

	public String getUpd_prv_amt(){
		return this.upd_prv_amt;
	}

	public String getUpd_aft_amt(){
		return this.upd_aft_amt;
	}

	public String getIcdc_amt(){
		return this.icdc_amt;
	}

	public String getResn(){
		return this.resn;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getFr_pubc_dt(){
		return this.fr_pubc_dt;
	}

	public String getTo_pubc_dt(){
		return this.to_pubc_dt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.seq = Util.checkString(cstmt.getString(6));
		this.icdc_clsf = Util.checkString(cstmt.getString(7));
		this.upd_prv_amt = Util.checkString(cstmt.getString(8));
		this.upd_aft_amt = Util.checkString(cstmt.getString(9));
		this.icdc_amt = Util.checkString(cstmt.getString(10));
		this.resn = Util.checkString(cstmt.getString(11));
		this.make_dt = Util.checkString(cstmt.getString(12));
		this.fr_pubc_dt = Util.checkString(cstmt.getString(13));
		this.to_pubc_dt = Util.checkString(cstmt.getString(14));
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			AD_BRN_1620_SCURLISTRecord rec = new AD_BRN_1620_SCURLISTRecord();
			rec.checked = Util.checkString(rset0.getString("checked"));
			rec.pubc_occr_dt = Util.checkString(rset0.getString("pubc_occr_dt"));
			rec.pubc_occr_seq = Util.checkString(rset0.getString("pubc_occr_seq"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset0.getString("sect_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.pubc_tot_amt = Util.checkString(rset0.getString("pubc_tot_amt"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BRN_1620_SDataSet ds = (AD_BRN_1620_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BRN_1620_SCURLISTRecord curlistRec = (AD_BRN_1620_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSeq()%>
<%= ds.getIcdc_clsf()%>
<%= ds.getUpd_prv_amt()%>
<%= ds.getUpd_aft_amt()%>
<%= ds.getIcdc_amt()%>
<%= ds.getResn()%>
<%= ds.getMake_dt()%>
<%= ds.getFr_pubc_dt()%>
<%= ds.getTo_pubc_dt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.checked%>
<%= curlistRec.pubc_occr_dt%>
<%= curlistRec.pubc_occr_seq%>
<%= curlistRec.dlco_no%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_seq%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.agn%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.pubc_tot_amt%>
<%= curlistRec.chrg_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 05 18:17:06 KST 2009 */