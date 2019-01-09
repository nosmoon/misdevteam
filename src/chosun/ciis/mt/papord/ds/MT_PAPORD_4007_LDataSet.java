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


package chosun.ciis.mt.papord.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_4007_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPORD_4007_LDataSet(){}
	public MT_PAPORD_4007_LDataSet(String errcode, String errmsg){
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
			MT_PAPORD_4007_LCURLISTRecord rec = new MT_PAPORD_4007_LCURLISTRecord();
			rec.d_mon = Util.checkString(rset0.getString("d_mon"));
			rec.d_mon_cnt = Util.checkString(rset0.getString("d_mon_cnt"));
			rec.d_tue = Util.checkString(rset0.getString("d_tue"));
			rec.d_tue_cnt = Util.checkString(rset0.getString("d_tue_cnt"));
			rec.d_wed = Util.checkString(rset0.getString("d_wed"));
			rec.d_wed_cnt = Util.checkString(rset0.getString("d_wed_cnt"));
			rec.d_thr = Util.checkString(rset0.getString("d_thr"));
			rec.d_thr_cnt = Util.checkString(rset0.getString("d_thr_cnt"));
			rec.d_fri = Util.checkString(rset0.getString("d_fri"));
			rec.d_fri_cnt = Util.checkString(rset0.getString("d_fri_cnt"));
			rec.d_sat = Util.checkString(rset0.getString("d_sat"));
			rec.d_sat_cnt = Util.checkString(rset0.getString("d_sat_cnt"));
			rec.d_sun = Util.checkString(rset0.getString("d_sun"));
			rec.d_sun_cnt = Util.checkString(rset0.getString("d_sun_cnt"));
			rec.issu_dt_fr = Util.checkString(rset0.getString("issu_dt_fr"));
			rec.issu_dt_to = Util.checkString(rset0.getString("issu_dt_to"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_yy = Util.checkString(rset0.getString("occr_yy"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.todt = Util.checkString(rset0.getString("todt"));
			rec.fix_clsf = Util.checkString(rset0.getString("fix_clsf"));
			rec.fix_clsf_nm = Util.checkString(rset0.getString("fix_clsf_nm"));
			rec.chg_dt = Util.checkString(rset0.getString("chg_dt"));
			rec.chg_tm = Util.checkString(rset0.getString("chg_tm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPORD_4007_LDataSet ds = (MT_PAPORD_4007_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPORD_4007_LCURLISTRecord curlistRec = (MT_PAPORD_4007_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.d_mon%>
<%= curlistRec.d_mon_cnt%>
<%= curlistRec.d_tue%>
<%= curlistRec.d_tue_cnt%>
<%= curlistRec.d_wed%>
<%= curlistRec.d_wed_cnt%>
<%= curlistRec.d_thr%>
<%= curlistRec.d_thr_cnt%>
<%= curlistRec.d_fri%>
<%= curlistRec.d_fri_cnt%>
<%= curlistRec.d_sat%>
<%= curlistRec.d_sat_cnt%>
<%= curlistRec.d_sun%>
<%= curlistRec.d_sun_cnt%>
<%= curlistRec.issu_dt_fr%>
<%= curlistRec.issu_dt_to%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_yy%>
<%= curlistRec.seq%>
<%= curlistRec.frdt%>
<%= curlistRec.todt%>
<%= curlistRec.fix_clsf%>
<%= curlistRec.fix_clsf_nm%>
<%= curlistRec.chg_dt%>
<%= curlistRec.chg_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 08 15:15:26 KST 2009 */