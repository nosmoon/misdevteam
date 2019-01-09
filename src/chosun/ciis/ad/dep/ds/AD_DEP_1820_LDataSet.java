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


package chosun.ciis.ad.dep.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.dep.rec.AD_DEP_1820_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_1820_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String basi_dt;
	public String busn_dt;
	public String tot_prvmm_unrcp_amt;
	public String tot_pubc_amt;
	public String tot_rcpm_amt;
	public String tot_unrcp_amt;
	public String avg_giil;

	public AD_DEP_1820_LDataSet(){}
	public AD_DEP_1820_LDataSet(String errcode, String errmsg, String basi_dt, String busn_dt, String tot_prvmm_unrcp_amt, String tot_pubc_amt, String tot_rcpm_amt, String tot_unrcp_amt, String avg_giil){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.basi_dt = basi_dt;
		this.busn_dt = busn_dt;
		this.tot_prvmm_unrcp_amt = tot_prvmm_unrcp_amt;
		this.tot_pubc_amt = tot_pubc_amt;
		this.tot_rcpm_amt = tot_rcpm_amt;
		this.tot_unrcp_amt = tot_unrcp_amt;
		this.avg_giil = avg_giil;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setBusn_dt(String busn_dt){
		this.busn_dt = busn_dt;
	}

	public void setTot_prvmm_unrcp_amt(String tot_prvmm_unrcp_amt){
		this.tot_prvmm_unrcp_amt = tot_prvmm_unrcp_amt;
	}

	public void setTot_pubc_amt(String tot_pubc_amt){
		this.tot_pubc_amt = tot_pubc_amt;
	}

	public void setTot_rcpm_amt(String tot_rcpm_amt){
		this.tot_rcpm_amt = tot_rcpm_amt;
	}

	public void setTot_unrcp_amt(String tot_unrcp_amt){
		this.tot_unrcp_amt = tot_unrcp_amt;
	}

	public void setAvg_giil(String avg_giil){
		this.avg_giil = avg_giil;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getBusn_dt(){
		return this.busn_dt;
	}

	public String getTot_prvmm_unrcp_amt(){
		return this.tot_prvmm_unrcp_amt;
	}

	public String getTot_pubc_amt(){
		return this.tot_pubc_amt;
	}

	public String getTot_rcpm_amt(){
		return this.tot_rcpm_amt;
	}

	public String getTot_unrcp_amt(){
		return this.tot_unrcp_amt;
	}

	public String getAvg_giil(){
		return this.avg_giil;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.basi_dt = Util.checkString(cstmt.getString(8));
		this.busn_dt = Util.checkString(cstmt.getString(9));
		this.tot_prvmm_unrcp_amt = Util.checkString(cstmt.getString(10));
		this.tot_pubc_amt = Util.checkString(cstmt.getString(11));
		this.tot_rcpm_amt = Util.checkString(cstmt.getString(12));
		this.tot_unrcp_amt = Util.checkString(cstmt.getString(13));
		this.avg_giil = Util.checkString(cstmt.getString(14));
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			AD_DEP_1820_LCURLISTRecord rec = new AD_DEP_1820_LCURLISTRecord();
			rec.pubc_yymm = Util.checkString(rset0.getString("pubc_yymm"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.prvmm_unrcp_amt = Util.checkString(rset0.getString("prvmm_unrcp_amt"));
			rec.pubc_amt = Util.checkString(rset0.getString("pubc_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.unrcp_amt = Util.checkString(rset0.getString("unrcp_amt"));
			rec.giil = Util.checkString(rset0.getString("giil"));
			rec.note_tot_amt = Util.checkString(rset0.getString("note_tot_amt"));
			rec.cash_deps_tot_amt = Util.checkString(rset0.getString("cash_deps_tot_amt"));
			rec.avg_dds = Util.checkString(rset0.getString("avg_dds"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_1820_LDataSet ds = (AD_DEP_1820_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_1820_LCURLISTRecord curlistRec = (AD_DEP_1820_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBasi_dt()%>
<%= ds.getBusn_dt()%>
<%= ds.getTot_prvmm_unrcp_amt()%>
<%= ds.getTot_pubc_amt()%>
<%= ds.getTot_rcpm_amt()%>
<%= ds.getTot_unrcp_amt()%>
<%= ds.getAvg_giil()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.pubc_yymm%>
<%= curlistRec.medi_nm%>
<%= curlistRec.prvmm_unrcp_amt%>
<%= curlistRec.pubc_amt%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.unrcp_amt%>
<%= curlistRec.giil%>
<%= curlistRec.note_tot_amt%>
<%= curlistRec.cash_deps_tot_amt%>
<%= curlistRec.avg_dds%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 06 17:35:10 KST 2009 */