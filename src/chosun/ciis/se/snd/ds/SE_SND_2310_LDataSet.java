/***************************************************************************************************
* 파일명 : SE_SND_2310_LDataSet.java
* 기능 : 판매-발송관리-수송업자등록
* 작성일자 : 2009-02-13
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


public class SE_SND_2310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2310_LDataSet(){}
	public SE_SND_2310_LDataSet(String errcode, String errmsg){
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
		this.errcode 			= Util.checkString(cstmt.getString(1));
		this.errmsg 			= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 		= (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_SND_2310_LCURLISTRecord rec = new SE_SND_2310_LCURLISTRecord();
			rec.cmpy_cd 		= Util.checkString(rset0.getString("cmpy_cd"		));
			rec.tran_cmpy_cd 	= Util.checkString(rset0.getString("tran_cmpy_cd"	));
			rec.dlco_no 		= Util.checkString(rset0.getString("dlco_no"		));
			rec.car_no 			= Util.checkString(rset0.getString("car_no"			));
			rec.tran_cmpy_nm	= Util.checkString(rset0.getString("tran_cmpy_nm"	));
			rec.corp_clsf 		= Util.checkString(rset0.getString("corp_clsf"		));
			rec.zip_1 			= Util.checkString(rset0.getString("zip_1"			));
			rec.zip_2 			= Util.checkString(rset0.getString("zip_2"			));
			rec.addr 			= Util.checkString(rset0.getString("addr"			));
			rec.dtls_addr 		= Util.checkString(rset0.getString("dtls_addr"		));
			rec.tel_no 			= Util.checkString(rset0.getString("tel_no"			));
			rec.ptph_no 		= Util.checkString(rset0.getString("ptph_no"		));
			rec.cntr_dt 		= Util.checkString(rset0.getString("cntr_dt"		));
			rec.cctr_dt 		= Util.checkString(rset0.getString("cctr_dt"		));
			rec.use_yn 			= Util.checkString(rset0.getString("use_yn"			));
			rec.setl_bank		= Util.checkString(rset0.getString("setl_bank"		));
			rec.acct_no			= Util.checkString(rset0.getString("acct_no"		));
			
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_2310_LDataSet ds = (SE_SND_2310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2310_LCURLISTRecord curlistRec = (SE_SND_2310_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.tran_cmpy_cd%>
<%= curlistRec.dlco_no%>
<%= curlistRec.car_no%>
<%= curlistRec.tran_cmpy_nm%>
<%= curlistRec.cmpy_clsf%>
<%= curlistRec.zip_1%>
<%= curlistRec.zip_2%>
<%= curlistRec.addr%>
<%= curlistRec.dtls_addr%>
<%= curlistRec.tel_no%>
<%= curlistRec.ptph_no%>
<%= curlistRec.cntr_dt%>
<%= curlistRec.cctr_dt%>
<%= curlistRec.use_yn%>
<%= curlistRec.route_clsf%>
<%= curlistRec.route_cd%>
<%= curlistRec.cnsg_seqo%>
<%= curlistRec.route_nm%>
<%= curlistRec.prt_plac_nm%>
<%= curlistRec.tran_cost%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 13 14:29:43 KST 2009 */