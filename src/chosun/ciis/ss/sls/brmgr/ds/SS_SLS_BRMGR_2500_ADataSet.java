/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2500_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList sellnetcur = new ArrayList();
	public ArrayList teamlist = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList medicdcur = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList d_stat = new ArrayList();
	public ArrayList boclsf = new ArrayList();
	public ArrayList clsf2cur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String now_toyymm;

	public SS_SLS_BRMGR_2500_ADataSet(){}
	public SS_SLS_BRMGR_2500_ADataSet(String errcode, String errmsg, String now_toyymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.now_toyymm = now_toyymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setNow_toyymm(String now_toyymm){
		this.now_toyymm = now_toyymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getNow_toyymm(){
		return this.now_toyymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_SLS_BRMGR_2500_ATEAMLISTRecord rec = new SS_SLS_BRMGR_2500_ATEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			SS_SLS_BRMGR_2500_APARTLISTRecord rec = new SS_SLS_BRMGR_2500_APARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			SS_SLS_BRMGR_2500_AAREALISTRecord rec = new SS_SLS_BRMGR_2500_AAREALISTRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			SS_SLS_BRMGR_2500_ACLSF2CURRecord rec = new SS_SLS_BRMGR_2500_ACLSF2CURRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			this.clsf2cur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(12);
		while(rset4.next()){
			SS_SLS_BRMGR_2500_AMEDICDCURRecord rec = new SS_SLS_BRMGR_2500_AMEDICDCURRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.medicdcur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(13);
		while(rset5.next()){
			SS_SLS_BRMGR_2500_ASELLNETCURRecord rec = new SS_SLS_BRMGR_2500_ASELLNETCURRecord();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			this.sellnetcur.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(14);
		while(rset6.next()){
			SS_SLS_BRMGR_2500_ABOCLSFRecord rec = new SS_SLS_BRMGR_2500_ABOCLSFRecord();
			rec.cicodeval = Util.checkString(rset6.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset6.getString("cicdnm"));
			this.boclsf.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(15);
		while(rset7.next()){
			SS_SLS_BRMGR_2500_AD_STATRecord rec = new SS_SLS_BRMGR_2500_AD_STATRecord();
			rec.cicodeval = Util.checkString(rset7.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset7.getString("cicdnm"));
			this.d_stat.add(rec);
		}
		this.now_toyymm = Util.checkString(cstmt.getString(16));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_BRMGR_2500_ADataSet ds = (SS_SLS_BRMGR_2500_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SS_SLS_BRMGR_2500_ATEAMLISTRecord teamlistRec = (SS_SLS_BRMGR_2500_ATEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SS_SLS_BRMGR_2500_APARTLISTRecord partlistRec = (SS_SLS_BRMGR_2500_APARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SS_SLS_BRMGR_2500_AAREALISTRecord arealistRec = (SS_SLS_BRMGR_2500_AAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.clsf2cur.size(); i++){
		SS_SLS_BRMGR_2500_ACLSF2CURRecord clsf2curRec = (SS_SLS_BRMGR_2500_ACLSF2CURRecord)ds.clsf2cur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		SS_SLS_BRMGR_2500_AMEDICDCURRecord medicdcurRec = (SS_SLS_BRMGR_2500_AMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sellnetcur.size(); i++){
		SS_SLS_BRMGR_2500_ASELLNETCURRecord sellnetcurRec = (SS_SLS_BRMGR_2500_ASELLNETCURRecord)ds.sellnetcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.boclsf.size(); i++){
		SS_SLS_BRMGR_2500_ABOCLSFRecord boclsfRec = (SS_SLS_BRMGR_2500_ABOCLSFRecord)ds.boclsf.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.d_stat.size(); i++){
		SS_SLS_BRMGR_2500_AD_STATRecord d_statRec = (SS_SLS_BRMGR_2500_AD_STATRecord)ds.d_stat.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTeamlist()%>
<%= ds.getPartlist()%>
<%= ds.getArealist()%>
<%= ds.getClsf2cur()%>
<%= ds.getMedicdcur()%>
<%= ds.getSellnetcur()%>
<%= ds.getBoclsf()%>
<%= ds.getD_stat()%>
<%= ds.getNow_toyymm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= teamlistRec.dept_cd%>
<%= teamlistRec.dept_nm%>
<%= partlistRec.dept_cd%>
<%= partlistRec.dept_nm%>
<%= partlistRec.supr_dept_cd%>
<%= arealistRec.area_cd%>
<%= arealistRec.area_nm%>
<%= arealistRec.dept_cd%>
<%= arealistRec.supr_dept_cd%>
<%= clsf2curRec.cicodeval%>
<%= clsf2curRec.cicdnm%>
<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= medicdcurRec.ciymgbcd%>
<%= medicdcurRec.cicdgb%>
<%= medicdcurRec.cicdynm%>
<%= sellnetcurRec.cd%>
<%= sellnetcurRec.cdnm%>
<%= sellnetcurRec.cd_abrv_nm%>
<%= boclsfRec.cicodeval%>
<%= boclsfRec.cicdnm%>
<%= d_statRec.cicodeval%>
<%= d_statRec.cicdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 18 18:18:01 KST 2016 */