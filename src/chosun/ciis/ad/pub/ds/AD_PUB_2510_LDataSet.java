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


public class AD_PUB_2510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String tot_clr_advt_fee;
	public String tot_blk_advt_fee;
	public String tot_tot_advt_fee;
	public String tot_issu_dt_cnt;
	public String avg_advt_fee;
	public String tot_cnt_clr_myun;
	public String tot_cnt_blk_myun;
	public String tot_tabl_clsf;
	public String tot_dn;
	public String pubc_cnt;
	public String avg_clr_advt_fee;
	public String avg_blk_advt_fee;
	public String avg_tot_advt_fee;
	public String avg_tot_uprc;
	public String tot_fee;
	public String tot_coms;

	public AD_PUB_2510_LDataSet(){}
	public AD_PUB_2510_LDataSet(String errcode, String errmsg, String tot_clr_advt_fee, String tot_blk_advt_fee, String tot_tot_advt_fee, String tot_issu_dt_cnt, String avg_advt_fee, String tot_cnt_clr_myun, String tot_cnt_blk_myun, String tot_tabl_clsf, String tot_dn, String pubc_cnt, String avg_clr_advt_fee, String avg_blk_advt_fee, String avg_tot_advt_fee, String avg_tot_uprc, String tot_fee, String tot_coms){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.tot_clr_advt_fee = tot_clr_advt_fee;
		this.tot_blk_advt_fee = tot_blk_advt_fee;
		this.tot_tot_advt_fee = tot_tot_advt_fee;
		this.tot_issu_dt_cnt = tot_issu_dt_cnt;
		this.avg_advt_fee = avg_advt_fee;
		this.tot_cnt_clr_myun = tot_cnt_clr_myun;
		this.tot_cnt_blk_myun = tot_cnt_blk_myun;
		this.tot_tabl_clsf = tot_tabl_clsf;
		this.tot_dn = tot_dn;
		this.pubc_cnt = pubc_cnt;
		this.avg_clr_advt_fee = avg_clr_advt_fee;
		this.avg_blk_advt_fee = avg_blk_advt_fee;
		this.avg_tot_advt_fee = avg_tot_advt_fee;
		this.avg_tot_uprc = avg_tot_uprc;
		this.tot_fee = tot_fee;
		this.tot_coms = tot_coms;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTot_clr_advt_fee(String tot_clr_advt_fee){
		this.tot_clr_advt_fee = tot_clr_advt_fee;
	}

	public void setTot_blk_advt_fee(String tot_blk_advt_fee){
		this.tot_blk_advt_fee = tot_blk_advt_fee;
	}

	public void setTot_tot_advt_fee(String tot_tot_advt_fee){
		this.tot_tot_advt_fee = tot_tot_advt_fee;
	}

	public void setTot_issu_dt_cnt(String tot_issu_dt_cnt){
		this.tot_issu_dt_cnt = tot_issu_dt_cnt;
	}

	public void setAvg_advt_fee(String avg_advt_fee){
		this.avg_advt_fee = avg_advt_fee;
	}

	public void setTot_cnt_clr_myun(String tot_cnt_clr_myun){
		this.tot_cnt_clr_myun = tot_cnt_clr_myun;
	}

	public void setTot_cnt_blk_myun(String tot_cnt_blk_myun){
		this.tot_cnt_blk_myun = tot_cnt_blk_myun;
	}

	public void setTot_tabl_clsf(String tot_tabl_clsf){
		this.tot_tabl_clsf = tot_tabl_clsf;
	}

	public void setTot_dn(String tot_dn){
		this.tot_dn = tot_dn;
	}

	public void setPubc_cnt(String pubc_cnt){
		this.pubc_cnt = pubc_cnt;
	}

	public void setAvg_clr_advt_fee(String avg_clr_advt_fee){
		this.avg_clr_advt_fee = avg_clr_advt_fee;
	}

	public void setAvg_blk_advt_fee(String avg_blk_advt_fee){
		this.avg_blk_advt_fee = avg_blk_advt_fee;
	}

	public void setAvg_tot_advt_fee(String avg_tot_advt_fee){
		this.avg_tot_advt_fee = avg_tot_advt_fee;
	}

	public void setAvg_tot_uprc(String avg_tot_uprc){
		this.avg_tot_uprc = avg_tot_uprc;
	}

	public void setTot_fee(String tot_fee){
		this.tot_fee = tot_fee;
	}

	public void setTot_coms(String tot_coms){
		this.tot_coms = tot_coms;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTot_clr_advt_fee(){
		return this.tot_clr_advt_fee;
	}

	public String getTot_blk_advt_fee(){
		return this.tot_blk_advt_fee;
	}

	public String getTot_tot_advt_fee(){
		return this.tot_tot_advt_fee;
	}

	public String getTot_issu_dt_cnt(){
		return this.tot_issu_dt_cnt;
	}

	public String getAvg_advt_fee(){
		return this.avg_advt_fee;
	}

	public String getTot_cnt_clr_myun(){
		return this.tot_cnt_clr_myun;
	}

	public String getTot_cnt_blk_myun(){
		return this.tot_cnt_blk_myun;
	}

	public String getTot_tabl_clsf(){
		return this.tot_tabl_clsf;
	}

	public String getTot_dn(){
		return this.tot_dn;
	}

	public String getPubc_cnt(){
		return this.pubc_cnt;
	}

	public String getAvg_clr_advt_fee(){
		return this.avg_clr_advt_fee;
	}

	public String getAvg_blk_advt_fee(){
		return this.avg_blk_advt_fee;
	}

	public String getAvg_tot_advt_fee(){
		return this.avg_tot_advt_fee;
	}

	public String getAvg_tot_uprc(){
		return this.avg_tot_uprc;
	}

	public String getTot_fee(){
		return this.tot_fee;
	}

	public String getTot_coms(){
		return this.tot_coms;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.tot_clr_advt_fee = Util.checkString(cstmt.getString(16));
		this.tot_blk_advt_fee = Util.checkString(cstmt.getString(17));
		this.tot_tot_advt_fee = Util.checkString(cstmt.getString(18));
		this.tot_issu_dt_cnt = Util.checkString(cstmt.getString(19));
		this.avg_advt_fee = Util.checkString(cstmt.getString(20));
		this.tot_cnt_clr_myun = Util.checkString(cstmt.getString(21));
		this.tot_cnt_blk_myun = Util.checkString(cstmt.getString(22));
		this.tot_tabl_clsf = Util.checkString(cstmt.getString(23));
		this.tot_dn = Util.checkString(cstmt.getString(24));
		this.pubc_cnt = Util.checkString(cstmt.getString(25));
		this.avg_clr_advt_fee = Util.checkString(cstmt.getString(26));
		this.avg_blk_advt_fee = Util.checkString(cstmt.getString(27));
		this.avg_tot_advt_fee = Util.checkString(cstmt.getString(28));
		this.avg_tot_uprc = Util.checkString(cstmt.getString(29));
		this.tot_fee = Util.checkString(cstmt.getString(30));
		this.tot_coms = Util.checkString(cstmt.getString(31));
		ResultSet rset0 = (ResultSet) cstmt.getObject(32);
		while(rset0.next()){
			AD_PUB_2510_LCURLISTRecord rec = new AD_PUB_2510_LCURLISTRecord();
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.yoil = Util.checkString(rset0.getString("yoil"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_clas_nm = Util.checkString(rset0.getString("sect_clas_nm"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.edt_nm = Util.checkString(rset0.getString("edt_nm"));
			rec.clr_advt_fee = Util.checkString(rset0.getString("clr_advt_fee"));
			rec.blk_advt_fee = Util.checkString(rset0.getString("blk_advt_fee"));
			rec.tot_advt_fee = Util.checkString(rset0.getString("tot_advt_fee"));
			rec.issu_dt_cnt = Util.checkString(rset0.getString("issu_dt_cnt"));
			rec.avg_pubc_amt = Util.checkString(rset0.getString("avg_pubc_amt"));
			rec.cnt_clr_myun = Util.checkString(rset0.getString("cnt_clr_myun"));
			rec.cnt_blk_myun = Util.checkString(rset0.getString("cnt_blk_myun"));
			rec.tot_tabl_clsf = Util.checkString(rset0.getString("tot_tabl_clsf"));
			rec.tot_dn = Util.checkString(rset0.getString("tot_dn"));
			rec.pubc_cnt = Util.checkString(rset0.getString("pubc_cnt"));
			rec.avg_clr_myun = Util.checkString(rset0.getString("avg_clr_myun"));
			rec.avg_blk_myum = Util.checkString(rset0.getString("avg_blk_myum"));
			rec.avg_tot_myun = Util.checkString(rset0.getString("avg_tot_myun"));
			rec.avg_tot_uprc = Util.checkString(rset0.getString("avg_tot_uprc"));
			rec.fee = Util.checkString(rset0.getString("fee"));
			rec.coms = Util.checkString(rset0.getString("coms"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_2510_LDataSet ds = (AD_PUB_2510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_2510_LCURLISTRecord curlistRec = (AD_PUB_2510_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTot_clr_advt_fee()%>
<%= ds.getTot_blk_advt_fee()%>
<%= ds.getTot_tot_advt_fee()%>
<%= ds.getTot_issu_dt_cnt()%>
<%= ds.getAvg_advt_fee()%>
<%= ds.getTot_cnt_clr_myun()%>
<%= ds.getTot_cnt_blk_myun()%>
<%= ds.getTot_tabl_clsf()%>
<%= ds.getTot_dn()%>
<%= ds.getPubc_cnt()%>
<%= ds.getAvg_clr_advt_fee()%>
<%= ds.getAvg_blk_advt_fee()%>
<%= ds.getAvg_tot_advt_fee()%>
<%= ds.getAvg_tot_uprc()%>
<%= ds.getTot_fee()%>
<%= ds.getTot_coms()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.pubc_dt%>
<%= curlistRec.yoil%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_clas_nm%>
<%= curlistRec.sect_nm%>
<%= curlistRec.edt_nm%>
<%= curlistRec.clr_advt_fee%>
<%= curlistRec.blk_advt_fee%>
<%= curlistRec.tot_advt_fee%>
<%= curlistRec.issu_dt_cnt%>
<%= curlistRec.avg_pubc_amt%>
<%= curlistRec.cnt_clr_myun%>
<%= curlistRec.cnt_blk_myun%>
<%= curlistRec.tot_tabl_clsf%>
<%= curlistRec.tot_dn%>
<%= curlistRec.pubc_cnt%>
<%= curlistRec.avg_clr_myun%>
<%= curlistRec.avg_blk_myum%>
<%= curlistRec.avg_tot_myun%>
<%= curlistRec.avg_tot_uprc%>
<%= curlistRec.fee%>
<%= curlistRec.coms%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 31 18:46:09 KST 2017 */