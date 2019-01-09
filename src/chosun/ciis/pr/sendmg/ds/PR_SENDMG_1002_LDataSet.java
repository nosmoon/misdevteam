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


public class PR_SENDMG_1002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String clos_clsf;
	public String ecnt_chk;

	public PR_SENDMG_1002_LDataSet(){}
	public PR_SENDMG_1002_LDataSet(String errcode, String errmsg, String clos_clsf, String ecnt_chk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.clos_clsf = clos_clsf;
		this.ecnt_chk = ecnt_chk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setClos_clsf(String clos_clsf){
		this.clos_clsf = clos_clsf;
	}

	public void setEcnt_chk(String ecnt_chk){
		this.ecnt_chk = ecnt_chk;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getClos_clsf(){
		return this.clos_clsf;
	}

	public String getEcnt_chk(){
		return this.ecnt_chk;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			PR_SENDMG_1002_LCURLIST1Record rec = new PR_SENDMG_1002_LCURLIST1Record();
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.make_pers = Util.checkString(rset0.getString("make_pers"));
			rec.make_pers_nm = Util.checkString(rset0.getString("make_pers_nm"));
			rec.weth = Util.checkString(rset0.getString("weth"));
			rec.ser_no = Util.checkString(rset0.getString("ser_no"));
			rec.side1_atic = Util.checkString(rset0.getString("side1_atic"));
			rec.rept_matt = Util.checkString(rset0.getString("rept_matt"));
			rec.issu_pcnt = Util.checkString(rset0.getString("issu_pcnt"));
			rec.clr_pcnt = Util.checkString(rset0.getString("clr_pcnt"));
			rec.bk_pcnt = Util.checkString(rset0.getString("bk_pcnt"));
			this.curlist1.add(rec);
		}
		this.clos_clsf = Util.checkString(cstmt.getString(8));
		this.ecnt_chk = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_SENDMG_1002_LDataSet ds = (PR_SENDMG_1002_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		PR_SENDMG_1002_LCURLIST1Record curlist1Rec = (PR_SENDMG_1002_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getClos_clsf()%>
<%= ds.getEcnt_chk()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.issu_dt%>
<%= curlist1Rec.make_pers%>
<%= curlist1Rec.make_pers_nm%>
<%= curlist1Rec.weth%>
<%= curlist1Rec.ser_no%>
<%= curlist1Rec.side1_atic%>
<%= curlist1Rec.rept_matt%>
<%= curlist1Rec.issu_pcnt%>
<%= curlist1Rec.clr_pcnt%>
<%= curlist1Rec.bk_pcnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 05 09:36:45 KST 2009 */