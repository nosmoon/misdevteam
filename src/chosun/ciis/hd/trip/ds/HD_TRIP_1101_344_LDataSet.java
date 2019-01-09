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


package chosun.ciis.hd.trip.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.dm.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_1101_344_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_TRIP_1101_344_LDataSet(){}
	public HD_TRIP_1101_344_LDataSet(String errcode, String errmsg){
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
			HD_TRIP_1101_344_LCURLISTRecord rec = new HD_TRIP_1101_344_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.busi_trip_fee_stot = Util.checkString(rset0.getString("busi_trip_fee_stot"));
			rec.dd_fee = Util.checkString(rset0.getString("dd_fee"));
			rec.food_fee = Util.checkString(rset0.getString("food_fee"));
			rec.busi_trip_dds = Util.checkString(rset0.getString("busi_trip_dds"));
			rec.dd_stay_fee = Util.checkString(rset0.getString("dd_stay_fee"));
			rec.stay_dds = Util.checkString(rset0.getString("stay_dds"));
			rec.trff_fee = Util.checkString(rset0.getString("trff_fee"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.rptv_posi_cd = Util.checkString(rset0.getString("rptv_posi_cd"));
			rec.rptv_posi_nm = Util.checkString(rset0.getString("rptv_posi_nm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			HD_TRIP_1101_344_LCURLIST2Record rec = new HD_TRIP_1101_344_LCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.flnm = Util.checkString(rset1.getString("flnm"));
			rec.busi_trip_dt = Util.checkString(rset1.getString("busi_trip_dt"));
			rec.start_area = Util.checkString(rset1.getString("start_area"));
			rec.via_area = Util.checkString(rset1.getString("via_area"));
			rec.ariv_area = Util.checkString(rset1.getString("ariv_area"));
			rec.stay_area = Util.checkString(rset1.getString("stay_area"));
			rec.path_clsf = Util.checkString(rset1.getString("path_clsf"));
			rec.path_nm = Util.checkString(rset1.getString("path_nm"));
			rec.dd_fee = Util.checkString(rset1.getString("dd_fee"));
			rec.food_fee = Util.checkString(rset1.getString("food_fee"));
			rec.stay_clsf = Util.checkString(rset1.getString("stay_clsf"));
			rec.stay_nm = Util.checkString(rset1.getString("stay_nm"));
			rec.stay_fee = Util.checkString(rset1.getString("stay_fee"));
			rec.trff_fee = Util.checkString(rset1.getString("trff_fee"));
			rec.trff_means_cd = Util.checkString(rset1.getString("trff_means_cd"));
			rec.trff_means_nm = Util.checkString(rset1.getString("trff_means_nm"));
			rec.trff_means_etc = Util.checkString(rset1.getString("trff_means_etc"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.sub_seq = Util.checkString(rset1.getString("sub_seq"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_TRIP_1101_344_LDataSet ds = (HD_TRIP_1101_344_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_TRIP_1101_344_LCURLISTRecord curlistRec = (HD_TRIP_1101_344_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_TRIP_1101_344_LCURLIST2Record curlist2Rec = (HD_TRIP_1101_344_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dty_cd%>
<%= curlistRec.posi_cd%>
<%= curlistRec.busi_trip_fee_stot%>
<%= curlistRec.dd_fee%>
<%= curlistRec.food_fee%>
<%= curlistRec.busi_trip_dds%>
<%= curlistRec.dd_stay_fee%>
<%= curlistRec.stay_dds%>
<%= curlistRec.trff_fee%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.rptv_posi_cd%>
<%= curlistRec.rptv_posi_nm%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.emp_no%>
<%= curlist2Rec.flnm%>
<%= curlist2Rec.busi_trip_dt%>
<%= curlist2Rec.start_area%>
<%= curlist2Rec.via_area%>
<%= curlist2Rec.ariv_area%>
<%= curlist2Rec.stay_area%>
<%= curlist2Rec.path_clsf%>
<%= curlist2Rec.path_nm%>
<%= curlist2Rec.dd_fee%>
<%= curlist2Rec.food_fee%>
<%= curlist2Rec.stay_clsf%>
<%= curlist2Rec.stay_nm%>
<%= curlist2Rec.stay_fee%>
<%= curlist2Rec.trff_fee%>
<%= curlist2Rec.trff_means_cd%>
<%= curlist2Rec.trff_means_nm%>
<%= curlist2Rec.trff_means_etc%>
<%= curlist2Rec.occr_dt%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.sub_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 09 15:47:21 KST 2012 */