/***************************************************************************************************
* 파일명 : SE_SND_2710_LDataSet.java
* 기능 : 판매-발송관리-기간별수송비 조회
* 작성일자 : 2009-03-02
* 작성자 : 김대준
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


public class SE_SND_2710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2710_LDataSet(){}
	public SE_SND_2710_LDataSet(String errcode, String errmsg){
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
		this.errcode 				= Util.checkString(cstmt.getString(1));
		this.errmsg 				= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 			= (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_SND_2710_LCURLISTRecord rec = new SE_SND_2710_LCURLISTRecord();
			rec.pay_dt 				= Util.checkString(rset0.getString("pay_dt"				));
			rec.tran_uprc_clas 		= Util.checkString(rset0.getString("tran_uprc_clas"		));
			rec.tran_uprc_nm 		= Util.checkString(rset0.getString("tran_uprc_nm"		));
			rec.std_tran_uprc 		= Util.checkString(rset0.getString("std_tran_uprc"		));
			rec.pay_tran_uprc 		= Util.checkString(rset0.getString("pay_tran_uprc"		));
			rec.work_dds 			= Util.checkString(rset0.getString("work_dds"			));
			rec.pay_tran_cost 		= Util.checkString(rset0.getString("pay_tran_cost"		));
			rec.tran_uprc_cd 		= Util.checkString(rset0.getString("tran_uprc_cd"		));
			rec.tran_uprc_route_nm 	= Util.checkString(rset0.getString("tran_uprc_route_nm"	));
			rec.route_clsf 			= Util.checkString(rset0.getString("route_clsf"			));
			rec.route_clsf_nm 		= Util.checkString(rset0.getString("route_clsf_nm"		));
			rec.route_cd 			= Util.checkString(rset0.getString("route_cd"			));
			rec.route_nm 			= Util.checkString(rset0.getString("route_nm"			));
			rec.prt_plac_cd 		= Util.checkString(rset0.getString("prt_plac_cd"		));
			rec.prt_plac_nm 		= Util.checkString(rset0.getString("prt_plac_nm"		));
			rec.dlco_no 			= Util.checkString(rset0.getString("dlco_no"			));
			rec.tran_cmpy_cd 		= Util.checkString(rset0.getString("tran_cmpy_cd"		));
			rec.tran_cmpy_nm 		= Util.checkString(rset0.getString("tran_cmpy_nm"		));
			rec.corp_clsf 			= Util.checkString(rset0.getString("corp_clsf"			));
			rec.corp_clsf_nm 		= Util.checkString(rset0.getString("corp_clsf_nm"		));
			rec.acct_no 			= Util.checkString(rset0.getString("acct_no"			));
			rec.medi_cd 			= Util.checkString(rset0.getString("medi_cd"			));
			rec.medi_nm 			= Util.checkString(rset0.getString("medi_nm"			));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_2710_LDataSet ds = (SE_SND_2710_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2710_LCURLISTRecord curlistRec = (SE_SND_2710_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pay_dt%>
<%= curlistRec.tran_uprc_clas%>
<%= curlistRec.tran_uprc_nm%>
<%= curlistRec.std_tran_uprc%>
<%= curlistRec.pay_tran_uprc%>
<%= curlistRec.work_dds%>
<%= curlistRec.pay_tran_cost%>
<%= curlistRec.tran_uprc_cd%>
<%= curlistRec.tran_uprc_route_nm%>
<%= curlistRec.route_clsf%>
<%= curlistRec.route_clsf_nm%>
<%= curlistRec.route_cd%>
<%= curlistRec.route_nm%>
<%= curlistRec.prt_plac_cd%>
<%= curlistRec.prt_plac_nm%>
<%= curlistRec.dlco_no%>
<%= curlistRec.tran_cmpy_cd%>
<%= curlistRec.tran_cmpy_nm%>
<%= curlistRec.corp_clsf%>
<%= curlistRec.corp_clsf_nm%>
<%= curlistRec.acct_no%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 02 13:18:46 KST 2009 */