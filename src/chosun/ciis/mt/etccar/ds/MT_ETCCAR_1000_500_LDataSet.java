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


package chosun.ciis.mt.etccar.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_1000_500_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCCAR_1000_500_LDataSet(){}
	public MT_ETCCAR_1000_500_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			MT_ETCCAR_1000_500_LCURLIST1Record rec = new MT_ETCCAR_1000_500_LCURLIST1Record();
			rec.drvr_nm = Util.checkString(rset0.getString("drvr_nm"));
			rec.buyoil_dt = Util.checkString(rset0.getString("buyoil_dt"));
			rec.buyoil_tm = Util.checkString(rset0.getString("buyoil_tm"));
			rec.oil_kind = Util.checkString(rset0.getString("oil_kind"));
			rec.buyoil_qunt = Util.checkString(rset0.getString("buyoil_qunt"));
			rec.buyoil_gag = Util.checkString(rset0.getString("buyoil_gag"));
			rec.outsd_oil_dt = Util.checkString(rset0.getString("outsd_oil_dt"));
			rec.outsd_oil_tm = Util.checkString(rset0.getString("outsd_oil_tm"));
			rec.outsd_oil_qunt = Util.checkString(rset0.getString("outsd_oil_qunt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			MT_ETCCAR_1000_500_LCURLIST2Record rec = new MT_ETCCAR_1000_500_LCURLIST2Record();
			rec.dest = Util.checkString(rset1.getString("dest"));
			rec.start_dt = Util.checkString(rset1.getString("start_dt"));
			rec.start_tm = Util.checkString(rset1.getString("start_tm"));
			rec.driv_dt = Util.checkString(rset1.getString("driv_dt"));
			rec.ariv_tm = Util.checkString(rset1.getString("ariv_tm"));
			rec.start_gag = Util.checkString(rset1.getString("start_gag"));
			rec.ariv_gag = Util.checkString(rset1.getString("ariv_gag"));
			rec.drvr_nm = Util.checkString(rset1.getString("drvr_nm"));
			rec.rid_pers = Util.checkString(rset1.getString("rid_pers"));
			rec.rid_deptcd = Util.checkString(rset1.getString("rid_deptcd"));
			rec.rid_dept_nm = Util.checkString(rset1.getString("rid_dept_nm"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.driv_purp = Util.checkString(rset1.getString("driv_purp"));
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			MT_ETCCAR_1000_500_LCURLIST3Record rec = new MT_ETCCAR_1000_500_LCURLIST3Record();
			rec.gag2 = Util.checkString(rset2.getString("gag2"));
			rec.gag1 = Util.checkString(rset2.getString("gag1"));
			rec.rowcnt = Util.checkString(rset2.getString("rowcnt"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			MT_ETCCAR_1000_500_LCURLIST4Record rec = new MT_ETCCAR_1000_500_LCURLIST4Record();
			rec.use_usag = Util.checkString(rset3.getString("use_usag"));
			this.curlist4.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCCAR_1000_500_LDataSet ds = (MT_ETCCAR_1000_500_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCCAR_1000_500_LCURLIST1Record curlist1Rec = (MT_ETCCAR_1000_500_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_ETCCAR_1000_500_LCURLIST2Record curlist2Rec = (MT_ETCCAR_1000_500_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_ETCCAR_1000_500_LCURLIST3Record curlist3Rec = (MT_ETCCAR_1000_500_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		MT_ETCCAR_1000_500_LCURLIST4Record curlist4Rec = (MT_ETCCAR_1000_500_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.drvr_nm%>
<%= curlist1Rec.buyoil_dt%>
<%= curlist1Rec.buyoil_tm%>
<%= curlist1Rec.oil_kind%>
<%= curlist1Rec.buyoil_qunt%>
<%= curlist1Rec.buyoil_gag%>
<%= curlist1Rec.outsd_oil_dt%>
<%= curlist1Rec.outsd_oil_tm%>
<%= curlist1Rec.outsd_oil_qunt%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.remk%>
<%= curlist2Rec.dest%>
<%= curlist2Rec.start_dt%>
<%= curlist2Rec.start_tm%>
<%= curlist2Rec.driv_dt%>
<%= curlist2Rec.ariv_tm%>
<%= curlist2Rec.start_gag%>
<%= curlist2Rec.ariv_gag%>
<%= curlist2Rec.drvr_nm%>
<%= curlist2Rec.rid_pers%>
<%= curlist2Rec.rid_deptcd%>
<%= curlist2Rec.rid_dept_nm%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.occr_dt%>
<%= curlist2Rec.driv_purp%>
<%= curlist3Rec.gag2%>
<%= curlist3Rec.gag1%>
<%= curlist3Rec.rowcnt%>
<%= curlist4Rec.use_usag%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 18 14:37:10 KST 2012 */