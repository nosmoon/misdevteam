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


package chosun.ciis.pr.papmake.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_1013_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_1013_LDataSet(){}
	public PR_PAPMAKE_1013_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			PR_PAPMAKE_1013_LCURLISTRecord rec = new PR_PAPMAKE_1013_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.duty_dt = Util.checkString(rset0.getString("duty_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.wk_duty_nops = Util.checkString(rset0.getString("wk_duty_nops"));
			rec.ngt_duty_nops = Util.checkString(rset0.getString("ngt_duty_nops"));
			rec.dtfree_nops = Util.checkString(rset0.getString("dtfree_nops"));
			rec.vaca_nops = Util.checkString(rset0.getString("vaca_nops"));
			rec.dspch_nops = Util.checkString(rset0.getString("dspch_nops"));
			rec.etc_nops = Util.checkString(rset0.getString("etc_nops"));
			rec.night_shift_liab_pers = Util.checkString(rset0.getString("night_shift_liab_pers"));
			rec.mchn_1_duty_pers = Util.checkString(rset0.getString("mchn_1_duty_pers"));
			rec.mchn_2_duty_pers = Util.checkString(rset0.getString("mchn_2_duty_pers"));
			rec.mchn_3_duty_pers = Util.checkString(rset0.getString("mchn_3_duty_pers"));
			rec.mchn_4_duty_pers = Util.checkString(rset0.getString("mchn_4_duty_pers"));
			rec.mchn_duty_pers = Util.checkString(rset0.getString("mchn_duty_pers"));
			rec.befo_duty_pers = Util.checkString(rset0.getString("befo_duty_pers"));
			rec.prt_board_duty_pers = Util.checkString(rset0.getString("prt_board_duty_pers"));
			rec.send_duty_pers = Util.checkString(rset0.getString("send_duty_pers"));
			rec.etc_duty_pers = Util.checkString(rset0.getString("etc_duty_pers"));
			rec.clos_clsf = Util.checkString(rset0.getString("clos_clsf"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PAPMAKE_1013_LDataSet ds = (PR_PAPMAKE_1013_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PAPMAKE_1013_LCURLISTRecord curlistRec = (PR_PAPMAKE_1013_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.duty_dt%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.wk_duty_nops%>
<%= curlistRec.ngt_duty_nops%>
<%= curlistRec.dtfree_nops%>
<%= curlistRec.vaca_nops%>
<%= curlistRec.dspch_nops%>
<%= curlistRec.etc_nops%>
<%= curlistRec.night_shift_liab_pers%>
<%= curlistRec.mchn_1_duty_pers%>
<%= curlistRec.mchn_2_duty_pers%>
<%= curlistRec.mchn_3_duty_pers%>
<%= curlistRec.mchn_4_duty_pers%>
<%= curlistRec.mchn_duty_pers%>
<%= curlistRec.befo_duty_pers%>
<%= curlistRec.prt_board_duty_pers%>
<%= curlistRec.send_duty_pers%>
<%= curlistRec.etc_duty_pers%>
<%= curlistRec.clos_clsf%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 17 19:02:43 KST 2009 */