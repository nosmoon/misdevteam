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

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.rec.*;

/**
 * 
 */


public class AD_RES_1000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList sectnmcurlist = new ArrayList();
	public ArrayList sectclsfcurlist = new ArrayList();
	public ArrayList panclsfcurlist = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_RES_1000_MDataSet(){}
	public AD_RES_1000_MDataSet(String errcode, String errmsg){
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
			AD_RES_1000_MCURLISTRecord rec = new AD_RES_1000_MCURLISTRecord();
			rec.sun = Util.checkString(rset0.getString("sun"));
			rec.sun_cnt = Util.checkString(rset0.getString("sun_cnt"));
			rec.sun_pcnt_clos_yn = Util.checkString(rset0.getString("sun_pcnt_clos_yn"));
			rec.sun_clos_yn = Util.checkString(rset0.getString("sun_clos_yn"));
			rec.mon = Util.checkString(rset0.getString("mon"));
			rec.mon_cnt = Util.checkString(rset0.getString("mon_cnt"));
			rec.mon_pcnt_clos_yn = Util.checkString(rset0.getString("mon_pcnt_clos_yn"));
			rec.mon_clos_yn = Util.checkString(rset0.getString("mon_clos_yn"));
			rec.tue = Util.checkString(rset0.getString("tue"));
			rec.tue_cnt = Util.checkString(rset0.getString("tue_cnt"));
			rec.tue_pcnt_clos_yn = Util.checkString(rset0.getString("tue_pcnt_clos_yn"));
			rec.tue_clos_yn = Util.checkString(rset0.getString("tue_clos_yn"));
			rec.wed = Util.checkString(rset0.getString("wed"));
			rec.wed_cnt = Util.checkString(rset0.getString("wed_cnt"));
			rec.wed_pcnt_clos_yn = Util.checkString(rset0.getString("wed_pcnt_clos_yn"));
			rec.wed_clos_yn = Util.checkString(rset0.getString("wed_clos_yn"));
			rec.thr = Util.checkString(rset0.getString("thr"));
			rec.thr_cnt = Util.checkString(rset0.getString("thr_cnt"));
			rec.thr_pcnt_clos_yn = Util.checkString(rset0.getString("thr_pcnt_clos_yn"));
			rec.thr_clos_yn = Util.checkString(rset0.getString("thr_clos_yn"));
			rec.fri = Util.checkString(rset0.getString("fri"));
			rec.fri_cnt = Util.checkString(rset0.getString("fri_cnt"));
			rec.fri_pcnt_clos_yn = Util.checkString(rset0.getString("fri_pcnt_clos_yn"));
			rec.fri_clos_yn = Util.checkString(rset0.getString("fri_clos_yn"));
			rec.sat = Util.checkString(rset0.getString("sat"));
			rec.sat_cnt = Util.checkString(rset0.getString("sat_cnt"));
			rec.sat_pcnt_clos_yn = Util.checkString(rset0.getString("sat_pcnt_clos_yn"));
			rec.sat_clos_yn = Util.checkString(rset0.getString("sat_clos_yn"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			AD_RES_1000_MSECTCLSFCURLISTRecord rec = new AD_RES_1000_MSECTCLSFCURLISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset1.getString("mang_cd_1"));
			this.sectclsfcurlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			AD_RES_1000_MSECTNMCURLISTRecord rec = new AD_RES_1000_MSECTNMCURLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset2.getString("mang_cd_1"));
			this.sectnmcurlist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			AD_RES_1000_MPANCLSFCURLISTRecord rec = new AD_RES_1000_MPANCLSFCURLISTRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			this.panclsfcurlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_RES_1000_MDataSet ds = (AD_RES_1000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1000_MCURLISTRecord curlistRec = (AD_RES_1000_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sectclsfcurlist.size(); i++){
		AD_RES_1000_MSECTCLSFCURLISTRecord sectclsfcurlistRec = (AD_RES_1000_MSECTCLSFCURLISTRecord)ds.sectclsfcurlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sectnmcurlist.size(); i++){
		AD_RES_1000_MSECTNMCURLISTRecord sectnmcurlistRec = (AD_RES_1000_MSECTNMCURLISTRecord)ds.sectnmcurlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.panclsfcurlist.size(); i++){
		AD_RES_1000_MPANCLSFCURLISTRecord panclsfcurlistRec = (AD_RES_1000_MPANCLSFCURLISTRecord)ds.panclsfcurlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getSectclsfcurlist()%>
<%= ds.getSectnmcurlist()%>
<%= ds.getPanclsfcurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.sun%>
<%= curlistRec.sun_cnt%>
<%= curlistRec.sun_pcnt_clos_yn%>
<%= curlistRec.sun_clos_yn%>
<%= curlistRec.mon%>
<%= curlistRec.mon_cnt%>
<%= curlistRec.mon_pcnt_clos_yn%>
<%= curlistRec.mon_clos_yn%>
<%= curlistRec.tue%>
<%= curlistRec.tue_cnt%>
<%= curlistRec.tue_pcnt_clos_yn%>
<%= curlistRec.tue_clos_yn%>
<%= curlistRec.wed%>
<%= curlistRec.wed_cnt%>
<%= curlistRec.wed_pcnt_clos_yn%>
<%= curlistRec.wed_clos_yn%>
<%= curlistRec.thr%>
<%= curlistRec.thr_cnt%>
<%= curlistRec.thr_pcnt_clos_yn%>
<%= curlistRec.thr_clos_yn%>
<%= curlistRec.fri%>
<%= curlistRec.fri_cnt%>
<%= curlistRec.fri_pcnt_clos_yn%>
<%= curlistRec.fri_clos_yn%>
<%= curlistRec.sat%>
<%= curlistRec.sat_cnt%>
<%= curlistRec.sat_pcnt_clos_yn%>
<%= curlistRec.sat_clos_yn%>
<%= sectclsfcurlistRec.cd%>
<%= sectclsfcurlistRec.cdnm%>
<%= sectclsfcurlistRec.mang_cd_1%>
<%= sectnmcurlistRec.cd%>
<%= sectnmcurlistRec.cdnm%>
<%= sectnmcurlistRec.mang_cd_1%>
<%= panclsfcurlistRec.cd%>
<%= panclsfcurlistRec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 28 16:19:50 KST 2017 */