/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2910_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2910_LDataSet(){}
	public SE_SND_2910_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SE_SND_2910_LCURLISTRecord rec = new SE_SND_2910_LCURLISTRecord();
			rec.reg_dt = Util.checkString(rset0.getString("reg_dt"));
			rec.reg_seq = Util.checkString(rset0.getString("reg_seq"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.prt_rfl_qty = Util.checkString(rset0.getString("prt_rfl_qty"));
			rec.cnfm_stat_clsf_nm = Util.checkString(rset0.getString("cnfm_stat_clsf_nm"));
			rec.arvl_clsf_nm = Util.checkString(rset0.getString("arvl_clsf_nm"));
			rec.clos_tms = Util.checkString(rset0.getString("clos_tms"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.route_clsf = Util.checkString(rset0.getString("route_clsf"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.send_plac_seq = Util.checkString(rset0.getString("send_plac_seq"));
			rec.send_plac_nm = Util.checkString(rset0.getString("send_plac_nm"));
			rec.aplc_pers_nm = Util.checkString(rset0.getString("aplc_pers_nm"));
			rec.call_no = Util.checkString(rset0.getString("call_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_2910_LDataSet ds = (SE_SND_2910_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2910_LCURLISTRecord curlistRec = (SE_SND_2910_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.reg_dt%>
<%= curlistRec.reg_seq%>
<%= curlistRec.issu_dt%>
<%= curlistRec.medi_nm%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_nm%>
<%= curlistRec.qty%>
<%= curlistRec.prt_rfl_qty%>
<%= curlistRec.cnfm_stat_clsf_nm%>
<%= curlistRec.arvl_clsf_nm%>
<%= curlistRec.clos_tms%>
<%= curlistRec.area_nm%>
<%= curlistRec.route_clsf%>
<%= curlistRec.bo_cd%>
<%= curlistRec.send_plac_seq%>
<%= curlistRec.send_plac_nm%>
<%= curlistRec.aplc_pers_nm%>
<%= curlistRec.call_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 30 10:29:04 KST 2009 */