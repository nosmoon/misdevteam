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


package chosun.ciis.pl.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.rcp.dm.*;
import chosun.ciis.pl.rcp.rec.*;

/**
 * 
 */


public class PL_RCP_1100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList crdt_ptcrcur = new ArrayList();
	public ArrayList budg_clsfcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_RCP_1100_MDataSet(){}
	public PL_RCP_1100_MDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			PL_RCP_1100_MBUDG_CLSFCURRecord rec = new PL_RCP_1100_MBUDG_CLSFCURRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.budg_clsfcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			PL_RCP_1100_MCRDT_PTCRCURRecord rec = new PL_RCP_1100_MCRDT_PTCRCURRecord();
			rec.budg_clsf = Util.checkString(rset2.getString("budg_clsf"));
			rec.basi_yymm = Util.checkString(rset2.getString("basi_yymm"));
			rec.amt = Util.checkString(rset2.getString("amt"));
			rec.slip_clsf = Util.checkString(rset2.getString("slip_clsf"));
			rec.seq = Util.checkString(rset2.getString("seq"));
			rec.subseq = Util.checkString(rset2.getString("subseq"));
			rec.dd_clos_yn = Util.checkString(rset2.getString("dd_clos_yn"));
			rec.remk = Util.checkString(rset2.getString("remk"));
			this.crdt_ptcrcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_RCP_1100_MDataSet ds = (PL_RCP_1100_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.budg_clsfcur.size(); i++){
		PL_RCP_1100_MBUDG_CLSFCURRecord budg_clsfcurRec = (PL_RCP_1100_MBUDG_CLSFCURRecord)ds.budg_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.crdt_ptcrcur.size(); i++){
		PL_RCP_1100_MCRDT_PTCRCURRecord crdt_ptcrcurRec = (PL_RCP_1100_MCRDT_PTCRCURRecord)ds.crdt_ptcrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBudg_clsfcur()%>
<%= ds.getCrdt_ptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= budg_clsfcurRec.cd%>
<%= budg_clsfcurRec.cdnm%>
<%= budg_clsfcurRec.cd_abrv_nm%>
<%= budg_clsfcurRec.cdnm_cd%>
<%= budg_clsfcurRec.cdabrvnm_cd%>
<%= crdt_ptcrcurRec.budg_clsf%>
<%= crdt_ptcrcurRec.basi_yymm%>
<%= crdt_ptcrcurRec.amt%>
<%= crdt_ptcrcurRec.slip_clsf%>
<%= crdt_ptcrcurRec.seq%>
<%= crdt_ptcrcurRec.subseq%>
<%= crdt_ptcrcurRec.dd_clos_yn%>
<%= crdt_ptcrcurRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 23 15:08:46 KST 2009 */