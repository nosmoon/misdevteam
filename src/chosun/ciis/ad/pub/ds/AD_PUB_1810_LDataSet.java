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


public class AD_PUB_1810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_1810_LDataSet(){}
	public AD_PUB_1810_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(22);
		while(rset0.next()){
			AD_PUB_1810_LCURLISTRecord rec = new AD_PUB_1810_LCURLISTRecord();
			rec.sale_stmt_issu_yn = Util.checkString(rset0.getString("sale_stmt_issu_yn"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.pubc_side = Util.checkString(rset0.getString("pubc_side"));
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset0.getString("sect_seq"));
			rec.sect_clas_nm = Util.checkString(rset0.getString("sect_clas_nm"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.tabl_yn = Util.checkString(rset0.getString("tabl_yn"));
			rec.chro_clsf = Util.checkString(rset0.getString("chro_clsf"));
			rec.slcrg_nm = Util.checkString(rset0.getString("slcrg_nm"));
			rec.mchrg_nm = Util.checkString(rset0.getString("mchrg_nm"));
			rec.cslcrg_nm = Util.checkString(rset0.getString("cslcrg_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.hndl_plac_nm = Util.checkString(rset0.getString("hndl_plac_nm"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.tot_rcpm_amt = Util.checkString(rset0.getString("tot_rcpm_amt"));
			rec.misu_tot_amt = Util.checkString(rset0.getString("misu_tot_amt"));
			rec.fee = Util.checkString(rset0.getString("fee"));
			rec.elec_tax_stmt_yn = Util.checkString(rset0.getString("elec_tax_stmt_yn"));
			rec.advt_clas = Util.checkString(rset0.getString("advt_clas"));
			rec.pubc_cnt = Util.checkString(rset0.getString("pubc_cnt"));
			rec.arow = Util.checkString(rset0.getString("arow"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.coms_rate = Util.checkString(rset0.getString("coms_rate"));
			rec.coms = Util.checkString(rset0.getString("coms"));
			rec.pubc_clsf_nm = Util.checkString(rset0.getString("pubc_clsf_nm"));
			rec.edt_clsf = Util.checkString(rset0.getString("edt_clsf"));
			rec.indt_clsf = Util.checkString(rset0.getString("indt_clsf"));
			rec.indt_clsf_nm = Util.checkString(rset0.getString("indt_clsf_nm"));
			rec.grp_cmpy_nm = Util.checkString(rset0.getString("grp_cmpy_nm"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.side_cd = Util.checkString(rset0.getString("side_cd"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_1810_LDataSet ds = (AD_PUB_1810_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_1810_LCURLISTRecord curlistRec = (AD_PUB_1810_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sale_stmt_issu_yn%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.pubc_side%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_seq%>
<%= curlistRec.sect_clas_nm%>
<%= curlistRec.sect_nm%>
<%= curlistRec.tabl_yn%>
<%= curlistRec.chro_clsf%>
<%= curlistRec.slcrg_nm%>
<%= curlistRec.mchrg_nm%>
<%= curlistRec.cslcrg_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.agn%>
<%= curlistRec.hndl_plac_nm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.tot_rcpm_amt%>
<%= curlistRec.misu_tot_amt%>
<%= curlistRec.fee%>
<%= curlistRec.elec_tax_stmt_yn%>
<%= curlistRec.advt_clas%>
<%= curlistRec.pubc_cnt%>
<%= curlistRec.arow%>
<%= curlistRec.cm%>
<%= curlistRec.dn%>
<%= curlistRec.uprc%>
<%= curlistRec.coms_rate%>
<%= curlistRec.coms%>
<%= curlistRec.pubc_clsf_nm%>
<%= curlistRec.edt_clsf%>
<%= curlistRec.indt_clsf%>
<%= curlistRec.indt_clsf_nm%>
<%= curlistRec.grp_cmpy_nm%>
<%= curlistRec.advt_cont%>
<%= curlistRec.side_cd%>
<%= curlistRec.ern%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 16 10:12:32 KST 2017 */