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


package chosun.ciis.pr.sendmg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.sendmg.dm.*;
import chosun.ciis.pr.sendmg.rec.*;

/**
 * 
 */


public class PR_SENDMG_1021_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_SENDMG_1021_LDataSet(){}
	public PR_SENDMG_1021_LDataSet(String errcode, String errmsg){
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
			PR_SENDMG_1021_LCURLIST1Record rec = new PR_SENDMG_1021_LCURLIST1Record();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.prt_plac_clsf = Util.checkString(rset0.getString("prt_plac_clsf"));
			rec.ecnt = Util.checkString(rset0.getString("ecnt"));
			rec.prt_bgn_tm = Util.checkString(rset0.getString("prt_bgn_tm"));
			rec.prt_end_tm = Util.checkString(rset0.getString("prt_end_tm"));
			rec.slip_qty = Util.checkString(rset0.getString("slip_qty"));
			rec.real_prt_qty = Util.checkString(rset0.getString("real_prt_qty"));
			rec.card_qty = Util.checkString(rset0.getString("card_qty"));
			rec.dqty = Util.checkString(rset0.getString("dqty"));
			rec.off_plat_tm = Util.checkString(rset0.getString("off_plat_tm"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_SENDMG_1021_LDataSet ds = (PR_SENDMG_1021_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		PR_SENDMG_1021_LCURLIST1Record curlist1Rec = (PR_SENDMG_1021_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.prt_plac_clsf%>
<%= curlist1Rec.ecnt%>
<%= curlist1Rec.prt_bgn_tm%>
<%= curlist1Rec.prt_end_tm%>
<%= curlist1Rec.slip_qty%>
<%= curlist1Rec.real_prt_qty%>
<%= curlist1Rec.card_qty%>
<%= curlist1Rec.dqty%>
<%= curlist1Rec.off_plat_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 15 16:03:43 KST 2009 */