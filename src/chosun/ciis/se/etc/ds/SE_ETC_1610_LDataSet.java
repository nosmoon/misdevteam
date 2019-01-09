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


package chosun.ciis.se.etc.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.etc.dm.*;
import chosun.ciis.se.etc.rec.*;

/**
 * 
 */


public class SE_ETC_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String real_qty;
	public String avg_qty;
	public String rate;
	public String month_qty;
	public String totclos_yn;
	public String areaclos_yn;
	public String fix_msg;
	public String fix_dt;
	public String noval_qty_rate;
	public String nvqrate_aply_yn;
	public String house_qty_rate;
	public String bnsite_qty_rate;
	public String hsbs_aply_yn;
	public String oth_qty_rate;
	public String othrate_aply_yn;

	public SE_ETC_1610_LDataSet(){}
	public SE_ETC_1610_LDataSet(String errcode, String errmsg, String real_qty, String avg_qty, String rate, String month_qty, String totclos_yn, String areaclos_yn, String fix_msg, String fix_dt, String noval_qty_rate, String nvqrate_aply_yn, String house_qty_rate, String bnsite_qty_rate, String hsbs_aply_yn, String oth_qty_rate, String othrate_aply_yn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.real_qty = real_qty;
		this.avg_qty = avg_qty;
		this.rate = rate;
		this.month_qty = month_qty;
		this.totclos_yn = totclos_yn;
		this.areaclos_yn = areaclos_yn;
		this.fix_msg = fix_msg;
		this.fix_dt = fix_dt;
		this.noval_qty_rate = noval_qty_rate;
		this.nvqrate_aply_yn = nvqrate_aply_yn;
		this.house_qty_rate = house_qty_rate;
		this.bnsite_qty_rate = bnsite_qty_rate;
		this.hsbs_aply_yn = hsbs_aply_yn;
		this.oth_qty_rate = oth_qty_rate;
		this.othrate_aply_yn = othrate_aply_yn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setReal_qty(String real_qty){
		this.real_qty = real_qty;
	}

	public void setAvg_qty(String avg_qty){
		this.avg_qty = avg_qty;
	}

	public void setRate(String rate){
		this.rate = rate;
	}

	public void setMonth_qty(String month_qty){
		this.month_qty = month_qty;
	}

	public void setTotclos_yn(String totclos_yn){
		this.totclos_yn = totclos_yn;
	}

	public void setAreaclos_yn(String areaclos_yn){
		this.areaclos_yn = areaclos_yn;
	}

	public void setFix_msg(String fix_msg){
		this.fix_msg = fix_msg;
	}

	public void setFix_dt(String fix_dt){
		this.fix_dt = fix_dt;
	}

	public void setNoval_qty_rate(String noval_qty_rate){
		this.noval_qty_rate = noval_qty_rate;
	}

	public void setNvqrate_aply_yn(String nvqrate_aply_yn){
		this.nvqrate_aply_yn = nvqrate_aply_yn;
	}

	public void setHouse_qty_rate(String house_qty_rate){
		this.house_qty_rate = house_qty_rate;
	}

	public void setBnsite_qty_rate(String bnsite_qty_rate){
		this.bnsite_qty_rate = bnsite_qty_rate;
	}

	public void setHsbs_aply_yn(String hsbs_aply_yn){
		this.hsbs_aply_yn = hsbs_aply_yn;
	}

	public void setOth_qty_rate(String oth_qty_rate){
		this.oth_qty_rate = oth_qty_rate;
	}

	public void setOthrate_aply_yn(String othrate_aply_yn){
		this.othrate_aply_yn = othrate_aply_yn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getReal_qty(){
		return this.real_qty;
	}

	public String getAvg_qty(){
		return this.avg_qty;
	}

	public String getRate(){
		return this.rate;
	}

	public String getMonth_qty(){
		return this.month_qty;
	}

	public String getTotclos_yn(){
		return this.totclos_yn;
	}

	public String getAreaclos_yn(){
		return this.areaclos_yn;
	}

	public String getFix_msg(){
		return this.fix_msg;
	}

	public String getFix_dt(){
		return this.fix_dt;
	}

	public String getNoval_qty_rate(){
		return this.noval_qty_rate;
	}

	public String getNvqrate_aply_yn(){
		return this.nvqrate_aply_yn;
	}

	public String getHouse_qty_rate(){
		return this.house_qty_rate;
	}

	public String getBnsite_qty_rate(){
		return this.bnsite_qty_rate;
	}

	public String getHsbs_aply_yn(){
		return this.hsbs_aply_yn;
	}

	public String getOth_qty_rate(){
		return this.oth_qty_rate;
	}

	public String getOthrate_aply_yn(){
		return this.othrate_aply_yn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SE_ETC_1610_LCURLISTRecord rec = new SE_ETC_1610_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.sido_gugun_cd = Util.checkString(rset0.getString("sido_gugun_cd"));
			rec.sido_gugun_nm = Util.checkString(rset0.getString("sido_gugun_nm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.livingin_yn = Util.checkString(rset0.getString("livingin_yn"));
			rec.house_qty = Util.checkString(rset0.getString("house_qty"));
			rec.business_site_qty = Util.checkString(rset0.getString("business_site_qty"));
			rec.curmm_val_qty = Util.checkString(rset0.getString("curmm_val_qty"));
			rec.curmm_no_val_qty = Util.checkString(rset0.getString("curmm_no_val_qty"));
			rec.avg_send_qty = Util.checkString(rset0.getString("avg_send_qty"));
			rec.no_val_rate = Util.checkString(rset0.getString("no_val_rate"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.hk_housqty = Util.checkString(rset0.getString("hk_housqty"));
			rec.hk_busiqty = Util.checkString(rset0.getString("hk_busiqty"));
			rec.mk_housqty = Util.checkString(rset0.getString("mk_housqty"));
			rec.mk_busiqty = Util.checkString(rset0.getString("mk_busiqty"));
			rec.kh_housqty = Util.checkString(rset0.getString("kh_housqty"));
			rec.kh_busiqty = Util.checkString(rset0.getString("kh_busiqty"));
			rec.km_housqty = Util.checkString(rset0.getString("km_housqty"));
			rec.km_busiqty = Util.checkString(rset0.getString("km_busiqty"));
			rec.da_housqty = Util.checkString(rset0.getString("da_housqty"));
			rec.da_busiqty = Util.checkString(rset0.getString("da_busiqty"));
			rec.ja_housqty = Util.checkString(rset0.getString("ja_housqty"));
			rec.ja_busiqty = Util.checkString(rset0.getString("ja_busiqty"));
			rec.hap = Util.checkString(rset0.getString("hap"));
			rec.lst_aply = Util.checkString(rset0.getString("lst_aply"));
			rec.abc_val_qty = Util.checkString(rset0.getString("abc_val_qty"));
			rec.end_dt_send_qty = Util.checkString(rset0.getString("end_dt_send_qty"));
			rec.sell_net_clsf = Util.checkString(rset0.getString("sell_net_clsf"));
			this.curlist.add(rec);
		}
		this.real_qty = Util.checkString(cstmt.getString(11));
		this.avg_qty = Util.checkString(cstmt.getString(12));
		this.rate = Util.checkString(cstmt.getString(13));
		this.month_qty = Util.checkString(cstmt.getString(14));
		this.totclos_yn = Util.checkString(cstmt.getString(15));
		this.areaclos_yn = Util.checkString(cstmt.getString(16));
		this.fix_msg = Util.checkString(cstmt.getString(17));
		this.fix_dt = Util.checkString(cstmt.getString(18));
		this.noval_qty_rate = Util.checkString(cstmt.getString(19));
		this.nvqrate_aply_yn = Util.checkString(cstmt.getString(20));
		this.house_qty_rate = Util.checkString(cstmt.getString(21));
		this.bnsite_qty_rate = Util.checkString(cstmt.getString(22));
		this.hsbs_aply_yn = Util.checkString(cstmt.getString(23));
		this.oth_qty_rate = Util.checkString(cstmt.getString(24));
		this.othrate_aply_yn = Util.checkString(cstmt.getString(25));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_ETC_1610_LDataSet ds = (SE_ETC_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_ETC_1610_LCURLISTRecord curlistRec = (SE_ETC_1610_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getReal_qty()%>
<%= ds.getAvg_qty()%>
<%= ds.getRate()%>
<%= ds.getMonth_qty()%>
<%= ds.getTotclos_yn()%>
<%= ds.getAreaclos_yn()%>
<%= ds.getFix_msg()%>
<%= ds.getFix_dt()%>
<%= ds.getNoval_qty_rate()%>
<%= ds.getNvqrate_aply_yn()%>
<%= ds.getHouse_qty_rate()%>
<%= ds.getBnsite_qty_rate()%>
<%= ds.getHsbs_aply_yn()%>
<%= ds.getOth_qty_rate()%>
<%= ds.getOthrate_aply_yn()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.yymm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.part_cd%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.sido_gugun_cd%>
<%= curlistRec.sido_gugun_nm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.livingin_yn%>
<%= curlistRec.house_qty%>
<%= curlistRec.business_site_qty%>
<%= curlistRec.curmm_val_qty%>
<%= curlistRec.curmm_no_val_qty%>
<%= curlistRec.avg_send_qty%>
<%= curlistRec.no_val_rate%>
<%= curlistRec.remk%>
<%= curlistRec.hk_housqty%>
<%= curlistRec.hk_busiqty%>
<%= curlistRec.mk_housqty%>
<%= curlistRec.mk_busiqty%>
<%= curlistRec.kh_housqty%>
<%= curlistRec.kh_busiqty%>
<%= curlistRec.km_housqty%>
<%= curlistRec.km_busiqty%>
<%= curlistRec.da_housqty%>
<%= curlistRec.da_busiqty%>
<%= curlistRec.ja_housqty%>
<%= curlistRec.ja_busiqty%>
<%= curlistRec.hap%>
<%= curlistRec.lst_aply%>
<%= curlistRec.abc_val_qty%>
<%= curlistRec.end_dt_send_qty%>
<%= curlistRec.sell_net_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 23 16:37:24 KST 2012 */