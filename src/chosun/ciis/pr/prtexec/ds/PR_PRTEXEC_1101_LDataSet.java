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


package chosun.ciis.pr.prtexec.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_1101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PRTEXEC_1101_LDataSet(){}
	public PR_PRTEXEC_1101_LDataSet(String errcode, String errmsg){
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
			PR_PRTEXEC_1101_LCURLISTRecord rec = new PR_PRTEXEC_1101_LCURLISTRecord();
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.ecnt = Util.checkString(rset0.getString("ecnt"));
			rec.rmsg_tm = Util.checkString(rset0.getString("rmsg_tm"));
			rec.off_plat_tm = Util.checkString(rset0.getString("off_plat_tm"));
			rec.off_plat_end_tm = Util.checkString(rset0.getString("off_plat_end_tm"));
			rec.prt_bgn_tm = Util.checkString(rset0.getString("prt_bgn_tm"));
			rec.prt_end_tm = Util.checkString(rset0.getString("prt_end_tm"));
			rec.slip_qty = Util.checkString(rset0.getString("slip_qty"));
			rec.real_prt_qty = Util.checkString(rset0.getString("real_prt_qty"));
			rec.bad_nwsp_qty = Util.checkString(rset0.getString("bad_nwsp_qty"));
			rec.card_qty = Util.checkString(rset0.getString("card_qty"));
			rec.dqty = Util.checkString(rset0.getString("dqty"));
			rec.apcut_err = Util.checkString(rset0.getString("apcut_err"));
			rec.driv_cut_err = Util.checkString(rset0.getString("driv_cut_err"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PRTEXEC_1101_LDataSet ds = (PR_PRTEXEC_1101_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PRTEXEC_1101_LCURLISTRecord curlistRec = (PR_PRTEXEC_1101_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.fac_clsf%>
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_nm%>
<%= curlistRec.ecnt%>
<%= curlistRec.rmsg_tm%>
<%= curlistRec.off_plat_tm%>
<%= curlistRec.off_plat_end_tm%>
<%= curlistRec.prt_bgn_tm%>
<%= curlistRec.prt_end_tm%>
<%= curlistRec.slip_qty%>
<%= curlistRec.real_prt_qty%>
<%= curlistRec.bad_nwsp_qty%>
<%= curlistRec.card_qty%>
<%= curlistRec.dqty%>
<%= curlistRec.apcut_err%>
<%= curlistRec.driv_cut_err%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jun 06 19:02:43 KST 2009 */