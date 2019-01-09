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


package chosun.ciis.hd.yadjm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_2018_1214_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_YADJM_2018_1214_LDataSet(){}
	public HD_YADJM_2018_1214_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_YADJM_2018_1214_LCURLISTRecord rec = new HD_YADJM_2018_1214_LCURLISTRecord();
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.firmnm = Util.checkString(rset0.getString("firmnm"));
			rec.dona_plac_clsf = Util.checkString(rset0.getString("dona_plac_clsf"));
			rec.dona_yymm = Util.checkString(rset0.getString("dona_yymm"));
			rec.dona_ptcr_noit = Util.checkString(rset0.getString("dona_ptcr_noit"));
			rec.dona_ptcr_amt = Util.checkString(rset0.getString("dona_ptcr_amt"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.rshp = Util.checkString(rset0.getString("rshp"));
			rec.obj_pers_flnm = Util.checkString(rset0.getString("obj_pers_flnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.corr_txn_prd_dduc_amt = Util.checkString(rset0.getString("corr_txn_prd_dduc_amt"));
			rec.cyov_amt = Util.checkString(rset0.getString("cyov_amt"));
			rec.lastyear_cyov_amt = Util.checkString(rset0.getString("lastyear_cyov_amt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			HD_YADJM_2018_1214_LCURLIST1Record rec = new HD_YADJM_2018_1214_LCURLIST1Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			HD_YADJM_2018_1214_LCURLIST2Record rec = new HD_YADJM_2018_1214_LCURLIST2Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.curlist2.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			HD_YADJM_2018_1214_LCURLIST3Record rec = new HD_YADJM_2018_1214_LCURLIST3Record();
			rec.faml_flnm = Util.checkString(rset3.getString("faml_flnm"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_2018_1214_LDataSet ds = (HD_YADJM_2018_1214_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_YADJM_2018_1214_LCURLISTRecord curlistRec = (HD_YADJM_2018_1214_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_YADJM_2018_1214_LCURLIST1Record curlist1Rec = (HD_YADJM_2018_1214_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_YADJM_2018_1214_LCURLIST2Record curlist2Rec = (HD_YADJM_2018_1214_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_YADJM_2018_1214_LCURLIST3Record curlist3Rec = (HD_YADJM_2018_1214_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.ern%>
<%= curlistRec.firmnm%>
<%= curlistRec.dona_plac_clsf%>
<%= curlistRec.dona_yymm%>
<%= curlistRec.dona_ptcr_noit%>
<%= curlistRec.dona_ptcr_amt%>
<%= curlistRec.rmks%>
<%= curlistRec.rshp%>
<%= curlistRec.obj_pers_flnm%>
<%= curlistRec.prn%>
<%= curlistRec.corr_txn_prd_dduc_amt%>
<%= curlistRec.cyov_amt%>
<%= curlistRec.lastyear_cyov_amt%>
<%= curlistRec.seq%>
<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.cd_abrv_nm%>
<%= curlist1Rec.cdnm_cd%>
<%= curlist1Rec.cdabrvnm_cd%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.cd_abrv_nm%>
<%= curlist2Rec.cdnm_cd%>
<%= curlist2Rec.cdabrvnm_cd%>
<%= curlist3Rec.faml_flnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 04 17:25:36 KST 2019 */