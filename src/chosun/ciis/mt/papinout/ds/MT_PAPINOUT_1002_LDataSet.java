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


package chosun.ciis.mt.papinout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_1002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_1002_LDataSet(){}
	public MT_PAPINOUT_1002_LDataSet(String errcode, String errmsg){
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
			MT_PAPINOUT_1002_LCURLISTRecord rec = new MT_PAPINOUT_1002_LCURLISTRecord();
			rec.medi_cd_medc = Util.checkString(rset0.getString("medi_cd_medc"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.sect_cd_medc = Util.checkString(rset0.getString("sect_cd_medc"));
			rec.issu_pcnt_medc = Util.checkString(rset0.getString("issu_pcnt_medc"));
			rec.prt_qty = Util.checkString(rset0.getString("prt_qty"));
			rec.prt_wgt = Util.checkString(rset0.getString("prt_wgt"));
			rec.pj_excl_prt_wgt = Util.checkString(rset0.getString("pj_excl_prt_wgt"));
			rec.pap_gm_qunt = Util.checkString(rset0.getString("pap_gm_qunt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.prt_dt = Util.checkString(rset0.getString("prt_dt"));
			rec.issu_dt_issu = Util.checkString(rset0.getString("issu_dt_issu"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.medi_cd_issu = Util.checkString(rset0.getString("medi_cd_issu"));
			rec.pap_std = Util.checkString(rset0.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset0.getString("issu_pcnt"));
			rec.bw_pcnt = Util.checkString(rset0.getString("bw_pcnt"));
			rec.clr_pcnt = Util.checkString(rset0.getString("clr_pcnt"));
			rec.slip_qty = Util.checkString(rset0.getString("slip_qty"));
			rec.medi_cdnm_issu = Util.checkString(rset0.getString("medi_cdnm_issu"));
			rec.sect_cdnm_issu = Util.checkString(rset0.getString("sect_cdnm_issu"));
			rec.sect_cd_issu = Util.checkString(rset0.getString("sect_cd_issu"));
			rec.sum_pjqunt = Util.checkString(rset0.getString("sum_pjqunt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPINOUT_1002_LDataSet ds = (MT_PAPINOUT_1002_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_1002_LCURLISTRecord curlistRec = (MT_PAPINOUT_1002_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.medi_cd_medc%>
<%= curlistRec.issu_dt%>
<%= curlistRec.sect_cd_medc%>
<%= curlistRec.issu_pcnt_medc%>
<%= curlistRec.prt_qty%>
<%= curlistRec.prt_wgt%>
<%= curlistRec.pj_excl_prt_wgt%>
<%= curlistRec.pap_gm_qunt%>
<%= curlistRec.remk%>
<%= curlistRec.prt_dt%>
<%= curlistRec.issu_dt_issu%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.medi_cd_issu%>
<%= curlistRec.pap_std%>
<%= curlistRec.issu_pcnt%>
<%= curlistRec.bw_pcnt%>
<%= curlistRec.clr_pcnt%>
<%= curlistRec.slip_qty%>
<%= curlistRec.medi_cdnm_issu%>
<%= curlistRec.sect_cdnm_issu%>
<%= curlistRec.sect_cd_issu%>
<%= curlistRec.sum_pjqunt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 14 17:43:00 KST 2009 */