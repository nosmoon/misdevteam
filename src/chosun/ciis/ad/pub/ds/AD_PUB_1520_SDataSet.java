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


public class AD_PUB_1520_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String icdc_clsf;
	public String upd_prv_amt;
	public String upd_aft_amt;
	public String icdc_amt;
	public String resn;
	public String dept_cd;
	public String dept_nm;
	public String chrg_pers;
	public String chrg_pers_nm;
	public String make_dt;
	public String fr_pubc_dt;
	public String to_pubc_dt;

	public AD_PUB_1520_SDataSet(){}
	public AD_PUB_1520_SDataSet(String errcode, String errmsg, String icdc_clsf, String upd_prv_amt, String upd_aft_amt, String icdc_amt, String resn, String dept_cd, String dept_nm, String chrg_pers, String chrg_pers_nm, String make_dt, String fr_pubc_dt, String to_pubc_dt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.icdc_clsf = icdc_clsf;
		this.upd_prv_amt = upd_prv_amt;
		this.upd_aft_amt = upd_aft_amt;
		this.icdc_amt = icdc_amt;
		this.resn = resn;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.chrg_pers = chrg_pers;
		this.chrg_pers_nm = chrg_pers_nm;
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

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
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

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
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

		this.icdc_clsf = Util.checkString(cstmt.getString(6));
		this.upd_prv_amt = Util.checkString(cstmt.getString(7));
		this.upd_aft_amt = Util.checkString(cstmt.getString(8));
		this.icdc_amt = Util.checkString(cstmt.getString(9));
		this.resn = Util.checkString(cstmt.getString(10));
		this.dept_cd = Util.checkString(cstmt.getString(11));
		this.dept_nm = Util.checkString(cstmt.getString(12));
		this.chrg_pers = Util.checkString(cstmt.getString(13));
		this.chrg_pers_nm = Util.checkString(cstmt.getString(14));
		this.make_dt = Util.checkString(cstmt.getString(15));
		this.fr_pubc_dt = Util.checkString(cstmt.getString(16));
		this.to_pubc_dt = Util.checkString(cstmt.getString(17));
		ResultSet rset0 = (ResultSet) cstmt.getObject(18);
		while(rset0.next()){
			AD_PUB_1520_SCURLISTRecord rec = new AD_PUB_1520_SCURLISTRecord();
			rec.icdcpubc_yn = Util.checkString(rset0.getString("icdcpubc_yn"));
			rec.pubc_occr_dt = Util.checkString(rset0.getString("pubc_occr_dt"));
			rec.pubc_occr_seq = Util.checkString(rset0.getString("pubc_occr_seq"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset0.getString("sect_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.hndl_plac_cd = Util.checkString(rset0.getString("hndl_plac_cd"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.pubc_tot_amt = Util.checkString(rset0.getString("pubc_tot_amt"));
			rec.pers = Util.checkString(rset0.getString("pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_1520_SDataSet ds = (AD_PUB_1520_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_1520_SCURLISTRecord curlistRec = (AD_PUB_1520_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getIcdc_clsf()%>
<%= ds.getUpd_prv_amt()%>
<%= ds.getUpd_aft_amt()%>
<%= ds.getIcdc_amt()%>
<%= ds.getResn()%>
<%= ds.getDept_cd()%>
<%= ds.getDept_nm()%>
<%= ds.getChrg_pers()%>
<%= ds.getChrg_pers_nm()%>
<%= ds.getMake_dt()%>
<%= ds.getFr_pubc_dt()%>
<%= ds.getTo_pubc_dt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.icdcpubc_yn%>
<%= curlistRec.pubc_occr_dt%>
<%= curlistRec.pubc_occr_seq%>
<%= curlistRec.dlco_no%>
<%= curlistRec.medi_cd%>
<%= curlistRec.seq%>
<%= curlistRec.medi_nm%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_seq%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.agn%>
<%= curlistRec.hndl_plac_cd%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.pubc_tot_amt%>
<%= curlistRec.pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 11 16:27:39 KST 2013 */