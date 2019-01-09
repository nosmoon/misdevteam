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


public class MT_PAPINOUT_2205_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String pj_arg1;
	public String pj_arg2;
	public String wgt;

	public MT_PAPINOUT_2205_LDataSet(){}
	public MT_PAPINOUT_2205_LDataSet(String errcode, String errmsg, String pj_arg1, String pj_arg2, String wgt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.pj_arg1 = pj_arg1;
		this.pj_arg2 = pj_arg2;
		this.wgt = wgt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPj_arg1(String pj_arg1){
		this.pj_arg1 = pj_arg1;
	}

	public void setPj_arg2(String pj_arg2){
		this.pj_arg2 = pj_arg2;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPj_arg1(){
		return this.pj_arg1;
	}

	public String getPj_arg2(){
		return this.pj_arg2;
	}

	public String getWgt(){
		return this.wgt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_PAPINOUT_2205_LCURLISTRecord rec = new MT_PAPINOUT_2205_LCURLISTRecord();
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.prt_dt = Util.checkString(rset0.getString("prt_dt"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.medi_cdnm = Util.checkString(rset0.getString("medi_cdnm"));
			rec.sect_cdnm = Util.checkString(rset0.getString("sect_cdnm"));
			rec.pap_std = Util.checkString(rset0.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset0.getString("issu_pcnt"));
			rec.bw_pcnt = Util.checkString(rset0.getString("bw_pcnt"));
			rec.clr_pcnt = Util.checkString(rset0.getString("clr_pcnt"));
			rec.slip_qty = Util.checkString(rset0.getString("slip_qty"));
			rec.prt_wgt = Util.checkString(rset0.getString("prt_wgt"));
			this.curlist.add(rec);
		}
		this.pj_arg1 = Util.checkString(cstmt.getString(7));
		this.pj_arg2 = Util.checkString(cstmt.getString(8));
		this.wgt = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPINOUT_2205_LDataSet ds = (MT_PAPINOUT_2205_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_2205_LCURLISTRecord curlistRec = (MT_PAPINOUT_2205_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getPj_arg1()%>
<%= ds.getPj_arg2()%>
<%= ds.getWgt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.issu_dt%>
<%= curlistRec.prt_dt%>
<%= curlistRec.medi_cd%>
<%= curlistRec.sect_cd%>
<%= curlistRec.medi_cdnm%>
<%= curlistRec.sect_cdnm%>
<%= curlistRec.pap_std%>
<%= curlistRec.issu_pcnt%>
<%= curlistRec.bw_pcnt%>
<%= curlistRec.clr_pcnt%>
<%= curlistRec.slip_qty%>
<%= curlistRec.prt_wgt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 22 13:41:56 KST 2009 */