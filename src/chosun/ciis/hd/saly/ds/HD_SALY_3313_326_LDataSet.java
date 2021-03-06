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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_3313_326_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_3313_326_LDataSet(){}
	public HD_SALY_3313_326_LDataSet(String errcode, String errmsg){
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
			HD_SALY_3313_326_LCURLISTRecord rec = new HD_SALY_3313_326_LCURLISTRecord();
			rec.yy = Util.checkString(rset0.getString("yy"));
			rec.no = Util.checkString(rset0.getString("no"));
			rec.dt = Util.checkString(rset0.getString("dt"));
			rec.gugcd = Util.checkString(rset0.getString("gugcd"));
			rec.gugnm = Util.checkString(rset0.getString("gugnm"));
			rec.bunm = Util.checkString(rset0.getString("bunm"));
			rec.buseocd = Util.checkString(rset0.getString("buseocd"));
			rec.buseonm = Util.checkString(rset0.getString("buseonm"));
			rec.jccd2_jg_hobong = Util.checkString(rset0.getString("jccd2_jg_hobong"));
			rec.iwgeub = Util.checkString(rset0.getString("iwgeub"));
			rec.ybgbg_25 = Util.checkString(rset0.getString("ybgbg_25"));
			rec.ybjmg_25 = Util.checkString(rset0.getString("ybjmg_25"));
			rec.gg1tsgy = Util.checkString(rset0.getString("gg1tsgy"));
			rec.gg1bggy = Util.checkString(rset0.getString("gg1bggy"));
			rec.gbbgggg = Util.checkString(rset0.getString("gbbgggg"));
			rec.gbjmgeub = Util.checkString(rset0.getString("gbjmgeub"));
			rec.sabeon = Util.checkString(rset0.getString("sabeon"));
			rec.name = Util.checkString(rset0.getString("name"));
			rec.bw = Util.checkString(rset0.getString("bw"));
			rec.soin = Util.checkString(rset0.getString("soin"));
			rec.noin = Util.checkString(rset0.getString("noin"));
			rec.kro = Util.checkString(rset0.getString("kro"));
			rec.jae = Util.checkString(rset0.getString("jae"));
			rec.jhgbsd = Util.checkString(rset0.getString("jhgbsd"));
			rec.jhbssd = Util.checkString(rset0.getString("jhbssd"));
			rec.bjhilsd = Util.checkString(rset0.getString("bjhilsd"));
			rec.hgilbssd = Util.checkString(rset0.getString("hgilbssd"));
			rec.jcilbssd = Util.checkString(rset0.getString("jcilbssd"));
			rec.jclsd = Util.checkString(rset0.getString("jclsd"));
			rec.cyygsd = Util.checkString(rset0.getString("cyygsd"));
			rec.jpbsd = Util.checkString(rset0.getString("jpbsd"));
			rec.twcjbi = Util.checkString(rset0.getString("twcjbi"));
			rec.jwgogy = Util.checkString(rset0.getString("jwgogy"));
			rec.sggy = Util.checkString(rset0.getString("sggy"));
			rec.sgsy = Util.checkString(rset0.getString("sgsy"));
			rec.jgtot = Util.checkString(rset0.getString("jgtot"));
			rec.ggsae = Util.checkString(rset0.getString("ggsae"));
			rec.juminsae = Util.checkString(rset0.getString("juminsae"));
			rec.jsggsae = Util.checkString(rset0.getString("jsggsae"));
			rec.jsjuminsae = Util.checkString(rset0.getString("jsjuminsae"));
			rec.gmyg = Util.checkString(rset0.getString("gmyg"));
			rec.erbhr = Util.checkString(rset0.getString("erbhr"));
			rec.jybhr = Util.checkString(rset0.getString("jybhr"));
			rec.gybhr = Util.checkString(rset0.getString("gybhr"));
			rec.jcbi = Util.checkString(rset0.getString("jcbi"));
			rec.bankdb = Util.checkString(rset0.getString("bankdb"));
			rec.urigg = Util.checkString(rset0.getString("urigg"));
			rec.snbjkg = Util.checkString(rset0.getString("snbjkg"));
			rec.jgwhb = Util.checkString(rset0.getString("jgwhb"));
			rec.rdjhb = Util.checkString(rset0.getString("rdjhb"));
			rec.dchb = Util.checkString(rset0.getString("dchb"));
			rec.cchb = Util.checkString(rset0.getString("cchb"));
			rec.gajgg_1 = Util.checkString(rset0.getString("gajgg_1"));
			rec.gajgg_2 = Util.checkString(rset0.getString("gajgg_2"));
			rec.swgbnm = Util.checkString(rset0.getString("swgbnm"));
			rec.gyar = Util.checkString(rset0.getString("gyar"));
			rec.gjcak = Util.checkString(rset0.getString("gjcak"));
			rec.chainjga = Util.checkString(rset0.getString("chainjga"));
			rec.gtgj = Util.checkString(rset0.getString("gtgj"));
			rec.cnt = Util.checkString(rset0.getString("cnt"));
			rec.nts = Util.checkString(rset0.getString("nts"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.emp_dtls_clsf = Util.checkString(rset0.getString("emp_dtls_clsf"));
			rec.incm_tax = Util.checkString(rset0.getString("incm_tax"));
			rec.res_tax = Util.checkString(rset0.getString("res_tax"));
			rec.dty_alon = Util.checkString(rset0.getString("dty_alon"));
			rec.care_alon = Util.checkString(rset0.getString("care_alon"));
			rec.food_alon = Util.checkString(rset0.getString("food_alon"));
			rec.lang_study_splamt = Util.checkString(rset0.getString("lang_study_splamt"));
			rec.rslt_alon_saly = Util.checkString(rset0.getString("rslt_alon_saly"));
			rec.scl_exps_alon_saly = Util.checkString(rset0.getString("scl_exps_alon_saly"));
			rec.etc_alon_saly = Util.checkString(rset0.getString("etc_alon_saly"));
			rec.bns_saly = Util.checkString(rset0.getString("bns_saly"));
			rec.rslt_alon_exst_pay = Util.checkString(rset0.getString("rslt_alon_exst_pay"));
			rec.scl_exps_alon_exst_pay = Util.checkString(rset0.getString("scl_exps_alon_exst_pay"));
			rec.etc_alon_exst_pay = Util.checkString(rset0.getString("etc_alon_exst_pay"));
			rec.bns_exst_pay = Util.checkString(rset0.getString("bns_exst_pay"));
			rec.sply_chk_fee = Util.checkString(rset0.getString("sply_chk_fee"));
			rec.anvy_pay_fee = Util.checkString(rset0.getString("anvy_pay_fee"));
			rec.non_tax_food_alon = Util.checkString(rset0.getString("non_tax_food_alon"));
			rec.non_tax_care_alon = Util.checkString(rset0.getString("non_tax_care_alon"));
			rec.posk_alon = Util.checkString(rset0.getString("posk_alon"));
			rec.rdr_extn_alon = Util.checkString(rset0.getString("rdr_extn_alon"));
			rec.vaca_fee = Util.checkString(rset0.getString("vaca_fee"));
			rec.park_vilt_sply_fee = Util.checkString(rset0.getString("park_vilt_sply_fee"));
			rec.clamt_alon = Util.checkString(rset0.getString("clamt_alon"));
			rec.prz_fee = Util.checkString(rset0.getString("prz_fee"));
			rec.hody_duty_alon = Util.checkString(rset0.getString("hody_duty_alon"));
			rec.prsn_pens_dduc = Util.checkString(rset0.getString("prsn_pens_dduc"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			HD_SALY_3313_326_LCURLIST1Record rec = new HD_SALY_3313_326_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.flnm = Util.checkString(rset1.getString("flnm"));
			rec.etc_saly_nm = Util.checkString(rset1.getString("etc_saly_nm"));
			rec.etc_saly_cd = Util.checkString(rset1.getString("etc_saly_cd"));
			rec.etc_saly_amt = Util.checkString(rset1.getString("etc_saly_amt"));
			rec.incm_tax = Util.checkString(rset1.getString("incm_tax"));
			rec.res_tax = Util.checkString(rset1.getString("res_tax"));
			rec.cal_pay_amt = Util.checkString(rset1.getString("cal_pay_amt"));
			rec.emp_insr_fee = Util.checkString(rset1.getString("emp_insr_fee"));
			rec.np_fee = Util.checkString(rset1.getString("np_fee"));
			rec.hlth_insr_fee = Util.checkString(rset1.getString("hlth_insr_fee"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_3313_326_LDataSet ds = (HD_SALY_3313_326_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_3313_326_LCURLISTRecord curlistRec = (HD_SALY_3313_326_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_SALY_3313_326_LCURLIST1Record curlist1Rec = (HD_SALY_3313_326_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.yy%>
<%= curlistRec.no%>
<%= curlistRec.dt%>
<%= curlistRec.gugcd%>
<%= curlistRec.gugnm%>
<%= curlistRec.bunm%>
<%= curlistRec.buseocd%>
<%= curlistRec.buseonm%>
<%= curlistRec.jccd2_jg_hobong%>
<%= curlistRec.iwgeub%>
<%= curlistRec.ybgbg_25%>
<%= curlistRec.ybjmg_25%>
<%= curlistRec.gg1tsgy%>
<%= curlistRec.gg1bggy%>
<%= curlistRec.gbbgggg%>
<%= curlistRec.gbjmgeub%>
<%= curlistRec.sabeon%>
<%= curlistRec.name%>
<%= curlistRec.bw%>
<%= curlistRec.soin%>
<%= curlistRec.noin%>
<%= curlistRec.kro%>
<%= curlistRec.jae%>
<%= curlistRec.jhgbsd%>
<%= curlistRec.jhbssd%>
<%= curlistRec.bjhilsd%>
<%= curlistRec.hgilbssd%>
<%= curlistRec.jcilbssd%>
<%= curlistRec.jclsd%>
<%= curlistRec.cyygsd%>
<%= curlistRec.jpbsd%>
<%= curlistRec.twcjbi%>
<%= curlistRec.jwgogy%>
<%= curlistRec.sggy%>
<%= curlistRec.sgsy%>
<%= curlistRec.jgtot%>
<%= curlistRec.ggsae%>
<%= curlistRec.juminsae%>
<%= curlistRec.jsggsae%>
<%= curlistRec.jsjuminsae%>
<%= curlistRec.gmyg%>
<%= curlistRec.erbhr%>
<%= curlistRec.jybhr%>
<%= curlistRec.gybhr%>
<%= curlistRec.jcbi%>
<%= curlistRec.bankdb%>
<%= curlistRec.urigg%>
<%= curlistRec.snbjkg%>
<%= curlistRec.jgwhb%>
<%= curlistRec.rdjhb%>
<%= curlistRec.dchb%>
<%= curlistRec.cchb%>
<%= curlistRec.gajgg_1%>
<%= curlistRec.gajgg_2%>
<%= curlistRec.swgbnm%>
<%= curlistRec.gyar%>
<%= curlistRec.gjcak%>
<%= curlistRec.chainjga%>
<%= curlistRec.gtgj%>
<%= curlistRec.cnt%>
<%= curlistRec.nts%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.emp_dtls_clsf%>
<%= curlistRec.incm_tax%>
<%= curlistRec.res_tax%>
<%= curlistRec.dty_alon%>
<%= curlistRec.care_alon%>
<%= curlistRec.food_alon%>
<%= curlistRec.lang_study_splamt%>
<%= curlistRec.rslt_alon_saly%>
<%= curlistRec.scl_exps_alon_saly%>
<%= curlistRec.etc_alon_saly%>
<%= curlistRec.bns_saly%>
<%= curlistRec.rslt_alon_exst_pay%>
<%= curlistRec.scl_exps_alon_exst_pay%>
<%= curlistRec.etc_alon_exst_pay%>
<%= curlistRec.bns_exst_pay%>
<%= curlistRec.sply_chk_fee%>
<%= curlistRec.anvy_pay_fee%>
<%= curlistRec.non_tax_food_alon%>
<%= curlistRec.non_tax_care_alon%>
<%= curlistRec.posk_alon%>
<%= curlistRec.rdr_extn_alon%>
<%= curlistRec.vaca_fee%>
<%= curlistRec.park_vilt_sply_fee%>
<%= curlistRec.clamt_alon%>
<%= curlistRec.prz_fee%>
<%= curlistRec.hody_duty_alon%>
<%= curlistRec.prsn_pens_dduc%>
<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.flnm%>
<%= curlist1Rec.etc_saly_nm%>
<%= curlist1Rec.etc_saly_cd%>
<%= curlist1Rec.etc_saly_amt%>
<%= curlist1Rec.incm_tax%>
<%= curlist1Rec.res_tax%>
<%= curlist1Rec.cal_pay_amt%>
<%= curlist1Rec.emp_insr_fee%>
<%= curlist1Rec.np_fee%>
<%= curlist1Rec.hlth_insr_fee%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 28 16:36:55 KST 2015 */