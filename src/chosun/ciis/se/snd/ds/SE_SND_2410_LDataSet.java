/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
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


public class SE_SND_2410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2410_LDataSet(){}
	public SE_SND_2410_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SE_SND_2410_LCURLISTRecord rec = new SE_SND_2410_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.aply_dt = Util.checkString(rset0.getString("aply_dt"));
			rec.aply_dt_key = Util.checkString(rset0.getString("aply_dt_key"));
			rec.tran_uprc_clas = Util.checkString(rset0.getString("tran_uprc_clas"));
			rec.tran_uprc_cd = Util.checkString(rset0.getString("tran_uprc_cd"));
			rec.tran_uprc_route_nm = Util.checkString(rset0.getString("tran_uprc_route_nm"));
			rec.route_clsf = Util.checkString(rset0.getString("route_clsf"));
			rec.route_cd = Util.checkString(rset0.getString("route_cd"));
			rec.route_nm = Util.checkString(rset0.getString("route_nm"));
			rec.prt_plac_cd = Util.checkString(rset0.getString("prt_plac_cd"));
			rec.route_lgth = Util.checkString(rset0.getString("route_lgth"));
			rec.load_wgt = Util.checkString(rset0.getString("load_wgt"));
			rec.tran_cost = Util.checkString(rset0.getString("tran_cost"));
			rec.tran_cost_ren = Util.checkString(rset0.getString("tran_cost_ren"));
			rec.tran_uprc_qty_clsf = Util.checkString(rset0.getString("tran_uprc_qty_clsf"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.cnsg_seqo = Util.checkString(rset0.getString("cnsg_seqo"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			rec.qty01 = Util.checkString(rset0.getString("qty01"));
			rec.qty02 = Util.checkString(rset0.getString("qty02"));
			rec.qty03 = Util.checkString(rset0.getString("qty03"));
			rec.qty04 = Util.checkString(rset0.getString("qty04"));
			rec.qty05 = Util.checkString(rset0.getString("qty05"));
			rec.qty06 = Util.checkString(rset0.getString("qty06"));
			rec.qty07 = Util.checkString(rset0.getString("qty07"));
			rec.qty08 = Util.checkString(rset0.getString("qty08"));
			rec.qty09 = Util.checkString(rset0.getString("qty09"));
			rec.qty10 = Util.checkString(rset0.getString("qty10"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_2410_LDataSet ds = (SE_SND_2410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2410_LCURLISTRecord curlistRec = (SE_SND_2410_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.aply_dt%>
<%= curlistRec.aply_dt_key%>
<%= curlistRec.tran_uprc_clas%>
<%= curlistRec.tran_uprc_cd%>
<%= curlistRec.tran_uprc_route_nm%>
<%= curlistRec.route_clsf%>
<%= curlistRec.route_cd%>
<%= curlistRec.route_nm%>
<%= curlistRec.prt_plac_cd%>
<%= curlistRec.route_lgth%>
<%= curlistRec.load_wgt%>
<%= curlistRec.tran_cost%>
<%= curlistRec.tran_cost_ren%>
<%= curlistRec.tran_uprc_qty_clsf%>
<%= curlistRec.rmks%>
<%= curlistRec.cnsg_seqo%>
<%= curlistRec.use_yn%>
<%= curlistRec.qty01%>
<%= curlistRec.qty02%>
<%= curlistRec.qty03%>
<%= curlistRec.qty04%>
<%= curlistRec.qty05%>
<%= curlistRec.qty06%>
<%= curlistRec.qty07%>
<%= curlistRec.qty08%>
<%= curlistRec.qty09%>
<%= curlistRec.qty10%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 02 13:40:12 KST 2009 */