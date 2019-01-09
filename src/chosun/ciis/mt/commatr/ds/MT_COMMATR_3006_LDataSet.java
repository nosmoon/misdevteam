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


package chosun.ciis.mt.commatr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_3006_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_COMMATR_3006_LDataSet(){}
	public MT_COMMATR_3006_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			MT_COMMATR_3006_LCURLISTRecord rec = new MT_COMMATR_3006_LCURLISTRecord();
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.ewh_amt = Util.checkString(rset0.getString("ewh_amt"));
			rec.aewh_amt = Util.checkString(rset0.getString("aewh_amt"));
			rec.ewh_qunt = Util.checkString(rset0.getString("ewh_qunt"));
			rec.ewh_uprc = Util.checkString(rset0.getString("ewh_uprc"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			MT_COMMATR_3006_LCURLIST1Record rec = new MT_COMMATR_3006_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.dlco_no = Util.checkString(rset1.getString("dlco_no"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.yy = Util.checkString(rset1.getString("yy"));
			rec.sale_amt = Util.checkString(rset1.getString("sale_amt"));
			rec.busn_prft = Util.checkString(rset1.getString("busn_prft"));
			rec.busn_prft_rate = Util.checkString(rset1.getString("busn_prft_rate"));
			rec.thterm_net_prft = Util.checkString(rset1.getString("thterm_net_prft"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			MT_COMMATR_3006_LCURLIST2Record rec = new MT_COMMATR_3006_LCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset2.getString("cmpy_cd"));
			rec.dlco_no = Util.checkString(rset2.getString("dlco_no"));
			rec.seq = Util.checkString(rset2.getString("seq"));
			rec.chrg_pers_nm = Util.checkString(rset2.getString("chrg_pers_nm"));
			rec.chrg_pers_tel_no = Util.checkString(rset2.getString("chrg_pers_tel_no"));
			rec.chrg_pers_email = Util.checkString(rset2.getString("chrg_pers_email"));
			this.curlist2.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			MT_COMMATR_3006_LCURLIST3Record rec = new MT_COMMATR_3006_LCURLIST3Record();
			rec.cmpy_cd = Util.checkString(rset3.getString("cmpy_cd"));
			rec.dlco_no = Util.checkString(rset3.getString("dlco_no"));
			rec.seq = Util.checkString(rset3.getString("seq"));
			rec.movmt = Util.checkString(rset3.getString("movmt"));
			this.curlist3.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			MT_COMMATR_3006_LCURLIST4Record rec = new MT_COMMATR_3006_LCURLIST4Record();
			rec.dlco_no = Util.checkString(rset4.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset4.getString("dlco_nm"));
			rec.ern = Util.checkString(rset4.getString("ern"));
			rec.presi_nm = Util.checkString(rset4.getString("presi_nm"));
			rec.addr = Util.checkString(rset4.getString("addr"));
			rec.item = Util.checkString(rset4.getString("item"));
			rec.tel_no = Util.checkString(rset4.getString("tel_no"));
			rec.fax_no = Util.checkString(rset4.getString("fax_no"));
			rec.presi_tel_no_1 = Util.checkString(rset4.getString("presi_tel_no_1"));
			rec.presi_tel_no_2 = Util.checkString(rset4.getString("presi_tel_no_2"));
			rec.presi_email = Util.checkString(rset4.getString("presi_email"));
			rec.presi_prof = Util.checkString(rset4.getString("presi_prof"));
			rec.chrg_pers = Util.checkString(rset4.getString("chrg_pers"));
			rec.chrg_pers_tel_no_1 = Util.checkString(rset4.getString("chrg_pers_tel_no_1"));
			rec.chrg_pers_tel_no_2 = Util.checkString(rset4.getString("chrg_pers_tel_no_2"));
			rec.chrg_pers_email_1 = Util.checkString(rset4.getString("chrg_pers_email_1"));
			rec.trsm_usag_email_yn_1 = Util.checkString(rset4.getString("trsm_usag_email_yn_1"));
			rec.chrg_pers_email_2 = Util.checkString(rset4.getString("chrg_pers_email_2"));
			rec.trsm_usag_email_yn_2 = Util.checkString(rset4.getString("trsm_usag_email_yn_2"));
			rec.chrg_pers_dept = Util.checkString(rset4.getString("chrg_pers_dept"));
			rec.chrg_pers_prof = Util.checkString(rset4.getString("chrg_pers_prof"));
			rec.fndt_dt = Util.checkString(rset4.getString("fndt_dt"));
			rec.cmpy_hmpg = Util.checkString(rset4.getString("cmpy_hmpg"));
			rec.sale_amt = Util.checkString(rset4.getString("sale_amt"));
			rec.mrkt_ocpy_rate = Util.checkString(rset4.getString("mrkt_ocpy_rate"));
			rec.dlco_pcond = Util.checkString(rset4.getString("dlco_pcond"));
			rec.remk = Util.checkString(rset4.getString("remk"));
			this.curlist4.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_COMMATR_3006_LDataSet ds = (MT_COMMATR_3006_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_3006_LCURLISTRecord curlistRec = (MT_COMMATR_3006_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_COMMATR_3006_LCURLIST1Record curlist1Rec = (MT_COMMATR_3006_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_COMMATR_3006_LCURLIST2Record curlist2Rec = (MT_COMMATR_3006_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_COMMATR_3006_LCURLIST3Record curlist3Rec = (MT_COMMATR_3006_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		MT_COMMATR_3006_LCURLIST4Record curlist4Rec = (MT_COMMATR_3006_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.ewh_amt%>
<%= curlistRec.aewh_amt%>
<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.dlco_no%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.yy%>
<%= curlist1Rec.sale_amt%>
<%= curlist1Rec.busn_prft%>
<%= curlist1Rec.busn_prft_rate%>
<%= curlist1Rec.thterm_net_prft%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.dlco_no%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.chrg_pers_nm%>
<%= curlist2Rec.chrg_pers_tel_no%>
<%= curlist2Rec.chrg_pers_email%>
<%= curlist3Rec.cmpy_cd%>
<%= curlist3Rec.dlco_no%>
<%= curlist3Rec.seq%>
<%= curlist3Rec.movmt%>
<%= curlist4Rec.dlco_no%>
<%= curlist4Rec.dlco_nm%>
<%= curlist4Rec.ern%>
<%= curlist4Rec.presi_nm%>
<%= curlist4Rec.addr%>
<%= curlist4Rec.item%>
<%= curlist4Rec.tel_no%>
<%= curlist4Rec.fax_no%>
<%= curlist4Rec.presi_tel_no_1%>
<%= curlist4Rec.presi_tel_no_2%>
<%= curlist4Rec.presi_email%>
<%= curlist4Rec.presi_prof%>
<%= curlist4Rec.chrg_pers%>
<%= curlist4Rec.chrg_pers_tel_no_1%>
<%= curlist4Rec.chrg_pers_tel_no_2%>
<%= curlist4Rec.chrg_pers_email_1%>
<%= curlist4Rec.trsm_usag_email_yn_1%>
<%= curlist4Rec.chrg_pers_email_2%>
<%= curlist4Rec.trsm_usag_email_yn_2%>
<%= curlist4Rec.chrg_pers_dept%>
<%= curlist4Rec.chrg_pers_prof%>
<%= curlist4Rec.fndt_dt%>
<%= curlist4Rec.cmpy_hmpg%>
<%= curlist4Rec.sale_amt%>
<%= curlist4Rec.mrkt_ocpy_rate%>
<%= curlist4Rec.dlco_pcond%>
<%= curlist4Rec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 11 13:38:11 KST 2009 */