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


package chosun.ciis.hd.hlywrk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.hlywrk.dm.*;
import chosun.ciis.hd.hlywrk.rec.*;

/**
 * 
 */


public class HD_HLYWRK_1001_344_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_HLYWRK_1001_344_LDataSet(){}
	public HD_HLYWRK_1001_344_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_HLYWRK_1001_344_LCURLISTRecord rec = new HD_HLYWRK_1001_344_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.aply_basi_dt = Util.checkString(rset0.getString("aply_basi_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.hody_clsf = Util.checkString(rset0.getString("hody_clsf"));
			rec.obj_clsf = Util.checkString(rset0.getString("obj_clsf"));
			rec.prsnt_hody_clsf = Util.checkString(rset0.getString("prsnt_hody_clsf"));
			rec.finish_hody_clsf = Util.checkString(rset0.getString("finish_hody_clsf"));
			rec.prsnt_tm = Util.checkString(rset0.getString("prsnt_tm"));
			rec.finish_tm = Util.checkString(rset0.getString("finish_tm"));
			rec.finish_dd_clsf = Util.checkString(rset0.getString("finish_dd_clsf"));
			rec.duty_tm = Util.checkString(rset0.getString("duty_tm"));
			rec.alvc_occr_yn = Util.checkString(rset0.getString("alvc_occr_yn"));
			rec.base_alon = Util.checkString(rset0.getString("base_alon"));
			rec.cmpn_alon = Util.checkString(rset0.getString("cmpn_alon"));
			rec.tot_alon = Util.checkString(rset0.getString("tot_alon"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_HLYWRK_1001_344_LDataSet ds = (HD_HLYWRK_1001_344_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_HLYWRK_1001_344_LCURLISTRecord curlistRec = (HD_HLYWRK_1001_344_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.aply_basi_dt%>
<%= curlistRec.seq%>
<%= curlistRec.hody_clsf%>
<%= curlistRec.obj_clsf%>
<%= curlistRec.prsnt_hody_clsf%>
<%= curlistRec.finish_hody_clsf%>
<%= curlistRec.prsnt_tm%>
<%= curlistRec.finish_tm%>
<%= curlistRec.finish_dd_clsf%>
<%= curlistRec.duty_tm%>
<%= curlistRec.alvc_occr_yn%>
<%= curlistRec.base_alon%>
<%= curlistRec.cmpn_alon%>
<%= curlistRec.tot_alon%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 16 15:31:11 KST 2012 */