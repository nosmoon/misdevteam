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


package chosun.ciis.mt.etccar.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_9111_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCCAR_9111_LDataSet(){}
	public MT_ETCCAR_9111_LDataSet(String errcode, String errmsg){
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
			MT_ETCCAR_9111_LCURLISTRecord rec = new MT_ETCCAR_9111_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.cmpy_cd_nm = Util.checkString(rset0.getString("cmpy_cd_nm"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.start_dt = Util.checkString(rset0.getString("start_dt"));
			rec.start_tm = Util.checkString(rset0.getString("start_tm"));
			rec.ariv_dt = Util.checkString(rset0.getString("ariv_dt"));
			rec.ariv_tm = Util.checkString(rset0.getString("ariv_tm"));
			rec.dest = Util.checkString(rset0.getString("dest"));
			rec.rid_pers = Util.checkString(rset0.getString("rid_pers"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.rid_pers_cnt = rset0.getInt("rid_pers_cnt");
			rec.rid_deptcd = Util.checkString(rset0.getString("rid_deptcd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.driv_purp = Util.checkString(rset0.getString("driv_purp"));
			rec.driv_purp_nm = Util.checkString(rset0.getString("driv_purp_nm"));
			rec.req_stat = Util.checkString(rset0.getString("req_stat"));
			rec.req_stat_nm = Util.checkString(rset0.getString("req_stat_nm"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.drvr_nm = Util.checkString(rset0.getString("drvr_nm"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.rid_ptphno = Util.checkString(rset0.getString("rid_ptphno"));
			rec.cmpy_mang_nm = Util.checkString(rset0.getString("cmpy_mang_nm"));
			rec.car_no = Util.checkString(rset0.getString("car_no"));
			rec.car_modl = Util.checkString(rset0.getString("car_modl"));
			rec.req_occr_dt = Util.checkString(rset0.getString("req_occr_dt"));
			rec.req_seq = Util.checkString(rset0.getString("req_seq"));
			rec.drvr_yn = Util.checkString(rset0.getString("drvr_yn"));
			rec.canc_caus = Util.checkString(rset0.getString("canc_caus"));
			rec.gubun = Util.checkString(rset0.getString("gubun"));
			rec.real_aplc_pers = Util.checkString(rset0.getString("real_aplc_pers"));
			rec.real_aplc_pers_nm = Util.checkString(rset0.getString("real_aplc_pers_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCCAR_9201_LDataSet ds = (MT_ETCCAR_9201_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_ETCCAR_9201_LCURLISTRecord curlistRec = (MT_ETCCAR_9201_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.start_dt%>
<%= curlistRec.start_tm%>
<%= curlistRec.ariv_dt%>
<%= curlistRec.ariv_tm%>
<%= curlistRec.dest%>
<%= curlistRec.rid_pers%>
<%= curlistRec.rid_pers_cnt%>
<%= curlistRec.rid_deptcd%>
<%= curlistRec.rid_deptcd_nm%>
<%= curlistRec.driv_purp%>
<%= curlistRec.driv_purp_nm%>
<%= curlistRec.req_stat%>
<%= curlistRec.req_stat_nm%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_dt_tm%>
<%= curlistRec.remk%>
<%= curlistRec.drvr_nm%>
<%= curlistRec.tel_no%>
<%= curlistRec.cmpy_mang_nm%>
<%= curlistRec.car_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 04 10:24:11 KST 2012 */