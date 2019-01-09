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


package chosun.ciis.ad.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_3720_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_3720_LDataSet(){}
	public AD_BAS_3720_LDataSet(String errcode, String errmsg){
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
			AD_BAS_3720_LCURLISTRecord rec = new AD_BAS_3720_LCURLISTRecord();
			rec.sun = Util.checkString(rset0.getString("sun"));
			rec.sun_cnt = Util.checkString(rset0.getString("sun_cnt"));
			rec.mon = Util.checkString(rset0.getString("mon"));
			rec.mon_cnt = Util.checkString(rset0.getString("mon_cnt"));
			rec.tue = Util.checkString(rset0.getString("tue"));
			rec.tue_cnt = Util.checkString(rset0.getString("tue_cnt"));
			rec.wed = Util.checkString(rset0.getString("wed"));
			rec.wed_cnt = Util.checkString(rset0.getString("wed_cnt"));
			rec.thr = Util.checkString(rset0.getString("thr"));
			rec.thr_cnt = Util.checkString(rset0.getString("thr_cnt"));
			rec.fri = Util.checkString(rset0.getString("fri"));
			rec.fri_cnt = Util.checkString(rset0.getString("fri_cnt"));
			rec.sat = Util.checkString(rset0.getString("sat"));
			rec.sat_cnt = Util.checkString(rset0.getString("sat_cnt"));
			this.curlist.add(rec);
		}

	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_3720_LDataSet ds = (AD_BAS_3720_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_3720_LCURLISTRecord curlistRec = (AD_BAS_3720_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_3720_LCURLIST2Record curlist2Rec = (AD_BAS_3720_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_BAS_3720_LCURLIST3Record curlist3Rec = (AD_BAS_3720_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.sun%>
<%= curlistRec.sun_cnt%>
<%= curlistRec.mon%>
<%= curlistRec.mon_cnt%>
<%= curlistRec.tue%>
<%= curlistRec.tue_cnt%>
<%= curlistRec.wed%>
<%= curlistRec.wed_cnt%>
<%= curlistRec.thr%>
<%= curlistRec.thr_cnt%>
<%= curlistRec.fri%>
<%= curlistRec.fri_cnt%>
<%= curlistRec.sat%>
<%= curlistRec.sat_cnt%>
<%= curlist2Rec.pubc_dt%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.sect_nm_cd%>
<%= curlist2Rec.sect_nm%>
<%= curlist2Rec.sect_nm_detail%>
<%= curlist2Rec.sect_cd%>
<%= curlist2Rec.tot_pcnt%>
<%= curlist2Rec.tot_dn%>
<%= curlist2Rec.tot_clr_dn%>
<%= curlist2Rec.tot_pubc_amt%>
<%= curlist2Rec.advt_ocpy_rate%>
<%= curlist3Rec.pubc_dt%>
<%= curlist3Rec.seq%>
<%= curlist3Rec.sect_nm_cd%>
<%= curlist3Rec.sect_nm%>
<%= curlist3Rec.sect_nm_detail%>
<%= curlist3Rec.sect_cd%>
<%= curlist3Rec.tot_pcnt%>
<%= curlist3Rec.tot_dn%>
<%= curlist3Rec.tot_clr_dn%>
<%= curlist3Rec.tot_pubc_amt%>
<%= curlist3Rec.advt_ocpy_rate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 07 18:33:55 KST 2012 */