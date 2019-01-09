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


package chosun.ciis.ad.res.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.res.rec.AD_RES_1110_LCURLISTRecord;
import chosun.ciis.ad.res.rec.AD_RES_1110_LSECTCURLISTRecord;

/**
 * 
 */


public class AD_RES_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public ArrayList sectcurlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String clos_yn;
	public String tot_dn_cnt;
	public String advs_ocpy_rate;

	public AD_RES_1110_LDataSet(){}
	public AD_RES_1110_LDataSet(String errcode, String errmsg, String clos_yn, String tot_dn_cnt, String advs_ocpy_rate){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.clos_yn = clos_yn;
		this.tot_dn_cnt = tot_dn_cnt;
		this.advs_ocpy_rate = advs_ocpy_rate;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setTot_dn_cnt(String tot_dn_cnt){
		this.tot_dn_cnt = tot_dn_cnt;
	}

	public void setAdvs_ocpy_rate(String advs_ocpy_rate){
		this.advs_ocpy_rate = advs_ocpy_rate;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getTot_dn_cnt(){
		return this.tot_dn_cnt;
	}

	public String getAdvs_ocpy_rate(){
		return this.advs_ocpy_rate;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.clos_yn = Util.checkString(cstmt.getString(6));
		this.tot_dn_cnt = Util.checkString(cstmt.getString(7));
		this.advs_ocpy_rate = Util.checkString(cstmt.getString(8));
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			AD_RES_1110_LCURLISTRecord rec = new AD_RES_1110_LCURLISTRecord();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_clas_cd = Util.checkString(rset0.getString("sect_clas_cd"));
			rec.sect_nm_cd = Util.checkString(rset0.getString("sect_nm_cd"));
			rec.issu_side = Util.checkString(rset0.getString("issu_side"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset0.getString("sect_seq"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.bw_clr_yn = Util.checkString(rset0.getString("bw_clr_yn"));
			rec.chro_clsf = Util.checkString(rset0.getString("chro_clsf"));
			rec.preng_cnt = Util.checkString(rset0.getString("preng_cnt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			AD_RES_1110_LSECTCURLISTRecord rec = new AD_RES_1110_LSECTCURLISTRecord();
			rec.sect_clas_cd = Util.checkString(rset1.getString("sect_clas_cd"));
			rec.sect_nm_cd = Util.checkString(rset1.getString("sect_nm_cd"));
			rec.sect_nm = Util.checkString(rset1.getString("sect_nm"));
			rec.sect_cd = Util.checkString(rset1.getString("sect_cd"));
			rec.max_seq = Util.checkString(rset1.getString("max_seq"));
			rec.clr_cnt = Util.checkString(rset1.getString("clr_cnt"));
			this.sectcurlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_RES_1110_LDataSet ds = (AD_RES_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1110_LCURLISTRecord curlistRec = (AD_RES_1110_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sectcurlist.size(); i++){
		AD_RES_1110_LSECTCURLISTRecord sectcurlistRec = (AD_RES_1110_LSECTCURLISTRecord)ds.sectcurlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getClos_yn()%>
<%= ds.getTot_dn_cnt()%>
<%= ds.getAdvs_ocpy_rate()%>
<%= ds.getCurlist()%>
<%= ds.getSectcurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.medi_cd%>
<%= curlistRec.sect_clas_cd%>
<%= curlistRec.sect_nm_cd%>
<%= curlistRec.issu_side%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_seq%>
<%= curlistRec.dn%>
<%= curlistRec.cm%>
<%= curlistRec.bw_clr_yn%>
<%= curlistRec.chro_clsf%>
<%= curlistRec.preng_cnt%>
<%= sectcurlistRec.sect_clas_cd%>
<%= sectcurlistRec.sect_nm_cd%>
<%= sectcurlistRec.sect_nm%>
<%= sectcurlistRec.sect_cd%>
<%= sectcurlistRec.max_seq%>
<%= sectcurlistRec.clr_cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 17 20:32:16 KST 2009 */