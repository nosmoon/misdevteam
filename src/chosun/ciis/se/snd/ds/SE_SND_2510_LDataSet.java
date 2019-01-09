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


public class SE_SND_2510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2510_LDataSet(){}
	public SE_SND_2510_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SE_SND_2510_LCURLISTRecord rec = new SE_SND_2510_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.reg_dt = Util.checkString(rset1.getString("reg_dt"));
			rec.reg_seq = Util.checkString(rset1.getString("reg_seq"));
			rec.tran_uprc_clas = Util.checkString(rset1.getString("tran_uprc_clas"));
			rec.pay_dt = Util.checkString(rset1.getString("pay_dt"));
			rec.send_yymm = Util.checkString(rset1.getString("send_yymm"));
			rec.send_frdt = Util.checkString(rset1.getString("send_frdt"));
			rec.send_todt = Util.checkString(rset1.getString("send_todt"));
			rec.tot_amt = Util.checkString(rset1.getString("tot_amt"));
			rec.clos_yn = Util.checkString(rset1.getString("clos_yn"));
			rec.actu_slip_no = Util.checkString(rset1.getString("actu_slip_no"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_2510_LDataSet ds = (SE_SND_2510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2510_LCURLISTRecord curlistRec = (SE_SND_2510_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.reg_dt%>
<%= curlistRec.reg_seq%>
<%= curlistRec.tran_uprc_clas%>
<%= curlistRec.pay_dt%>
<%= curlistRec.send_yymm%>
<%= curlistRec.send_frdt%>
<%= curlistRec.send_todt%>
<%= curlistRec.tot_amt%>
<%= curlistRec.clos_yn%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 04 20:32:25 KST 2009 */